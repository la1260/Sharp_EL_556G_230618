package hu.hl.sharp_el_556g_241106;

import java.awt.Color;
import java.awt.event.KeyListener;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Form {
	private JLabel[] label= {new JLabel(), new JLabel(), new JLabel(), new JLabel(), new JLabel(), new JLabel()};
	private JTextArea textarea= new JTextArea();
	private JScrollPane scrollpane= new JScrollPane();
	public Form(KeyListener keylistener) {
		JFrame frame= new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 200, 300, 400);
		frame.setVisible(true);
		frame.setLayout(null);
		label[0].setBounds(16, 16, 40, 24);
		label[0].setVisible(true);
		label[0].setLayout(null);
		label[0].setBorder(BorderFactory.createLineBorder(Color.black));
		frame.add(label[0]);
		label[1].setBounds(64, 16, 152, 24);
		label[1].setVisible(true);
		label[1].setLayout(null);
		label[1].setBorder(BorderFactory.createLineBorder(Color.black));
		frame.add(label[1]);
		label[2].setBounds(224, 16, 40, 24);
		label[2].setVisible(true);
		label[2].setLayout(null);
		label[2].setBorder(BorderFactory.createLineBorder(Color.black));
		frame.add(label[2]);
		label[3].setBounds(16, 48, 200, 24);
		label[3].setVisible(true);
		label[3].setLayout(null);
		label[3].setBorder(BorderFactory.createLineBorder(Color.black));
		frame.add(label[3]);
		label[4].setBounds(16, 80, 200, 24);
		label[4].setVisible(true);
		label[4].setLayout(null);
		label[4].setBorder(BorderFactory.createLineBorder(Color.black));
		frame.add(label[4]);
		label[5].setBounds(16, 112, 200, 24);
		label[5].setVisible(true);
		label[5].setLayout(null);
		label[5].setBorder(BorderFactory.createLineBorder(Color.black));
		frame.add(label[5]);
		frame.addKeyListener(keylistener);
	}
	public void update(String[] displays) {
		label[0].setText(displays[0]);
		label[1].setText(displays[1]);
		label[3].setText(displays[2]);
		label[4].setText(displays[3]);
		label[5].setText(displays[4]);
		textarea.setText(displays[5]);
	}
}
