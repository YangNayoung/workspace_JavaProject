import java.util.Scanner; 
import java.util.Random;

public class ����� {

	public static void main(String[] args) {
		boolean winplayer = false;
		boolean winner = false;
		
		String[] pae = {"��", "��", "��"};
		//������� �Է��� �޴´�.(1:��, 2:��, 3:��, 0:��)
		System.out.println("������� �Է��� ������(1:�� 2:�� 3:�� 0:����) ");
		Scanner sc = new Scanner(System.in);
		while(true){
			int p = sc.nextInt();
			//��ǻ���� �и� ������
			if(p == 0) {
				break;
			}
			int c = makeComputer();
			int result = compare(p, c);
			
			System.out.println("�����: "+pae[p-1]+"\t��ǻ��: "+pae[c-1]);
			if (result == -1) {
				winplayer = false;
				winner = true;
			} else if(result == 0) {
				// ó�� ���� �ٽ�
				if(winner == true) {
				// ���а� ���� ������ ����, ���� ��, ����� �˷�����
					if(winplayer == true) {
						System.out.println("�̰��!!!");
					} else {
						System.out.println("���٤Ф�");
					}
				} else {
					// ó�� ���� �ٽ�.
				}
			} else {
				// ���� ����� ���� �ٽ�
				winplayer = true;
				winner =  true;
			}
		}
	}

	private static int compare(int p, int c) {
		if((p + 1) % 3 == c % 3) {
		//-1: ����� ��
			return -1;
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
		int c=random.nextInt(3-1+1)+1; // 1~3 ������ ��
		return c;
	}
}
