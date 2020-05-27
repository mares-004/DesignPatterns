package Proxy;

public interface IFunctor<T,R> {
    //public void compute(T element);
    public void preLog(T s);
    public void postLog(T s);
    public R getValue();
}
