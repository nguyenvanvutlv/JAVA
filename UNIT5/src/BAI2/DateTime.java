package BAI2;

import java.util.Scanner;

public class DateTime {
    private int Ngay;
    private int Thang;
    private int Nam;

    public void InputDate(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập ngày: ");
        this.Ngay =sc.nextInt();
        System.out.print("Nhập Tháng: ");
        this.Thang =sc.nextInt();
        System.out.print("Nhập Năm: ");
        this.Nam =sc.nextInt();
    }
    public void OutputDate() {
        System.out.println(Ngay + "/" + Thang + "/" + Nam);
    }

    public int getNgay() {
        return Ngay;
    }

    public void setNgay(int ngay) {
        Ngay = ngay;
    }

    public int getThang() {
        return Thang;
    }

    public void setThang(int thang) {
        Thang = thang;
    }

    public int getNam() {
        return Nam;
    }

    public void setNam(int nam) {
        Nam = nam;
    }
}
