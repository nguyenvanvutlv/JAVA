package BAI2;

import java.util.Scanner;

public class NHANSU {
    private String ManhanSU;
    private String HoTen;
    private DATE NS;
    public void INPUT(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã nhân sự   : "); ManhanSU = sc.nextLine();
        System.out.print("Nhập tên sinh viên: "); HoTen = sc.nextLine();
        NS = new DATE();
        System.out.println("Nhập ngày tháng năm: ");
        NS.setDay(sc.nextInt());
        NS.setMonth(sc.nextInt());
        NS.setYear(sc.nextInt());

    }
    public void OUT(){
        System.out.print("Mã : " + ManhanSU + " Tên: " + HoTen + "\t");
        NS.OUT();
    }
}
