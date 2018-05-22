package core;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

public class MultiplyTest {
	@Test
	public void test_21_multiply_2() {System.out.println("Test # 21: Multiply 2 params");
	assertThat("The multiplying of two params returns an incorrect value", 
						Calculator.multiply(9.0, 5.0), 
						allOf(notNullValue(), equalTo(45.0), instanceOf(Double.class)));}
	
	@Test
	public void test_22_multiply_2() {System.out.println("Test # 22: Multiply by zero");
	assertThat("The multiplying by zero doesn't return positive zero", 
						Calculator.multiply(9.0, 0.0), equalTo(0.0));}
	
	@Test
	public void test_23_multiply_2() {System.out.println("Test # 23: Multiply 2 params (dif. Data Type)");
	assertThat("The multiplying of two params with different Data Type returns an incorrect value", 
						Calculator.multiply(9.0, 5), equalTo(45.0));}
	
	@Test
	public void test_24_multiply_2() {System.out.println("Test # 24: Multiply by zero (dif. Data Type)");
	assertThat("The multiplying by zero doesn't return positive zero", 
						Calculator.multiply(9.0, 0), equalTo(0.0));}
	
	@Test
	public void test_25_multiply_2() {System.out.println("Test # 25: Multiply 2 params (dif. Data Type)");
	assertThat("The multiplying of two params with different Data Type returns an incorrect value", 
						Calculator.multiply(9, 5.0), equalTo(45.0));}
	
	@Test
	public void test_26_multiply_2() {System.out.println("Test # 26: Multiply by zero (dif. Data Type)");
	assertThat("The multiplying by zero doesn't return positive zero", 
						Calculator.multiply(0, 5.0), equalTo(0.0));}
	
	@Test
	public void test_27_multiply_3() {System.out.println("Test # 27: Multiply 3 params");
	assertThat("The multiplying of three params returns an incorrect value", 
						Calculator.multiply(20.0, 5.0, 8.0), equalTo(800.0));}
	
	@Test
	public void test_28_multiply_3() {System.out.println("Test # 28: Multiply 2 params by zero");
	assertThat("The multiplying of two params by zero doesn't return positive zero", 
						Calculator.multiply(20.0, 5.0, 0.0), equalTo(0.0));}
	
	@Test
	public void test_29_multiply_4() {System.out.println("Test # 29: Multiply 4 params");
	assertThat("The multiplying of four params returns an incorrect value", 
						Calculator.multiply(24.0, 4.0, 10.0, 5.0), equalTo(4800.0));}
	
	@Test
	public void test_30_multiply_4() {System.out.println("Test # 30: Multiply 3 params by zero");
	assertThat("The multiplying of three params by zero doesn't return positive zero", 
						Calculator.multiply(24.0, 4.0, 10.0, 0.0), equalTo(0.0));}
	
	
}
