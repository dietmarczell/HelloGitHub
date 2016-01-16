package customer;
import java.util.ArrayList;

public class CsvDocument extends Document {

	private ArrayList<String> lines;
	
	public CsvDocument(String fileName, ArrayList<String> lines) {
		super(fileName);
		this.lines = lines;
	}
	
	@Override
	public void printDocument() {
		System.out.println("filename:"+fileName+" Content:"+lines.toString());
	}
	
	public void addLine(String line)
	{
		this.lines.add(line);
	}
}
