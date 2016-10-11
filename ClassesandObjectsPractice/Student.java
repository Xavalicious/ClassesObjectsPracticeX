
public class Student {
	private String name;
	private int score;
	private int p=1;
	public Student(String n, int s){
	name=n;
	score=s;
	}
	public String getName(){
	return name;	
	}
	public void addQuiz(int sc){
	score=score+sc;
	p++;
	}
	public int getTotalScore(){
	return score;	
	}
	public int getAverageScore(){
	return (score/p);	
	}
}
