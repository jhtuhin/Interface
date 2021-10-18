package com.JHTuhin;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable {
    private String name;
    private int hitPoints;
    private int health;

    public Monster(String name, int hitPoints, int health) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getHealth() {
        return health;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", health=" + health +
                '}';
    }

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<String>();
        values.add(0, this.name);
        values.add(1, "" + this.hitPoints);
        values.add(2, "" + this.health);
        return values;
    }

    @Override
    public void read(List<String> savedVales) {
        if (savedVales != null && savedVales.size() > 0) {
            this.name = savedVales.get(0);
            this.hitPoints = Integer.parseInt(savedVales.get(1));
            this.health = Integer.parseInt(savedVales.get(2));
        }
    }
}
