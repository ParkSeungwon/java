//2016110056 박승원
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

class Dice extends JPanel implements ActionListener {
	JButton bt = new JButton("던지기");
	int eye1, eye2;
	public void paintComponent(Graphics g) {
		g.clearRect(0,0,400,300);
		g.drawRect(50, 100, 100, 100);
		g.drawRect(200, 100, 100, 100);
		System.out.println(eye1);
		System.out.println(eye2);
		for(int i=0; i<eye1; i++) g.fillArc(80+20*(i%2),120+20*(i/2),10,10,0,360);
		for(int i=0; i<eye2; i++) g.fillArc(240+20*(i%2),120+20*(i/2),10,10,0,360);
	}
	public void actionPerformed(ActionEvent e) {
		Random rd = new Random();
		int k = rd.nextInt();
		eye1 = (k>0?k:-k) % 6 + 1;
		k = rd.nextInt();
		eye2 = (k>0?k:-k) % 6 + 1;
		repaint();
	}
	public Dice() {
		add(bt);
		bt.addActionListener(this);
	}
}

class Prg extends JFrame {
	public Prg() {
		setSize(400, 300);
		setTitle("Dice");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new Dice());
		setVisible(true);
	}
}
public class problem2 {
	public static void main(String[] args) {
		Prg p = new Prg();
	}
}

