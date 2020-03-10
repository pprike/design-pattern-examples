package ChainOfResponsibilities;

public class Numbers {

  private int operand1;
  private int operand2;
  private String operation;

  public Numbers(int num1, int num2, String operation) {
    this.operand1 = num1;
    this.operand2 = num2;
    this.operation = operation;
  }

  public int getOperand1() {
    return operand1;
  }

  public int getOperand2() {
    return operand2;
  }

  public String getOperation()
  {
    return operation;
  }
}