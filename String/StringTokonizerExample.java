package String;

import java.util.StringTokenizer;

public class StringTokonizerExample {
    public static void main(String[] args) {
        StringTokenizer name1 = new StringTokenizer("Manish/pudasaini/is/a/good/boy");
        System.out.println(name1.countTokens()); //ans=6 it will seperate the token using white space by default

        while (name1.hasMoreTokens()){  //it will check the string and return bollean
            System.out.println(name1.nextToken("/")); //it will display all the string token seperately
        }

        System.out.println();

        StringTokenizer name = new StringTokenizer("Manish,pudasaini,is,a,good boy",",");
        System.out.println(name.countTokens());  //ans=5 //it will seperate by usrin , delelmeter

        while (name.hasMoreTokens()){  //it will check the string and return bollean
            System.out.println(name.nextToken()); //it will display all the string token seperately
        }
    }
}
