import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class �ɸ��׽�Ʈ{
	public static void main(String[] args) {
		JFrame frame = new JFrame("�ɸ��׽�Ʈ");
		JPanel panel = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel test1 = new JPanel();	
		JPanel test3 = new JPanel();
		JPanel test1_1 = new JPanel();
		frame.setPreferredSize(new Dimension(2000,1000));

		//FlowLayout
		panel.setLayout(new BorderLayout());
		panel2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 25));
		test1.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 20));
		test3.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 20));
		
		test1_1.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 20));

		//��ư ���� 450, ���� 350 30�� ����Ʈ��, ������ 25 ����Ʈ��
		//��� ���� 1472,���� 600	
		
		//�ɸ��׽�Ʈ ����
		ImageIcon image1 = new ImageIcon("src/image/1.PNG");
		ImageIcon small1 = new ImageIcon(image1.getImage().getScaledInstance(450, 350, Image.SCALE_DEFAULT));
		ImageIcon image2 = new ImageIcon("src/image/2.PNG");
		ImageIcon small2 = new ImageIcon(image2.getImage().getScaledInstance(450, 350, Image.SCALE_DEFAULT));
		ImageIcon image3 = new ImageIcon("src/image/3.PNG");
		ImageIcon small3 = new ImageIcon(image3.getImage().getScaledInstance(450, 350, Image.SCALE_DEFAULT));
		ImageIcon image4 = new ImageIcon("src/image/4.PNG");
		ImageIcon small4 = new ImageIcon(image4.getImage().getScaledInstance(450, 350, Image.SCALE_DEFAULT));
		
		JButton imageButton1 = new JButton(small1);
		JButton imageButton2 = new JButton(image2);
		JButton imageButton3 = new JButton(image3);
		JButton imageButton4 = new JButton(image4);
		
		//�ɸ��׽�Ʈ1
		ImageIcon A = new ImageIcon("src/image/A.PNG");
		ImageIcon B = new ImageIcon("src/image/B.PNG");
		ImageIcon C = new ImageIcon("src/image/C.PNG");
		ImageIcon D = new ImageIcon("src/image/D.PNG");
		
		JButton AButton = new JButton(A);
		JButton BButton = new JButton(B);
		JButton CButton = new JButton(C);
		JButton DButton = new JButton(D);
		

		ActionListener Test1Listener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == imageButton1) {//setVisible, CardLayout
					test1.setVisible(true);
				}
			}
		};
		imageButton1.addActionListener(Test1Listener);

		
		//�ɸ��׽�Ʈ1 ����
		ImageIcon A_A = new ImageIcon("src/image/A_A.jpg");
		ImageIcon B_B = new ImageIcon("src/image/B_B.jpg");
		ImageIcon C_C = new ImageIcon("src/image/C_C.jpg");
		ImageIcon D_D = new ImageIcon("src/image/D_D.jpg");
		
		JButton A_AButton = new JButton(A_A);
		JButton B_BButton = new JButton(B_B);
		JButton C_CButton = new JButton(C_C);
		JButton D_DButton = new JButton(D_D);
		
		ActionListener Test1_1Listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == AButton) {
					test1.setVisible(false);
					
					A_AButton.setVisible(true);	
				}
				
			}
		};
		A_AButton.addActionListener(Test1_1Listener);
		
		
		
		//�ɸ��׽�Ʈ3
		//ImageIcon 
		
		panel.add(panel2, BorderLayout.NORTH);
		panel.add(test1, BorderLayout.SOUTH);
		//panel.add(test1_1, BorderLayout.SOUTH);
		//test1
		test1.add(AButton);
		test1.add(BButton);
		test1.add(CButton);
		test1.add(DButton);
		test1.setVisible(false);
		test1_1.add(A_AButton);
		test1_1.add(B_BButton);
		test1_1.add(C_CButton);
		test1_1.add(D_DButton);
		test1_1.setVisible(false);
		//test2
		
		
		panel2.add(imageButton1);
		panel2.add(imageButton2);
		panel2.add(imageButton3);
		panel2.add(imageButton4);
		frame.add(panel);

		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}