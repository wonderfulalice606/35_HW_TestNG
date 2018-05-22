package core;

import org.testng.annotations.*;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class FunctionTest {
	@Test
	public void test_41_root_2() {System.out.println("Test # 41: Square root 2 params");
	assertThat("The extraction of the square root of two params returns an incorrect value", 
						Calculator.root(8.0, 8.0), closeTo(4.0, 0.09));}
	
	@Test
	public void test_42_root_2() {System.out.println("Test # 42: Square root 2 dif.params");
	assertThat("The extraction of the square root of two negative params returns a value", 
						Calculator.root(-8.0, -8.0), equalTo(Double.NaN));}
	
	@Test
	public void test_43_root_2() {System.out.println("Test # 43: Square root 2 params (dif. Data Type)");
	assertThat("The extraction of the square root of two params with different Data Type returns an incorrect value", 
						Calculator.root(8.0, 8), closeTo(4.0, 0.09));}
	
	@Test
	public void test_44_root_2() {System.out.println("Test # 44: Square root 2 dif.params (dif. Data Type)");
	assertThat("The extraction of the square root of two params with different Data Type returns an incorrect value", 
						Calculator.root(8.0, 0), closeTo(2.82, 0.09));}
	
	@Test
	public void test_45_root_2() {System.out.println("Test # 45: Square root 2 params (dif. Data Type)");
	assertThat("The extraction of the square root of two parameters with different Data Type returns an incorrect value", 
						Calculator.root(8, 8.0), closeTo(4.0, 0.09));}
	
	@Test
	public void test_46_root_2() {System.out.println("Test # 46: Square root 2 dif.params (dif. Data Type)");
	assertThat("The extraction of the square root of two negative params returns a value", 
						Calculator.root(-8, -8.0), equalTo(Double.NaN));}
	
	@Test
	public void test_47_root_3() {System.out.println("Test # 47: Square root 3 params");
	assertThat("The extraction of the square root of three parameters returns an incorrect value", 
						Calculator.root(6.0, 5.0, 5.0), closeTo(4.0, 0.09));}
	
	@Test
	public void test_48_root_3() {System.out.println("Test # 48: Square root 3 dif.params");
	assertThat("The extraction of the square root of three negative params returns a value", 
						Calculator.root(-6.0, -5.0, -5.0), equalTo(Double.NaN));}
	
	@Test
	public void test_49_root_4() {System.out.println("Test # 49: Square root 4 params");
	assertThat("The extraction of the square root of four params with different Data Type returns an incorrect value", 
						Calculator.root(4.0, 4.0, 4.0, 4.0), closeTo(4.0, 0.09));}
	
	@Test
	public void test_50_root_4() {System.out.println("Test # 50: Square root 4 dif.params");
	assertThat("The extraction of the square root of four params with different Data Type returns an incorrect value", 
						Calculator.root(4.0, -4.0, 4.0, -4.0), closeTo(0.0, 0.09));}
	
	@Test
	public void test_51_cube_root_2() {System.out.println("Test # 51: Cube root 2 params");
	assertThat("The extraction of the cube root of two params returns an incorrect value", 
						Calculator.cube_root(20.3, 6.7), closeTo(3.0, 0.09));}
	
	@Test
	public void test_52_cube_root_2() {System.out.println("Test # 52: Cube root 2 dif.params");
	assertThat("The extraction of the cube root of two params returns a positive value", 
						Calculator.cube_root(-20.3, -6.7), closeTo(-3.0, 0.09));}
	
	@Test
	public void test_53_cube_root_3() {System.out.println("Test # 53: Cube root 3 params (dif. Data Type)");
	assertThat("The extraction of the cube root of three params with different Data Type returns an incorrect value", 
						Calculator.cube_root(9.5, 9.5, 7), closeTo(3.0, 0.09));}
	
	@Test
	public void test_54_cube_root_3() {System.out.println("Test # 54: Cube root 3 dif.params (dif. Data Type)");
	assertThat("The extraction of the cube root of three params with different Data Type returns a positive value", 
						Calculator.cube_root(-9.5, -9.5, -7), closeTo(-2.96, 0.09));}
	
	@Test
	public void test_55_power() {System.out.println("Test # 55: Raise to the power");
	assertThat("The raising to the power of two params returns an incorrect value", 
						Calculator.power(3.0, 3.0), closeTo(27.0, 0.09));}
	
	@Test
	public void test_56_power() {System.out.println("Test # 56: Raise to the power dif.param");
	assertThat("The raising to the power of two params returns a positive value", 
						Calculator.power(-3.0, 3.0), closeTo(-27.0, 0.09));}
	
	@Test
	public void test_57_power() {System.out.println("Test # 57: Raise to the power (dif. Data Type)");
	assertThat("The raising to the power of two params with differen Data Type returns an incorrect value", 
						Calculator.power(3.0, 3), closeTo(27.0, 0.09));}
	
	@Test
	public void test_58_power() {System.out.println("Test # 58: Raise to the power dif.param (dif. Data Type)");
	assertThat("The raising to the power of two params with differen Data Type returns an incorrect value", 
						Calculator.power(3.0, -3), closeTo(0.03, 0.09));}
	
	@Test
	public void test_59_greater_value() {System.out.println("Test # 59: Greater of two values");
	assertThat("The method of two params doesn't return the greater value", 
						Calculator.maximum(15839.0, 10109.09), closeTo(15839.0, 0.09));}
	
	@Test
	public void test_60_greater_value() {System.out.println("Test # 60: Greater of two values (def.param)");
	assertThat("The method of two params doesn't return the greater value", 
						Calculator.maximum(-15839.0, 10109.09), closeTo(10109.09, 0.09));}
}
