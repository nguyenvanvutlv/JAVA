package MAIN;


import java.util.Scanner;

public class Account implements Comparable<Account>{

    private int rank;
    private String fullname;
    private String username;
    private int match;
    private int win;
    private int lose;
    private int winStreak;
    private int winStreakMax;
    private float rate;
    private int elo;
    Scanner sc = new Scanner(System.in);
    public Account(int rank, String fullname, String username, int match, int win, int lose, int winStreak,int winStreakMax, int elo) {
        this.rank = rank;
        this.fullname = fullname;
        this.username = username;
        this.match = match;
        this.win = win;
        this.lose = lose;
        this.winStreak = winStreak;
        this.winStreakMax = winStreakMax;
        this.elo = elo;
    }

    public void calculateRate(){
        if(match != 0){
            rate = (float) ((win*1.0)/(match*1.0));
        }
    }

    public int getWinStreakMax() {
        return winStreakMax;
    }

    public void setWinStreakMax(int winStreakMax) {
        this.winStreakMax = winStreakMax;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public int getMatch() {
        return match;
    }

    public void setMatch(int match) {
        this.match = match;
    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public int getLose() {
        return lose;
    }

    public void setLose(int lose) {
        this.lose = lose;
    }

    public int getWinStreak() {
        return winStreak;
    }

    public void setWinStreak(int winStreak) {
        this.winStreak = winStreak;
    }


    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public int getElo() {
        return elo;
    }

    public void setElo(int elo) {
        this.elo = elo;
    }

    public void showINFO(){
        int t = 0;
        System.out.println("             ┌---------------------------------┐");
        System.out.print(  "             | Username: " + username + " | ⚡ " + winStreak + " streak");

        t = 10 - username.length() - Integer.toString(winStreak).length();
        for(int i = 1;i<=t;i++){
            System.out.print(' ');
        }
        System.out.println("|");

        System.out.println("┌------------|---------------------------------|------------┐");
        System.out.print("| Rank: " + rank);
        t = 5 - Integer.toString(rank).length();
        for(int i= 1;i<=t;i++){
            System.out.print(' ');
        }
        System.out.print("|");

        System.out.print("       Win: "+win);
        t = 4 - Integer.toString(win).length();
        for(int i = 1;i<=t;i++){
            System.out.print(' ');
        }
        System.out.print(" Lose: " + lose);
        t  = 10 - Integer.toString(lose).length();
        for(int i = 1;i<=t;i++){
            System.out.print(' ');
        }

        System.out.print("| Elo: " + elo);
        t = 6 - Integer.toString(elo).length();
        for(int i= 1;i<=t;i++){
            System.out.print(' ');
        }
        System.out.println('|');
        System.out.println("└------------┘---------------------------------└------------┘");

    }


    @Override
    public int compareTo(Account o) {
            if(getElo() == o.getElo()){
                if(getRate() == o.getRate()){
                    if(getWin() == o.getWin()){
                        return (getWinStreakMax() > o.getWinStreakMax()) ? -1 : 1;
                    }else return (getWin() > o.getWin()) ? -1 : 1;
                }else return (getRate() > o.getRate()) ? -1 : 1;
            }
            return (getElo() > o.getElo()) ? -1 : 1;
    }
}
