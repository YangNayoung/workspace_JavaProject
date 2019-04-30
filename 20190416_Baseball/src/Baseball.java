import java.util.Random;
import java.util.Scanner; 
public class Baseball {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String c = makeComputer();
		//���� �����
		
		//���ѹݺ�
		while(true) {
			//	1~9���� ���ڸ� ���� �Է�
			String p = sc.nextLine();
			//	strike, ball ������.
			boolean isEnd = play(p,c);
			if(isEnd==true) {
				System.out.println("HIT");
				break;
			
			}
		}
	}
	
	private static String makeComputer() {
		StringBuffer buffer = new StringBuffer();
		//1~9���� �������� 3�� �̱�, �ߺ�����
		Random random = new Random();
		for(int i = 0; i<3;) {
			int r = random.nextInt(9 - 1 + 1) + 1;
			String rString = String.valueOf(r);
			// StringBuffer�� �ֱ� ����, �ִ��� Ȯ��
			if(!buffer.toString().contains(rString)) {
				buffer.append(rString);
				i++;
			}
		}
		return "719";
	}
	
	private static boolean play(String p, String c) {
		int strike = 0;
		int ball = 0;
		//		for i ������ε��� ����
		for(int i = 0; i<p.length(); i++) {
			//			for j ��ǻ���ε��� ����
			for(int j = 0; j<c.length(); j++) {
				if(p.charAt(i) == c.charAt(j)) {
					if(i == j) strike++;
					else ball++;
				//				if i == j, strike++;
		//				else, ball++
				}
			}
		}
		//p, strike, ball ���
		System.out.println(p+"\tstrike"+strike+"\tball"+ball);
		
		//	strike == �Է��� ���ڿ� ���̸�ŭ ������ HIT
		if(p.contentEquals(c))
			return true;
		return false;
	}
}
