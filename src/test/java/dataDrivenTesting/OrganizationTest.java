package dataDrivenTesting;

import org.testng.annotations.Test;

public class OrganizationTest {
	@Test
	public void createOrgTest()
	{
		System.out.println("Organization Created");
	}

	@Test
	public void modifyOrgTest()
	{
		System.out.println("Organization modified");
	}

	@Test
	public void cleanOrgTest()
	{
		System.out.println("Organization deleted");
	}
}
