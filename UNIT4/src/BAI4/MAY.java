package BAI4;

import java.util.Scanner;

public class MAY {
    private String MaMay;
    private String KieuMay;
    private String TinhTrang;
    public void INPUT(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Mã Máy     : "); MaMay = sc.nextLine();
        System.out.print("Kiểu máy   : "); KieuMay =sc.nextLine();
        System.out.print("Tình trạng : "); TinhTrang = sc.nextLine();
    }
    public void OUT(){
        System.out.print("Mã: " + MaMay + " Kiểu: " + KieuMay + " Tình trạng: "+ TinhTrang + "\n");
    }
    
    
}
