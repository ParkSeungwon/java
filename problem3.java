//2016110056 박승원
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Calc extends JFrame {
	private JTextField jt;
	private JPanel p;
	final int W = 60, H = 40;
	int calc_string(String s) {
		int[] r = {0,0};
		int i = 0;
		char op = '+';
		for(int j = 0; j < s.length(); j++) {
			char c = s.charAt(j);
			switch(c) {
				case '+': case '-': case '*': case '/': i++; op = c; break;
				default: r[i] = r[i] * 10 + (c - '0'); break;
			}
		}
		switch(op) {
			case '+': return r[1] + r[0]; 
			case '-': return r[0] - r[1];
			case '*': return r[0] * r[1];
			case '/': return r[0] / r[1];
		}
		return -1;
	}
	class MyListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton bt = (JButton)e.getSource();
			if(bt.getText().equals("="))
				jt.setText(Integer.toString(calc_string(jt.getText())));
			else if(bt.getText().equals("C")) jt.setText("");
			else jt.setText(jt.getText() + bt.getText());
		}
	}

	public Calc() {
		setSize(W * 4, H * 5);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("2016110056 박승원");

		p = new JPanel();
		p.setLayout(null);
		add(p);

		jt = new JTextField();
		jt.setHorizontalAlignment(JTextField.RIGHT);
		p.add(jt);
		jt.setBounds(0, 0, W*4, H);

		String s = "789+456-123*C0/=";
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
