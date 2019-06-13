import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUITest11_UpDown {
	
	static int computer;
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("업다운업다운업다운");
		frame.setPreferredSize(new Dimension(400, 600));
		JPanel panel = new JPanel();
		
		Random random = new Random();
		computer = random.nextInt(100) + 1; // 1~100
				
		JTextField tfInput = new JTextField(10);
		JButton btQuestion = new JButton("입니까?");
		JLabel lbResult = new JLabel("1~100 사이 숫자 맞춰봐");
		
		ActionListener al = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input = tfInput.getText();
				tfInput.setText("");
				int player = Integer.parseInt(input);
				
				if (computer > player)
					lbResult.setText(player+" Up");
				else if (computer < player)
					lbResult.setText(player+" Down");
				else {
					lbResult.setText("정답입니다.");
					computer = random.nextInt(100) + 1;
				}
				
			}
		};
		
		btQuestion.addActionListener(al);
		tfInput.addActionListener(al);
		
		panel.add(tfInput);
		panel.add(btQuestion);
		panel.add(lbResult);
		frame.add(panel);
		
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
