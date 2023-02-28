package TypeGenerics;

import java.util.Scanner;

public class ArrayGenerics {
    public <T> void arrayDisplay(T[] array){
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }


    public static void main(String[] args) {
        ArrayGenerics ag = new ArrayGenerics();

        Integer arryNumber[] = {1,12,13,14,15,3,5,6};
        ag.arrayDisplay(arryNumber);

        String arrayName[] = {"Manish","Ronaldo","Messi","Real Madrid","Ramos"};
        ag.arrayDisplay(arrayName);

    }

}
