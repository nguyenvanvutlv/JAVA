package Bai1;

public class Main {
    public static void main(String [] args){
        Person employee_A = new Employee("Trung","HN",3300);
        Person customer_B = new Customer("Linh","BN",10400);

        employee_A.display();
        customer_B.display();
    }
}
