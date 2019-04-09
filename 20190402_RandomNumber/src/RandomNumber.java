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
				//up -> start 교체, guess 추측
				start = guess + 1;
			}
			else if(input == 3) {
				//down -> end 교체, guess 추측
				
			}
			else if(input == 1) {
				System.out.println("정답입니다.");
				break;
			}
			//== -> "정답입니다.", break
		}
	}

}
