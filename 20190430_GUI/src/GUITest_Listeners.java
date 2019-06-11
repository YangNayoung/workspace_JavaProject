import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUITest_Listeners {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Ã¢ÀÌ¸§");
		frame.setLocation(500, 300);
		frame.setPreferredSize(new Dimension(400,600));
		
		JPanel panel = new JPanel();
		JTextField tfInput = new JTextField(10);
		JTextField tfInput2 = new JTextField(20);
		
		JLabel lbOutput = new JLabel("ÃÄ ¿£ÅÍ!");
		
		tfInput.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				lbOutput.setText(tfInput.getText()+" Èì»¶¼î!!!");
				
			}
		});
		tfInput.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub
				lbOutput.setText("´Ù½Ãµ¹¾Æ¿Í");
				
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				// TODO Auto-generated method stub
				lbOutput.setText("³ª¸¸ºÁ¶óºÁ 0.0");
				
			}
		});
		
		panel.add(tfInput);
		panel.add(tfInput2);
		panel.add(lbOutput);
		frame.add(panel);
		
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}