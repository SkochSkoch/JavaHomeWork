package com.pb.skochikovskij.hw6;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*В пакете hw6 создайте класс Animal и расширяющие его классы Dog, Cat, Horse.
Класс Animal содержит переменные food, location и методы makeNoise, eat, sleep.
Метод sleep, например, может выводить на консоль "Такое-то животное спит".
Dog, Cat, Horse переопределяют методы makeNoise, eat.
Добавьте переменные (поля) в классы Dog, Cat, Horse, характеризующие только этих животных.
В классах Dog, Cat, Horse переопределить методы toString, equals, hashCode.
Создайте класс Veterinarian (Ветеринар), в котором определите метод void treatAnimal(Animal animal).
Пусть этот метод печатает на экран food и location пришедшего на прием животного.
Создайте класс VetСlinic в его методе main создайте массив типа Animal, в который запишите животных всех имеющихся у вас типов.
В цикле отправляйте животных на прием к ветеринару.
Объект класса Veterinarian создайте с помощью рефлексии.*/
public class VetСlinic {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Class clazz = Class.forName("com.pb.skochikovskij.hw6.Veterinarian");
        Constructor constructor = clazz.getConstructor();
        Object obj = constructor.newInstance();
        Veterinarian veterinarian = null;
        if (obj instanceof Veterinarian) {
            veterinarian = (Veterinarian) obj;
        }
        Unicorn unicorn1 = new Unicorn("Бодатель2000");
        Unicorn unicorn2 = new Unicorn("Тыгыдым Обыкновенный");
        Seal seal1 = new Seal("Рыба", "Берег", "Большеласт", 98);
        Seal seal2 = new Seal("Корм", "Нора", "Тризуб", 264);
        Panda panda1 = new Panda("Бамбук", "Зоопарк", "Милотун", 3542);
        Panda panda2 = new Panda("Увалень", 2241);

        Animal[] animals = new Animal[]{unicorn1, unicorn2, seal1, seal2, panda1, panda2};

        unicorn1.makeNoise();
        unicorn2.makeNoise();
        seal1.eat();
        panda1.sleep();
        /*
        for (Animal animal : animals) {
            veterinarian.treatAnimal(animal);
        }
*/
    }

}

