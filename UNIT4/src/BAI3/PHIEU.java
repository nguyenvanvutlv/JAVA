package BAI3;

import java.util.Scanner;

public class PHIEU {
    private String MaPhieu;
    private HANG[] phieu;
    private int n;
    public void INPUT(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Mã phiếu:  ");
        MaPhieu = sc.nextLine();
        System.out.println("n : ");
        n = sc.nextInt();
        phieu = new HANG[n];
        for(int i=0;i<n;i++){
            phieu[i] = new HANG();
            phieu[i].INPUT();
        }
    }
    public void OUT(){
        for(int i = 0;i<n;i++){
            phieu[i].OUT();
        }
    }
}
