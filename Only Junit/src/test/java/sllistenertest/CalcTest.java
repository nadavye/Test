package sllistenertest;

import org.junit.Test;
import org.junit.Assert;

public class CalcTest {

	@Test
	public void test_5_plus_7_shouldBe_12() {
		System.out.println("1");
		Calculator calc = new Calculator();
		int actual = calc.add(5, 7);
		int expected = 12;

		Assert.assertEquals(expected, actual);
	}

	@Test
	public void test_12_divide_4_plus_7_shouldBe_10() {
		Calculator calc = new Calculator();
		int result = calc.divide(12, 4);
		int actual = calc.add(result, 7);
		int expected = 10;
		Assert.assertEquals(expected, actual);
	}

}
