package BAI2;

import java.util.Scanner;

public class Phieu {
    private String MaPhieu;
    private String TenPhieu;
    private DateTime a;
    private SanPham [] x;
    private int n;

    public void InputPhieu(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Mã: ");
        this.MaPhieu = sc.nextLine();

        System.out.print("Tên: ");
        this.TenPhieu = sc.nextLine();
        a = new DateTime();
        a.InputDate();

        System.out.print("Nhập số lượng Sản phẩm: ");
        this.n = sc.nextInt();
        x = new SanPham[n];
        sc.nextLine();
        for(int i = 0;i<n;i++){
            x[i] = new SanPham();
            x[i].InputSP();
        }
    }
    public void OutputPhieu(){
        System.out.printf("Mã Phiếu: %10s Tên Phiếu: %10s \n" ,this.MaPhieu,this.TenPhieu);
        a.OutputDate();

        System.out.println("Sản Phẩm");
        System.out.println("Mã Sản Phẩm    Tên Sản Phẩm    Số Lượng    Đơn Giá  Thành tiền");
        for(int i =0;i<n;i++){
            x[i].OutputSP();
        }
    }
}
