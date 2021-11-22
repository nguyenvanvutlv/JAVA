package BAI2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {


    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        ArrayList<Book> Lib = new ArrayList<>();

        while(true) {

            int h =   extracted(sc);

            if (h == 7){
                break;
            }else if(h == 1){

                Book res = INPUT(sc);
                Lib.add(res);

            }else if(h == 2){
                System.out.println("Nhập ID cần sửa: ");
                 int resID = sc.nextInt();
                for(int i = 0;i<Lib.size();i++){
                    if(Lib.get(i).getID() == resID){

                        System.out.println("ID: ");
                        Lib.get(i).setID(sc.nextInt());
                        sc.nextLine();

                        System.out.println("Document: ");
                        Lib.get(i).setName(sc.nextLine());

                        System.out.println("publisher");
                        Lib.get(i).setPublisher(sc.nextLine());

                        System.out.println("Giá: ");
                        Lib.get(i).setPrice(sc.nextFloat());
                        System.out.println("Số trang: ");
                        Lib.get(i).setNumberOfPage(sc.nextInt());
                        sc.nextLine();
                        System.out.println("Tác Giả: ");
                        Lib.get(i).setAuthor(sc.nextLine());
                    }
                }
            }else if(h == 3){

            }else if(h == 4){
                for(int i = 0;i<Lib.size();i++){
                    for(int j = 0;j<i;j++){
                        if(Lib.get(i).getName().compareTo(Lib.get(j).getName()) > 0){
                            Collections.swap(Lib,i,j);
                        }
                    }
                }
            }else if(h == 5){
                for(int i = 0;i<Lib.size();i++){
                    for(int j = 0;j<i;j++){
                        if(Lib.get(i).getPrice() < Lib.get(j).getPrice()){
                            Collections.swap(Lib,i,j);
                        }
                    }
                }
            }else if(h == 6){
                System.out.println(Lib);
            }
        }
    }



    private static int extracted(Scanner sc) {
        System.out.println("1 Add book");
        System.out.println("2 Edit book by id");
        System.out.println("3 Delete book by id");
        System.out.println("4 Sort books by name (ascending)");
        System.out.println("5 Sort books by price (descending)");
        System.out.println("6 Show all books");
        System.out.println("7 EXIT");
        int C = sc.nextInt();

        return C;
    }
    public static Book INPUT(Scanner sc){
        int ID;
        int SoTrang;
        float GiaBan;
        String Document;
        String NXB;
        String TacGia;
        System.out.print("Nhập ID: "); ID = sc.nextInt(); sc.nextLine();
        System.out.print("Nhập Document: "); Document = sc.nextLine();
        System.out.print("Nhà Xuất bản: "); NXB = sc.nextLine();
        System.out.print("Nhập Giá: ");   GiaBan = sc.nextFloat();
        System.out.print("Nhập Số trang: "); SoTrang = sc.nextInt(); sc.nextLine();
        System.out.print("Nhập Tác Giả: "); TacGia = sc.nextLine();
        Book temp =  new Book(ID,Document,NXB,GiaBan,SoTrang,TacGia);
        return temp;

    }


}
