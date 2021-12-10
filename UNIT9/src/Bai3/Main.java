package Bai3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        List<News> list_info = new ArrayList<>();
        while(true) {
            int c = extracted(sc);

            if(c == 1){

                InsertNews(sc, list_info);

            }else if(c == 2){

                ViewListNews(list_info);

            }else if(c == 3){
                AverageRate(list_info);
            }else if(c == 4){
                System.out.println("Exit");
                break;
            }
        }

    }
    private static void AverageRate(List<News> list_info) {
        for(News info : list_info){
            info.Calculate();
            info.Display();
        }
    }


    private static void ViewListNews(List<News> list_info) {
        for(News info : list_info){
            info.Display();
        }
    }

    private static void InsertNews(Scanner sc, List<News> list_info) {
        News info = new News();
        System.out.println("ID: ");
        info.setId(sc.nextInt());
        sc.nextLine();

        System.out.println("Title: ");
        info.setTitle(sc.nextLine());

        System.out.println("Public Date: ");
        info.setPublishDate(sc.nextLine());

        System.out.println("Author: " );
        info.setAuthor(sc.nextLine());

        System.out.println("Content: ");
        info.setContent(sc.nextLine());

        System.out.println("Rate list: ");
        info.Input();
        list_info.add(info);
    }

    private static int extracted(Scanner sc) {
        System.out.println("1.Insert News");
        System.out.println("2.View List News");
        System.out.println("3.Average Rate");
        System.out.println("4.Exit");
        int c = sc.nextInt();

        return c;
    }


}
