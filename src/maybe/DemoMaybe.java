package maybe;

import java.util.GregorianCalendar;

public class DemoMaybe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MayBe<String> Name = new MayBe<String>("Müller",MayBe.ZugriffErlaubt);
		Name.MaybeCheck();
		Name.setStatus(MayBe.ZugriffVerboten);
		Name.MaybeCheck();
		MayBe<GregorianCalendar> Datum = new MayBe<GregorianCalendar> (new GregorianCalendar(2015, 10, 20), MayBe.ZugriffErlaubt);
		Datum.MaybeCheck();
		MayBe<Integer> Gehalt = new MayBe<Integer>(new Integer(1234), MayBe.ZugriffErlaubt);
		Gehalt.MaybeCheck();
	}

}
