import java.util.Scanner; 

public class StudentNumber2Major {

	public static void main(String[] args) {
		// �й� �Է� ����
		Scanner sc = new Scanner(System.in);
		System.out.println("�й��� �Է��ϼ���(ex.1111)>> ");
		String studentID = sc.nextLine();
		System.out.println(studentID);
		String grade = studentID.substring(0,1);
		String classroom = studentID.substring(1,2);
		// �а�  �������
		if(grade.equals("1")||grade.equals("2")) {
			// �г��� 1,2 �̸�
			if(classroom.equals("1")||classroom.equals("2")) {
				// ���� 1,2�� "���̵�����Ʈ�����"
				System.out.println("���̵�����Ʈ�����");
			}
			else if(classroom.equals("3")||classroom.equals("4")) {
				// ���� 3,4�� "���̵�����ַ�ǰ�"
				System.out.println("���̵�����ַ�ǰ�");
			}
			else if(classroom.equals("5")||classroom.equals("6")) {
				// ���� 5,6�� "���̵������ΰ�"
				System.out.println("���̵������ΰ�");
			}
		}
		
		if(grade.equals("3")) {
			// �г��� 3�̸�
			if(classroom.equals("1")||classroom.equals("2")) {
				// ���� 1,2�� "���ͷ�Ƽ��̵���"
				System.out.println("���ͷ�Ʈ�̵���");
			}
			else if(classroom.equals("3")||classroom.equals("4")) {
				// ���� 3,4�� "���̵������ΰ�"
				System.out.println("���̵������ΰ�");
			}
			else if(classroom.equals("5")||classroom.equals("6")) {
				// ���� 5,6�� "���̵�����ַ�ǰ�"
				System.out.println("���̵�����ַ�ǰ�");
			}
		}
	}

}
