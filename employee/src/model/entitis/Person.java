package model.entitis;

public abstract class Person {
  protected String firstName;
  protected String lastName;
  protected String cpf;

  public Person(){};

  public Person(String firstName, String lastName, String cpf){
    this.firstName = firstName;
    this.lastName = lastName;
    this.cpf = cpf;
  }

 //é publico pq as outras classes podem ver, é público pq é visível às outras classes.
 //o tipo de retorno é String, pois retorna o atributo (firstName) que é String
 //o nome do método é "getFirstName" pq ele pega o primeiro nome.
  public String getFirstName(){
    return this.firstName;
  }

  //é publico pq as outras classes podem ver
  //o nome do método é setFirstName pq permite alterar o primeiro nome
  //é void pq não retorna nada
  public void setFirstName(String firstName){
    this.firstName = firstName;
  }

  public String getLastName(){
    return this.lastName;
  }

  public void setLastName(String lastName){
    this.lastName = lastName;
  }

  public String getCPF(){
    return this.cpf;
  }

  @Override
  public String toString(){
    return "First Name: " + getFirstName() + "\nLast Name: " + getLastName() + "\nCPF: " + getCPF() + "\n";
  }




  


}
