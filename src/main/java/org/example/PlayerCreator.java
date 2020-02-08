package org.example;

import org.example.allcharacters.Player;

import java.util.Scanner;

public class PlayerCreator {

    public static Player creatorPlayer() {
        System.out.println("Choose your weapon: 1 - SWORD, 2 - MACE, 3 - NO WEAPON");
        Scanner sc = new Scanner(System.in);
        int choseOption = sc.nextInt();
        sc.nextLine();

        WeaponType weaponType;
        if (choseOption == 1) {
            weaponType = WeaponType.SWORD;
        } else if (choseOption == 2){
            weaponType = WeaponType.MACE;
        }else{
            weaponType = WeaponType.UNARMED;

        }
        return new Player(weaponType);
    }

}