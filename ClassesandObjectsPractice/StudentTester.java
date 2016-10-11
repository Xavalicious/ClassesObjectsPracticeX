
public class StudentTester {

	public static void main(String[] args) {
	Student Adrian=new Student("Adrian", 77);
	System.out.println(Adrian.getName());
	Adrian.addQuiz(89);
	System.out.println(Adrian.getTotalScore());
	System.out.println(Adrian.getAverageScore());
	}

}
