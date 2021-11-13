package BAI3;

import java.util.Scanner;

public class SINHVIEN extends NGUOI {
    private String MaSV;
    private String Nganh;
    private int KhoaHoc;
    public SINHVIEN(String MaSV,String Nganh,int KhoaHoc){
        this.MaSV = MaSV;
        this.Nganh = Nganh;
        this.KhoaHoc = KhoaHoc;
    }
    public SINHVIEN(){

    }
    public void NHAP(){
        Scanner sc = new Scanner(System.in);
        super.Nhap();
        System.out.print("Mã Sinh Viên: ");
        this.MaSV = sc.nextLine();

        System.out.print("Ngành Học: ");
        this.Nganh = sc.nextLine();

        System.out.print("Khoá Học: ");
        this.KhoaHoc = sc.nextInt();
    }
    public void Xuat(){
        super.Xuat();
        System.out.printf("Mã sv: " + MaSV + " Ngành: " + Nganh + " Khóa học: " + KhoaHoc);
    }
    public String getMaSV(){
        return this.MaSV;
    }
    public String getNganh(){
        return this.Nganh;
    }
    public int getKhoaHoc(){
        return this.KhoaHoc;
    }


    public void setMaSV(String MaSV){
        this.MaSV = MaSV;
    }
    public void setNganh(String Nganh){
        this.Nganh = Nganh;
    }
    public void setKhoaHoc(int KhoaHoc){
        this.KhoaHoc = KhoaHoc;
    }
}
