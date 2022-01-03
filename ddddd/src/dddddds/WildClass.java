package dddddds;

import java.util.ArrayList;
import java.util.List;

class LandAnimal { public void crying() { System.out.println("육지동물"); } }

class Cat extends LandAnimal { public void crying() { System.out.println("냐옹냐옹"); } }

class Dog extends LandAnimal { public void crying() { System.out.println("멍멍"); } }

class Sparrow { public void crying() { System.out.println("짹짹"); } }

 

class AnimalList<hello extends LandAnimal> {

    ArrayList<hello> al = new ArrayList<hello>();

    void add(hello animal) { al.add(animal); }

    hello get(int index) { return al.get(index); }

    boolean remove(hello animal) { return al.remove(animal); }

    int size() { return al.size(); }

}

 

public class WildClass {

    public static void main(String[] args) {

        AnimalList<LandAnimal> landAnimal = new AnimalList<>(); // Java SE 7부터 생략가능함.

 
        landAnimal.add(new LandAnimal());

        landAnimal.add(new Cat());

        landAnimal.add(new Dog());

        // landAnimal.add(new Sparrow()); // 오류가 발생함.

 

        for (int i = 0; i < landAnimal.size() ; i++) {

            landAnimal.get(i).crying();

        }

    }

}