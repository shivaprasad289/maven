package maven2;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Demo1 {
	@Test
	public void test_01() 
	{
		SoftAssert s = new SoftAssert();
		s.assertEquals(10, 20, "failed....1");
		System.out.println("Test ase 1 end");
		s.assertAll();
	}

	
	  @Test
	  public void test_02() 
	  { 
		  System.out.println("Test case 2 start");
		  SoftAssert s = new SoftAssert(); 
	      s.assertEquals(10,10,"Failed....2"); 
	      System.out.println("Test case 2 end");
	      s.assertAll();
	  }
	 
}
