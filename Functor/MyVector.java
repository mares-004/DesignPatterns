package Functor;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

public class MyVector extends Vector {

    public void iterate() {
        cFunctor cf = new cFunctor();
        doAll(cf);
    }

    private void doAll(cFunctor f) {
        int rSum;
        Integer size=0;
    
        Iterator itr = this.iterator();

        while(itr.hasNext()) {
            f.compute((Integer)itr.next());
            size++;
        }
        rSum = f.getValue();
        f.setSize(size);
        
        System.out.println(rSum);
        System.out.println(f.Count());
        
        
        
        
    }
}
