package Academy.E2E;

import java.io.IOException;

import org.testng.annotations.Test;

public class hometest extends baseclass {
	
	@Test
	
	public void basePageNavigation() throws IOException {
		
		driver = browserInitializing();
		driver.get("http://qaclickacademy.com");

		
	}
	

}
