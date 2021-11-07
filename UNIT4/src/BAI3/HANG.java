package BAI3;

import java.util.Scanner;

public class HANG {
    private String Mahang;
    private String TenHang;
    private float DonGia;

    public void INPUT(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Mã hàng: ");
        Mahang = sc.nextLine();
        System.out.println("Tên hàng: ");
        TenHang = sc.nextLine();
        System.out.println("Đơn giá: ");
        DonGia = sc.nextFloat();
    }
    public void OUT(){
        System.out.println("Mã hàng: " + Mahang +
                            " Tên Hàng: " + TenHang
                            +" Đơn Giá: " + DonGia);
    }
}
