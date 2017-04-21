import javax.swing.*;
import java.awt.*;

class MyFrame extends JFrame {
	public MyFrame() {
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		//setLayout(new FlowLayout());
		JPanel p = new JPanel(new GridLayout());
		this.add(p);
		JLabel f = new JLabel("farenheit");
		JTextField ft = new JTextField(15);
		JLabel c = new JLabel("celsius");
		JTextField ct = new JTextField(15);
		JButton button = new JButton("convert");
		p.add(f);
		p.add(ft);
		p.add(c);
		p.add(ct);
		p.add(button);
		pack();
		setVisible(true);
	}
}

public class MyFrameTest {
	public static void main(String[] args) {
		MyFrame f = new MyFrame();
	}
}
