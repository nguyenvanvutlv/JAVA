package AccSystem;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static List<Account> listUser = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);
    public static Scanner scan;
    static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    static Date date;
    static Pattern pattern;
    static Controller file = new Controller();

    static final String registerUsername = "^[a-zA-Z0-9]{6,}$";
    static final String registerPassword = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*?&])[A-Za-z0-9@$!%*?&]{8,}$";
    static final String registerEmail = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
    static final String registerPhone = "^[0-9\\-\\+]{9,15}$";


    public static void main(String[] args) throws IOException {
        do {
            System.out.println("1. Create new account");
            System.out.println("2. Login to an existing account");
            System.out.println("3. Sort accounts by username");
            System.out.println("4. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    CreatNewAccount();
                    break;
                case 2:
                    LoginToAccount();
                    break;
                case 3:
                    SortAccount();
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        } while (true);
    }

    public static void CreatNewAccount() throws IOException {
        long ID;
        String fullName;
        String userName;
        String Password = null;
        String rePassword;
        String Email;
        String Phone;
        String CreateAt;
        do {
            System.out.println("ID: "); ID = sc.nextInt();
            if (check(ID)) System.out.println("ID đã tồn tại!");
        }
        while (check(ID));

        sc.nextLine();
        System.out.println("Fullname: "); fullName = sc.nextLine();
        boolean checkEmail;
        boolean checkPassword;
        boolean checkPhone;
        boolean checkUser;
        pattern = Pattern.compile(registerUsername);

        do {
            System.out.println("Username: "); userName = sc.nextLine();
            Matcher matcher = pattern.matcher(userName);
            checkUser = matcher.find();
            if (!checkUser) {
                System.out.println("Username must contain lowercase, uppercase, number and at least 6 characters");
            } else if (check(userName)) System.out.println("Uername already exists");
        }while (check(userName) && !checkUser );

        do {
            System.out.println("Password: "); Password = sc.nextLine();
            Matcher matcher = pattern.matcher(Password);
            checkPassword = matcher.find();
            if (!checkUser) {
                System.out.println("Password must contain lowercase, uppercase, number and at least 8 characters");
            } else if (check(Password)) System.out.println("Password already exists");
        }while (check(Password) && !checkPassword );

        pattern = Pattern.compile(registerEmail) ;
        do{
            System.out.print("Email: "); Email = sc.nextLine() ;
            Matcher matcher = pattern.matcher(Email) ;
            checkEmail = matcher.find() ;
            if(!checkEmail) {
                System.out.print("Invalid email");
            }
        }while(!checkEmail) ;

        pattern = Pattern.compile(registerPhone) ;
        do{
            System.out.print("Phone Number: "); Phone = sc.nextLine() ;
            checkPhone = pattern.matcher(Phone).find() ;
            if(!checkPhone) {
                System.out.print("Wrong format");
            }
        }while(!checkPhone) ;

        date = new Date();
        CreateAt = simpleDateFormat.format(date);

        Account account = new Account(ID, fullName, userName, Password, Email, Phone, CreateAt);
        file.writeAccount2File("Account.DAT", account);
    }

    public static boolean check(long ID) {
        for (int i = 0; i< listUser.size(); i++) {
            if (listUser.get(i).getID() == ID) return true;
        }
        return false;
    }

    public static boolean check(String userName) {
        for (int i = 0; i< listUser.size(); i++) {
            if (listUser.get(i).getUserName() == userName) return true;
        }
        return false;
    }

    public static void LoginToAccount() throws IOException {
        sc.nextLine();
        System.out.print("usename: ");
        String userName = sc.nextLine();
        System.out.print("password: ");
        String password = sc.nextLine();
        if (checkAccount(userName, password)) {
            System.out.println("1. Show info\n2. Change Password");
            System.out.print("Enter select: ");
            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                    showInfo(userName, password);
                    break;
                case 2:
                    changePassword(userName, password);
                    break;
                default:
                    break;
            }
        } else {
            do {
                System.out.print("user name: ");
                userName = sc.nextLine();
                System.out.print("password: ");
                password = sc.nextLine();
            } while (!checkAccount(userName, password));
        }
    }

    public static boolean checkAccount(String username, String password) throws IOException {
        listUser = file.readAccount("Account.dat");
        for (Account tmp : listUser) {
            if (username.compareTo(tmp.getUserName()) == 0 && password.compareTo(tmp.getPassword()) == 0) {
                return true;
            }
        }
        return false;
    }
    public static void showInfo(String username, String password) {
        listUser = file.readAccount("Account.dat");
        for (Account tmp : listUser) {
            if (username.compareTo(tmp.getUserName()) == 0 && password.compareTo(tmp.getPassword()) == 0) {
                tmp.output();
            }
        }
    }

    public static void changePassword(String username, String password) throws IOException {
        listUser = file.readAccount("Account.dat");
        for (Account tmp : listUser) {
            if (username.compareTo(tmp.getUserName()) == 0 && password.compareTo(tmp.getPassword()) == 0) {
                System.out.println("Enter new password: ");

                boolean checkpass;
                pattern = Pattern.compile(registerPassword);
                do {
                    System.out.print("Password : "); password = sc.nextLine();
                    checkpass = pattern.matcher(password).find() ;
                    if(!checkpass) {
                        System.out.print("Invalid Password");
                    } else {
                        System.out.print("Re-enter password : "); String rePassword = sc.nextLine() ;
                        checkpass = pattern.matcher(rePassword).find() ;
                        if(!checkpass)  {
                            System.out.println("Invalid password");
                        }
                    }
                }while(!checkpass) ;
                tmp.setPassword(password);
                file.updateAccount2File("Account.dat", listUser);
            }
        }
        System.out.println("Change password success!");
    }


    public static void SortAccount() throws IOException {
        listUser = file.readAccount("Account.dat");
        Collections.sort(listUser);
        System.out.println("List account after sort: ");
        file.updateAccount2File("Account.dat", listUser);
        for (Account acc : listUser) {
            acc.output();
        }
    }

}