package StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FilterTwoConditionExample {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<7;i++){
            System.out.println("Enter the name in list:");
            nameList.add(sc.nextLine());
        }

        List<String>filterName = nameList.stream()
                .filter(name -> name.startsWith("a") || name.startsWith("A"))
                .filter(name -> name.length()>4 && name.length()<8)
                .collect(Collectors.toList());
        System.out.println(filterName);

    }
}
