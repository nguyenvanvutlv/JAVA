package BAI1;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập N: ");
        int n = sc.nextInt();
        ArrayList<DieuHoa> arr = new ArrayList<>(n);
        for(int i = 0;i<n;i++){
            DieuHoa res = new DieuHoa();
            res.Nhap();
            arr.add(res);
        }


        //arr.stream().filter(i -> i.getTenHangSanXuat().compareTo("Electrolux") == 0).forEach(DieuHoa::Xuat);
        for(DieuHoa i : arr){
            if( i.getTenHangSanXuat().compareTo("Electrolux") == 0) {
                i.Xuat();
            }
        }

        int MINX = 10000009;
        for(DieuHoa i : arr){
            MINX = Math.min(MINX,i.getGiaBan());
        }
        System.out.println("Danh Sách Sản Phẩm Có Giá Bán Thấp Nhất");
        for(DieuHoa i : arr){
            if(i.getGiaBan() == MINX){
                i.Xuat();
            }
        }


    }


}
