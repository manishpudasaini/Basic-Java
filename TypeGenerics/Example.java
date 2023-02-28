package TypeGenerics;

public class Example {
    public Integer sum(int a,int b){
        return a+b;
    }

    public static void main(String[] args) {
        Example ex = new Example();
        int add =ex.sum(2,3);
        System.out.println(add);
    }

}
