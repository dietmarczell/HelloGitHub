
public class Temperatur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double celsius = 30;
		double fahrenheit = celsius2fahrenheit(celsius);
		System.out.println(celsius+" Grad Celsius = "+fahrenheit+" Grad Fahrenheit");
		celsius = fahrenheit2celsius(fahrenheit);
		System.out.println(fahrenheit+" Grad Fahrenheit = "+celsius+" Grad Celsius\n");
		
		celsius = 12;
		fahrenheit = celsius2fahrenheit(celsius);
		System.out.println(celsius+" Grad Celsius = "+fahrenheit+" Grad Fahrenheit");
		celsius = fahrenheit2celsius(fahrenheit);
		System.out.println(fahrenheit+" Grad Fahrenheit = "+celsius+" Grad Celsius\n");
		
		celsius = -14.5;
		fahrenheit = celsius2fahrenheit(celsius);
		System.out.println(celsius+" Grad Celsius = "+fahrenheit+" Grad Fahrenheit");
		celsius = fahrenheit2celsius(fahrenheit);
		System.out.println(fahrenheit+" Grad Fahrenheit = "+celsius+" Grad Celsius");
		
	}
	public static double celsius2fahrenheit(double celsius) 
	{
		return (9.0/5.0) * celsius + 32;
	}
	
	public static double fahrenheit2celsius(double fahrenheit) 
	{
		return (5.0/9.0) * (fahrenheit - 32);
	}
}
