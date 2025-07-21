package model.entitis;

public class CheckingAccount extends Account{
  protected boolean check;

  public CheckingAccount (){
    super();
  }

  public CheckingAccount(double balance, String holder, String number, boolean check){
    super(balance,holder, number);
    this.check = check;
  }

  // se tiver cheque no construtor, vai retornar 0. se não tiver, vai retornar 1.
  public String useCheck(){
    if (check){
      return "yes";
    } else {
      return "no";
    }
  }

  @Override 
  public String toString(){
    return super.toString() + "Use check? " + useCheck() + "\n";
  }


  
}
