package B10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){

        ArrayList<Person> Persons = new ArrayList<Person>();

        Scanner sc = new Scanner(System.in);

        int people = 0;

        try{
            System.out.println("Input: N = ");
            people = sc.nextInt();
            sc.nextLine();
        } catch (Exception e){
            System.out.println("error " + e.getMessage());
        }

        for(int i = 0;i < people;i++){

            System.out.println("Person[" + (i + 1 )+ "] : ");
            Person new_person = new Person();
            boolean flag = true;

            try{
                new_person.INPUT();
            } catch (Exception e){
                flag = false;
                System.out.println("Error " + e.getMessage());
            }

            if(flag){
                Persons.add(new_person);
            }

        }
        System.out.println("sort by Name");
        Collections.sort(Persons);

        for(Person person_i : Persons){
            System.out.println(person_i.toString());
        }

        System.out.println("sort by ID");

        Collections.sort(Persons, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getID() - o2.getID();
            }
        });

        for(Person person_i : Persons){
            System.out.println(person_i.toString());
        }


    }
}
