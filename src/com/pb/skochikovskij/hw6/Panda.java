package com.pb.skochikovskij.hw6;

import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Panda panda = (Panda) o;
        return hugsLastYear == panda.hugsLastYear && Objects.equals(nameOfPanda, panda.nameOfPanda);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfPanda, hugsLastYear);
    }

    @Override
    public String toString() {
        return "Panda{" +
                "nameOfPanda='" + nameOfPanda + '\'' +
                ", hugsLastYear=" + hugsLastYear +
                '}';
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
