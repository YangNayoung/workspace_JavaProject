import java.util.Random;
import java.util.Scanner; 

public class RandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start = 0;
		int end = 99;
		Random random = new Random();
		int RandomNumber = random.nextInt(end+1-start)+start;
		System.out.println(RandomNumber);
		Scanner sc = new Scanner(System.in);
		while (true) {
			int input = sc.nextInt();
			
			if(input == 2) {
				//up -> start ��ü, guess ����
				start = guess + 1;
			}
			else if(input == 3) {
				//down -> end ��ü, guess ����
				
			}
			else if(input == 1) {
				System.out.println("�����Դϴ�.");
				break;
			}
			//== -> "�����Դϴ�.", break
		}
	}

}
