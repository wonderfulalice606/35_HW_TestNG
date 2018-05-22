package core;

import org.testng.annotations.*;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class SubtractTest {
	@Test
	public void test_31_subtract_2() {System.out.println("Test # 31: Subtract 2 params");
	assertThat("The subtracting of two params returns an incorrect value", 
						Calculator.subtract(28.0, 14.0), 
						allOf(notNullValue(), equalTo(14.0), instanceOf(Double.class)));}
	
	@Test
	public void test_32_subtract_2() {System.out.println("Test # 32: Subtract 2 different params");
	assertThat("The subtracting of two params doesn't return a positive value", 
						Calculator.subtract(28.0, -14.0), equalTo(42.0));}
	
	@Test
	public void test_33_subtract_2() {System.out.println("Test # 33: Subtract 2 params (dif. Data Type)");
	assertThat("The subtracting of two params with different Data Type returns an incorrect value", 
						Calculator.subtract(28.0, 14), equalTo(14.0));}
	@Test
	public void test_34_subtract_2() {System.out.println("Test # 34: Subtract 2 dif.params (dif. Data Type)");
	assertThat("The subtracting of two params with different Data Type doesn't return a positive value", 
						Calculator.subtract(28.0, -14), equalTo(42.0));}
	
	@Test
	public void test_35_subtract_2() {System.out.println("Test # 35: Subtract 2 params (dif. Data Type)");
	assertThat("The subtracting of two params with different Data Type returns an incorrect value", 
						Calculator.subtract(28, 14.0), equalTo(14.0));}
	
	@Test
	public void test_36_subtract_2() {System.out.println("Test # 36: Subtract 2 dif.params (dif. Data Type)");
	assertThat("The subtracting of two params with different Data Type doesn't return a negative value", 
						Calculator.subtract(-28, 14.0), equalTo(-42.0));}
	
	@Test
	public void test_37_subtract_3() {System.out.println("Test # 37: Subtract 3 params");
	assertThat("The subtracting of three params returns an incorrect value", 
						Calculator.subtract(220.0, 20.0, 120.0), equalTo(80.0));}
	
	@Test
	public void test_38_subtract_3() {System.out.println("Test # 38: Subtract 3 dif.params");
	assertThat("The subtracting of three params doesn't return a negative value", 
						Calculator.subtract(-220.0, 20.0, 120.0), equalTo(-360.0));}
	
	@Test
	public void test_39_subtract_4() {System.out.println("Test # 39: Subtract 4 params");
	assertThat("The subtracting of four params returns an incorrect value", 
						Calculator.subtract(400.0, 150.0, 50.0, 45.0), equalTo(155.0));}
	
	@Test
	public void test_40_subtract_4() {System.out.println("Test # 40: Subtract 4 dif.params");
	assertThat("The subtracting of four params doesn't return a negative value", 
						Calculator.subtract(-400.0, 150.0, 50.0, 45.0), equalTo(-645.0));}
	
}
