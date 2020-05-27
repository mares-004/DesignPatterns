package Composite;

import java.util.*;

public class Cabinet implements CabinetComponent{
	
  private Vector<CabinetComponent> componentList = new Vector<>();

  boolean constraint() {
	  int board = 0;
	  int drive = 0;
	for(CabinetComponent loop : componentList) {
		switch(loop.getClass().getSimpleName()) {
		case "Board" : board++;
						break;
		case "Drive" : drive++;
						break;
		}
	}
	if( board <= 1 && drive <= 4)
		return true;
	
	return false;
  }
  
  public void addComponent (CabinetComponent c){
	  	if(constraint()) {
		  componentList.addElement(c);
	  	}else {
			  System.out.println("Can not add element : "+ c);
		  }
  }
  public double netPrice()      {return 6.00;}
  public double discountPrice() {return 3.00;}
  
  public double computePrice(){
    double tmp=netPrice();
    for (CabinetComponent drive  : componentList)
        tmp+=drive.computePrice();
    return tmp;  
  }
}
