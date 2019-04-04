import java.util.*;

public class StudentNumberToMajor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String major[][] = {{"뉴미디어소프트웨어과","뉴미디어웹솔루션과", "뉴미디어디자인과"},
				{"뉴미디어소프트웨어과","뉴미디어웹솔루션과", "뉴미디어디자인과"},
				{"인터랙티브미디어과", "뉴미디어디자인과", "뉴미디어솔루션과"}};
		
		System.out.print("학번을 입력해주세요 >> ");
		String input = sc.nextLine();
		
		String grade = input.substring(0, 1);
		String classNum = input.substring(1, 2);
		
		int gradeNum = Integer.parseInt(grade);
		int classNumber = Integer.parseInt(classNum);
		
		int classNumber2 = (classNumber-1)/2;
		
		System.out.println("학번 : "+input);
		System.out.println("학과 : "+major[gradeNum-1][classNumber2]);
	}
}