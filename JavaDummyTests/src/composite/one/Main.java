package composite.one;
public class Main {
  public static void main(String[] args) {
    Expr one = new Const(1);
    Expr onePtwo = new Plus (new Const(1), new Const(2));
    Expr threeMfour = new Mult (new Const(3), new Const(4));
    Expr m = new Minus (onePtwo, threeMfour);
    Expr mMonePtwo = new Mult (m, onePtwo);
    Expr n = new Quot (mMonePtwo, new Const(5));

    System.out.println(n);
    System.out.println("Value: " + n.eval());
  }
}
