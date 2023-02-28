package TypeGenerics;

public class Test <T>{
    T a;
    T b;

    public Test(T a, T b) {
        this.a = a;
        this.b = b;
    }
    public void print(){
        System.out.println("The result::"+a+b);
    }

}
