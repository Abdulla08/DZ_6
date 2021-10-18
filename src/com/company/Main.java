package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
Boss boss = new Boss();
boss.setSuperAbility("Magic");
boss.setHealth(300);
        System.out.println(boss.getSuperAbility()+" Health = "+boss.getHealth());
    }
}
