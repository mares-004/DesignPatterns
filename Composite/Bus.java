package Composite;

public class Bus  implements BoardComponent{
  public double netPrice()      {return 5.00;}
  public double discountPrice() {return 1.00;}
  public double computePrice(){
    return netPrice();  
  }
}
