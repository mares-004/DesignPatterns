package Proxy;

public class ProxyDemo
{
	public static void main(String[] args)
	{
		
		IFunctor cfun;
		cfun = new cFunctor();
		
		Thing t = new aThing("A");
		t.compute("helloo");
		
		t = new LogProxy(t,cfun);
		
		t.compute("helloo");
	}
}
