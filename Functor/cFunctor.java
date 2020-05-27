package Functor;

public class cFunctor implements iFunctor<Integer, Integer> {
    private java.lang.Integer sum;
    private int tSum;
    private java.lang.Integer size;

    public void compute(Integer i) {
        tSum += (int)i;
    }
    public Integer getValue() {

        sum = (java.lang.Integer)tSum;
        return sum;
    }
    public void setSize(Integer size)
    {
    	this.size = (java.lang.Integer)size;
    }
    
    public Integer Count()
    {
    	return size;
    }
}
