package grossbuchstaben;

public class grossbuchstaben {

	private String grossbuchstaben;
	
	public grossbuchstaben(String grossbuchstaben)
	{
		this.grossbuchstaben = grossbuchstaben;
	}
	
	public String startmitgrossbuchstaben()
	{
		String new_string = this.grossbuchstaben;
		
		for (int i=0; i<new_string.length();i++)
		{
			if (Character.isLowerCase(new_string.charAt(i)) )
			{
				if (i == 0 || new_string.charAt(i-1) == ' ')
				{
					char upper = Character.toUpperCase(new_string.charAt(i));
					String helper_string = new_string.substring(0, i) + upper;
					new_string = helper_string + new_string.substring(i+1);
					System.out.println(new_string);
				}
			}
		}
		return new_string;
	}
}
		
/*
                .---. .---. 
               :     : o   :    K-EEEEEEE-KKK-S-E!
           _..-:   o :     :-.._    /
       .-''  '  `---' `---' "   ``-.    
     .'   "   '  "  .    "  . '  "  `.  
    :   '.---.,,.,...,.,.,.,..---.  ' ;
    `. " `.                     .' " .'
     `.  '`.                   .' ' .'
      `.    `-._           _.-' "  .'  .----.
        `. "    '"--...--"'  . ' .'  .'  o   `.
        .'`-._'    " .     " _.-'`. :       o  :
      .'      ```--.....--'''    ' `:_ o       :
    .'    "     '         "     "   ; `.;";";";'
   ;         '       "       '     . ; .' ; ; ;
  ;     '         '       '   "    .'      .-'
  '  "     "   '      "           "    _.-' 
 

*/