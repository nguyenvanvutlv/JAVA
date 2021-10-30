package BAI3;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner sc = new Scanner(System.in);


        String [] Weapon = {"AK47","M16","Scar-L","M416","AWM","M24"};

        int Game = 5 ,index = 0;
        String [] Result = new String[Game];

        for(int i = 1;i<=Game;i++) {


            Guns DiepBeDe = new Guns( Weapon[random.nextInt(Weapon.length)] , 100);
            Guns DoanXinhGai = new Guns( Weapon[random.nextInt(Weapon.length)] , 100);

            while (DiepBeDe.getAmmoNumber() != 0 && DoanXinhGai.getAmmoNumber() != 0) {

                 System.out.print("DiepBeDe : "  + DiepBeDe.getAmmoNumber());
                 System.out.println("\tDoanXinhGai: "  + DoanXinhGai.getAmmoNumber());

                boolean zero = false;
                DiepBeDe.Shoot(random.nextInt(11));
                DoanXinhGai.Shoot(random.nextInt(11));

                if (DiepBeDe.getAmmoNumber() == 0 && DoanXinhGai.getAmmoNumber() == 0) {
                    System.out.println("Cả hai hết đoạn rùi");
                    DiepBeDe.Load(random.nextInt(11));
                    DoanXinhGai.Load(random.nextInt(11));
                    zero = true;
                } else {
                    if (DiepBeDe.getAmmoNumber() == 0) {
                        Result[index] = "Game" + String.valueOf(i) + "\n"
                                + "DoanXinhGai đã Thắng với " + DoanXinhGai.getWeaponName() + "\t"
                                + "DiepBeDe đã thua với " + DiepBeDe.getWeaponName() ;
                        index++;
                        break;
                    } else if (DoanXinhGai.getAmmoNumber() == 0) {
                        Result[index] = "Game" + String.valueOf(i) + "\n"
                                + "DiepBeDe đã Thắng với " + DiepBeDe.getWeaponName() + "\t"
                                + "DoanXinh đã thua với " + DoanXinhGai.getWeaponName() ;
                        index++;
                        break;
                    }
                }
            }
        }
        for(int i = 0;i<Game;i++){
            System.out.println(Result[i]);
        }
    }


}
