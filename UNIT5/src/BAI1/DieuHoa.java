package BAI1;

import java.util.Scanner;

public class DieuHoa extends SanPham{
    private int CongSuat;
    private int GiaBan;

    public void Nhap(){

        Scanner sc = new Scanner(System.in);

        super.Nhap();

        System.out.print("Nhập công suất: ");
        this.CongSuat = sc.nextInt();

        System.out.print("Nhập Giá Bán  : ");
        this.GiaBan = sc.nextInt();


    }
    public void Xuat(){
        super.Xuat();
        System.out.println(String.valueOf(CongSuat) + " " + String.valueOf(GiaBan));

    }

    public int getCongSuat() {
        return CongSuat;
    }

    public void setCongSuat(int congSuat) {
        CongSuat = congSuat;
    }

    public int getGiaBan() {
        return GiaBan;
    }

    public void setGiaBan(int giaBan) {
        GiaBan = giaBan;
    }
}
