package com.pb.skochikovskij.hw6;

public class Animal {
    private String food;
    private String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public Animal() {
        this.food = "Вкусная";
        this.location = "Тут не далеко, идём - я покажу =) ";
    }

    public void makeNoise() {
        System.out.println("Ну допустим... Мяу");
    }

    public void eat() {
        System.out.println("С удовольствие облизывается и ест " + food);
    }

    public void sleep() {
        System.out.println("Медленно моргает и засыпает в излюбленном месте - " + location);
    }


    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


}
