import java.awt.Dimension;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUITest2_JComboBox {

	public static void main(String[] args) {
		JFrame frame = new JFrame("â�̸�");
		frame.setLocation(500,300);
		frame.setPreferredSize(new Dimension(300,200));

		JPanel panel = new JPanel();
		String[] picnics = {"�Ҳɱ���", "��������"};
		JComboBox<String> cb =  new JComboBox<>(picnics);
		cb.addItem("����ķ��");
		
		panel.add(cb);
		frame.add(panel);
		
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
