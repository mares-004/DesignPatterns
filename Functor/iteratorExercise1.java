package Functor;


public class iteratorExercise1 {
    public static void main(String[] args) {
        MyVector mv = new MyVector();

        mv.addElement(1);
        mv.addElement(2);
        mv.addElement(3);
        mv.addElement(4);
        mv.addElement(5);
        
        mv.iterate();
        
        // # of elements
        System.out.println(mv.stream().map(a->a.toString()).count());
        

        
        

        

    }
}
