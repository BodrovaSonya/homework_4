/**
 * div which implements IOperation
 */

public class Div extends Operation {
    public Div(double a_, double b_) {
        super(a_, b_);
    }

    public double getResult() {
        return super.getA() - super.getB();
    }
}
