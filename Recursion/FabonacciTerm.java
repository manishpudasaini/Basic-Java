package Recursion;

import java.util.Scanner;
//find the nth term of fibonacci series
public class FabonacciTerm {
    public static void display(int n ,int end,int array[]){
        if(n==end){
            return ;
        }

        array[n]=array[n-2]+array[n-1];
        System.out.println(array[n]);
        display(n+1,end,array);

    }

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the index you want to find::");
        int n=sc.nextInt();
        int[] array = new int[n];
        array[0]=0;
        array[1]=1;

        display(2,n,array);

    }
}
