package com.pb.skochikovskij.hw6;

public class Veterinarian {

    public void treatAnimal(Animal animal) {
        System.out.println( "Чем же тебя лечить, родной?\n");
        System.out.println("Хмммм кажется вспомнил\n");
        System.out.println("Насобирать немного " + animal.getFood() + " неподалёку от " + animal.getLocation());
    }

}
