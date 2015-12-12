package Lohnberechnung;

public class lohnberechnung {
	private String vorname;
	private String nachname;
	private int mitarbeiternummer;
	private double gehalt;
	private int alter;
	private static int mitarbeiter_counter = 0;
	
	public lohnberechnung (String vorname, String nachname, double gehalt) {
		this.vorname=vorname;
		this.nachname=nachname;
		this.gehalt=gehalt;
		this.mitarbeiternummer=mitarbeiter_counter++;
		this.alter = 0;
	}
	
	public String getNachname() {
		return nachname;
	}
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
	public double getGehalt() {
		return gehalt;
	}
	public void setGehalt(double gehalt) {
		this.gehalt = gehalt;
	}
	public String getVorname() {
		return vorname;
	}
	public int getMitarbeiternummer() {
		return mitarbeiternummer;
	}
	public int getAlter() {
		return alter;
	}
	
	public double monatsAbrechnung()
	{
		double newGehalt=this.gehalt*12*0.8;
		double steuer = 0;

//		if (newGehalt < 10000)
//			steuer = newGehalt * (10/100);
//		if (newGehalt < 20000)
//			newGehalt = newGehalt + ((newGehalt-10000) * (20/100));
//		if (newGehalt < 30000)
//			newGehalt = newGehalt + ((newGehalt-20000) * (32/100));
//		if (newGehalt < 50000)
//			newGehalt = newGehalt + ((newGehalt-30000) * (45/100));
//		if (newGehalt > 50000)
//			newGehalt = newGehalt + ((newGehalt-50000) * (60/100));
//		return newGehalt/12;
		
		if (newGehalt > 50000) {
			steuer = steuer + (newGehalt - 50000)*0.6; 
			newGehalt=50000; }
		if (newGehalt > 30000) {
			steuer = steuer + (newGehalt - 30000)*0.45;
			newGehalt=30000; }
		if (newGehalt > 20000) {
			steuer = steuer + (newGehalt - 20000)*0.32;
			newGehalt=20000; }
		if (newGehalt > 10000) {
			steuer = steuer + (newGehalt - 10000)*0.20;
			newGehalt=10000; }
		if (newGehalt <= 10000) {
			steuer = steuer + newGehalt *0.1;
		}
		return (((this.gehalt*12*0.8)-steuer)/12);
	}
	
	public double jahresAbrechnung()
	{
		return jahresAbrechnung(12);
	}
	
	public double jahresAbrechnung(int monate)
	{
		return monatsAbrechnung() * monate;
	}
	
	

}
