import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class class4  {
@Test(retryAnalyzer=class3.class)
public void test1(){
	
	System.out.println("hello");
	Assert.assertEquals(false, true);
}
@Test
public void test2(){
	System.out.println("hi");
}
}
