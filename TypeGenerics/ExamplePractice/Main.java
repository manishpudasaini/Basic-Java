package TypeGenerics.ExamplePractice;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Dog> alDog = new ArrayList<>();
        alDog.add(new Dog("Gog1"));
        alDog.add(new Dog("Kog12"));
        alDog.add(new Dog("Log3"));
        alDog.add(new Dog("Dpg43"));
        alDog.add(new Dog("Yog55"));
        alDog.add(new Dog("Aog6"));
        alDog.add(new Dog("Dog6"));

        ArrayList<Cat> alCat = new ArrayList<>();
        alCat.add(new Cat("Cat1"));
        alCat.add(new Cat("BAt28"));
        alCat.add(new Cat("YAt13"));
        alCat.add(new Cat("UAt44"));
        alCat.add(new Cat("Rat5"));
        alCat.add(new Cat("Qat16"));

        ArrayList<Animal> alAnimal = new ArrayList<>();
        alAnimal.addAll(alDog);
        alAnimal.addAll(alCat);

//        alDog.addAll(alCat);  //we cannot add cat list in the dog because it is not extended to Cat
//        alCat.addAll(alDog);

        System.out.println(alAnimal);

        alAnimal.sort(new AnimalComparator());
        alDog.sort(new DogComparator());
        System.out.println(alDog);
        List<? extends Number> num= new ArrayList<Integer>();
        List<? extends Number> num1= new ArrayList<Double>(); //wild card
        List<? super Number> num3 = new ArrayList<Number>();

     }
}
