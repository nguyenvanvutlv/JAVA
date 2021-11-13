package BAI3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        LOPHOC H = new LOPHOC();
       

        // NHAP THONG TIN

        Scanner sc = new Scanner(System.in);

        System.out.print("Mã Lớp Học: ");
        H.setMaLH(sc.nextLine());

        System.out.print("Tên Lớp Học: ");
        H.setTenLH(sc.nextLine());

        System.out.print("Ngày Mở: ");
        H.setNgayMo(sc.nextLine());

        System.out.print("Tên Giáo Viên: ");
        H.setGiaoVien(sc.nextLine());

        System.out.print("Số lượng sinh viên: ");
        H.setN(sc.nextInt());
        
        ArrayList<SINHVIEN> x = new ArrayList<>();
        for(int i = 0;i<H.getN();i++){
            SINHVIEN  res = new SINHVIEN();
            res.NHAP();
            x.add(res);
        }

        H.setX(x);

        xuat(H);



        System.out.println("Số học sinh khoá 15 là: ");
        FIND(H);
        SORT(H);

        xuat(H);
        
    }
    public static void xuat(LOPHOC H){
        System.out.print("Ma LH: " + H.getMaLH() + "Ten LH: " +H.getTenLH() + 
                            "Ngay mo: " + H.getNgayMo() +  "\n");
        System.out.printf("%-20s %-10s %-50s ", "Ho ten", "Ngay sinh", "Que quan");
        System.out.printf("%-10s %-5s %-10s \n", "Ma SV", "Nganh", "Khoa hoc");
        for(int i=0;i<H.getN();i++){
            H.getX().get(i).Xuat();
        }
    }
    public static void SORT(LOPHOC H){

        for(int i = 0;i<H.getN();i++){
            for(int j = 0;j<i;j++){
                int ai = H.getX().get(i).getKhoaHoc();
                int aj = H.getX().get(j).getKhoaHoc();
                if(aj > ai){
                    Collections.swap(H.getX(), i, j);
                }
            }
        }

    }
    public static void FIND(LOPHOC H){
        for(int i = 0;i<H.getN();i++){
            if(H.getX().get(i).getKhoaHoc() == 15){
                H.getX().get(i).Xuat();
            }
        }
    }

}
