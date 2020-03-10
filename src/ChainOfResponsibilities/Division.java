package ChainOfResponsibilities;

public class Division implements Chain {

  private  Chain nextInChain;

  @Override
  public void setNextChain(Chain chain) {
    this.nextInChain = chain;
  }

  @Override
  public int calculate(Numbers request) {
    if(request.getOperation().equalsIgnoreCase("division")) {
      return request.getOperand1() / request.getOperand2();
    }

    System.out.println("Cannot handle operation type");
    return 99999;
  }
}