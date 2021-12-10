package Bai3;

import java.util.ArrayList;
import java.util.Scanner;
public class News implements INews{
    private int id;
    private String title;
    private String publishDate;
    private String author;
    private String content;
    private float averageRate;
    ArrayList<Integer> rateList = new ArrayList<>();
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public float getAverageRate() {
        return averageRate;
    }


    @Override
    public void Display(){

        System.out.println("Title: " + getTitle());
        System.out.println("Publish date: " + getPublishDate());
        System.out.println("Author: " + getAuthor());
        System.out.println("Content: " + getContent());
        System.out.println("AverageRate: " + getAverageRate());

    }
    public void Input(){
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<3;i++){
            rateList.add(sc.nextInt());
        }
    }
    public void Calculate(){

        int sum_of_rate = 0;
        for(int i =0;i<3;i++){

            sum_of_rate += rateList.get(i);

        }
        this.averageRate = (float)(sum_of_rate/3);

    }
}
