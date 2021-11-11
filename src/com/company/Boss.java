package com.company;

public class Boss extends GameEntity{
    Weapon weapon = new Weapon();

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    public void printlnfo(){
        System.out.println(getHp()+ "\n" + getDamage()+ "\n" + weapon.getWeaponName()+"\n" + weapon.getWeaponType());

    }
}