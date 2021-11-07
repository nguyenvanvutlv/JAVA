package BAI4;

import java.util.Scanner;

public class PHONGMAY {
    private String Maphong;
    private String TenPhong;
    private float Dientich;
    private QUANLY x;
    private MAY [] y;
    private int n;
    public void INPUT(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Mã Phòng   : "); Maphong = sc.nextLine();
        System.out.print("Tên Phòng  : "); TenPhong =sc.nextLine();
        System.out.print("Diện tích  : "); Dientich =sc.nextInt();
        x = new QUANLY();
        x.INPUT();
        n = sc.nextInt();
        y = new MAY[n];
        for(int i = 0;i<n;i++){
            y[i] = new MAY();
            y[i].INPUT();
        }
        
    }
    public void OUT(){
        System.out.println("Phòng");
        System.out.println("Mã: " + Maphong + " Tên: " + TenPhong + " Diện tích: " + Dientich);    
        
        System.out.println("Quản lý");
        x.OUT();
        
        System.out.println("Thông tin phòng");
        for(int i = 0;i<n;i++){
            y[i].OUT();
        }
    }
}
