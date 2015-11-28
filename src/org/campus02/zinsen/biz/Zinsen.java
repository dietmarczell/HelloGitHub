package org.campus02.zinsen.biz;

public class Zinsen {

	private double Kapital;
	private int Tage;
	private double Zinssatz;

	//Konstruktor
	public Zinsen (double gotKapital, int gotTage, double gotZinssatz) {
		if (gotTage < 0){
			this.Tage = 0;
		}
		if (gotZinssatz > 100){
			this.Zinssatz = 100;
		}
		this.Kapital=gotKapital;
		this.Tage=gotTage;
		this.Zinssatz=gotZinssatz;
	}
	
	public double berechnen()
	{
		System.out.println(this.Kapital+" "+this.Tage+" "+this.Zinssatz);
		return (this.Kapital*this.Tage*this.Zinssatz/36000);
	}
	
	public double berechnen(double gotKapital, int gotTage, double gotZinssatz)
	{
		System.out.println(gotKapital+" "+gotTage+" "+gotZinssatz);
		return (gotKapital*gotTage*gotZinssatz/36000.0);
	}
}
