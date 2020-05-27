package Composite;

import java.util.*;

public class Board implements CabinetComponent,BoardComponent{
  private Vector<BoardComponent> boardlist = new Vector<>();
  
  boolean constraint() {
	  int bus = 0;
	  int card = 0;
	for(BoardComponent loop : boardlist) {
		switch(loop.getClass().getSimpleName()) {
		case "Bus" : bus++;
						break;
		case "Card" : card++;
						break;
		}
	}
	if( bus <= 1 && card <= 4)
		return true;
	
	return false;
  }
 
  public void addBoardComponent(BoardComponent b){
	  if(constraint()) {
	  boardlist.addElement(b);
	  }else {
		  System.out.println("Can not add element : "+ b);
	  }
	  
	 
  }
  public double netPrice()      {return 26.00;}
  public double discountPrice() {return  6.00;}
  
  public double computePrice(){
    double tmp=discountPrice();
    for (BoardComponent board : boardlist) 
        tmp+=board.computePrice();
    return tmp;
  }
}
