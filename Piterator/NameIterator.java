package Piterator;

public class NameIterator implements IteratorA {
	
    int indexRow;
    int indexCol;
    
    private String names[][] = null;
    
    public NameIterator(String names[][] )
    {
    	this.names = names;
    }

    @Override
    public boolean hasNext() {
        if ((indexRow < names.length) && (indexCol < names[indexRow].length)) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
    	
    	String el=null;
    	
        if (this.hasNext()) {
            el = names[indexRow][indexCol];

            indexCol++;
            if(indexCol >= names[indexRow].length) {
                indexCol = 0;
                indexRow++;
            }

            if (el.equals("-")) {
                return next();
            }
        }
        return el;
    }
}

