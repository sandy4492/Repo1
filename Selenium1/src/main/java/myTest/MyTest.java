package myTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import net.bytebuddy.jar.asm.tree.analysis.Analyzer;

public class MyTest {
	
	@Test()
	public void test(){
		Assert.assertTrue(false);
	}
	@Test
	public void test2(){
		Assert.assertTrue(false);
	}

}
