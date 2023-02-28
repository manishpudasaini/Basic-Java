package TypeGenerics.ExamplePractice;

public class Dog extends Animal{
    private String name;

    public Dog(String name) {
        this.name = name;
    }
    Dog(){}

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}

