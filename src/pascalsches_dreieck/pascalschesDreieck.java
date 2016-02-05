package pascalsches_dreieck;

public class pascalschesDreieck {
	
	private int start;
	private String erg;
	
	public pascalschesDreieck(){
		this.start = 1;
	}
	
	public int count(int exponent)
	{
		if (exponent == start)
			return 1;
		this.erg = this.erg + "\n " + Math.pow(start, exponent) + Math.pow(start, exponent-1) + Math.pow(start, exponent-1) + Math.pow(start, exponent);
		start++;
		System.out.println(erg);
		return count(exponent-1);
	}
	
}
