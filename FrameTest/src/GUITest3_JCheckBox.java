import java.awt.*;
import javax.swing.*;

public class GUITest3_JCheckBox {
	public static void main(String[] args) {
		JFrame frame = new JFrame("창 이름");
		frame.setLocation(500, 300);
		frame.setPreferredSize(new Dimension(300, 200));
		
		JPanel panel = new JPanel();
		JCheckBox cbChicken = new JCheckBox("치킨");
		JCheckBox cbPizza = new JCheckBox("피자");
		
		panel.add(cbChicken);
		panel.add(cbPizza);
		frame.add(panel);
		
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
