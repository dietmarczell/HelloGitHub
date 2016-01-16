package customer;

public class TextDocument extends Document{

	private String content;
	
	public TextDocument(String fileName, String content) {
		super(fileName);
		this.content = content;
	}

	@Override
	public void printDocument() {
		System.out.println("filename:"+fileName+" FileContent:"+content);
	}
	
}
