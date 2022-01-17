package tictactoe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import static MAIN.Main.sc;

public class gameBoard {
    private char[][] showGameBoard={{'┌','-','-','-','┐','┌','-','-','-','┐','┌','-','-','-','┐'},
                                    {'|',' ',' ',' ','|','|',' ',' ',' ','|','|',' ',' ',' ','|'},
                                    {'└','-','-','-','┘','└','-','-','-','┘','└','-','-','-','┘'},
                                    {'┌','-','-','-','┐','┌','-','-','-','┐','┌','-','-','-','┐'},
                                    {'|',' ',' ',' ','|','|',' ',' ',' ','|','|',' ',' ',' ','|'},
                                    {'└','-','-','-','┘','└','-','-','-','┘','└','-','-','-','┘'},
                                    {'┌','-','-','-','┐','┌','-','-','-','┐','┌','-','-','-','┐'},
                                    {'|',' ',' ',' ','|','|',' ',' ',' ','|','|',' ',' ',' ','|'},
                                    {'└','-','-','-','┘','└','-','-','-','┘','└','-','-','-','┘'}};
    private char gameBoard[][] = {{},
           {'-','-','-','-'},
           {'-','-','-','-'},
           {'-','-','-','-'}};
    public void showGame(){
        int rows = 1;
        for(int i = 1;i<=3;i++,rows+=3){
            int cols = 2;
            for(int j = 1;j<=3;j++,cols+=5){
                showGameBoard[rows][cols] = gameBoard[i][j];
            }
        }
        for(char [] Rows : showGameBoard){
            for(char Cols : Rows){
                System.out.print(Cols);
            }
            System.out.println();
        }
    }
    public char checkWin(){
        char win = 'a';
        for(int i= 1;i<=3;i++){
            if(gameBoard[1][i] == gameBoard[2][i]
               && gameBoard[1][i] == gameBoard[3][i]
               && gameBoard[1][i] != '-'){
                win = gameBoard[1][i];
            }
        }
        for(int i =1;i<=3;i++){
            if(gameBoard[i][1] == gameBoard[i][2]
                    && gameBoard[i][1] == gameBoard[i][3]
                    && gameBoard[i][1] != '-'){
                win = gameBoard[i][1];
            }
        }
        if(gameBoard[1][1] == gameBoard[2][2]
           && gameBoard[1][1] == gameBoard[3][3]
           && gameBoard[1][1] != '-'){
            win = gameBoard[1][1];
        }
        if(gameBoard[1][3] == gameBoard[2][2]
                && gameBoard[1][3] == gameBoard[3][1]
                && gameBoard[1][3] != '-'){
            win = gameBoard[1][3];
        }
        int dem = 0;
        for(int i = 1;i<=3;i++){
            for(int j = 1;j<=3;j++){
                if(gameBoard[i][j] == '-'){
                    dem++;
                }
            }
        }
        if(dem == 0 && win == 'a')
            return 't';
        return win;
    }

    public int minimax(int turn){
        char win = checkWin();
        if(win != 'a'){
            if(win == 'X') return 10;
            else if(win == 'O') return -10;
            else return 0;
        }
        if(turn == 1){
            int maxValue = Integer.MIN_VALUE;
            for(int i = 1;i<=3;i++){
                for(int j = 1;j<=3;j++){
                    if(gameBoard[i][j] == '-'){
                        gameBoard[i][j] = 'X';
                        maxValue = Math.max(maxValue,minimax(0));
                        gameBoard[i][j] = '-';
                    }
                }
            }
            return maxValue;
        }else{
            int minValue = Integer.MAX_VALUE;
            for(int i = 1;i<=3;i++){
                for(int j = 1;j<=3;j++){
                    if(gameBoard[i][j] == '-'){
                        gameBoard[i][j] = 'O';
                        minValue = Math.min(minValue,minimax(1));
                        gameBoard[i][j] = '-';
                    }
                }
            }
            return minValue;
        }

    }

    public PointXY moveX(){
        List<PointXY> score = new ArrayList<>();
        for(int i = 1;i<=3;i++){
            for(int j =1;j<=3;j++){
                if(gameBoard[i][j] == '-'){
                    gameBoard[i][j] = 'X';
                    score.add(new PointXY(i,j,minimax(0)));
                    gameBoard[i][j] = '-';
                }
            }
        }
        Collections.sort(score);
        int dem = 0;
        for(int i = 0;i<score.size();i++){
           // System.out.println(score.get(i).getX() + " " + score.get(i).getY() + " " + score.get(i).getScore());
            if(score.get(i).getScore() == score.get(0).getScore()) dem++;
        }
        Random ran = new Random();
        return score.get(ran.nextInt(dem));
    }
    public PointXY moveY(){
        List<PointXY> score = new ArrayList<>();
        for(int i = 1;i<=3;i++){
            for(int j =1;j<=3;j++){
                if(gameBoard[i][j] == '-'){
                    gameBoard[i][j] = 'O';
                    score.add(new PointXY(i,j,minimax(1)));
                    gameBoard[i][j] = '-';
                }
            }
        }
        Collections.sort(score);
        int dem = 0;
        List<PointXY> Score = new ArrayList<>();
        for(int i = score.size()-1;i>=0;i--){
            Score.add(score.get(i));
            if(score.get(i).getScore() == score.get(score.size()-1).getScore()) dem++;
            //System.out.println(score.get(i).getX() + " " + score.get(i).getY() + " " + score.get(i).getScore());
        }
        Random ran = new Random();
        return Score.get(ran.nextInt(dem));
    }
    
    public void gamePlay(){
        List<int []> history = new ArrayList<>();
        char bot,human;
        int turn;
        System.out.println("1) --- Đi trước\n2) --- Đi sau");
        turn = sc.nextInt();
        if(turn == 2) turn = 0;
        System.out.println("1) --- Chọn (X)\n2) --- Chọn (O)");
        int c = sc.nextInt();
        if(c == 1){
            bot = 'O';
            human ='X';
        }else{
            bot = 'X';
            human = 'O';
        }
        for(int i = 1;i<=9;i++){
            if(i%2==turn){
                while(true) {
                    System.out.print("Nhập lựa chọn [1-9]: ");
                    c = sc.nextInt();
                    sc.nextLine();
                    int _x_, _y_;
                    if (c <= 3) {
                        _x_ = 1;
                        _y_ = c;
                    } else if (c <= 6) {
                        _x_ = 2;
                        _y_ = c-3;
                    } else {
                        _x_ = 3;
                        _y_ = c-6;
                    }
                    if (gameBoard[_x_][_y_] == '-' && (c >= 1 && c <= 9)) {
                        gameBoard[_x_][_y_] = human;
                        break;
                    }
                }
            }else{
                System.out.println("Lựa chọn của máy: ");
                PointXY res;
                if(bot == 'X') res = moveX();
                else res = moveY();
                gameBoard[res.getX()][res.getY()] = bot;
            }
            showGame();
            char win = checkWin();
            if(win != 'a'){
                if(win == 't'){
                    System.out.println("Cả hai hoà nhau");
                }else if(win == 'X'){
                    if(win == human){
                        System.out.println("Bạn giành chiến thắng");
                    }else {
                        System.out.println("Bot giành chiến thắng (Gà)");
                    }
                    break;
                }
            }

        }
    }

}







