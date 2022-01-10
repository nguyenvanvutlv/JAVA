package MAIN;

public class Pair {
    private boolean trangThai;
    private char XO;
    Pair(){}

    Pair(boolean trangThai,char XO){
        this.trangThai = trangThai;
        this.XO = XO;
    }

    public boolean isTrangThai() {
        return trangThai;
    }
    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    public char getXO() {
        return XO;
    }
    public void setXO(char XO) {
        this.XO = XO;
    }

}
