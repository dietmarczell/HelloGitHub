package cvsparser;

public class CSVParser {
	
	private String csvline;
	private int commacounter;

	public CSVParser (String input)
	{
		this.csvline = input;
	}
	
	public int countComma()
	{
		this.commacounter=0;
		for (int i = 0; i<csvline.length(); i++)
		{
			if (csvline.charAt(i) == ',') {
			this.commacounter++;
			}
		}
		System.out.println("We found "+commacounter+" comma-chars");
		return commacounter;
	}
	
//	public String[] parse_new()
//	{
//		
//	}
	
	public String[] parse()
	{
		int helper=0;	//markieren bis wohin der string geht
		String[] part = new String[countComma()+1];
		int j=0;
		for (int i = 0; i<csvline.length(); i++)
		{
			if (csvline.charAt(i) == ',') {
				part[j] = csvline.substring(helper,i);
				System.out.println("String["+j+"]"+part[j]);
				helper = i+1;
				j++;
			}
		}
		part[j] = csvline.substring(helper);
		System.out.println("String["+j+"]"+part[j]);
		
		return part;
	}
	
}
