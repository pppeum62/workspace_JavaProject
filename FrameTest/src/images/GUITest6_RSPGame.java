package images;
import java.awt.*;
import javax.swing.*;

public class GUITest6_RSPGame {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.setPreferredSize(new Dimension(400, 600));
		
		JLabel result = new JLabel("Win");
		ImageIcon computerImage = new ImageIcon("");
		JLabel computerLabel = new JLabel(computerImage);
		
		ImageIcon scissorsImage = new ImageIcon("");
		JLabel scissorsButton = new JLabel(scissorsImage);
		ImageIcon rockImage = new ImageIcon("");
		JLabel rockButton = new JLabel(rockImage);
		ImageIcon paperImage = new ImageIcon("");
		JLabel paperButton = new JLabel(paperImage);
		
		panel.add(result);
		panel.add(computerLabel);
		panel.add(scissorsButton);
		panel.add(rockButton);
		panel.add(paperButton);
		frame.add(panel);
		
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
