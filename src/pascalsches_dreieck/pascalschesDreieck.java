package pascalsches_dreieck;

public class pascalschesDreieck {

	protected int zahl1;
	protected int zahl2;
	
	public pascalschesDreieck (int zahl1, int zahl2) {
		this.zahl1 = zahl1;
		this.zahl2 = zahl2;
	}
	
	public int count(int zahl1, int zahl2)
	{
		if ( zahl1 == 0 && zahl2 == 0 )
			return 0;
		
		System.out.println(zahl1+zahl2);
		return count(zahl1-1,zahl2-1);
	}
	
}
