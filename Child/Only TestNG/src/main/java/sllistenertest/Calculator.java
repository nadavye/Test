package sllistenertest;

public class Calculator {

	public int add(int a, int b)
	{
		return b+a;
	}
	
	public int mul(int a, int b)
	{
		return a*b;
	}
	
	public int divide(int a, int b)
	{
		if (b== 0)
			throw new IllegalArgumentException();
		
		return a/b;
	}
	
	public int sub(int a, int b)
	{
		return a-b;
	}
}