package package1;

import org.testng.annotations.Test;

public class FirstTest {
	@Test
	public void firstTest() {
		String url=System.getProperty("url","default url");
		String browser=System.getProperty("browser","default browser");
		System.out.println("URL is : "+url);
		System.out.println("Browser is : "+browser);	}
	@Test
	public void secondTest() {
		System.out.println("package1Test2");
	}
	

}
