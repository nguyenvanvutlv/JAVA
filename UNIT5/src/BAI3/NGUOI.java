package BAI3;

import java.util.Scanner;

public class NGUOI {
    private String HoTen;
    private String NgaySinh;
    private String QueQuan;
    public void Nhap(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Họ Tên   : ");
        this.HoTen = sc.nextLine();

        System.out.print("Ngày Sinh: ");
        this.NgaySinh = sc.nextLine();

        System.out.print("Quê Quán: ");
        this.QueQuan = sc.nextLine();
    }
    public void Xuat(){
        System.out.println("Quê Quán: " + this.QueQuan + "\n Họ Tên: " + this.HoTen + "\n Ngày Sinh: " + this.NgaySinh  + "\n");
    }


    public void setHoten(String Hoten){
        this.HoTen = Hoten;
    }
    public void setQueQuan(String QueQuan){
        this.QueQuan = QueQuan;
    }
    public void setNgaySinh(String NgaySinh){
        this.NgaySinh = NgaySinh;
    }

    public String getHoten(){
        return this.HoTen;
    }
    public String getQueQuan(){
        return this.QueQuan;
    }
    public String getNgaySinh(){
        return this.NgaySinh;
    }
}
