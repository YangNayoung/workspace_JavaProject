import java.util.Random;
import java.util.Scanner; 

public class Up_Down_Bot {
	public static void main(String[] args) {
		int start = 1;
		int end = 100;
		//makeGuess strar ~ end ���� ����
		Random random = new Random();
		while (true) {
			// int guess =  random.nextInt(end+1-start)+start; ��û�� ���
			int guess = (end-start)/2;
			System.out.println(guess+"�Դϱ�? (1: ����, 2: Up, 3: Down)");
			// input(up/down/����) (1. ����, 2.up, 3.down)
			Scanner sc = new Scanner(System.in);
			int answer = sc.nextInt();
			if(answer == 1) {
				//== -> "�����Դϴ�.", break
				System.out.println("�����Դϴ�.");
				break;
			}
			else if(answer == 2) {
				//up�̸� guess+1 ~ end
				start = guess + 1;
				
			}
			else if(answer == 3) {
				//down�̸� start ~ end -1
				end = guess-1;
			}
		}
	}

}