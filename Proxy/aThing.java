package Proxy;

public class aThing implements Thing
{
	String name;
	
	aThing(String name)
	{
		this.name = name;
	}

	@Override
	public void compute(String str) {
		System.out.println(str + " " + name);
		
	}

}
