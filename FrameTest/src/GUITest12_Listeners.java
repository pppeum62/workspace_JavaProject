import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class GUITest12_Listeners {
	public static void main(String[] args) {
		JFrame frame = new JFrame("창이름");
		frame.setLocation(500, 300);
		frame.setPreferredSize(new Dimension(400, 600));
		
		JPanel panel = new JPanel();
		JTextField tfInput = new JTextField(10);
		JTextField tfInput2 = new JTextField(20);
		JLabel lbOutput = new JLabel("엔터 입력");
		
		tfInput.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbOutput.setText(tfInput.getText()+" 흠뻑쇼");
			}
		});
		
		tfInput.addFocusListener(new FocusListener() {
			public void focusLost(FocusEvent e) {
				lbOutput.setText("ㅠㅜ");
			}
			
			public void focusGained(FocusEvent e) {
				lbOutput.setText("ㅎㅎ");
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
