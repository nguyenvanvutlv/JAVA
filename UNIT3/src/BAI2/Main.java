package BAI2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Array arr1 = new Array();
        Array arr2 = new Array();
        System.out.print("Nhập N1: ");
        arr1.setN(sc.nextInt());
        arr1.InputData();

        System.out.print("Nhập N2: ");
        arr2.setN(sc.nextInt());
        arr2.InputData();
        float sum1 = (float) (arr1.SUM()/ (arr1.getN() * 1.0));
        float sum2 = (float) (arr2.SUM()/ (arr2.getN() * 1.0));
        if(sum1 == sum2){
            System.out.println("BYE");
        }else{
            System.out.println("TBC arr1 = "  + sum1);
            System.out.println("TBC arr2 = "  + sum2);
            System.out.println( (sum1 > sum2) ? "Mảng arr1 có TBC lớn hơn" : "Mảng arr2 có TBC lớn hơn" );
        }
        arr1.Filter(false);
        arr2.Filter(true);

    }
}
