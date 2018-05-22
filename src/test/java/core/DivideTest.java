package core;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import static org.testng.Assert.fail;

import org.testng.annotations.Test;

public class DivideTest {
	@Test
	public void test_11_divide_2() {System.out.println("Test # 11: Divide 2 params");
	assertThat("The dividing of two params returns an incorrect value", 
			Calculator.divide(90.0, 30.0), allOf(notNullValue(), closeTo(3.0, 0.09), instanceOf(Double.class)));}
	
	@Test
	public void test_12_divide_2() {System.out.println("Test # 12: Divide by zero");
	assertThat("The dividing by zero doesn't return positive infinity", 
						Calculator.divide(90.0, 0.0), equalTo(Double.POSITIVE_INFINITY));}
	
	@Test
	public void test_13_divide_2() {System.out.println("Test # 13: Divide by zero and catch Exception");
	assertThat("The dividing by zero doesn't return negative infinity", 
			Calculator.divide(-90.0, 0), equalTo(Double.NEGATIVE_INFINITY));}
	
	@Test
	public void test_14_divide_2() {System.out.println("Test # 14: Divide by zero");
	assertThat("The dividing of two params returns an incorrect value", 
			Calculator.divide(90, 0), equalTo(Double.POSITIVE_INFINITY));}

	@Test
	public void test_15_divide_2() {System.out.println("Test # 15: Divide by zero (dif. Data Type)");
	assertThat("The dividing of two params returns an incorrect value", 
						Calculator.divide(90, 3), closeTo(30.0, 0.09));}
		
	@Test
	public void test_16_divide_2() {System.out.println("Test # 16: Divide by zero and catch Exception");
	{try { Calculator.divide(9, 0); }
	catch (ArithmeticException e) {
		fail ("Test # 16: Should have thrown an ArithmeticException because the divisor is zero");
	    assertThat(e.getMessage(), containsString("/ by zero"));} }}
	
	@Test
	public void test_17_divide_3() {System.out.println("Test # 17: Divide 3 params");
	assertThat("The dividing of three params returns an incorrect value", 
						Calculator.divide(40.0, 8.0, 2.0), closeTo(2.5, 0.09));}
	
	@Test
	public void test_18_divide_3() {System.out.println("Test # 18: Divide 2 params by zero");
	assertThat("The dividing of two params by zero doesn't return positive infinity", 
						Calculator.divide(40.0, 8.0, 0.0), equalTo(Double.POSITIVE_INFINITY));}
	
	@Test
	public void test_19_divide_4() {System.out.println("Test # 19: Divide 4 params");
	assertThat("The dividing of four parameters returns an incorrect value", 
						Calculator.divide(600.0, 50.0, 4.0, 2.0), closeTo(1.5, 0.09));}
	
	@Test
	public void test_20_divide_4() {System.out.println("Test # 20: Divide 3 params by negative zero");
	assertThat("The dividing of three params by zero doesn't return negative infinity", 
						Calculator.divide(600.0, 50.0, 4.0, -0.0), equalTo(Double.NEGATIVE_INFINITY));}
}