import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI_Event {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Event");
		JPanel panel = new JPanel();
		frame.setPreferredSize(new Dimension(400,600));
		
		JTextField tfInput = new JTextField(10);
		JButton btRun = new JButton("X 12");
		JLabel lbOutput = new JLabel();
		
		ActionListener al = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input = tfInput.getText();
				// lbOutput.setText("¾È³ç! "+input+"¾ß"); // ¾È³ç! ¤±¤±¾ß
				int i = Integer.parseInt(input);
				String Output = Integer.toString(i*12);
				lbOutput.setText(Output);
			}
		};
		
		btRun.addActionListener(al);
		
		panel.add(tfInput);
		panel.add(btRun);
		panel.add(lbOutput);
		frame.add(panel);
		
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
