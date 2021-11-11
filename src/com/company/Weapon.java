package com.company;

class Skeleton extends Boss {

    private int numberOfArrows;

    public int getNumberOfArrows() {
        return numberOfArrows;
    }

    public void setNumberOfArrows(int numberOfArrows) {
        this.numberOfArrows = numberOfArrows;
    }
    public void printlnfo(){
        System.out.println(getHp()+ "\n" + getDamage()+ "\n" + weapon.getWeaponName()+"\n" + weapon.getWeaponType());

        System.out.println("Game finished succesful");
    }
}