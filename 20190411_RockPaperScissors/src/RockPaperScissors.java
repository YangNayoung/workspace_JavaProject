import java.util.Scanner; 
import java.util.Random;
public class RockPaperScissors {

	public static void main(String[] args) {
		String[] pae = {"����", "����", "��"};
		//������� �Է��� �޴´�.(1:����, 2:����, 3:��, 0:��)
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("������� �Է��� ������(1:���� 2:���� 3:�� 0:����) ");
			int p = sc.nextInt();
			//��ǻ���� �и� ������
			if(p == 0) {
				break;
			}
			int c = makeComputer();
			//����ڿ� ��ǻ���� �и� ������
			int result = compare(p, c);
	/*		if(p == 1) {
				System.out.println("�����: ����");
			}else if(p == 2) {
				System.out.println("�����: ����");
			}else if(p == 3) {
				System.out.println("�����: ��");
			}else {
				System.out.println("�߸� �����̽��ϴ�.");
			} */
			System.out.println("�����: "+pae[p-1]+"\t��ǻ��: "+pae[c-1]);
			if (result == -1) {
				System.out.println("���٤Ф�");
			} else if(result == 0) {
				System.out.println("����.");
			} else {
				System.out.println("�̰��!!!");
			}
		//����� �������
		}
	}

	private static int compare(int p, int c) {
		//if((p == 1 && c == 2) || (p == 2 && c == 3) || (p == 3 && c == 1)) {
		if((p + 1) % 3 == c) {
		//-1: ����� ��
			return -1;
		// } else if ((p == 1 && c == 1) || (p == 2 && c == 2) || (p == 3 && c == 3)) {
		} else if(p == c) {
		//0: ���
			return 0;
		} else {
		//1: ����� �̱�
		return 1;
		}
	}

	private static int makeComputer() {
		Random random = new Random();
		int c  = random.nextInt(3 - 1 + 1) + 1; // 1~3 ������ ��
		return c;
	}
}