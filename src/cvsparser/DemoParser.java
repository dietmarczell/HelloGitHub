package cvsparser;

public class DemoParser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CSVParser csvString = new CSVParser("hallo,ich,bin,ein,csv,string,der,immer,länger,wird,und,es,funktioniert,trotzdem");
		csvString.countComma();
		csvString.parse();
	}
}
