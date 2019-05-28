import java.awt.*;
import javax.swing.*;

public class Calculator extends JFrame {
	Calculator(){
		setTitle("계산기");
		setSize(700, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridLayout grid = new GridLayout(6, 10);
		grid.setVgap(5);
		grid.setHgap(5);
		Container cp = getContentPane();
		cp.setLayout(grid);
		
		JRadioButton btn1 = new JRadioButton("Degrees");
		JRadioButton btn2 = new JRadioButton("Radians");
		JRadioButton btn3 = new JRadioButton("Grads");
		JPanel radio = new JPanel();
		JPanel pn = new JPanel();
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(btn1);
		bg.add(btn2);
		bg.add(btn3);
		
		radio.add(btn1);
		radio.add(btn2);
		radio.add(btn3);
		pn.add(radio);
		
		cp.add(pn);
		cp.add(new JPanel());
		cp.add(new JPanel());
		cp.add(new JPanel());
		cp.add(new JPanel());
		cp.add(new JButton("MC"));
		cp.add(new JButton("MR"));
		cp.add(new JButton("MS"));
		cp.add(new JButton("M+"));
		cp.add(new JButton("M-"));
		cp.add(new JButton(""));
		cp.add(new JButton("Inv"));
		cp.add(new JButton("In"));
		cp.add(new JButton("("));
		cp.add(new JButton(")"));
		cp.add(new JButton("←"));
		cp.add(new JButton("CE"));
		cp.add(new JButton("C"));
		cp.add(new JButton("±"));
		cp.add(new JButton("√"));
		cp.add(new JButton("Int"));
		cp.add(new JButton("sinh"));
		cp.add(new JButton("sin"));
		cp.add(new JButton("x²"));
		cp.add(new JButton("n!"));
		cp.add(new JButton("7"));
		cp.add(new JButton("8"));
		cp.add(new JButton("9"));
		cp.add(new JButton("/"));
		cp.add(new JButton("%"));
		cp.add(new JButton("dms"));
		cp.add(new JButton("cosh"));
		cp.add(new JButton("cos"));
		cp.add(new JButton("x^y"));
		cp.add(new JButton("y√x"));
		cp.add(new JButton("4"));
		cp.add(new JButton("5"));
		cp.add(new JButton("6"));
		cp.add(new JButton("*"));
		cp.add(new JButton("1/x"));
		cp.add(new JButton("π"));
		cp.add(new JButton("tanh"));
		cp.add(new JButton("tan"));
		cp.add(new JButton("x³"));
		cp.add(new JButton("³√x"));
		cp.add(new JButton("1"));
		cp.add(new JButton("2"));
		cp.add(new JButton("3"));
		cp.add(new JButton("-"));
		cp.add(new JButton("="));
		cp.add(new JButton("F-E"));
		cp.add(new JButton("Exp"));
		cp.add(new JButton("Mod"));
		cp.add(new JButton("log"));
		cp.add(new JButton("10^x"));
		cp.add(new JButton("0"));
		cp.add(new JButton("."));
		cp.add(new JButton("+"));
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new Calculator();
	}
}
