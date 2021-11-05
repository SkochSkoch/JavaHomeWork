package com.pb.skochikovskij.hw6;

import java.util.Objects;

public class Unicorn extends Animal{
    private String nameOfUnicorn;
    private int hornHeight;

    public Unicorn(String nameOfUnicorn) {
        this.nameOfUnicorn = nameOfUnicorn;
    }

@Override
    public void  makeNoise() {
        System.out.println("Цок-Цок и волшебное иго-го");
    }
    @Override
    public void  eat() {
        System.out.println("Бьёт копытцем, а в желудке медленно переваривается " + getFood());
    }
    @Override
    public void  sleep() {
        System.out.println(getLocation() + "Манит и убаюкивает" );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Unicorn unicorn = (Unicorn) o;
        return hornHeight == unicorn.hornHeight && Objects.equals(nameOfUnicorn, unicorn.nameOfUnicorn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfUnicorn, hornHeight);
    }

    @Override
    public String toString() {
        return "Unicorn{" +
                "nameOfUnicorn='" + nameOfUnicorn + '\'' +
                ", hornHeight=" + hornHeight +
                '}';
    }

    public String getNameOfUnicorn() {
        return nameOfUnicorn;
    }

    public void setNameOfUnicorn(String nameOfUnicorn) {
        this.nameOfUnicorn = nameOfUnicorn;
    }

    public int getHornHeight() {
        return hornHeight;
    }

    public void setHornHeight(int hornHeight) {
        this.hornHeight = hornHeight;
    }
}
