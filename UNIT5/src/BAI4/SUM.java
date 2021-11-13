package BAI4;

public class SUM <N>{
    N soA;
    N soB;
    public SUM(){

    }
    public SUM(N soA,N soB){
        this.soA = soA;
        this.soB = soB;
    }


    
    public N getSoA() {
        return soA;
    }

    public void setSoA(N soA) {
        this.soA = soA;
    }

    public N getSoB() {
        return soB;
    }

    public void setSoB(N soB) {
        this.soB = soB;
    }
}
