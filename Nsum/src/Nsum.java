import java.util.Scanner; 

public class Nsum {

	public static void main(String[] args) {
		// ���� �Է¹��� (String���� �Է¹��� -> �ڸ����� �˱� ���ؼ� -> 0~�ڸ���-1���� �ϳ��� �߶� ���ؾ���/
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���>> ");
		String number = sc.nextLine();
		int sum=0;
		// �� �ڸ����� ���� ������
		int length = number.length();
		for(int i=0; i<length; i++) {
			// 0~�ڸ���-1���� �ݺ�����
			// �ѱ��ھ� �����ͼ� ���ڸ� �ٲ���
			char n = number.charAt(i);
			// sum�� ������
			sum+=n-'0';
		}
		// ���� ���� �������
		System.out.println(sum);
	}

}
