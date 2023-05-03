package TEST_SCRIPT;

import org.testng.Assert;
import org.testng.annotations.Test;

import GENERIC.Fetch_data;
import GENERIC.Generics;
import POM.Pom;

public class Login_script extends Generics
{
	@Test
	public void test()
	{
		String un = Fetch_data.get_data("Sheet1", 0, 0);
		String pw = Fetch_data.get_data("Sheet1", 0, 1);
		Pom p=new Pom(driver);
		p.username(un);
		//Assert.fail();
		p.password(pw);
		p.login();

	}

}
