import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUITest9_Event {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Event");
		JPanel panel = new JPanel();
		frame.setPreferredSize(new Dimension(400, 600));
		
		JTextField tfInput = new JTextField(10);
		JButton btRun = new JButton("->");
		JLabel lbOutput = new JLabel();
		
		ActionListener al = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input = tfInput.getText();
				//lbOutput.setText("안녕 "+input+"!");
				int num = Integer.parseInt(input) * 12;
				lbOutput.setText(input+" * 12 = "+String.valueOf(num));
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
