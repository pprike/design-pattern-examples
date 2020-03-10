package ChainOfResponsibilities;

public class TestCalculation {

  public static void main(String[] args){

    Numbers request = new Numbers(13, 3, "multiplication");

    Chain c1 = new Addition();
    Chain c2 = new Subtraction();
    Chain c3 = new Multiplication();
    Chain c4 = new Division();

    c1.setNextChain(c2);
    c2.setNextChain(c3);
    c3.setNextChain(c4);

    System.out.println(c1.calculate(request));
  }
}