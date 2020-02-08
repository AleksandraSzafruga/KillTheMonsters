package org.example.allcharacters;

import org.example.WeaponType;

public class Goblin extends Monster {

    public Goblin() {
        hp = 25;
        strength = 10;
        weaponType = WeaponType.MACE;
        alive = true;


    }

    @Override
    public int attack() {
        return strength + weaponType.getDamage();
    }
}
