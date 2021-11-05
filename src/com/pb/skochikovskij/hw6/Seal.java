package com.pb.skochikovskij.hw6;

public class Seal extends Animal {

    private String nameOfSeal;
    private int kgWeight;

    public Seal(String nameOfSeal) {
        this.nameOfSeal = nameOfSeal;
    }

    public Seal(String food, String location, String nameOfSeal, int kgWeight) {
        super(food, location);
        this.nameOfSeal = nameOfSeal;
        this.kgWeight = kgWeight;
    }

    public Seal(String nameOfSeal, int kgWeight) {
        this.nameOfSeal = nameOfSeal;
        this.kgWeight = kgWeight;
    }

    @Override
    public void makeNoise() {
        System.out.println("Усиленно хлопает ластами с невоспроизводимыми для написания звуками");
    }

    @Override
    public void eat() {
        System.out.println("Не сводит с тебя глаз ожидая пока в ротик попадёт  " + getFood());
    }

    @Override
    public void sleep() {
        System.out.println(getLocation() + " нагрелся за день, лежать на пузике и засыпать..Что может быть лучше? ");
    }

    public Seal(String food, String location) {
        super(food, location);
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

    public String getNameOfSeal() {
        return nameOfSeal;
    }

    public void setNameOfSeal(String nameOfSeal) {
        this.nameOfSeal = nameOfSeal;
    }

    public int getKgWeight() {
        return kgWeight;
    }

    public void setKgWeight(int kgWeight) {
        this.kgWeight = kgWeight;
    }

}
