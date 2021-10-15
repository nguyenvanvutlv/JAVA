public class Main {
    public static void main(String[] args) {
        // This is The first project for JAVA
        int n = 11,m = 11;

        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=m;j++){
                if(j == m){
                    System.out.print("*\n");
                }else{
                    if(i == 1 || j == 1 || i == n) {
                        System.out.print("* ");
                    }else {
                        System.out.print("  ");
                    }
                }
            }
        }


    }
}
