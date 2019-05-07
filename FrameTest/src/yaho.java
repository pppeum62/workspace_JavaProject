import java.awt.*;
import javax.swing.*;

public class yaho {
	public static void main(String[] args) {
		JFrame frame = new JFrame("안뇽");
		frame.setPreferredSize(new Dimension(300, 400));
		
		JPanel panel = new JPanel();
		JLabel label = new JLabel("ID : ");
		
		JTextField tf = new JTextField("아이디를 입력하세요");
		
		tf.setText("");
		
		panel.add(label);
		panel.add(tf);
		frame.add(panel);
		
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
