/*
import java.util.*;

public class Page {

	public static void main(String[] args) {
		int nPerPage=7;
		System.out.println("몇 개의 게시물을 표시할까요?(정수로 쓰세요.) ");
		Scanner sc = new Scanner(System.in);
		int result=sc.nextInt();
		int 결과= result/nPerPage;
		if(result%nPerPage==0) {
			결과=result/nPerPage+1;
		}
		System.out.println(결과+"페이지가 필요합니다.");
		
		}

} */

import java.util.*;

public class Page {

	public static void main(String[] args) {
		int nPerPage=7;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("몇 개의 게시물을 표시할까요?(정수로 쓰세요.) ");
			String inputString= sc.nextLine();
			if(inputString.equals("exit")) {
				System.out.println("끝");
				break;
				}
			int result=Integer.parseInt(inputString);
			int 결과= result/nPerPage;
			if(result%nPerPage!=0) {
				결과=result/nPerPage+1;
			}
			System.out.println(결과+"페이지가 필요합니다.");
		}
	}

}