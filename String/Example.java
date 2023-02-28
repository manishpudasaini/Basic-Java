package String;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
//        System.out.printf("%%manish"); //ans = %manish
//        System.out.println();
//        System.out.println("\"manish\"");//ans = "manish"
//        float num = 123.4f;
//        System.out.printf("In scientific notation %f=%e",num,num);
//        System.out.printf("In scientific notation %e",num);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name::");
        String name = sc.nextLine();
        System.out.println(name);

        System.out.println("Enter your new name::");
        String newName = sc.next();
        System.out.println(newName);  //manish pudasaini bhadrabas ans=manish

        System.out.println("Enter last name::");
        String lastname = sc.next();
        System.out.println(lastname); //ans=pudasaini

        System.out.println("Enter address::");
        String address = sc.nextLine();
        System.out.println(address); //ans=bhadrabas


    }
}
