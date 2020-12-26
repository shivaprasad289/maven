package equals;

class LaptopDriver1 
{
	public static void main(String[] args) 
	{
		Laptop x = new Laptop( 4 , 500 , 2.2 ) ;
		Laptop y = new Laptop( 4 , 500 , 2.2 ) ;
		System.out.println( x ) ;
		System.out.println( y ) ;
		System.out.println( "==          :" +  (x == y)  ) ; //   false 
		System.out.println( "equals()   :" +  x.equals(y)  ) ; //   true
		if (   x.equals(y) )
		{
			System.out.println("Same Config") ;
		}
		else
			System.out.println("Different Config") ;
	}
}