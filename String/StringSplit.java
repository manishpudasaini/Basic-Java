package String;

import java.util.Arrays;

public class StringSplit {
    public static void main(String[] args) {
        String text="Hello My name is manish ";
        String[] sentence =text.split(" ");
        System.out.println(Arrays.toString(sentence));
        for(String a:sentence){
            System.out.println(a);
        }
    }
}
