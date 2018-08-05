import org.testng.IRetryAnalyzer;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class class3 implements IRetryAnalyzer {
	int counter=0;
	int limit=4;
	@Override
	public boolean retry(ITestResult arg0) {
		// TODO Auto-generated method stub
		
				{
			if(counter<limit)
				counter++;
				return true;
				}
				if(counter>=limit)
				{
					return false;
				}
}
}


