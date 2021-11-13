package BAI2;

import java.util.Scanner;

public class SanPham {
    private String MaSanPham;
    private String TenSanPham;
    private int SoLuong;
    private int DonGia;
    public void InputSP(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập Mã Hàng      : ");
        this.MaSanPham = sc.nextLine();
        System.out.print("Nhập Tên Hàng     : ");
        this.TenSanPham = sc.nextLine();
        System.out.print("Nhập Số Lượng Hàng: ");
        this.SoLuong = sc.nextInt();
        System.out.print("Nhập Đơn Giá      : ");
        this.DonGia = sc.nextInt();
    }
    public void OutputSP(){
        System.out.printf("%10s %10s %10s %10s %10s\n",this.MaSanPham,this.TenSanPham,this.SoLuong,this.DonGia,this.DonGia * this.SoLuong);

    }

    public String getMaSanPham() {
        return MaSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        MaSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return TenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        TenSanPham = tenSanPham;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int soLuong) {
        SoLuong = soLuong;
    }

    public int getDonGia() {
        return DonGia;
    }

    public void setDonGia(int donGia) {
        DonGia = donGia;
    }
}
