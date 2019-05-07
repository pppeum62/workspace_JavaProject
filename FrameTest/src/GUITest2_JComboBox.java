import java.awt.*;
import javax.swing.*;

public class GUITest2_JComboBox {
	public static void main(String[] args) {
		JFrame frame = new JFrame("창 이름");
		frame.setLocation(500, 300);
		frame.setPreferredSize(new Dimension(300, 200));
		
		
		JPanel panel = new JPanel();
		JLabel label = new JLabel("태어난 달 : ");
		
		String[] picnis = {"봄꽃구경", "여름수영"};
		JComboBox<String> cb = new JComboBox<>(picnis);
		
		cb.addItem("가을캠프");
		cb.addItem("겨울스키");
		
		//String[] month = {"1","2","3","4","5","6","7","8","9","10","11","12"};
		
		JComboBox<String> cb2 = new JComboBox<>();
		for(int i = 1; i <= 12; i++) {
			cb2.addItem(i+"");
		}
		
		panel.add(label);
		panel.add(cb2);
		panel.add(cb);
		frame.add(panel);
		
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
