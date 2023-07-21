package models;

import java.util.ArrayList;

public class Hero {
    private String name;
    private int id;
    private int age;
    private String powers;
    private  String weakness;
    private int defence;
    private int attack;
    private boolean occupied;
    private static ArrayList<Hero> heroes=new ArrayList<Hero>();

    public Hero(String name, int age, String powers, String weakness, int defence, int attack) {
        this.name = name;
        this.age = age;
        this.powers = powers;
        this.weakness = weakness;
        this.defence = defence;
        this.attack = attack;
        heroes.add(this);
        this.id=heroes.size();
    }

    public static ArrayList<Hero> getHeroes() {
        return heroes;
    }

    public void updateHero(boolean occupied){
        this.occupied=occupied;
    }

    public void deleteHero(){
        heroes.remove(id-1);
    }


    public static Hero findById(int id){
        try {
            return heroes.get(id-1);
        } catch (IndexOutOfBoundsException exception) {
            return null;
        }

    }

    public void setId(int id) {
        this.id = id;
    }

    public static void clearAll(){
        heroes.clear();
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getPowers() {
        return powers;
    }

    public String getWeakness() {
        return weakness;
    }

    public int getDefence() {
        return defence;
    }

    public int getAttack() {
        return attack;
    }

    public boolean isOccupied() {
        return occupied;
    }
}