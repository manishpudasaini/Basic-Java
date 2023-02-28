package TypeGenerics;

import java.security.PublicKey;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class JavaGenricClass<T,V> {
    T obj1;
    V obj2;
    int obj=4;

    public JavaGenricClass(T obj1, V obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public T getObj1() {
        return obj1;
    }

    public V getObj2() {
        return obj2;
    }

    @Override
    public String toString() {
        return "JavaGenricClass{" +
                "obj1=" + obj1 +
                ", obj2=" + obj2 +
                '}';
    }
    public void displayArray(T[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        JavaGenricClass jgc = new JavaGenricClass<Integer,String>(12,"Manish");
        JavaGenricClass jgc1 = new JavaGenricClass<String,Integer>("Manish",7);
        JavaGenricClass jgc2 = new JavaGenricClass<String,Character>("Manish",'S');
        JavaGenricClass jgc3 = new JavaGenricClass<String,Float>("Manish",7.7f);
        JavaGenricClass jgc4 = new JavaGenricClass<Integer,Double>(11,7.7);

        System.out.println(jgc);
        System.out.println(jgc1);
        System.out.println(jgc2);
        System.out.println(jgc3);
        System.out.println(jgc4);

        Integer[] intArray = {1,2,3,5,6,7};
        String[] stringsArray = {"Manish","Samir","Shashi"};
        System.out.println("Integer array::");
        jgc.displayArray(intArray);

        System.out.println();

        System.out.println("String array::");
        jgc.displayArray(stringsArray);

    }
}
