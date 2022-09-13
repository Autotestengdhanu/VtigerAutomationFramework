package dataDrivenTesting;

import org.testng.annotations.Test;

public class ContactTest {
	@Test
	public void createContactTest()
	{
		System.out.println("Contact created");
	}
	
	@Test
	public void deleteContactTest()
	{
		System.out.println("Contact deleted");
	}
}
