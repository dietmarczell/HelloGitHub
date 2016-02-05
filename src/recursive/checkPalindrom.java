package recursive;

public class checkPalindrom {
	
	public boolean check(String input)
	{	
		
		if (input.length() == 1 || input.length() == 0)
		{
			return true;
		}
		
		char first_char = Character.toLowerCase(input.charAt(0));
		char last_char = Character.toLowerCase(input.charAt(input.length()-1));
		
		if (first_char == ' ')
		{
			input = input.substring(1, input.length()-1);
			return check(input);
			
		}
		if (last_char == ' ')
		{
			input = input.substring(0, input.length()-1);
			return check(input);
		}
		if ( first_char == last_char)
		{
			input = input.substring(1, input.length()-1);
			return check(input);
		}
		else 
		{
			return false;
		}
	}
	
}
