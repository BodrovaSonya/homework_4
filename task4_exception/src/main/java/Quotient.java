/**
 * quotient which implements IOperation
 */

public class Quotient extends Operation {
    public Quotient(double a_, double b_) {
        super(a_, b_);
    }

    public double getResult() {
        return super.getA() / super.getB();
    }
}
