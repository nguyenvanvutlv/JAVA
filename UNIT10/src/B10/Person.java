package B10;

import java.util.Scanner;

public class Person implements Comparable<Person>{
    private int ID;
    private String Name;
    private String Address;
    Scanner sc = new Scanner(System.in);
    public Person(){

    }

    public Person(int ID,String Name,String Address){
        this.ID = ID;
        this.Name = Name;
        this.Address = Address;
    }


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }


    public void INPUT(){

        System.out.print("ID: ");
        ID = sc.nextInt();
        sc.nextLine();
        System.out.print("Name: ");
        Name = sc.nextLine();
        System.out.print("Address: ");
        Address = sc.nextLine();
    }

    @Override
    public String toString() {
        return "Person{" +
                "ID=" + ID +
                ", Name='" + Name + '\'' +
                ", Address='" + Address + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person tmp) {

        if(Name.compareTo(tmp.Name) == 0){
            return Address.compareTo(tmp.Address);
        }
        return Name.compareTo(tmp.Name);
    }
}
