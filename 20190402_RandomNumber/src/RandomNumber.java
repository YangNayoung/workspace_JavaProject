import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start = 0;
		int end = 99;
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int randomNumber = random.nextInt(end+1-start)+start;
		
		System.out.println("1~100���� ���� �� �ϳ��� �����ϼ���.");
		System.out.println("���ڰ� ������ �ͺ��� ũ�ٸ� (DOWN)'2'�� �۴ٸ� (UP)'1'�� �Է��ϰ� ������ '0'�� �Է��ϼ���.");
		
		while(true) {
			
			int guess = random.nextInt(end-start+1)+start;
			//int guess = (end-start)/2;//����ȭ ���
			System.out.println(guess+"�Դϱ�? (0 : ����, 1 : up, 2 : down)");
			//input(up/down/����/) (0 : ����, 1 : up, 2 : down)
			int answer = scanner.nextInt();
			
			if(answer == 0) {
				System.out.println("�����Դϴ�.");
				break;
			}
			else if(answer == 1) {
				//up�̸� guess+1 ~end
				start = guess + 1;
			}
			else if(answer == 2) {
				//down�̸� start ~ guess-1
				end = guess - 1;
			}

				

		}
	}

}