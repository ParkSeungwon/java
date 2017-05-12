//2016110056 박승원
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Bank extends JFrame {
	JLabel jl1, jl2, jl3;
	JTextField jt1, jt2;
	JButton jb;
	JPanel jp;

	class MyListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			float f = Integer.parseInt(jt1.getText()) 
				* 0.01f * Float.parseFloat(jt2.getText());
			jl3.setText("이자는 년 " + Float.toString(f) + "입니다.");
		}
	}	

	Bank() {
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("이자 계산기");

		jp = new JPanel();
		jb = new JButton("변환");
		jl1 = new JLabel("원금을 입력하시오");
		jl2 = new JLabel("이율을 입력하시오");
		jl3 = new JLabel("");
		jt1 = new JTextField();
		jt2 = new JTextField();

		jb.addActionListener(new MyListener());

		add(jp);
		jp.setLayout(null);
		jp.add(jl1);
		jp.add(jl2);
		jp.add(jl3);
		jp.add(jb);
		jp.add(jt1);
		jp.add(jt2);
		jl1.setBounds(0, 0, 200, 50);
		jl2.setBounds(0, 50, 200, 50);
		jl3.setBounds(10, 150, 200, 50);
		jt1.setBounds(200, 0, 100, 50);
		jt2.setBounds(200, 50, 100, 50);
		jb.setBounds(10, 100, 100, 50);
		setVisible(true);
	}
}	

public class problem2 {
	public static void main(String[] args) {
		Bank b = new Bank();
	}
}

