import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MyTest {
	@Test
	public void myFirstTest() {
		assertEquals("evaluate", 3 + 3 , 6);
	}
	@Test
	public void mySecondTest() {
		assertEquals("evaluate", 3 + 3 , 5);
	}
}