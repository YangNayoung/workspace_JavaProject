import java.util.Scanner; 
import java.util.Random;

public class 묵찌빠 {

	public static void main(String[] args) {
		boolean winplayer = false;
		boolean winner = false;
		
		String[] pae = {"찌", "묵", "빠"};
		//사용자의 입력을 받는다.(1:찌, 2:묵, 3:빠, 0:끝)
		System.out.println("사용자의 입력을 말하자(1:찌 2:묵 3:빠 0:종료) ");
		Scanner sc = new Scanner(System.in);
		while(true){
			int p = sc.nextInt();
			//컴퓨터의 패를 구하자
			if(p == 0) {
				break;
			}
			int c = makeComputer();
			int result = compare(p, c);
			
			System.out.println("사용자: "+pae[p-1]+"\t컴퓨터: "+pae[c-1]);
			if (result == -1) {
				winplayer = false;
				winner = true;
			} else if(result == 0) {
				// 처음 비기면 다시
				if(winner == true) {
				// 승패가 갈린 다음에 비기며, 게임 끝, 결과를 알려주자
					if(winplayer == true) {
						System.out.println("이겼다!!!");
					} else {
						System.out.println("졌다ㅠㅠ");
					}
				} else {
					// 처음 비기면 다시.
				}
			} else {
				// 이전 결과를 갖고 다시
				winplayer = true;
				winner =  true;
			}
		}
	}

	private static int compare(int p, int c) {
		if((p + 1) % 3 == c % 3) {
		//-1: 사용자 짐
			return -1;
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
		int c=random.nextInt(3-1+1)+1; // 1~3 임의의 수
		return c;
	}
}
