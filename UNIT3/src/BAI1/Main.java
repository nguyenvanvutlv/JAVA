package BAI1;

import java.util.Scanner;

public class Main {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        Person Vu = new Person();
        Vu.setAge(18);
        Vu.setName("Nguyễn Văn Vũ");
        Vu.setGender("Nam");
        System.out.println("Name  : " + Vu.getName());
        System.out.println("Age   : " + Vu.getAge());
        System.out.println("Gender: " + Vu.getGender());


        Person Tai = new Person("Ngô Thế Tài",18,"Nữ");
        System.out.println(Tai.toString());


        Person Hung = new Person();
        System.out.print("Name   : "); Hung.setName(sc.nextLine());
        System.out.print("Age    : "); Hung.setAge(sc.nextInt());
        sc.nextLine();
        System.out.print("Gender : "); Hung.setGender(sc.nextLine());
        System.out.println(Hung.toString());

    }
}



