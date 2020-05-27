package Command;

import java.util.*;

public class VStack{
   private Vector stackvector;  
   
   public VStack(){
      stackvector= new Vector();
   }
   
   public void push(Object obj){
      stackvector.insertElementAt(obj,0);
   }
   
   public Object pop(){
      if (stackvector.size()>0){
         Object obj =stackvector.firstElement();
         stackvector.removeElementAt(0);
         return obj;
      }
         else
         return null;
   }
   
   public int getSize(){
      return stackvector.size();
   }
   
   public Vector getStackVector(){
      return stackvector;
   }
    
}
