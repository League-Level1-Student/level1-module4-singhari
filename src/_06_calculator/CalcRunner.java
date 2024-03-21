package _06_calculator;

	import java.util.*;

public class CalcRunner {
	public static void main(String[] args) {
		float a = 1.0f;
		float b = 3.0f;
		Calc calc = new Calc();
		System.out.println(calc.add(a, b));
		System.out.println(calc.subtract(a, b));
		System.out.println(calc.divide(a, b));
		System.out.println(calc.multiply(a,b));
	}
}
