// ���� �Է¹޾�
// ���� 30���� 1500��, 10�д� 1000��
// ��������� �������
// 5->1500, 30->1500, 40->2500��, 41->3500

public class ParkingFee {
	public static void main(String[] args) {
		//���� �Է¹ޱ�
		int Mintes = 52;
		int fee = 0;
		int minutes = 0;
		if(minutes <= 20) {
			// <= 30 �̸� , 1500
			fee = 1500;
		}
		else {
		//�ƴϰ�, 
		//��  -30, ��� += 1500
			minutes = Mintes - 30;
			fee += 1500;
			//��� += (��/10)*1000
			fee += (Mintes/10)*1000;
			//�� %10 != 0, ��� += 1000
			if(minutes%10 != 0) {
				fee += 1000;
			}
		}
		System.out.println("��������� " + fee + "���Դϴ�.");
	}
}