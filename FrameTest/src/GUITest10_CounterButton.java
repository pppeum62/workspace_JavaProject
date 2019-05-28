import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUITest10_CounterButton {
	public static void main(String[] args) {
		JFrame frame = new JFrame("CounterButton");
		JPanel panel = new JPanel();
		
		frame.setPreferredSize(new Dimension(400, 150));
		
		JLabel lbNumber = new JLabel("0");
		lbNumber.setHorizontalAlignment(SwingConstants.CENTER);
		JButton btCount = new JButton("Click Counter");
		
		ActionListener listener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = lbNumber.getText();
				int cnt = Integer.parseInt(num);
				cnt++;
				lbNumber.setText(Integer.toString(cnt));
			}
		};
		
		btCount.addActionListener(listener);
		
		GridLayout gl = new GridLayout(1, 2);
		panel.setLayout(gl);
		panel.add(lbNumber);
		panel.add(btCount);
		
		frame.add(panel);
		
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
