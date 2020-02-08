package org.example.allcharacters;

import org.example.WeaponType;

public abstract class Creature {
    protected boolean alive;
    protected int strength;
    protected int hp;
    protected WeaponType weaponType;

    public void receiveDamage (int damage){
        hp -= damage;
        if (hp <= 0){
            alive = false;
        }
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(WeaponType weaponType) {
        this.weaponType = weaponType;
    }
}


