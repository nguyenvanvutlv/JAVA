package BAI1;

import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int SUM = 0;
        int dem = 0;
        String s = sc.nextLine();
        for (int i = 0;i<s.length();i++){

            int digist = (int)(s.charAt(i)) - 48;
            if(digist >= 0 && digist <= 9){
                if (i > 0 && s.charAt(i - 1) == '-') {
                    digist = -digist;
                }
                SUM+=digist;
                dem++;
            }

        }
        if(dem == 0){
            System.out.println("Có 0 ký tự số");
            System.out.println("Tích: 0");
        }else {
            int MUL = 1;
            for (int i = 0; i < s.length(); i++) {
                int digist = (int)(s.charAt(i))-48;
                if (digist > 0 && digist <= 9 && SUM % digist == 0) {
                    if (i > 0 && s.charAt(i - 1) == '-') {
                        digist = -digist;
                    }
                    MUL *= digist;
                }
            }
            System.out.println("Có " + dem + " ký tự số");
            System.out.println("Tích: "+MUL);
        }
    }
}
