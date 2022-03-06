package dz.spring.springconfiguration;

public class SumProcessor {
    int a;
    int b;

//    public SumProcessor(int a, int b) {
//        this.a = a;
//        this.b = b;
//    }

    public SumProcessor(){

    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int sum() {
        return a + b;
    }
}
