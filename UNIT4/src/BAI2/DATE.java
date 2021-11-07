package BAI2;

import java.util.Scanner;

public class DATE {
    private int Day;
    private int Month;
    private int Year;
    public DATE(){

    }
    public DATE(int Day, int Month, int Year){
        this.Day = Day;
        this.Month = Month;
        this.Year  = Year;
    }
    public void setDay(int day) {
        Day = day;
    }
    public void setMonth(int month) {
        Month = month;
    }
    public void setYear(int year) {
        Year = year;
    }
    public void OUT(){
        System.out.print(Day + "/" + Month + "/" + Year + "\n");
    }
}
