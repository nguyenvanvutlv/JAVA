package B4;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.String.*;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String  s = sc.nextLine().toLowerCase().replaceAll("[0-9]", "").trim().replaceAll(" +"," ");

        if (s.length() == 0) return;

        String [] arr = s.split(" ");

        Arrays.setAll(arr, i -> arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1));

        s = join(" ",arr);

        System.out.println(s);
    }
}
