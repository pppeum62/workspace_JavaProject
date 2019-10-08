import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class moleGame {
	
	public static void main(String[] args) {
		
		String [] img = {"src/images/one.png", "src/images/three.png"};
		String [] heartImg = {"src/images/like.png", "src/images/empty"};
		
		JFrame frame = new JFrame("창 이름");
		JPanel panel = new JPanel();
		frame.setPreferredSize(new Dimension(300, 400));
		
		JLabel title = new JLabel("디그다를 잡아라!");
		JPanel info = new JPanel();
		JPanel play = new JPanel();
		JPanel heart = new JPanel();
		
		JLabel score = new JLabel("score : ");
		
		GridLayout mainGl = new GridLayout(3, 1);
		GridLayout infoGl = new GridLayout(1, 3);
		GridLayout playGl = new GridLayout(3, 3);
		GridLayout heartGl = new GridLayout(5, 1);
		
		panel.setLayout(mainGl);
		info.setLayout(infoGl);
		play.setLayout(playGl);
		heart.setLayout(heartGl);
		
		ImageIcon heartImage = new ImageIcon("src/images/like.png");
		JLabel imageLabel = new JLabel(heartImage);
		
		ImageIcon moleImage = new ImageIcon("src/images/one.png");
		JLabel moleLabel = new JLabel(moleImage);
		
		info.add(new JButton());
		info.add(new JPanel());
		info.add(score);
		
		play.add(moleLabel);
		
		panel.add(title);
		panel.add(info);
		panel.add(play);
		
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}