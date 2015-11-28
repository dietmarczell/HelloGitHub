package maybe;

public class MayBe <Type> {

	private Type data;
	private int status;
	
	public final static int ZugriffErlaubt = 1;
	public final static int ZugriffVerboten = 2;
	public final static int KeineDaten = 3;
	
	public void setData(Type data) {
		this.data = data;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
	public void MaybeCheck ()
	{
		switch (status) {
		case ZugriffErlaubt:
			System.out.println("Zugriff erlaubt: "+data);
			break;
		case ZugriffVerboten:
			System.out.println("Zugriff verboten");
			break;
		case KeineDaten:
			System.out.println("keine Daten!");
			break;
		default:
			System.out.println("Ungültiger Status!!");
		}
	}

	public MayBe(Type data, int status) {
		this.data = data;
		this.status = status;
	}
	
}
