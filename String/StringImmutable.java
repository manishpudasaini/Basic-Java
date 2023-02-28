package String;

public class StringImmutable {
    public static void main(String[] args) {
//        String name="manish";  //string are immutable it cant be changed
//        System.out.println(name.concat("pudasaini")); //ans= manish
//        System.out.println(name.hashCode()); //-1081...(memory address)
//
//        name=name.concat("Pudasaini");
//        System.out.println(name);//ans=manishpudasaini
//        System.out.println(name.hashCode()); //-1049...(memory address)
//        String s = new String("manish");
//        System.out.println(s);

        String name ="Manish";
        System.out.println(name.concat("pudasaini")); //ans=manish pudasaini
        name.concat("Pudasaini");
        System.out.println(name); //ans=manish

       String newName = name.concat(" pudasaini");
        System.out.println(newName); //ans= manish pudasaini

    }
}
