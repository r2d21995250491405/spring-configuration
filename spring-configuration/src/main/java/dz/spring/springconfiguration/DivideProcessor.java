package dz.spring.springconfiguration;

public class DivideProcessor {
    int a;
    int b;

//    public DivideProcessor(int a, int b) {
//        this.a = a;
//        this.b = b;
//    }

    public DivideProcessor(){

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

    public int divide() {
        return a / b;
    }


}
