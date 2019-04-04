import java.util.Scanner; 

public class StudentNumber2Major {

	public static void main(String[] args) {
		// 학번 입력 받자
		Scanner sc = new Scanner(System.in);
		System.out.println("학번을 입력하세요(ex.1111)>> ");
		String studentID = sc.nextLine();
		System.out.println(studentID);
		String grade = studentID.substring(0,1);
		String classroom = studentID.substring(1,2);
		// 학과  출력하자
		if(grade.equals("1")||grade.equals("2")) {
			// 학년이 1,2 이면
			if(classroom.equals("1")||classroom.equals("2")) {
				// 반이 1,2반 "뉴미디어소프트웨어과"
				System.out.println("뉴미디어소프트웨어과");
			}
			else if(classroom.equals("3")||classroom.equals("4")) {
				// 반이 3,4반 "뉴미디어웹솔루션과"
				System.out.println("뉴미디어웹솔루션과");
			}
			else if(classroom.equals("5")||classroom.equals("6")) {
				// 반이 5,6반 "뉴미디어디자인과"
				System.out.println("뉴미디어디자인과");
			}
		}
		
		if(grade.equals("3")) {
			// 학년이 3이면
			if(classroom.equals("1")||classroom.equals("2")) {
				// 반이 1,2반 "인터렉티브미디어과"
				System.out.println("인터렉트미디어과");
			}
			else if(classroom.equals("3")||classroom.equals("4")) {
				// 반이 3,4반 "뉴미디어디자인과"
				System.out.println("뉴미디어디자인과");
			}
			else if(classroom.equals("5")||classroom.equals("6")) {
				// 반이 5,6반 "뉴미디어웹솔루션과"
				System.out.println("뉴미디어웹솔루션과");
			}
		}
	}

}
