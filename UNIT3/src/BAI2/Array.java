package BAI2;

import java.util.Scanner;

public class Array {
    Scanner sc = new Scanner(System.in);
    private int [] arr;
    private int N;
    public Array(){}
    public Array(int [] arr,int N){
        this.arr = arr;
        this.N = N;
    }


    public int[] getArr() {
        return arr;
    }

    public int getN() {
        return N;
    }


    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public void setN(int n) {
        this.N = n;
    }

    public void InputData(){
        arr = new int[N];
        for(int i = 0;i<N;i++){
            System.out.print("arr[" + i + "]: "); arr[i] = sc.nextInt();
        }
    }
    public void SHOW(){
        System.out.print("Arr: ");
        for(int i = 0;i<N;i++) System.out.print(arr[i] + " ");
    }
    public int SUM(){
        int sum = 0;
        for(int i = 0;i<N;i++){
            sum += arr[i];
        }
        return sum;
    }
    public void Filter(boolean flag){
        System.out.print((!flag) ? "Các số lẻ: " : "Các số chẵn: ");
        if(flag) {
            for (int i = 0; i < N; i++) {
                if (arr[i] % 2 == 0) {
                    System.out.print(arr[i] + " ");
                }
            }
        }else {
            for (int i = 0; i < N; i++) {
                if (arr[i] % 2 == 1) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
        System.out.println();

    }

}
