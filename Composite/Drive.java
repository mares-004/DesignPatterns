package Composite;

public class Drive implements CabinetComponent{
  public double netPrice()     {return 10.00;}
  public double discountPrice() {return 4.00;}
  public double computePrice(){
    return discountPrice();  
  }
}

