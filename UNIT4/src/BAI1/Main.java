package BAI1;

import java.util.Scanner;

import static java.lang.Math.abs;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Sach [] Sach_A = new Sach[n];
        for(int i=0; i<n; i++) {
            Sach_A[i] = new Sach();
            
            Sach_A[i].Nhap();
        }
        System.out.println("OUT");
        for(int i=0; i<n; i++) {
            
            Sach_A[i].OUT();
        }
    }
}
