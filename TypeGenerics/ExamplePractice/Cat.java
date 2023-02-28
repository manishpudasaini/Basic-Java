package TypeGenerics.ExamplePractice;

public class Cat extends Animal{
    private String name;

    public Cat(String name) {
        this.name = name;
    }
    Cat(){}

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
