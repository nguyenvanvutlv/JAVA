package MAIN;

public class GamePlay {
    // └ ┐ ┌ ┘
    private char[][] gameBoard = {{'┌','-','-','-','┐','┌','-','-','-','┐','┌','-','-','-','┐'},
                                {'|',' ',' ',' ','|','|',' ',' ',' ','|','|',' ',' ',' ','|'},
                                {'└','-','-','-','┘','└','-','-','-','┘','└','-','-','-','┘'},
                                {'┌','-','-','-','┐','┌','-','-','-','┐','┌','-','-','-','┐'},
                                {'|',' ',' ',' ','|','|',' ',' ',' ','|','|',' ',' ',' ','|'},
                                {'└','-','-','-','┘','└','-','-','-','┘','└','-','-','-','┘'},
                                {'┌','-','-','-','┐','┌','-','-','-','┐','┌','-','-','-','┐'},
                                {'|',' ',' ',' ','|','|',' ',' ',' ','|','|',' ',' ',' ','|'},
                                {'└','-','-','-','┘','└','-','-','-','┘','└','-','-','-','┘'}};
    private char[][] gameBoardMain = {{' ',' ',' '},
                                {' ',' ',' '},
                                {' ',' ',' '}};
    private String playerOne;
    private String playerTwo;

    public char[][] getGameBoardMain() {
        return gameBoardMain;
    }

    public Pair checkWinLoseDraw(){

        /// kiểm tra X

        /// kiểm tra hàng ngang
        char tmpXO = 'X';
        int numberOfXO = 0;
        for(int i = 0;i<3;i++){
            numberOfXO += ((gameBoardMain[0][i] == tmpXO) ? 1 : 0);
        }
        if(numberOfXO == 3) {
            Pair result = new Pair();
            result.setXO(tmpXO);
            result.setTrangThai(true);
            return result;
        }
        numberOfXO = 0;
        for(int i = 0;i<3;i++){
            numberOfXO += ((gameBoardMain[1][i] == tmpXO) ? 1 : 0);
        }
        if(numberOfXO == 3) {
            Pair result = new Pair();
            result.setXO(tmpXO);
            result.setTrangThai(true);
            return result;
        }

        numberOfXO = 0;
        for(int i = 0;i<3;i++){
            numberOfXO += ((gameBoardMain[2][i] == tmpXO) ? 1 : 0);
        }
        if(numberOfXO == 3) {
            Pair result = new Pair();
            result.setXO(tmpXO);
            result.setTrangThai(true);
            return result;
        }
        /// kiểm tra hàng ngang


        /// kiểm tra hàng dọc
        numberOfXO = 0;
        for(int i = 0;i<3;i++){
            numberOfXO += ((gameBoardMain[i][0] == tmpXO) ? 1 : 0);
        }
        if(numberOfXO == 3) {
            Pair result = new Pair();
            result.setXO(tmpXO);
            result.setTrangThai(true);
            return result;
        }
        numberOfXO = 0;
        for(int i = 0;i<3;i++){
            numberOfXO += ((gameBoardMain[i][1] == tmpXO) ? 1 : 0);
        }
        if(numberOfXO == 3) {
            Pair result = new Pair();
            result.setXO(tmpXO);
            result.setTrangThai(true);
            return result;
        }

        numberOfXO = 0;
        for(int i = 0;i<3;i++){
            numberOfXO += ((gameBoardMain[i][2] == tmpXO) ? 1 : 0);
        }
        if(numberOfXO == 3) {
            Pair result = new Pair();
            result.setXO(tmpXO);
            result.setTrangThai(true);
            return result;
        }
        /// kiểm tra hàng dọc

        /// kiểm tra hai đường chéo
        numberOfXO = 0;
        numberOfXO += ((gameBoardMain[0][0] == tmpXO) ? 1 : 0)+
                      ((gameBoardMain[1][1] == tmpXO) ? 1 : 0)+
                      ((gameBoardMain[2][2] == tmpXO) ? 1 : 0);
        if(numberOfXO == 3){
            Pair result = new Pair();
            result.setXO(tmpXO);
            result.setTrangThai(true);
            return result;
        }
        numberOfXO = 0;
        numberOfXO += ((gameBoardMain[0][2] == tmpXO) ? 1 : 0)+
                ((gameBoardMain[1][1] == tmpXO) ? 1 : 0)+
                ((gameBoardMain[2][0] == tmpXO) ? 1 : 0);
        if(numberOfXO == 3) {
            Pair result = new Pair();
            result.setXO(tmpXO);
            result.setTrangThai(true);
            return result;
        }
        /// kiểm tra hai đường chéo



        /// kiểm tra O
        /// kiểm tra hàng ngang
        tmpXO = 'O';
        numberOfXO = 0;
        for(int i = 0;i<3;i++){
            numberOfXO += ((gameBoardMain[0][i] == tmpXO) ? 1 : 0);
        }
        if(numberOfXO == 3) {
            Pair result = new Pair();
            result.setXO(tmpXO);
            result.setTrangThai(true);
            return result;
        }
        numberOfXO = 0;
        for(int i = 0;i<3;i++){
            numberOfXO += ((gameBoardMain[1][i] == tmpXO) ? 1 : 0);
        }
        if(numberOfXO == 3) {
            Pair result = new Pair();
            result.setXO(tmpXO);
            result.setTrangThai(true);
            return result;
        }

        numberOfXO = 0;
        for(int i = 0;i<3;i++){
            numberOfXO += ((gameBoardMain[2][i] == tmpXO) ? 1 : 0);
        }
        if(numberOfXO == 3) {
            Pair result = new Pair();
            result.setXO(tmpXO);
            result.setTrangThai(true);
            return result;
        }
        /// kiểm tra hàng ngang


        /// kiểm tra hàng dọc
        numberOfXO = 0;
        for(int i = 0;i<3;i++){
            numberOfXO += ((gameBoardMain[i][0] == tmpXO) ? 1 : 0);
        }
        if(numberOfXO == 3) {
            Pair result = new Pair();
            result.setXO(tmpXO);
            result.setTrangThai(true);
            return result;
        }
        numberOfXO = 0;
        for(int i = 0;i<3;i++){
            numberOfXO += ((gameBoardMain[i][1] == tmpXO) ? 1 : 0);
        }
        if(numberOfXO == 3) {
            Pair result = new Pair();
            result.setXO(tmpXO);
            result.setTrangThai(true);
            return result;
        }

        numberOfXO = 0;
        for(int i = 0;i<3;i++){
            numberOfXO += ((gameBoardMain[i][2] == tmpXO) ? 1 : 0);
        }
        if(numberOfXO == 3) {
            Pair result = new Pair();
            result.setXO(tmpXO);
            result.setTrangThai(true);
            return result;
        }
        /// kiểm tra hàng dọc

        /// kiểm tra hai đường chéo
        numberOfXO = 0;
        numberOfXO += ((gameBoardMain[0][0] == tmpXO) ? 1 : 0)+
                ((gameBoardMain[1][1] == tmpXO) ? 1 : 0)+
                ((gameBoardMain[2][2] == tmpXO) ? 1 : 0);
        if(numberOfXO == 3){
            Pair result = new Pair();
            result.setXO(tmpXO);
            result.setTrangThai(true);
            return result;
        }
        numberOfXO = 0;
        numberOfXO += ((gameBoardMain[0][2] == tmpXO) ? 1 : 0)+
                ((gameBoardMain[1][1] == tmpXO) ? 1 : 0)+
                ((gameBoardMain[2][0] == tmpXO) ? 1 : 0);
        if(numberOfXO == 3) {
            Pair result = new Pair();
            result.setXO(tmpXO);
            result.setTrangThai(true);
            return result;
        }
        /// kiểm tra hai đường chéo



        /// return null
        return new Pair(false,' ');
    }

