package _06_calculator;

public class Calc {

	float c;
	
	Calc(){
		
	}
	
	public float add(float a, float b) {
		c= a+b;
		return c;
	}
	public float subtract(float a, float b) {
		c=a-b;
		return c;
	}
	public float multiply(float a, float b) {
		c=a*b;
		return c;
	}
	public float divide(float a, float b) {
		c=a/b;
		return c;
	}
}
