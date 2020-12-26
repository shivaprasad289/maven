package maven2;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Demo2 
{
	@Test
	public void test_01()
	{
		System.out.println("Test case 1 start");
		SoftAssert s = new SoftAssert();
		String s1 = "I am King";
		String s2 = "I am King";
		s.assertEquals(s1, s2);
		System.out.println("Test case 1 end");
		s.assertAll();
	}
	
	@Test
	public void test_02()
	{
		System.out.println("Test case 2 start");
		SoftAssert s = new SoftAssert();
		String s1 = "I am King";
		String s2 = "I am Dog";
		s.assertEquals(s1, s2);
		System.out.println("Test case 2 end");
		s.assertAll();
	}
	
}