    public void copyGameBoardMain2GameBoard(){
        int col = 1;
        int row = 2;
        for(int i = 0;i<3;i++,col+=3){
            row = 2;
            for(int j =0;j<3;j++,row+=5){
                gameBoard[col][row] = gameBoardMain[i][j];
            }
        }

    }

    public void showGameBoard(){
        System.out.println(playerOne + " vs " + playerTwo);
        for(char [] row : gameBoard){
            for(char col : row){
                System.out.print(col);
            }
            System.out.println();
        }
    }

    public boolean setChoice(int choice,char XO) {
        if(choice < 1 || choice > 9) return false;

        if(choice>=1 && choice <= 3){

            if(gameBoardMain[0][choice-1] != ' ') return false;
            gameBoardMain[0][choice-1] = XO;

        }else if(choice>=4 && choice <= 6){

            if(gameBoardMain[1][choice-4] != ' ') return false;
            gameBoardMain[1][choice-4] = XO;

        }else if(choice>=7 && choice <= 9){

            if(gameBoardMain[2][choice-7] != ' ') return false;
            gameBoardMain[2][choice-7] = XO;

        }

        copyGameBoardMain2GameBoard();
        return true;
    }

    public boolean winner(){
        return checkWinLoseDraw().isTrangThai();
    }

    public void setPlayerOne(String playerOne) {
        this.playerOne = playerOne;
    }

    public void setPlayerTwo(String playerTwo) {
        this.playerTwo = playerTwo;
    }

    /**
     * 1 2
     * 1 7
     * 1 12
     * 4 2
     * 4 7
     * 4 12
     * 7 2
     * 7 7
     * 7 12
     * */




}
