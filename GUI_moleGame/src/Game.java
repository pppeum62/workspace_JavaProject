import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Game {
	
	protected static int score = 0;
	protected static int monster;
	protected static int cnt = 0;
	
	static ImageIcon one = new ImageIcon("src/images/one.png");
	static ImageIcon smallOne = new ImageIcon(one.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
	static JButton imageButton = new JButton(smallOne);
	static JButton btn[] = new JButton[16];
	static JPanel panel = new JPanel();
	static JPanel first = new JPanel();
	
	public static void setMonster() {
		Random rand = new Random();
		monster = rand.nextInt(15);
		System.out.println(monster);
		
		for(int i = 0; i < 16; i++) {
			if(i == monster) {
				panel.add(imageButton);
				continue;
			}	
			btn[i] = new JButton((i+1)+"번 버튼");
			panel.add(btn[i]);
		}
	}
	
	public static void setMonster2() {
		Random rand = new Random();
		monster = rand.nextInt(15);
		System.out.println(monster);
		
		for(int i = 0; i < 16; i++) {
			if(i == monster) {
				first.add(imageButton);
				continue;
			}	
			btn[i] = new JButton((i+1)+"번 버튼");
			first.add(btn[i]);
		}
	}
	
	public static void main(String[] args) {
		Random rand = new Random();
		JFrame frame = new JFrame("디그다를 잡아라!");
		frame.setPreferredSize(new Dimension(500, 500));
		
		GridLayout gl = new GridLayout(4, 4);
		
		panel.setLayout(gl);
		first.setLayout(gl);
		
		monster = rand.nextInt(15);
		
		if(cnt == 0) {
			for(int i = 0; i < 16; i++) {
				if(i == monster) {
					first.add(imageButton);
					continue;
				}	
				btn[i] = new JButton((i+1)+"번 버튼");
				first.add(btn[i]);
			}
			frame.add(first);
		}
		
		ActionListener al = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == imageButton) {
					score += 500;
					
					if(cnt%2 == 0) {
						frame.remove(first);
						frame.add(panel);
						setMonster();
						panel.updateUI();
						cnt++;
					}
					
					else {
						frame.remove(panel);
						frame.add(first);
						setMonster2();
						first.updateUI();
						cnt++;
					}
					
				}
			}
		};
		
		imageButton.addActionListener(al);
		
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
