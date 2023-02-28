package TypeGenerics;

import java.util.ArrayList;

public class InheritanceIngeneric <T,V>{
   T obj1;
   V obj;


    public <T extends Number,V extends Number> void sumNumber(T obj,V obj1){
        System.out.println(obj.intValue()+obj1.intValue());
    }

//    void displaysInfo(T ob){
//        ob.displayAnimal();
//        //ob.displayDog();
//    }


    public static void main(String[] args) {
       InheritanceIngeneric intgeneric  = new InheritanceIngeneric();
        intgeneric.sumNumber(12,12);

        Animal an = new Animal("Loki");
        Dog dog = new Dog("Samir");

        System.out.println(an.displayAnimal());
        System.out.println(dog.displayDog());

        ArrayList<Animal> alAnimal = new ArrayList<>();
        ArrayList<Dog> alDog = new ArrayList<>();

        alAnimal.add(new Animal("Jack"));
        alDog.add(new Dog("Abhi"));

        System.out.println(alAnimal);
        System.out.println(alDog);

    }

}

class Animal{
    String name;
    Animal(){

    }

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }

    public String displayAnimal() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Dog extends Animal{
    String name;
    public Dog(String name) {
        this.name = name;
    }
    public String displayDog() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}