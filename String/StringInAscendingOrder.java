package String;

import java.util.Arrays;

public class StringInAscendingOrder {
    public static void main(String[] args) {
//        String name="Manish";
//        System.out.println(name.substring(0,4)); //ans=mani
//        String a="a";
//        String b="b";
//        System.out.println(a.compareTo(b)); //ans=-1


        //Sorting the string in ascending order
        String word = "Java is a programming language";
        //converting the String in array by spliting the string by using white space
        String[] splitString = word.split(" ");
        System.out.println(Arrays.toString(splitString));

        //sorting array
        for(int i=0;i< splitString.length;i++){
            for(int j=i+1;j< splitString.length;j++){
                String temp = " ";
                if (splitString[j].compareToIgnoreCase(splitString[i]) < splitString[i].compareToIgnoreCase(splitString[j])) {
                    temp = splitString[i];
                    splitString[i] = splitString[j];
                    splitString[j] = temp;
                }
            }
            System.out.println(splitString[i]);
        }

        String str="Manish";
        String str1 = new String("Samir");
        System.out.println(str1.intern()==str);  //ans= false

        String str3="Manish";
        String str4 = new String("Manish");
        System.out.println(str4.intern()==str3);  // ans= true
    }
}
