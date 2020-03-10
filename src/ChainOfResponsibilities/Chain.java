package ChainOfResponsibilities;

public interface Chain {

  void setNextChain(Chain chain);

  int calculate(Numbers request);
}