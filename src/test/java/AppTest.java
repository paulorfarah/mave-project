import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest {

	@Test public void testAppHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }
    
//    @Test public void testDelay13seconds() {
//    	try {
//			Thread.sleep(13000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//			
//		}
//    }
//    
//    @Test public void testDelay30seconds() {
//    	try {
//    		Thread.sleep(30000);
//    	} catch(InterruptedException e) {
//    		e.printStackTrace();
//    	}
//    	testDelay13seconds();
//    }

}
