/**
 * sum which implements IOperation
 */
public class Sum extends Operation{

    public Sum(double a_, double b_) {
        super(a_, b_);
    }

    public double getResult() {
        return super.getA() + super.getB();
    }
}
