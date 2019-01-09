package testNG;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterInTestNG {

	@Test
	@Parameters({ "data", "data1" })
	public void test(@Optional("default") String data, @Optional("default") String data1) {

		System.out.println(data+" "+data1);
	}

}
