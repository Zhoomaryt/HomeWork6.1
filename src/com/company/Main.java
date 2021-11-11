package com.company;

import java.io.OutputStream;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Boss boss = new Boss();
        boss.setHp(1000);
        boss.setDamage(500);
        boss.weapon.setWeaponName("Магический жезыл");
        boss.weapon.setWeaponType("магия MAX-lv");
        boss.printlnfo();

        System.out.println("Boss ivel");



        System.out.println("---------------------------");



        Skeleton skeleton = new Skeleton();
        skeleton.setHp(700);
        skeleton.setDamage(605);
        skeleton.weapon.setWeaponType("зачерованный лук");
        skeleton.weapon.setWeaponName("100 lv");
        skeleton.printlnfo();
        System.out.println("скелет Жони");


        System.out.println("---------------------------");






        Skeleton skeleton2 = new Skeleton();
        skeleton2.setHp(156);
        skeleton2.setDamage(99);
        skeleton2.weapon.setWeaponType("супер броня");
        skeleton2.weapon.setWeaponName("сила MAX-lv");
        skeleton2.printlnfo();
        System.out.println("скелет Джош");

        System.out.println("----------------------------");


    }
}