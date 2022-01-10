package MAIN;


import java.util.ArrayList;
import java.util.List;
import java.lang.String;

public class PlayerVsBot {
    private int [] status = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
    private int [] currentStatus = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
    private int [] result =  {0,0,0,0,0,0,0,0,0,0,0};
    private List<String> listCase = new ArrayList<>();

    /***
     * từ file main sẽ lấy dữ liệu để cập nhật mảng currentStatus
     * mảng status sẽ tạo các trường hợp sẽ xảy ra từ currentStatus
     * respond() hàm trả về giá trị của máy chọn
     * caculator hàm tính toán
     */

    public void deleteList(){
        listCase.clear();
        for(int i = 1;i<=9;i++){
            status[i] = -1;
            currentStatus[i] = -1;
            result[i] = 0;
        }
    }
    public void setCurrentStatus(int [] currentStatus){
        this.currentStatus = currentStatus;
    }

    public int caculator(char XO){
        String b = "m";
        for(int i =1;i<=9;i++){
            if(status[i] == 1) b+='X';
            else if(status[i] == 0) b+='O';
            else b+='-';
        }
        for(String s : listCase){
            if(s.equals(b)) return 0;
        }
        listCase.add(b);
        /*
        for(int i = 1;i<=9;i++){
            System.out.print(status[i] + " ");
            if(i%3==0) System.out.println();
        }
        */

        int cnt = (XO == 'X' ? 1 : 0);
        int bnt = (cnt == 1 ? 0 : 1);
        /**
         * 123
         * 456
         * 789
         * 147
         * 258
         * 369
         *
         * 159
         * 357
         * */
        int dem = 0;
        dem += (status[1] == cnt ? 1 : 0) +
                (status[5] == cnt ? 1 : 0) +
                (status[9] == cnt ? 1 : 0);
        if(dem == 3) {
            if((status[7] == bnt && status[3] == bnt) && currentStatus[5] == -1) return 5;
            if((status[2] == bnt && status[8] == bnt) && currentStatus[5] == -1) return 5;
            if((status[4] == bnt && status[6] == bnt) && currentStatus[5] == -1) return 5;
            if((status[2] == bnt && status[3] == bnt  && currentStatus[1] == -1) || (status[4] == bnt && status[7] == bnt  && currentStatus[1] == -1)) return 1;
            if((status[6] == bnt && status[3] == bnt && currentStatus[9] == -1) || (status[8] == bnt && status[7] == bnt && currentStatus[9] == -1)) return 9;
            for (int i = 1; i <= 9; i += 4) {
                if (currentStatus[i] == -1) return i;
            }
        }

        dem = 0;
        dem += (status[3] == cnt ? 1 : 0) +
                (status[5] == cnt ? 1 : 0) +
                (status[7] == cnt ? 1 : 0);
        if(dem == 3) {
            if((status[1] == bnt && status[9] == bnt) && currentStatus[5] == -1) return 5;
            if((status[2] == bnt && status[8] == bnt) && currentStatus[5] == -1) return 5;
            if((status[4] == bnt && status[6] == bnt) && currentStatus[5] == -1) return 5;
            if((status[1] == bnt && status[2] == bnt  && currentStatus[3] == -1) || (status[6] == bnt && status[9] == bnt  && currentStatus[3] == -1)) return 3;
            if((status[1] == bnt && status[4] == bnt && currentStatus[7] == -1) || (status[8] == bnt && status[9] == bnt && currentStatus[7] == -1)) return 7;
            for (int i = 3; i <= 7; i += 2) {
                if (currentStatus[i] == -1) return i;
            }
        }


        dem = 0;
        dem += (status[1] == cnt ? 1 : 0) +
                (status[2] == cnt ? 1 : 0) +
                (status[3] == cnt ? 1 : 0);
        if(dem == 3) {
            if((status[5] == bnt && status[7] == bnt) && currentStatus[3] == -1) return 3;
            if((status[6] == bnt && status[9] == bnt) && currentStatus[3] == -1) return 3;
            if((status[5] == bnt && status[8] == bnt) && currentStatus[2] == -1) return 2;
            if((status[4] == bnt && status[7] == bnt  && currentStatus[1] == -1) || (status[5] == bnt && status[9] == bnt  && currentStatus[1] == -1)) return 1;
            for(int i= 1;i<=3;i++){
                if(currentStatus[i] == -1) return i;
            }
        }
        dem = 0;
        dem += (status[4] == cnt ? 1 : 0) +
                (status[5] == cnt ? 1 : 0) +
                (status[6] == cnt ? 1 : 0);
        if(dem == 3){
            if((status[1] == bnt && status[9] == bnt) && currentStatus[5] == -1) return 5;
            if((status[2] == bnt && status[8] == bnt) && currentStatus[5] == -1) return 5;
            if((status[3] == bnt && status[7] == bnt) && currentStatus[5] == -1) return 5;
            if((status[1] == bnt && status[7] == bnt) && currentStatus[4] == -1) return 4;
            if((status[3] == bnt && status[9] == bnt) && currentStatus[6] == -1) return 6;
            for(int i= 4;i<=6;i++){
                if(currentStatus[i] == -1) return i;
            }
        }
        dem = 0;
        dem += (status[7] == cnt ? 1 : 0) +
                (status[8] == cnt ? 1 : 0) +
                (status[9] == cnt ? 1 : 0);
        if(dem == 3){
            if((status[1] == bnt && status[4] == bnt) && currentStatus[7] == -1) return 7;
            if((status[3] == bnt && status[5] == bnt) && currentStatus[7] == -1) return 7;
            if((status[2] == bnt && status[5] == bnt) && currentStatus[8] == -1) return 8;
            if((status[1] == bnt && status[5] == bnt) && currentStatus[9] == -1) return 9;
            if((status[3] == bnt && status[6] == bnt) && currentStatus[9] == -1) return 9;
            for(int i= 7;i<=9;i++){
                if(currentStatus[i] == -1) return i;
            }
        }

        dem = 0;
        dem += (status[1] == cnt ? 1 : 0) +
                (status[4] == cnt ? 1 : 0) +
                (status[7] == cnt ? 1 : 0);
        if(dem == 3){
            if((status[2] == bnt && status[3] == bnt) && currentStatus[1] == -1) return 1;
            if((status[5] == bnt && status[9] == bnt) && currentStatus[1] == -1) return 1;
            if((status[5] == bnt && status[6] == bnt) && currentStatus[4] == -1) return 4;
            if((status[8] == bnt && status[9] == bnt) && currentStatus[7] == -1) return 7;
            if((status[3] == bnt && status[5] == bnt) && currentStatus[7] == -1) return 7;
            for(int i= 1;i<=7;i+=3){
                if(currentStatus[i] == -1) return i;
            }
        }
        dem = 0;
        dem += (status[2] == cnt ? 1 : 0) +
                (status[5] == cnt ? 1 : 0) +
                (status[8] == cnt ? 1 : 0);
        if(dem == 3){
            if((status[1] == bnt && status[3] == bnt) && currentStatus[2] == -1) return 2;
            if((status[1] == bnt && status[9] == bnt) && currentStatus[5] == -1) return 5;
            if((status[3] == bnt && status[7] == bnt) && currentStatus[5] == -1) return 5;
            if((status[4] == bnt && status[6] == bnt) && currentStatus[5] == -1) return 5;
            if((status[7] == bnt && status[9] == bnt) && currentStatus[8] == -1) return 8;
            for(int i= 2;i<=8;i+=3){
                if(currentStatus[i] == -1) return i;
            }
        }
        dem = 0;
        dem += (status[3] == cnt ? 1 : 0) +
                (status[6] == cnt ? 1 : 0) +
                (status[9] == cnt ? 1 : 0);
        if(dem == 3){
            if((status[1] == bnt && status[2] == bnt) && currentStatus[3] == -1) return 3;
            if((status[5] == bnt && status[7] == bnt) && currentStatus[3] == -1) return 3;
            if((status[4] == bnt && status[5] == bnt) && currentStatus[6] == -1) return 6;
            if((status[7] == bnt && status[8] == bnt) && currentStatus[9] == -1) return 9;
            if((status[1] == bnt && status[5] == bnt) && currentStatus[9] == -1) return 9;
            for(int i= 3;i<=9;i+=3){
                if(currentStatus[i] == -1) return i;
            }
        }

        return 0;
    }

    public int respond(int [] c){
        int dem = 0;
        int k = -1;
        for(int i = 1;i<=9;i++){
            if(dem < result[i] && currentStatus[i] == -1 && c[i] == 0){
                dem = result[i];
                k = i;
            }
        }
        if(k < 1 || k > 9){
            for(int i=1;i<=9;i++){
                if(currentStatus[i] == -1) return i;
            }

        }
        return k;
    }

    public void backTracking(int index,char XO){

        for(int i = 0;i<=1;i++){

            if(currentStatus[index] == -1)
                status[index] = i;
            else status[index] = currentStatus[index];
            if(index == 9){
                int dem = 0;
                for(int j = 1;j<=9;j++){
                    if(status[j] == 1) dem++;

                }
                if(dem == 5){
                    result[caculator(XO)]++;
                }
            }else backTracking(index+1,XO);
            if(currentStatus[index] == -1){
                status[index] = -1;
            }
        }

    }
}
