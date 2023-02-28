package Recursion;

import java.util.Scanner;

/* print ::x^n
           hint:2^5=2*2^4
           2^4=2*2^3 */
public class Powerprint {
    public static int  print(int base , int power){
        if(power==0){
            return 1 ;
        }
        double result = Math.pow(base,power);
        System.out.println(result);
       return print(base,power-1);


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value ::");
        int base = sc.nextInt();

        System.out.println("Enter the Power::");
        int power = sc.nextInt();

        print(base,power);


    }

}
