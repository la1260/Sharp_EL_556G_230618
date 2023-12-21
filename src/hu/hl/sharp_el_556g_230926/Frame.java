package hu.hl.sharp_el_556g_230926;

import java.awt.Color;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Frame extends JFrame {
	private static final long serialVersionUID = 1L;
	private JLabel label0;
	private JLabel label1;
	private JLabel label2;
	public Frame(KeyListener keylistener) {
		setBounds(100, 200, 300, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setVisible(true);
		addKeyListener(keylistener);
		
		add(label0= new JLabel());
		label0.setBounds(16, 16, 32, 16);
		label0.setOpaque(true);
		label0.setBackground(Color.CYAN);
		label0.setVisible(true);

		add(label1= new JLabel());
		label1.setBounds(56, 16, 96, 16);
		label1.setOpaque(true);
		label1.setBackground(Color.YELLOW);
		label1.setVisible(true);

		add(label2= new JLabel());
		label2.setBounds(160, 16, 24, 16);
		label2.setOpaque(true);
		label2.setBackground(Color.GREEN);
		label2.setVisible(true);		
	}
	public void update(String[] s) {
		label0.setText(s[0]);
		label1.setText(s[1]);
		label2.setText(s[2]);
	}

}
