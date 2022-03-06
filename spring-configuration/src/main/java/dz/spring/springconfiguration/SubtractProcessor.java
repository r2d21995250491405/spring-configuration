package dz.spring.springconfiguration;

public class SubtractProcessor {

    int a;
    int b;

//    public SubtractProcessor(int a, int b) {
//        this.a = a;
//        this.b = b;
//    }

    public SubtractProcessor(){

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

    public int minus() {
        return a - b;
    }
}
