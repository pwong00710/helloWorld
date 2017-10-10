import org.junit.Assert;

public class Test {

	@org.junit.Test
	public void test() {
		String expected = "Hello World!!!";
		String actual = new HelloWorld().getMessage();
		Assert.assertEquals(expected, actual);
	}
}
