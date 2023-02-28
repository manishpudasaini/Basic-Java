package String;

import java.sql.SQLOutput;

public class Example2 {
    String name ="Manish";
    String address = "Bhadrabas";
    Integer id = 77;

    @Override
    public String toString() {
        return name+" "+address+" "+id;
    }

    public static void main(String[] args) {
        Example2 ex = new Example2();
        System.out.println(ex.toString());
        System.out.println(ex);

//        System.out.println(2+2); //ans=4
//        System.out.println("Manish"+2+2); //ans=Manish22
//        System.out.println(2+2+"Manish"); //ans = 4Manish

//        char[] charArray = {'H','e','l','l','o'};
//        String str = new String(charArray);
//        System.out.println(str);  //ans=Hello


        System.out.println("String "+(2+2));  //ans = String 4


    }
}
