package String;

public class ExampleStringBuffer {
    public static void main(String[] args) {
        StringBuffer name = new StringBuffer("Manish");
        System.out.println(name.capacity()); //ans=22
        name.append(" Pudasaini bhadrabas");
        System.out.println(name);
        System.out.println(name.capacity());  //ans=(oldcapacity*2)+2 = 46

    }
}
