package TypeGenerics;

public class MultiParameterExample2 <T,K,M>{
    T t;
    K k;
    M m;

    public MultiParameterExample2(T t,K k,M m){
        this.t=t;
        this.k=k;
        this.m=m;
    }
    public void display(){
        System.out.println("Name of employee"+this.t+". "+"Employee salary is "+this.k+". "+"Employee number "+this.m);
    }

    public static void main(String[] args) {
        MultiParameterExample2<String,Integer,Integer> mp1 = new MultiParameterExample2<>("Ronaldo",200000,961402361);
        mp1.display();

        MultiParameterExample2<String,Double,Integer> mp2 = new MultiParameterExample2<>("Messi",200000.9,961406789);
        mp2.display();
    }

}
