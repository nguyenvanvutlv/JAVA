package BAI1;

import java.util.Scanner;


public class Sach {

    private String Masach;
    private String TenSach;
    private String Nxb;
    private int SoTrang;
    private float Giatien;
    public Sach(){

    }
    public Sach(String Masach,String TenSach,String Nxb,int SoTrang,float Giatien){
        this.Masach = Masach;
        this.TenSach = TenSach;
        this.Nxb = Nxb;
        this.SoTrang = SoTrang;
        this.Giatien = Giatien;
    }

    public String getMasach() {
        return Masach;
    }

    public void setMasach(String masach) {
        Masach = masach;
    }

    public String getTenSach() {
        return TenSach;
    }

    public void setTenSach(String tenSach) {
        TenSach = tenSach;
    }

    public String getNxb() {
        return Nxb;
    }

    public void setNxb(String nxb) {
        Nxb = nxb;
    }

    public int getSoTrang() {
        return SoTrang;
    }

    public void setSoTrang(int soTrang) {
        SoTrang = soTrang;
    }

    public float getGiatien() {
        return Giatien;
    }

    public void setGiatien(float giatien) {
        Giatien = giatien;
    }

    public void Nhap(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Mã sách     : ");
        this.Masach = sc.nextLine();
        System.out.print("Tên sách    : ");
        this.TenSach = sc.nextLine();
        System.out.print("Nhà xuất bản: ");
        this.Nxb = sc.nextLine();
        System.out.print("Số Trang    : ");
        this.SoTrang = sc.nextInt();
        System.out.print("Giá tiền    : ");
        this.Giatien = sc.nextFloat();
    }
    
    public void OUT() {
        // TODO Auto-generated method stub
        System.out.println("Mã Sách: " + Masach 
                           + " Tên Sách: " + TenSach 
                           + " Nhà xuất bản: " + Nxb
                           + " Số trang: " + SoTrang
                           + " Gia tiền: " + Giatien);
    }
}
