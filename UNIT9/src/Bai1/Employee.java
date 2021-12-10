package Bai1;

public class Employee extends Person{
    private int Salary;

    public Employee(String name, String address, int Salary) {
        super(name, address);
        this.Salary = Salary;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    @Override
    public void display() {
        System.out.println("Employee name: " + getName());
        System.out.println("Employee address: " + getAddress());
        System.out.println("Employee salary: " + getSalary());
    }
}
