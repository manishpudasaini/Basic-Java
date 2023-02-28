package TypeGenerics;

public class MultiParameterGenerics <T,K>{
    public static <T,K> void displayTwoParameter(T[] number,K address){
        for(int i=0;i< number.length;i++){
            System.out.println(number[i]);
        }
        System.out.println(address);

    }

    public static void main(String[] args) {
       Integer num[]={12,13,4,1,15,16,7,8,90};
       String address = "Bhadrabas";

       MultiParameterGenerics.displayTwoParameter(num,address);
    }

}
