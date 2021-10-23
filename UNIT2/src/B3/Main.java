package B3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        String s = cin.nextLine();
        float sum = 0,cnt = 0;
        for(int i = 0;i<s.length();i++){
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                sum += s.charAt(i) - '0';
                cnt++;
            }
        }
        if(cnt > 0) System.out.print("true\n" + sum / cnt);
        else System.out.print("false");


    }
}
