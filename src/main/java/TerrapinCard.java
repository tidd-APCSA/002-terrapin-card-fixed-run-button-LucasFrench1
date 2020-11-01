public class TerrapinCard {
  private double balance;
  public TerrapinCard(double bal){
    balance = bal;
  }
  public TerrapinCard(){
    this(0);
  }

  public String toString(){
    return "This card has "+balance+" dollars";
  }

  public TerrapinCard payEconomical(){
    if((balance - 2.5) >= 0){
      balance -= 2.5;
    }
    return this;
  }

  public TerrapinCard payGourmet(){
    if((balance - 4) >= 0){
      balance -= 4;
    }
    return this;
  }

  public TerrapinCard loadMoney(double moneyToAdd){
    if(moneyToAdd < 0){}
    else if(!((balance+moneyToAdd) > 200)){
      balance += moneyToAdd;
    }
    else{
      balance = 200;
    }
    return this;
  }
}
