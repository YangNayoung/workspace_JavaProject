import java.util.Scanner;

public class Echo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String inputString = sc.nextLine();
		if(inputString.equals("exit")) {
			System.out.println("¾È³ç, Àß°¡");
		}
		System.out.println(inputString);
	}

}
