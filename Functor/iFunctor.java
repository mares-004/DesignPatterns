package Functor;;

public interface iFunctor<T,R> {
    public void compute(T element);
    public R getValue();
}
