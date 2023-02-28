package TypeGenerics;

public class TestProgram {
    public static void main(String[] args) {
        Test<Integer> tp1 = new Test<Integer>(2,3);
        tp1.print();

        Test<String> tp2 = new Test<String>("Hello","world!!");
        tp2.print();

        Test<Double> tp3 = new Test<Double>(1.00,4.000);
        tp3.print();

        Test<Float> tp4 = new Test<Float>(1.0f,5.0f);
        tp4.print();

    }
}
