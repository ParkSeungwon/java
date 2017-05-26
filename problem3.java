//2016110056 박승원
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

class FontPanel extends JPanel implements ActionListener {
	String[] type= {"TimesRoman", "Helvetica", "Courier", "Dialog", "DialogInput",
		"ZapfDingbats"};
	int[] style = {Font.PLAIN, Font.ITALIC, Font.BOLD, Font.BOLD + Font.ITALIC};
	Random rd = new Random();
	Font[] f;

	public void actionPerformed(ActionEvent e) {
		repaint();
	}
	public FontPanel() {
		JButton bt = new JButton("change");
		bt.addActionListener(this);
		add(bt);
		setVisible(true);
	}

	public void paintComponent(Graphics g) {
		g.clearRect(0,0,400,300);
		for(int i=0; i<5; i++) {
			g.setFont(new Font(type[getInt()%6], style[getInt()%4], 30));
			g.drawString("Hello World!()", 30, (i+1) * 40 + 30);
		}
	}
	private int getInt() {
		int k = rd.nextInt();
		k = k > 0 ? k : -k;
		return k;
	}
}

class Prg3 extends JFrame {
	public Prg3() {
		setSize(400, 300);
		setTitle("Font");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new FontPanel());
		setVisible(true);
	}
}
public class problem3
{
	static public void main(String[] args) {
		
		Prg3 c = new Prg3();
	}
}
