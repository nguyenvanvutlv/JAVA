package AccSystem;

public class Account implements Comparable<Account> {
    private long ID;
    private String FullName;
    private String UserName;
    private String Password;
    private String Email;
    private String Phone;
    private String CreateAt;

    public Account(long ID, String FullName, String UserName, String Password, String Email, String Phone, String CreateAt) {
        this.ID = ID;
        this.FullName = FullName;
        this.UserName = UserName;
        this.Password = Password;
        this.Email = Email;
        this.Phone = Phone;
        this.CreateAt = CreateAt;
    }

    public Account() {}

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getCreateAt() {
        return CreateAt;
    }

    public void setCreatedAt(String createAt) {
        CreateAt = createAt;
    }

    public void output() {
        System.out.println("ID: " + ID +
                ", Full Name: " + FullName +
                ", User Name: " + UserName +
                ", Password: " + Password +
                ", Email: " + Email +
                ", Phone: " + Phone +
                ", Create At: " + CreateAt);
    }

    @Override
    public int compareTo(Account o) {
        return getUserName().compareTo((o.getUserName()));
    }
}
