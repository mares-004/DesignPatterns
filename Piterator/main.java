package Piterator;

public class main
{

	public static void main(String[] args) {
		IteratorA it;
		NameRepository obj = new NameRepository();
		
		it = obj.getIterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
			
		
		
		
		

	}

}
