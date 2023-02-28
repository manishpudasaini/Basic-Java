package String;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Manish");
        s.append("Pudasaini Bhadrabas kathmandu");
        System.out.println(s);
        s.trimToSize();
        System.out.println(s.capacity()); //ans=46 formula = (old capacity*2)+2  after using trimeSize ans==35

    }
}
