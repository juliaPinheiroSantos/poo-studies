package model.entitis;

public abstract class Account {
  protected double balance;
  protected String holder;
  protected String number;

  public Account (){}

  public Account (double balance, String holder, String number){
    this.balance = balance;
    this.holder = holder; 
    this.number = number;
  }

  public double getBalance(){
    return this.balance;
  }

  public String getHolder(){
    return this.holder;
  }

  public String getNumber(){
    return this.number;
  }

  public void depositBalance(double value){
    balance = balance + value;
  }

  public void withdrawBalance(double value){
    balance = balance - value;
  }

  @Override
  public String toString(){
    return "Account balance: " + getBalance() + "\nAccount Holder: " + getHolder() +  "\nAccount Number: " + getNumber() + "\n";
  }

}
