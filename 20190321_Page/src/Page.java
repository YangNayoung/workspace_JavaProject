/*
import java.util.*;

public class Page {

	public static void main(String[] args) {
		int nPerPage=7;
		System.out.println("�� ���� �Խù��� ǥ���ұ��?(������ ������.) ");
		Scanner sc = new Scanner(System.in);
		int result=sc.nextInt();
		int ���= result/nPerPage;
		if(result%nPerPage==0) {
			���=result/nPerPage+1;
		}
		System.out.println(���+"�������� �ʿ��մϴ�.");
		
		}

} */

import java.util.*;

public class Page {

	public static void main(String[] args) {
		int nPerPage=7;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("�� ���� �Խù��� ǥ���ұ��?(������ ������.) ");
			String inputString= sc.nextLine();
			if(inputString.equals("exit")) {
				System.out.println("��");
				break;
				}
			int result=Integer.parseInt(inputString);
			int ���= result/nPerPage;
			if(result%nPerPage!=0) {
				���=result/nPerPage+1;
			}
			System.out.println(���+"�������� �ʿ��մϴ�.");
		}
	}

}