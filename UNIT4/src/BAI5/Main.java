package BAI5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        
         System.out.println(isPrime(1.12));
         System.out.println(isPrime(100000009));
         System.out.println(isPrime(321));

        
        
        
    }
    public static boolean isPrime(int n){
        for(int i = 2;i*i<=n;i++){
            if(n % i == 0) return false;
        }
        return n > 2;
    }
    public static boolean isPrime(long n){
        for(long i = 2;i*i<=n;i++){
            if(n % i == 0) return false;
        }
        return n > 2;
    }
    public static boolean isPrime(float n){
         return false;
    }
    public static boolean isPrime(double n){
        return false;
   }
}
