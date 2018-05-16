package core;

import static org.hamcrest.CoreMatchers.is;

import org.junit.Assume;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class TheoryTest {
	
	@DataPoints
	public static String[] s_array() {
		return new String[] {"a", "b", "c", "d", "e", "f", "g"};
								     }
	
	@Theory
	public void test01(String first, String second, String third, String forth, String five, String six, String seven) { 
		// System.out.println(first + second + third + " ");
		Assume.assumeThat(first + second + third + forth + five + six + seven, is("cgcacda"));
	}
}