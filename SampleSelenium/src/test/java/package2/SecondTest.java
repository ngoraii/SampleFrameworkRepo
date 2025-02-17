package package2;

import org.testng.annotations.Test;

public class SecondTest {
	@Test
	public void thirdtTest() {
		String url=System.getProperty("url","default url");
		String browser=System.getProperty("browser","default browser");
		System.out.println("URL is : "+url);
		System.out.println("Browser is : "+browser);
	}
	@Test
	public void fourthTest() {
		System.out.println("package2Test2");
	}

}
