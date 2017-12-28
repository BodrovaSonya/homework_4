/**
 * mult which implements IOperation
 */

public class Mult extends Operation {
    public Mult(double a_, double b_) {
        super(a_, b_);
    }

    public double getResult() {
        return super.getA() * super.getB();
    }
}
