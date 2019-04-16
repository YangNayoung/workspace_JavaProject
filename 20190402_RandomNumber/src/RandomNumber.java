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
		
		System.out.println("1~100까지 숫자 중 하나를 생각하세요.");
		System.out.println("숫자가 생각한 것보다 크다면 (DOWN)'2'을 작다면 (UP)'1'을 입력하고 맞으면 '0'을 입력하세요.");
		
		while(true) {
			
			int guess = random.nextInt(end-start+1)+start;
			//int guess = (end-start)/2;//최적화 기법
			System.out.println(guess+"입니까? (0 : 정답, 1 : up, 2 : down)");
			//input(up/down/점답/) (0 : 정답, 1 : up, 2 : down)
			int answer = scanner.nextInt();
			
			if(answer == 0) {
				System.out.println("정답입니다.");
				break;
			}
			else if(answer == 1) {
				//up이면 guess+1 ~end
				start = guess + 1;
			}
			else if(answer == 2) {
				//down이면 start ~ guess-1
				end = guess - 1;
			}

				

		}
	}

}