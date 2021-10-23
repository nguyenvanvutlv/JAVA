package B1;

import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("MAX: " + Math.max(sc.nextInt(), Math.max(sc.nextInt(), sc.nextInt())));
    }

}
