//2016110056 박승원
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.*;
import java.awt.Color;

class MyFrame extends JFrame {
	int startx = 30, starty = 30, size = 150;
	boolean happy = false;

	class MyComponent extends JPanel implements ActionListener {
		JButton bt ;
		public void actionPerformed(ActionEvent e) {
			if(!happy) bt.setText("I am happy now");
			else bt.setText("Make me Smile");
			happy = !happy;
			repaint();
		}
		public void paintComponent(Graphics g) {
			if(happy) {
				g.setColor(Color.BLUE);
				g.fillRect(0,0,300,300);
				g.setColor(Color.YELLOW);
				g.fillArc(startx, starty, startx + size, starty + size, 0, 360);
				g.setColor(Color.BLACK);
				g.drawArc(startx + 50, starty+30, 25, 25, 0, 180);
				g.drawArc(startx + 110, starty+30, 25, 25, 0, 180);
				g.drawArc(startx + 60, starty + 100, 60, 60, 180, 180);
			} else {
				g.setColor(Color.MAGENTA);
				g.fillRect(0,0,300,300);
				g.setColor(Color.YELLOW);
				g.fillArc(startx, starty, startx + size, starty + size, 0, 360);
				g.setColor(Color.BLACK);
				g.drawLine(startx + 50, starty+30, startx + 90, starty+30);
				g.drawLine(startx + 110, starty+30, startx + 150, starty+30);
				for(int x=startx+60, y=starty+120, i=0, j=1; i<8; i++, j*=-1)
					g.drawLine(x, y,  x += 10, y -= 10 * j);
			}
		}
		public MyComponent() {
			bt = new JButton("Make me Smile");
			add(bt);
			bt.setVisible(true);
			bt.addActionListener(this);
			setVisible(true);
		}
	}

	public MyFrame() {
		setSize(300, 300);
		setTitle("snow man face");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new MyComponent());
		setVisible(true);
	}
}

public class problem1 {
	public static void main(String[] args) {
		MyFrame mp = new MyFrame();
	}
}

