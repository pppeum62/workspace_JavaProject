import java.awt.*;
import javax.swing.*;

public class Calculator extends JFrame {
	Calculator(){
		setTitle("계산기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		contentPane.add(new JButton("MC"));
		contentPane.add(new JButton("MR"));
		contentPane.add(new JButton("MS"));
		contentPane.add(new JButton("M+"));
		contentPane.add(new JButton("M-"));
		contentPane.add(new JButton("  "));
		contentPane.add(new JButton("Inv"));
		contentPane.add(new JButton("In"));
		contentPane.add(new JButton("("));
		contentPane.add(new JButton(")"));
		contentPane.add(new JButton("←"));
		contentPane.add(new JButton("CE"));
		contentPane.add(new JButton("C"));
		contentPane.add(new JButton("±"));
		contentPane.add(new JButton("√"));
		contentPane.add(new JButton("Int"));
		contentPane.add(new JButton("sinh"));
		contentPane.add(new JButton("sin"));
		contentPane.add(new JButton("x²"));
		contentPane.add(new JButton("n!"));
		contentPane.add(new JButton("7"));
		contentPane.add(new JButton("8"));
		contentPane.add(new JButton("9"));
		contentPane.add(new JButton("/"));
		contentPane.add(new JButton("%"));
		contentPane.add(new JButton("dms"));
		contentPane.add(new JButton("cosh"));
		contentPane.add(new JButton("cos"));
		contentPane.add(new JButton("x^y"));
		contentPane.add(new JButton("y√x"));
		contentPane.add(new JButton("4"));
		contentPane.add(new JButton("5"));
		contentPane.add(new JButton("6"));
		contentPane.add(new JButton("*"));
		contentPane.add(new JButton("1/x"));
		contentPane.add(new JButton("π"));
		contentPane.add(new JButton("tanh"));
		contentPane.add(new JButton("tan"));
		contentPane.add(new JButton("x³"));
		contentPane.add(new JButton("³√x"));
		contentPane.add(new JButton("1"));
		contentPane.add(new JButton("2"));
		contentPane.add(new JButton("3"));
		contentPane.add(new JButton("-"));
		contentPane.add(new JButton("="));
		contentPane.add(new JButton("F-E"));
		contentPane.add(new JButton("Exp"));
		contentPane.add(new JButton("Mod"));
		contentPane.add(new JButton("log"));
		contentPane.add(new JButton("10^x"));
		contentPane.add(new JButton("0"));
		contentPane.add(new JButton("."));
		contentPane.add(new JButton("+"));
		
		setSize(400, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Calculator();
	}
}
