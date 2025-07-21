package model.entitis;

public class Account {
  private Double balance;
  private String holder;

  public Account(){}

  public Account(Double balance, String holder){
    this.balance = balance;
    this.setHolder(holder);
  }

  public Double getBalance(){
    return this.balance;
  }

  public void increaseBalance(Double value){
    balance = balance + value;
  }

  public void decreaseBalance(Double value){
    balance = balance - value;
  }

  public String getHolder(){
    return this.holder;
  }

  public void setHolder(String holder){
    this.holder = holder;
  }



  @Override
  public String toString() {
    return "Account balance: " + balance + ", Account Holder: " + holder;
  }
}
