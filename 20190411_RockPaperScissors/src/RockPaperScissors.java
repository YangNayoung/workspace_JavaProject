import java.util.Scanner; 
import java.util.Random;
public class RockPaperScissors {

	public static void main(String[] args) {
		String[] pae = {"가위", "바위", "보"};
		//사용자의 입력을 받는다.(1:가위, 2:바위, 3:보, 0:끝)
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("사용자의 입력을 말하자(1:가위 2:바위 3:보 0:종료) ");
			int p = sc.nextInt();
			//컴퓨터의 패를 구하자
			if(p == 0) {
				break;
			}
			int c = makeComputer();
			//사용자와 컴퓨터의 패를 비교하자
			int result = compare(p, c);
	/*		if(p == 1) {
				System.out.println("사용자: 가위");
			}else if(p == 2) {
				System.out.println("사용자: 바위");
			}else if(p == 3) {
				System.out.println("사용자: 보");
			}else {
				System.out.println("잘못 누르셨습니다.");
			} */
			System.out.println("사용자: "+pae[p-1]+"\t컴퓨터: "+pae[c-1]);
			if (result == -1) {
				System.out.println("졌다ㅠㅠ");
			} else if(result == 0) {
				System.out.println("비겼다.");
			} else {
				System.out.println("이겼다!!!");
			}
		//결과를 출력하자
		}
	}

	private static int compare(int p, int c) {
		//if((p == 1 && c == 2) || (p == 2 && c == 3) || (p == 3 && c == 1)) {
		if((p + 1) % 3 == c) {
		//-1: 사용자 짐
			return -1;
		// } else if ((p == 1 && c == 1) || (p == 2 && c == 2) || (p == 3 && c == 3)) {
		} else if(p == c) {
		//0: 비금
			return 0;
		} else {
		//1: 사용자 이김
		return 1;
		}
	}

	private static int makeComputer() {
		Random random = new Random();
		int c  = random.nextInt(3 - 1 + 1) + 1; // 1~3 임의의 수
		return c;
	}
}