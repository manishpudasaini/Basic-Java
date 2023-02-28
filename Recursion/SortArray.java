package Recursion;

//sorting an array

import java.util.Scanner;

public class SortArray {

    public static void print(int i,int size,int array[]){
        if(i==size){
            System.out.println("Completed..");
            return;
        }

            for(int j=i+1;j<size;j++){
                int temp = 0;
                if(array[j]<array[i]){
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
            System.out.println(array[i]);

            print(i+1,size,array);


    }

    public static void main(String[] args) {
        int array[];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array::");
        int size = sc.nextInt();

        array = new int[size];

        for(int i=0;i<size;i++){
            System.out.println("Enter the element of an array::");
            array[i] = sc.nextInt();
        }

//        for(int num:array){
//            System.out.println(num);
//        }
//        SortArray sa = new SortArray();
//        System.out.println(sa);

       print(0,size, array);


    }

}
