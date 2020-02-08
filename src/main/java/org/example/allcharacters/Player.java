package org.example.allcharacters;

import org.example.AbleToAttack;
import org.example.WeaponType;

public class Player extends Creature implements AbleToAttack {

    public Player(WeaponType playerWeapon) {
        hp = 150;
        strength = 15;
        weaponType = playerWeapon;
        alive = true;
    }

    @Override
    public int attack() {
        if (weaponType.equals(WeaponType.MACE)){
            return hp += 5;
        }
        return strength + weaponType.getDamage() + 1;
    }

}
