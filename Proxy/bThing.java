package Proxy;

public class bThing implements Thing
{

String name;
	
	bThing(String name)
	{
		this.name = name;
	}

	@Override
	public void compute(String str) {
		System.out.println(str);
		
	}

}
