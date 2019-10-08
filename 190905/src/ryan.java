import java.awt.*;
import javax.swing.*;

public class ryan extends JFrame {
	private MyPanel panel = new MyPanel();
	public ryan() {
		setTitle("라이언");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(600, 600);
		setVisible(true);
	}

	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			g.setColor(Color.BLACK);
			g.fillOval(110, 60, 120, 120);
			g.fillOval(330, 60, 120, 120);
			g.setColor(new Color(213, 151, 41));
			g.fillOval(120, 70, 100, 100);
			g.fillOval(340, 70, 100, 100);
			
			g.setColor(Color.BLACK);
			g.fillOval(70, 70, 420, 400);
			g.setColor(new Color(213, 151, 41));
			g.fillOval(80,80,400,380);
			//라이언 얼굴
			
			g.setColor(Color.BLACK);
			g.fillRoundRect(150, 200, 90, 15, 15, 15);
			g.fillRoundRect(330, 200, 90, 15, 15, 15);
			//라이언 눈썹
			
			g.fillOval(180, 240, 28, 28);
			g.fillOval(355, 240, 28, 28);
			//라이언 눈
			
			g.fillOval(223, 290, 75, 70);
			g.fillOval(267, 290, 75, 70);
			g.setColor(Color.WHITE);
			g.fillOval(233, 300, 55, 50);
			g.fillOval(277, 300, 55, 50);
			g.setColor(Color.BLACK);
			g.fillOval(267, 280, 33, 33);
			//라이언 입
		}
	}
	
	public static void main(String[] args) {
		new ryan();
	}
}
