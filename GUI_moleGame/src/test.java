import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class test {
	public static void main(String[] args) {
		JFrame frame = new JFrame("창");
		frame.setPreferredSize(new Dimension(400, 400));
		
		GridLayout gl = new GridLayout(5, 1);
		GridLayout infoGl = new GridLayout(1, 3);
		GridLayout lifeGl = new GridLayout(1, 5);
		GridLayout gameGl = new GridLayout(1, 3);
		
		JPanel panel = new JPanel();
		JPanel info = new JPanel();
		JPanel life = new JPanel();
		JPanel game1 = new JPanel();
		JPanel game2 = new JPanel();
		JPanel game3 = new JPanel();
		
		JButton btn[] = new JButton[5];
		JButton gbtn[] = new JButton[9]; 
		
		panel.setLayout(gl);
		info.setLayout(infoGl);
		life.setLayout(lifeGl);
		game1.setLayout(gameGl);
		game2.setLayout(gameGl);
		game3.setLayout(gameGl);
		
		JLabel title = new JLabel("디그다를 잡아라!");
		
		panel.add(title);
		panel.add(info);
		info.add(life);
		
		
		for(int i = 0; i < 3; i++) {
			btn[i] = new JButton((i+1)+"번 버튼");
			life.add(btn[i]);
		}
		
		for(int i = 1; i < 3; i++) {
			for(int j = 0; j < 2; i++) {
				btn[i] = new JButton((i+1)+"번 버튼");
				life.add(btn[i]);
			}
		}
		
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
	}
}
