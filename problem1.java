//2016110056 박승원
import java.util.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.Color;

class clock extends JPanel implements ActionListener{
	JButton start, end;
	JLabel count;
	int sec=0;
	time_pass t;

	class time_pass extends Thread {
		public void run() {
			while(true) {
				sec++;
				count.setText(Integer.toString(sec));
				repaint();
				try {
					Thread.sleep(1000);
				} catch(Exception e) {
					System.out.println(e.getMessage());
				}
			}
		}
	}

	public void paintComponent(Graphics g) {
		g.setColor(Color.RED);
		g.fillArc(100, 100, 100, 100, 90, -sec%60 * 6);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == start) {
			t = new time_pass();
			t.start();
		} else try {
			t.stop();
		} catch(Exception e2) {}
	}

	public clock() {
		start = new JButton("start");
		end = new JButton("end");
		count = new JLabel("0");
		start.addActionListener(this);
		end.addActionListener(this);
		add(start);
		add(end);
		add(count);
		setVisible(true);
	}
}


public class problem1 {
	public static void main(String[] args) {
		JFrame jf = new JFrame("2016001256 박승원");
		jf.add(new clock());
		jf.setSize(300, 300);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
	}
}

