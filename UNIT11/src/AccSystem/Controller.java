package AccSystem;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {
    private FileWriter fileWriter;
    private BufferedWriter bufferedWriter;
    private PrintWriter printWriter;
    Scanner sc;

    public void openFile2Write(String fileName) throws IOException {
        try {
            fileWriter = new FileWriter(fileName, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            printWriter = new PrintWriter(bufferedWriter);
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void closeFileAW() {
        try {
            printWriter.close();
            bufferedWriter.close();
            fileWriter.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void openFile2Read(String fileName) {
        try {
            sc = new Scanner(Paths.get(fileName));
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void closeFileAR() {
        sc.close();
    }

    public void writeAccount2File(String fileName, Account acc) throws IOException {
        openFile2Write(fileName);
        printWriter.println(acc.getID() + "|" + acc.getFullName() + "|" + acc.getUserName() + "|" + acc.getPassword() + "|" + acc.getEmail() + "|" + acc.getPhone() + "|" + acc.getCreateAt());
        closeFileAW();
    }

    public Account createAccount(String data) {
        String[] acc = data.split("\\|");
        return new Account(Long.parseLong(acc[0]), acc[1], acc[2], acc[3], acc[4], acc[5], acc[6]);
    }

    public List<Account> readAccount(String fileName) {
        openFile2Read(fileName);
        List<Account> accounts = new ArrayList<>();
        while (sc.hasNext()) {
            String str = sc.nextLine();
            accounts.add(createAccount(str));
        }
        closeFileAR();
        return accounts;
    }

    public void updateAccount2File(String fileName, List<Account> accounts) throws IOException {
        File file = new File(fileName);
        if (file.exists()) {
            file.delete();
        }
        openFile2Write(fileName);
        for (Account account : accounts) {
            printWriter.println(account.getID() + "|" + account.getFullName() + "|" + account.getUserName() + "|" + account.getPassword() + "|" + account.getEmail() + "|" + account.getPhone() + account.getCreateAt());
        }
        closeFileAW();
    }
}