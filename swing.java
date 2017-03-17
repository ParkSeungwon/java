import javax.swing.*;

public class swing implements Runnable {
	@Override public void run() {
		JFrame frame = new JFrame("HelloWorldSwing");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		JLabel label = new JLabel("Hello World우리는 사나이");
		frame.add(label);
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		swing s = new swing();
		SwingUtilities.invokeLater(s);
	}
}
