package StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EvenOdd {
    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<7;i++){
            System.out.println("Enter the number in list:");
            numberList.add(sc.nextInt());
        }

        List<Integer> EvenfilterList = numberList.stream()
                .filter(num -> num%2==0).collect(Collectors.toList());
        List<Integer> OddfilterList = numberList.stream()
                .filter(num -> num%2!=0).collect(Collectors.toList());

        System.out.println(EvenfilterList);
        System.out.println(OddfilterList);
    }
}
