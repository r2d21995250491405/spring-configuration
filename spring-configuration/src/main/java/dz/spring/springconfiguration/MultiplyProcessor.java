package dz.spring.springconfiguration;

public class MultiplyProcessor {

    int a;
    int b;

//    public MultiplyProcessor(int a, int b) {
//        this.a = a;
//        this.b = b;
//    }
    public MultiplyProcessor(){

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

    public int multiply() {
        return a * b;
    }
}
