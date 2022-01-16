package tictactoe;

public class PointXY implements Comparable<PointXY>{
    private int X;
    private int Y;
    private int score;

    public PointXY(int X,int Y,int score){
        this.X = X;
        this.Y = Y;
        this.score = score;
    }
    public int getX(){
        return this.X;
    }
    public int getY(){
        return this.Y;
    }
    public int getScore(){
        return this.score;
    }

    public void setX(int x) {
        X = x;
    }

    public void setY(int y) {
        Y = y;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public int compareTo(PointXY o) {
        if(getScore() > o.getScore()) return -1;
        return 1;
    }
}
