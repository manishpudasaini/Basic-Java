package StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PrimeNumber {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<7;i++){
            System.out.println("Enter the element ");
            number.add(sc.nextInt());
        }


//        List<Integer>primeFilter = number.stream()
//                .filter(i -> isprime(i)).collect(Collectors.toList());
//        System.out.println("prime number= "+primeFilter);

        List<Integer>primeFilter2 = number.stream()
                .filter(num1 -> primeNumber(num1)).collect(Collectors.toList());
        System.out.println("prime number= "+primeFilter2);


    }


    public static boolean primeNumber(int num1){
            int count=0;
            boolean primeNumber=true;
            for(int i=1;i<=num1;i++){
                if(num1%i==0){
                    count++;
                }
            }
            if(count==2){
                return primeNumber;
            }
            return false;
        }

//    public static boolean isPrime(int num){
//        boolean isPrime =true;
//        for(int i=0;i<=num;i++){
//            if(num%2==0){
//                isPrime=false;
//                break;
//            }
//        }
//        return isPrime;
//    }
}



