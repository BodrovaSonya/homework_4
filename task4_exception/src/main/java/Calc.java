/**
 * calculate the result of input
 */

public class Calc {
    private Operation result;

    public Calc (char op, double a, double b) throws IncorrectOperationException {

            switch (op) {

                case '+':
                    result = new Sum(a, b);
                    System.out.println(result.getResult());
                    break;
                case '-':
                    result = new Div(a, b);
                    System.out.println(result.getResult());
                    break;
                case '*':
                    result = new Mult(a, b);
                    System.out.println(result.getResult());
                    break;
                case '/':
                    result = new Quotient(a, b);
                    System.out.println(result.getResult());
                    break;
                default:
                    /*result = new Sum(a, b);
                    System.out.println(result.getResult());
                    break;*/
                    throw new IncorrectOperationException(op);
            }
        }

}
