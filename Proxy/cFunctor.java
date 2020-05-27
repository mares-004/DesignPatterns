package Proxy;

public class cFunctor implements IFunctor<String, String>
{

//	@Override
//	public void compute(T element) {
// TODO Ato-generated method stub
		
//	}

	@Override
	public void preLog(String s)
	{
		System.out.println(s);
		
	}	
	public void postLog(String s)
	{
		System.out.println(s);
		
	}	

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return null;
	}
}
