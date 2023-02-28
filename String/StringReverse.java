package String;

public class StringReverse {
    public static void main(String[] args) {
//        StringBuilder name =new StringBuilder("Manish");
//        name.reverse();   //reverse the string using String Builder
//        System.out.println(name);

//        int[] number={1,2,3,4,5};
//        for(int i= number.length-1;i>=0;i--){
//            System.out.println(number[i]);
//        }

        String firstName="Manish";
        char[] newName=firstName.toCharArray();
        String reverseName="";
        for(int i=newName.length-1;i>=0;i--){
            reverseName += Character.toString(newName[i]);
            System.out.println(newName[i]);  //ans: sinam
        }
        System.out.println(reverseName);

    }
}
