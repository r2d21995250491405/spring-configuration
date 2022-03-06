package dz.spring.springconfiguration;

public class Calculator {

    DivideProcessor div;
    MultiplyProcessor mult;
    SumProcessor sum;
    SubtractProcessor sub;

    public Calculator(DivideProcessor div, MultiplyProcessor mult, SumProcessor sum, SubtractProcessor sub) {
        this.div = div;
        this.mult = mult;
        this.sum = sum;
        this.sub = sub;
    }

    public void printValues(){
        System.out.println(div.divide());
        System.out.println(mult.multiply());
        System.out.println(sum.sum());
        System.out.println(sub.minus());
    }
}
