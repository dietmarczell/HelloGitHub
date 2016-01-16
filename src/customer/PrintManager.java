package customer;

import java.util.ArrayList;

public class PrintManager {

	private ArrayList<Document> Dokumentenliste = new ArrayList<Document>();
	
	public void addDocument(Document d)
	{
		Dokumentenliste.add(d);
	}

	public void printAll()
	{
		for (Document document : Dokumentenliste) {
			document.printDocument();
		}
	}
	
	public Document findDocument(String fileName)
	{
		for (Document document : Dokumentenliste) {
			if (document.fileName.equals(fileName))
			{
				return document;
			}
		}
		return new Document(fileName);
	}
}
