package recursive;

public class RecursiveMaths {

	public static int sum(int n) {
		if (n == 0)
			return 0;
		return sum(n-1)+n;
	}
	
	public static int fibonacci(int n)
	{
		if (n == 1 || n == 2)
			return 1;
		return fibonacci(n-1)+fibonacci(n-2);
	}
}
