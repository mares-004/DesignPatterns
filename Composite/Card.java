package Composite;

public class Card implements BoardComponent {
  public double netPrice()     {return 10.00;}
  public double discountPrice() {return 1.00;}
  
  public double computePrice(){
    return netPrice();  
  }
}

