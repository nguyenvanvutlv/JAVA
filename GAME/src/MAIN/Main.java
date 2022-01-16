package MAIN;
import java.io.IOException;
import java.util.*;
import tictactoe.*;

public class Main {
    public static List<Account> listUser = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);
    public static Scanner scan;
    static Controller  file = new Controller();

    public static void clear(){

    }

    public static void main(String[] args) throws IOException {




        listUser = file.readAccount("account.txt");


        //// // └ ┐ ┌ ┘

        int screen = 1;
        while(true){

            menu(screen);
            if(screen == 1){
                System.out.print("Nhập lựa chọn: ");
                int c = sc.nextInt();
                sc.nextLine();
                if(c == 1){
                    clear();
                    if(listUser.size() <= 1){
                        System.out.println("Không thể tạo trận dấu do không đủ người chơi");
                        System.out.println();
                    }else screen = 2;
                }else if(c == 2){
                    clear();

                    for(Account account : listUser){
                        account.calculateRate();
                    }
                    Collections.sort(listUser);
                    System.out.println("Thông tin toàn bộ "+listUser.size() +" người chơi");
                    int rank = 1;
                    for(Account account : listUser){
                        account.setRank(rank);
                        rank++;
                        account.showINFO();
                    }
                    file.updateAccount2File("account.txt",listUser);
                    System.out.println();
                }else if(c == 3){
                    createAccount();
                    clear();
                }else break;
            }else if(screen == 2){
                System.out.print("Nhập lựa chọn: ");
                int c = sc.nextInt();
                sc.nextLine();
                if(c == 1){
                    clear();
                    String playerOne;
                    String playerTwo;
                    System.out.print("Nhập tên người chơi 1: ");
                    playerOne = sc.nextLine();
                    System.out.print("Nhập tên người chơi 2: ");
                    playerTwo = sc.nextLine();
                    if(!checkUser(playerOne) || !checkUser(playerTwo)) System.out.println("Không tìm thấy người chơi");
                    else{
                        /**
                         * GameOn
                         * */
                        int eloOne = 0;
                        int eloTwo = 0;
                        for(Account acc : listUser){
                            if(acc.getUsername().compareTo(playerOne) == 0){
                                eloOne = acc.getElo();
                            }
                            if(acc.getUsername().compareTo(playerTwo) == 0){
                                eloTwo = acc.getElo();
                            }
                        }
                        if(eloOne > eloTwo){
                            String tmp = playerOne;
                            playerOne = playerTwo;
                            playerTwo = tmp;
                        }
                        GameOnPlayerVsPlayer(playerOne,playerTwo);
                    }
                }else if(c == 2){
                    screen = 3;
                }else{
                    screen = 1;
                    clear();
                }
            }else if(screen == 3){
                clear();
                System.out.print("Nhập lựa chọn: ");
                int choice = sc.nextInt();
                sc.nextLine();
                if(choice == 1){
                    System.out.print("Nhập tên người chơi: ");
                    String namePlayer = sc.nextLine();
                    if(!checkUser(namePlayer)){
                        System.out.println("Không tìm thấy tên người chơi");
                    }else{
                        GameOnPlayerVsBot(namePlayer);
                    }
                }else if(choice == 2){
                    System.out.print("Nhập tên người chơi: ");
                    String namePlayer = sc.nextLine();
                    if(!checkUser(namePlayer)){
                        System.out.println("Không tìm thấy tên người chơi");
                    }else{
                        gameOnPlayerHard(namePlayer);
                    }
                }else{
                    screen = 2;
                }

            }else if(screen == 4){
                break;
            }else{



            }


        }

    }
    public static void menu(int screen){
        if(screen==1) {
            System.out.println("┌-----------------------------┐");
            System.out.println("|1) Tạo trận đấu              |"); ///
            System.out.println("|-----------------------------|");
            System.out.println("|2) Xem thông tin người chơi  |");  ///
            System.out.println("|-----------------------------|");
            System.out.println("|3) Tạo tài khoản             |");  ///
            System.out.println("|-----------------------------|");
            System.out.println("|4) Thoát                     |"); ///
            System.out.println("└-----------------------------┘");
        }else if(screen == 2){
            System.out.println("┌-----------------------------┐");
            System.out.println("|1) Người vs Người            |");///
            System.out.println("|-----------------------------|");
            System.out.println("|2) Người vs Máy              |");
            System.out.println("|-----------------------------|");
            System.out.println("|3) Thoát                     |"); ///
            System.out.println("└-----------------------------┘");
        }else{
            System.out.println("┌-----------┐");
            System.out.println("|1) Dễ      |");
            System.out.println("|-----------|");
            System.out.println("|2) Khó     |");
            System.out.println("|-----------|");
            System.out.println("|3) Thoát   |");
            System.out.println("└-----------┘");
        }

    }
    public static void createAccount() throws IOException {
        String tmpFullName;
        String tmpUsername;
        System.out.print("Nhập Họ và Tên: ");
        tmpFullName = sc.nextLine();
        System.out.print("Nhập Username: ");
        tmpUsername = sc.nextLine();
        while(checkUser(tmpUsername)){
            System.out.print("Nhập lại Username: ");
            tmpUsername = sc.nextLine();
        }
        Account newAccount = new Account(listUser.size()+1,tmpFullName,tmpUsername,0,0,0,0,0,0);
        listUser.add(newAccount);
        file.updateAccount2File("account.txt",listUser);
    }
    private static boolean checkUser(String userName) {
        for(int i = 0;i<listUser.size();i++){
            if(listUser.get(i).getUsername().compareTo(userName)==0) {
                return true;
            }
        }
        return false;
    }
    public static void GameOnPlayerVsPlayer(String playerOne,String playerTwo) throws IOException {
        clear();
        String los = "-";
        String win = "-";
        int numberOfRound = 10;
        System.out.println(playerOne + " đi trước ");
        GamePlay gameOn = new GamePlay();
        gameOn.setPlayerOne(playerOne);
        gameOn.setPlayerTwo(playerTwo);
        gameOn.copyGameBoardMain2GameBoard();
        gameOn.showGameBoard();
        for(int i = 1;i<=9;i++){
            System.out.print("Nhập lựa chọn (1-9): ");

            if(i % 2 == 1){
                boolean c = gameOn.setChoice(sc.nextInt(),'X');
                sc.nextLine();
                while(!c){
                    System.out.print("Nhập lại lựa chọn: ");
                    c = gameOn.setChoice(sc.nextInt(),'X');
                    sc.nextLine();
                }
            }else{
                boolean c = gameOn.setChoice(sc.nextInt(),'O');
                sc.nextLine();
                while(!c){
                    System.out.print("Nhập lại lựa chọn: ");
                    c = gameOn.setChoice(sc.nextInt(),'O');
                    sc.nextLine();
                }
            }
            gameOn.showGameBoard();
            boolean status = gameOn.winner();
            if(status){
                if(i%2==1){
                    win = playerOne;
                    los = playerTwo;
                }else{
                    win = playerTwo;
                    los = playerOne;
                }
                numberOfRound = i;
                break;
            }
        }
        if(win!="-"){
            System.out.println(win + " winner ");

            for(int i = 0;i<listUser.size();i++){
                if(listUser.get(i).getUsername().compareTo(win) == 0){
                    listUser.get(i).setMatch(listUser.get(i).getMatch() + 1);
                    listUser.get(i).setWin(listUser.get(i).getWin() + 1);
                    listUser.get(i).setWinStreak(listUser.get(i).getWinStreak()+1);
                    listUser.get(i).setWinStreakMax(max(listUser.get(i).getWinStreakMax(), listUser.get(i).getWinStreak()));
                    listUser.get(i).setElo(max(0,listUser.get(i).getElo() + 9 - numberOfRound + 1)*10);
                    listUser.get(i).calculateRate();
                }
                if(listUser.get(i).getUsername().compareTo(los)==0){
                    listUser.get(i).setMatch(listUser.get(i).getMatch() + 1);
                    listUser.get(i).setLose(listUser.get(i).getLose() + 1);
                    listUser.get(i).setWinStreak(0);
                    listUser.get(i).setElo(max(0,listUser.get(i).getElo() - (9 - numberOfRound + 1)));
                    listUser.get(i).calculateRate();
                }
            }

        }else{
            System.out.println(" Draw ");
            for(int i = 0;i<listUser.size();i++){
                if(listUser.get(i).getUsername().compareTo(playerOne) == 0){
                    listUser.get(i).setMatch(listUser.get(i).getMatch() + 1);
                    listUser.get(i).setWinStreak(0);
                    listUser.get(i).setElo(listUser.get(i).getElo()+2);
                    listUser.get(i).calculateRate();
                }
                if(listUser.get(i).getUsername().compareTo(playerTwo) == 0){
                    listUser.get(i).setMatch(listUser.get(i).getMatch() + 1);
                    listUser.get(i).setWinStreak(0);
                    listUser.get(i).setElo(listUser.get(i).getElo() + 2);
                    listUser.get(i).calculateRate();
                }
            }
        }
        file.updateAccount2File("account.txt",listUser);

    }

    public static void GameOnPlayerVsBot(String player){

        int turn=-1;
        System.out.println("1 ---- Bạn đi trước");
        System.out.println("2 ---- Máy đi trước");
        System.out.print("Nhập lựa chọn: ");
        turn = sc.nextInt();
        sc.nextLine();
        GamePlay gameOn = new GamePlay();
        gameOn.setPlayerOne(turn == 1 ? player : "Bot");
        gameOn.setPlayerTwo(turn == 2 ? player : "Bot");
        gameOn.copyGameBoardMain2GameBoard();
        gameOn.showGameBoard();

        char XOOne = turn == 1 ? 'X' : 'O';
        char XOTwo = turn == 2 ? 'X' : 'O';


        PlayerVsBot A = new PlayerVsBot();
        A.deleteList();

        int [] gameBoard = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
        for(int i = 1;i<=9;i++){
            A.deleteList();
            update(gameOn,gameBoard);
            A.setCurrentStatus(gameBoard);
            System.out.print("Nhập lựa chọn ");
            if(turn == 1){
                System.out.print(player + ": ");
                boolean statusSetchoice = gameOn.setChoice(sc.nextInt(),XOOne);
                sc.nextLine();
                while(!statusSetchoice){
                    System.out.print("Nhập lại lựa chọn: ");
                    statusSetchoice = gameOn.setChoice(sc.nextInt(),XOOne);
                    sc.nextLine();
                }
                turn = 2;
            }else{
                System.out.print("Bot: ");
                A.backTracking(1,XOTwo);
                int [] K =  {0,0,0,0,0,0,0,0,0,0,0};
                int c = A.respond(K);
                K[c]++;
                int printResult = c;
                while(!gameOn.setChoice(c,XOTwo)){
                    c = A.respond(K);
                    K[c]++;
                    printResult = c;
                }
                System.out.println(printResult);
                turn = 1;
            }

            gameOn.showGameBoard();
            if(gameOn.winner()){
                if(turn == 1){
                    System.out.println("Máy thắng");
                }else{
                    System.out.println(player + " Thắng ");
                }
                return ;
            }
        }
        System.out.println(player + " Hoà Máy ");
    }

    private static void update(GamePlay gameOn, int[] gameBoard) {
        char [][] gameBoardChar = gameOn.getGameBoardMain();
        int index = 1;
        for(char [] rows : gameBoardChar){
            for(char cols : rows){
                if(cols == 'X')
                    gameBoard[index++] = 1;
                else if(cols == 'O')
                    gameBoard[index++] = 0;
                else gameBoard[index++] = -1;
            }
        }
    }

    private static int max(int a,int b) {
        return Math.max(a, b);
    }


    public static void gameOnPlayerHard(String name){
        gameBoard tictactoe = new gameBoard();
        tictactoe.gamePlay(name);
    }

}
