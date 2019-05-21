import java.awt.Dimension;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI_Image {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.setPreferredSize(new Dimension(1200, 400));
		
		ImageIcon BTS = new ImageIcon("src/images/BTS!.jpg");
		JLabel imageLable = new JLabel(BTS);
		
		ImageIcon V = new ImageIcon("src/images/V4.jpg");
		// 이미지 아이콘 크기 선정
		ImageIcon smallV = new ImageIcon(V.getImage().getScaledInstance(500,333,Image.SCALE_DEFAULT));
		JButton imageButton = new JButton(smallV);
		imageButton.setRolloverIcon(BTS); // 마우스 올리면
		imageButton.setPressedIcon(V); // 마우스 클릭화면
		
		panel.add(imageLable);
		panel.add(imageButton);
		frame.add(panel);
		
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
