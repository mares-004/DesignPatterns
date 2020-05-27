package Proxy;

public class LogProxy implements Thing
{
	
	Thing p;
	IFunctor f;
	
	LogProxy(Thing t, IFunctor f)
	{
		p=t;
		this.f = f;
	}

	@Override
	public void compute(String str) 
	{
		
		f.preLog("Before");
		
		p.compute(str);
				
		f.postLog("After");
		
	}
	
}
