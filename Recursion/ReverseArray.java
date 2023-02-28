package Recursion;

//Reverse of an array[]

public class ReverseArray {
    public static void reverse(int size,int array[]){
       if(size==0) {
           return;
       }
        System.out.println(array[size-1]);
        reverse(size-1,array);
    }

    public static void main(String[] args) {
        int array[]={2,3,6,7,8,56,77};
//        for (int i = array.length-1; i >= 0; i--) {
//            System.out.print(array[i] + " ");
//        }
        System.out.println("ArrayLength::"+array.length);
        reverse(array.length, array);
    }
}
