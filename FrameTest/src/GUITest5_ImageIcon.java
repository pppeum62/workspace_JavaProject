import java.awt.*;
import javax.swing.*;

public class GUITest5_ImageIcon {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.setPreferredSize(new Dimension(700, 700));
		
		ImageIcon Charlie = new ImageIcon("src/images/Charlie.png");
		JLabel imageLabel = new JLabel(Charlie);
		
		ImageIcon kirby = new ImageIcon("src/images/kirby.png");
		JLabel imageLb = new JLabel(kirby);
		
		ImageIcon Charlie2 = new ImageIcon("src/images/CharlieBr.png");
		//JButton imageButton = new JButton(Charlie2);
		//ImageIcon 크기 수정
		ImageIcon smallCharlie = new ImageIcon(Charlie2.getImage().getScaledInstance(320, 600, Image.SCALE_DEFAULT));
		JButton imageButton = new JButton(smallCharlie);
		imageButton.setRolloverIcon(kirby); //마우스 올렸을 때
		imageButton.setPressedIcon(Charlie); //마우스 클릭하면
		
		panel.add(imageLabel);
		panel.add(imageButton);
		frame.add(panel);
		
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}