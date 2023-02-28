package String;

public class StringCompare {
    public static void main(String[] args) {
        String name="Manish";
        String lastName="Manish";
        Boolean s = name.equals(lastName);  //comparing the string using equals keyword
        System.out.println(s);
        System.out.println(name.compareTo(lastName));  //comparing the string using compareTo keyword
        System.out.println(name==lastName);  //comparing the string using operator
    }
}
