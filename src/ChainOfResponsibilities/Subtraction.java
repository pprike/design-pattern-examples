package ChainOfResponsibilities;

public class Subtraction implements Chain {

  private  Chain nextInChain;

  @Override
  public void setNextChain(Chain chain) {
    this.nextInChain = chain;
  }

  @Override
  public int calculate(Numbers request) {
    if(request.getOperation().equalsIgnoreCase("subtraction")) {
      return request.getOperand1() - request.getOperand2();
    }

    return nextInChain.calculate(request);
  }
}