package customer;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		customer maier = new customer("Hans","Maier", 1234);

		System.out.println(maier.getCustomerNumber() + " " + maier.getFirstname() + " " + maier.getLastname());
		maier.getInfo();
		
		System.out.println();
		
		Hase Haserl = new Hase("Hoppler");
		Haserl.hoppeln();
		Haserl.fressen();
		Haserl.schlafen();
		
		Weihnachtshase Saturn = new Weihnachtshase("Saturn");
		Saturn.hoppeln();
		Saturn.geschenke_verteilen();
		
		Osterhase OHase = new Osterhase("Osterhase");
		OHase.hoppeln();
		OHase.ostereier_verteilen();
		
		System.out.println();
		
		Document file = new Document("irgendeinFile.dat");
		file.printDocument();
		
		TextDocument textfile = new TextDocument("irgendeinFile.txt", "blub blub blub");
		textfile.printDocument();
		
		ImageDocument bild = new ImageDocument("bild.jpg", 1024, 768, "RGB");
		bild.printDocument();
		
		ArrayList<String> stringarray = new ArrayList<String>();
		stringarray.add("hallo");
		stringarray.add("123");
		System.out.println(stringarray.toString());
		CsvDocument filecsv = new CsvDocument("file.csv", stringarray);
		filecsv.printDocument();
		filecsv.addLine("blubb");
		filecsv.printDocument();
		
		System.out.println(stringarray.toString());
		Document csv = new CsvDocument("csv.csv",stringarray);
		csv.printDocument();
		
		System.out.println();
		
		PrintManager pmgr = new PrintManager();
		pmgr.addDocument(csv);
		pmgr.addDocument(filecsv);
		pmgr.addDocument(bild);
		pmgr.addDocument(textfile);
		pmgr.addDocument(file);
		pmgr.printAll();
		
		System.out.println(pmgr.findDocument("file.csv").fileName);
	}
}