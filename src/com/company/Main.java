package com.company;

public class Main {

    public static void main(String[] args) {


        Boss boss=new Boss();
        boss.age=25;
        boss.damage=100;
        boss.health=300;
        boss.name="Rusik";
        boss.weapon="brain";
        System.out.println(boss.getAge()+ " " +boss.getName()+ " " +boss.getDamage()+ " "  +boss.getHealth()+ " " +boss.getWeapon());







    }
}
