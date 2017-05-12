//2016110056 박승원
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Calc extends JFrame {
	private JTextField jt;
	private JPanel p;
	final int W = 60, H = 40;
	class MyListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton bt = (JButton)e.getSource();
			jt.setText(bt.getText());
			p.setBackground(Color.YELLOW);
		}
	}

//	class KeyEvent implements KeyListener {
//		public void KeyTyped(KeyEvent e) {
//		}
//	}
	
	public Calc() {
		setSize(W * 4, H * 5);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("2016110056 박승원");

		p = new JPanel();
		p.setLayout(null);
		add(p);

		jt = new JTextField();
		p.add(jt);
		jt.setBounds(0, 0, W*4, H);

		String s = "789+456-123*.0/=";
		JButton[] bts = new JButton[s.length()];//this just acquired memory space
		for(int i=0; i<s.length(); i++) //so I need to use constructor again!!!
			bts[i] = new JButton(Character.toString(s.charAt(i)));
		for(int j = 0, y = 0; y < 4 * H; y += H) {
			for(int x = 0; x < 4 * W; x += W) {
				p.add(bts[j]);
				bts[j].addActionListener(new MyListener());
				bts[j++].setBounds(x, H + y, W, H);
			}
		}
		setVisible(true);
	}
}

public class problem3
{
	static public void main(String[] args) {
		Calc c = new Calc();
	}
}
