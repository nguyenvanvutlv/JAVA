package BAI1;

import java.util.Scanner;

public class SanPham {
    private String MaSanPham;
    private String TenSanPham;
    private String TenHangSanXuat;
    private String NgayNhap;

    public void Nhap(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Mã Sản Phẩm      : ");
        this.MaSanPham = sc.nextLine();

        System.out.print("Tên Sản Phẩm     : ");
        this.TenSanPham = sc.nextLine();

        System.out.print("Tên Hãng Sản Xuât: ");
        this.TenHangSanXuat = sc.nextLine();

        System.out.print("Ngày Nhập        : ");
        this.NgayNhap = sc.nextLine();

    }

    public void Xuat(){
        System.out.printf("%10s %10s %10s %10s ", MaSanPham, TenSanPham, TenHangSanXuat, NgayNhap);
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

    public String getTenHangSanXuat() {
        return TenHangSanXuat;
    }

    public void setTenHangSanXuat(String tenHangSanXuat) {
        TenHangSanXuat = tenHangSanXuat;
    }

    public String getNgaySanXuat() {
        return  NgayNhap;
    }

    public void setNgaySanXuat(String NgayNhap) {
        NgayNhap = NgayNhap;
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "MaSanPham='" + MaSanPham + '\'' +
                ", TenSanPham='" + TenSanPham + '\'' +
                ", TenHangSanXuat='" + TenHangSanXuat + '\'' +
                ", NgaySanXuat='" + NgayNhap+ '\'' +
                '}';
    }
}
