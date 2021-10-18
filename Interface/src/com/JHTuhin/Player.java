package com.JHTuhin;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable{
    private String name;
    private int hitPoints;
    private int health;
    private String weapon;

    public Player(String name, int hitPoints, int health) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.health = health;
        this.weapon="Gun";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", health=" + health +
                ", weapon='" + weapon + '\'' +
                '}';
    }

    @Override
    public List<String> write() {
        List<String> values= new ArrayList<String>();
        values.add(0,this.name);
        values.add(1,""+this.hitPoints);
        values.add(2,""+this.health);
        values.add(3,""+this.weapon);
        return values;
    }

    @Override
    public void read(List<String> savedVales) {
        if(savedVales !=null && savedVales.size()>0){
            this.name = savedVales.get(0);
            this.hitPoints = Integer.parseInt(savedVales.get(1));
            this.health = Integer.parseInt(savedVales.get(2));
            this.weapon = savedVales.get(3);
        }
    }
}
