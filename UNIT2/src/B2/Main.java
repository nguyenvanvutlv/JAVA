package B2;

import java.util.Scanner;
import java.lang.System;
public class Main {
    private static void SHOW(){
        System.out.println("1) Nhập N và mảng A");
        System.out.println("2) Hiển thị mảng vừa tạo ");
        System.out.println("3) Thêm 1 phần tử vào vị trí k bất kỳ");
        System.out.println("4) Xóa 1 phần tử tại vị trí k bất kỳ");
        System.out.println("5) Hiển thị mảng đảo ngược");
        System.out.println("6) Hiển thị phần tử a[1] và các số chia hết cho a[1]");
        System.out.println("7) Xuất ra màn hình tổng các số nguyên tố có trong mảng");
        System.out.println("8) Thoát  (Khi nhấn thoát thì chương trình mới kết thúc)");
    }
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int N = 0;
        int [] arr = new int[0];
        int choose = -1;

        while(choose != 8){
            SHOW();
            choose = cin.nextInt();
            if(choose == 1){

                System.out.print("N: ");
                N = cin.nextInt();
                arr = new int[N];
                for(int i = 0;i<N;i++){
                    System.out.print("arr[" + i + "]: ");
                    arr[i] = cin.nextInt();
                }
            }else if(choose == 2){
                System.out.print("arr: ");
                for(int i = 0;i<N;i++){
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }else if(choose == 3){

                N+=1;
                arr = add(cin, N, arr);

            }else if(choose == 4){

                N--;
                arr = remove(cin, N, arr);

            }else if(choose == 5){
                System.out.print("arr: ");
                for(int i = N-1;i>=0;i--){
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }else if(choose == 6){
                System.out.print("A[1]: " + arr[1] + "\n");
                System.out.print("Các số chia hết cho " + arr[1] + ": ");
                for(int i = 0;i<N;i++){
                    if(arr[i] % arr[1] == 0)
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }else if(choose == 7){
                int sum =0;
                for(int i= 0;i<N;i++){
                    if(isprime(arr[i])) sum+=arr[i];
                }
                System.out.println("SUM: " + sum);
            }
        }


    }

    private static int[] remove(Scanner cin, int N, int[] arr) {
        System.out.print("Chỉ số: ");
        int index = cin.nextInt();
        while(index < 0 || index > N){
            System.out.println("Nhập Lại chỉ số: ");
            index = cin.nextInt();
        }
        int [] res = arr;
        arr = new int [N];
        System.arraycopy(res, 0, arr, 0, index);
        System.arraycopy(res, index + 1, arr, index, N - index);
        return arr;

    }

    private static int[] add(Scanner cin, int N, int[] arr) {
        System.out.print("Giá Trị: ");
        int value = cin.nextInt();
        System.out.print("Chỉ số: ");
        int index = cin.nextInt();
        while(index < 0 || index > N){
            System.out.println("Nhập Lại chỉ số: ");
            index = cin.nextInt();
        }
        int [] res = arr;
        arr = new int[N];
        System.arraycopy(res, 0, arr, 0, index);
        arr[index] = value;
        if (N - (index + 1) >= 0) System.arraycopy(res, index + 1 - 1, arr, index + 1, N - (index + 1));
        return arr;

    }


    private static boolean isprime(int a){
        for(int i= 2;i*i<=a;i++){
            if(a % i == 0) return false;
        }
        return a >= 2;
   }
   private static void OUTPUT(int [] a,int n){
       System.out.print("arr: ");
        for(int i= 0;i<n;i++){
            System.out.print(a[i] + " ");
        }
       System.out.println();
   }

}
