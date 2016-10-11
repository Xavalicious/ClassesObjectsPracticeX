
public class Letter {
	private String from;
	private String to;
	
	public Letter(String f, String t){
	from=f;
	to=t;
	}
	public void addLine(String line){
	System.out.println(line);	
	}
	public void getText(){
	System.out.println("Dear "+to+":");
	System.out.println("");
	addLine("I love you");
	addLine("But I can't stand being apart for so long");
	addLine("");
	addLine("Please forgive me");
	addLine("");
	addLine("Sincerely, ");
	addLine("");
	System.out.println(from);
	
	}
}
