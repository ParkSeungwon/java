import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
class Point {
	int x, y;
}


class MyPanel extends JPanel {
	private int index = 0;
	Point p = new Point();


	String[] style = {"Helvetica", "TimesRoman", "Courier", "Dialog", "default"};
	Font[] font;
	int idx = 0;

	class MouseHandle extends MouseAdapter implements MouseMotionListener {
		@Override public void mouseDragged(MouseEvent e) {
			p.x = e.getX();
			p.y = e.getY();
			repaint();
		}
		@Override public void mouseMoved(MouseEvent arg0) {}
		public void mouseClicked(MouseEvent e) {
			idx++;
			if(idx == 5) idx = 0;
			System.out.println("clicked");
		}
		public void mouseEntered(MouseEvent e) {
			System.out.println("entered");
		}
	}
	MouseHandle mh;

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.magenta);
	//	if(p != null) g.fill3DRect(p.x, p.y, 50, 50, true);
		g.setFont(font[idx]);
		g.drawString("Hello", p.x, p.y);
	}

	public MyPanel() {
		mh = new MouseHandle();
		font = new Font[5];
		for(int i=0; i<5; i++) font[i] = new Font(style[i], Font.PLAIN, 30);
		addMouseMotionListener(mh);
		addMouseListener(mh);
	}
}

public class Paint extends JFrame {
	public Paint() {
		setSize(300, 300);
		setTitle("그림 그리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new MyPanel());
		setVisible(true);
	}
	public static void main(String[] args) {
		Paint s = new Paint();
	}
}

