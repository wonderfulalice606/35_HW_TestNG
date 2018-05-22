package core;

import org.testng.annotations.*;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class AddTest {

	@Test
	public void test_01_add_2() {System.out.println("Test # 01: Add 2 positive params");
			assertThat("Sum of two params returns an incorrect value", Calculator.add(200.0, 150.0),
					allOf(notNullValue(), equalTo(350.0), instanceOf(Double.class)));}
	
	@Test
	public void test_02_add_2() {System.out.println("Test # 02: Add 2 different params");
			assertThat("Sum of two params returns a positive value", 
						Calculator.add(200.0, -250.0), equalTo(-50.0));}
	
	
	@Test
	public void test_03_add_2() {System.out.println("Test # 03: Add 2 positive params (dif. Data Type)");
	assertThat("Sum of two params with different Data Type returns an incorrect value", 
						Calculator.add(200.0, 150), equalTo(350.0));}
	
	@Test
	public void test_04_add_2() {System.out.println("Test # 04: Add 2 different params (dif. Data Type)");
	assertThat("Sum of two params with different Data Type returns a positive value", 
						Calculator.add(200.0, -250), equalTo(-50.0));}
	
	@Test
	public void test_05_add_2() {System.out.println("Test # 05: Add 2 positive params (dif. Data Type)");
	assertThat("Sum of two params with different Data Type returns an incorrect value", 
						Calculator.add(200, 150), equalTo(350.0));}
	
	@Test
	public void test_06_add_2() {System.out.println("Test # 06: Add 2 different params (dif. Data Type)");
	assertThat("Sum of two params with different Data Type returns a positive value", 
						Calculator.add(200, -250), equalTo(-50.0));}
	
	@Test
	public void test_07_add_3() {System.out.println("Test # 07: Add 3 positive params");
	assertThat("Sum of three params returns an incorrect value", 
						Calculator.add(8.0, 5.0, 7.0), equalTo(20.0));}
	
	@Test
	public void test_08_add_3() {System.out.println("Test # 08: Add 3 diferent params");
	assertThat("Sum of three params returns a positive value", 
						Calculator.add(8.0, -5.0, -7.0), equalTo(-4.0));}
	
	@Test
	public void test_09_add_4() {System.out.println("Test # 09: Add 4 positive params");
	assertThat("Sum of four params returns an incorrect value", 
						Calculator.add(185.3, 0.7, 10.0, 74.0), equalTo(270.0));}
	
	@Test
	public void test_10_add_4() {System.out.println("Test # 10: Add 4 different params");
	assertThat("Sum of four params returns a positive value", 
						Calculator.add(-185.3, 0.7, 10.0, 74.0), closeTo(-100.6, 0.09));}
	  
}