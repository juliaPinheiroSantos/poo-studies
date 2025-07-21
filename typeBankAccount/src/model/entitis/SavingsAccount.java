package model.entitis;

public class SavingsAccount extends Account{
  protected double profit;

  public SavingsAccount(){
    super();
  }

  public SavingsAccount (Double balance, String holder, String number, double profit){
    super(balance, holder, number);
    this.profit = profit;
  }

  public double getProfit(){
    return this.profit;
  }

  public double applyProfit(){
    return this.getBalance() + ((this.getBalance()*getProfit())/100);
  }

  @Override
  public String toString(){
    return super.toString() + "Rendimento: " + getProfit() + "\nRendimento aplicado: " + applyProfit() + "\n";
  }
  
}
