import java.awt.*;
import javax.swing.*;

public class GUITest_JFrame {
	public static void main(String[] args) {
		JFrame frame = new JFrame("창 이름");
		frame.setLocation(500, 300);
		frame.setPreferredSize(new Dimension(300, 400));
		//frame.setSize(300, 400);
		
		JPanel panel = new JPanel();
		JLabel label = new JLabel("안녕하세요");
		label.setOpaque(true);
		label.setBackground(Color.pink);
		JLabel label2 = new JLabel("반가워요");
		
		JTextField tf = new JTextField("이름이 뭔가요?");
		
		panel.add(label);
		panel.add(label2);
		panel.add(tf);
		frame.add(panel);
		
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
