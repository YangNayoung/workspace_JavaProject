import java.util.Scanner; 

public class NumberToWeekday {

	public static void main(String[] args) {
		String[] weekdays = {"��","ȭ","��","��","��","��","��"};
		// �����Է�����
		System.out.println("���ڸ� �Է��ϸ� ������ ���ɴϴ�>> ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		// ���� ������� (1 => ������, 2 => ȭ����, ..., 7 => �Ͽ���)
		System.out.println(weekdays[input-1]+"����");
		/* switch (input) {
		case 1: System.out.println("������");
			break;
		case 2: System.out.println("ȭ����");
			break;
		case 3: System.out.println("������");
			break;
		case 4: System.out.println("�����");
			break;
		case 5: System.out.println("�ݿ���");
			break;
		case 6: System.out.println("�����");
			break;
		case 7: System.out.println("�Ͽ���");
			break;
		} */
	}

}
