package StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterExample {
    public static void main(String[] args) {

        List<Integer> number = new ArrayList<>();
        number.add(10);
        number.add(2);
        number.add(-4);
        number.add(15);
        number.add(-45);
        number.add(90);
        number.add(-10);

        List<Integer> positiveNumber = new ArrayList<>();
        List<Integer> negativeNumber = new ArrayList<>();

        positiveNumber= number.parallelStream().filter(i -> i > 0).collect(Collectors.toList());
        negativeNumber= number.parallelStream().filter(i -> i < 0).collect(Collectors.toList());

        System.out.println("positive Number from the list= "+positiveNumber);
        System.out.println("Negative number from the list= "+negativeNumber);

    }
}
