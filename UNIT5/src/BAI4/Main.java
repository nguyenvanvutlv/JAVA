package BAI4;

public class Main {
    public static void main(String [] args){
        SUM<Integer> Number_int= new SUM<>(0,0);
        System.out.println("Số A + Số B(int): "+(Number_int.getSoA()+Number_int.getSoB()));

        SUM<Long> Number_Long= new SUM<>(132654798l,4654657l);
        System.out.println("Số A + Số B(Long): "+(Number_Long.getSoA()+Number_Long.getSoB()));

        SUM<Float> Number_Float= new SUM<>(12346789f,987654321f);
        System.out.println("Số A + Số B(Float): "+(Number_Float.getSoA()+Number_Float.getSoB()));

        SUM<Double> Number_Doble= new SUM<>(2.7,0.5);
        System.out.println("Số A + Số B(Double): "+(Number_Doble.getSoA()+Number_Doble.getSoB()));
    }
}
