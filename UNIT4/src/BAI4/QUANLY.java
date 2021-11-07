package BAI4;

import java.util.Scanner;

public class QUANLY {
    private String Maql;
    private String Hoten;
    public void INPUT(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Mã Quản lý : "); Maql = sc.nextLine();
        System.out.print("Họ tên     : "); Hoten =sc.nextLine();
        
    }
    public void OUT(){
        System.out.print("Mã quản lý: " + Maql + " Họ Tên: " + Hoten + "\n");
    }
}
