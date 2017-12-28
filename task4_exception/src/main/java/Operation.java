

public abstract class Operation implements IOperation{
    private double a;
    private double b;

    public Operation (double a_, double b_){
            setA(a_);
        setB(b_);
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
}
