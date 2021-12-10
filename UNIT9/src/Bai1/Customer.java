package Bai1;

public class Customer extends Person{
    private int Balance;

    public Customer(String name, String address,int Balance) {
        super(name, address);
        this.Balance = Balance;
    }
    public int getBalance() {
        return Balance;
    }

    public void setBalance(int Balance) {
        this.Balance = Balance;
    }
    @Override
    public void display() {
        System.out.println("Customer name: " + getName());
        System.out.println("Customer address: " + getAddress());
        System.out.println("Customer balance: " + getBalance());
    }
}
