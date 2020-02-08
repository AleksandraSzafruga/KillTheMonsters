package org.example.allcharacters;

import org.example.WeaponType;

public class Ghul extends Monster {

    public Ghul() {
        hp = 18;
        strength = 10;
        weaponType = WeaponType.UNARMED;
        alive = true;

    }

    @Override
    public int attack() {
        return strength + weaponType.getDamage();
    }
}

