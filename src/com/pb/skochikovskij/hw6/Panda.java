package com.pb.skochikovskij.hw6;

public class Panda extends Animal {
    private String nameOfPanda;
    private int hugsLastYear;


    public Panda(String food, String location, String nameOfPanda, int hugsLastYear) {
        super(food, location);
        this.nameOfPanda = nameOfPanda;
        this.hugsLastYear = hugsLastYear;
    }

    public Panda(String nameOfPanda, int hugsLastYear) {
        this.nameOfPanda = nameOfPanda;
        this.hugsLastYear = hugsLastYear;
    }

    @Override
    public void makeNoise() {
        System.out.println("хрустит ветками из дальнего угла вольера");
    }

    @Override
    public void eat() {
        System.out.println("Обнимается с перерывами только на то, чтобы поглотить очередной  " + getFood());
    }

    @Override
    public void sleep() {
        System.out.println(getLocation() + " позаботился чтобы сон был комфортным");
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public String getNameOfPanda() {
        return nameOfPanda;
    }


    public void setNameOfPanda(String nameOfPanda) {
        this.nameOfPanda = nameOfPanda;
    }

    public int getHugsLastYear() {
        return hugsLastYear;
    }

    public void setHugsLastYear(int hugsLastYear) {
        this.hugsLastYear = hugsLastYear;
    }
}
