//2016110056 박승원
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class FileOpen extends JFrame {
	JLabel jl;
	JButton jb1, jb2;
	JFileChooser jf;
	JPanel jp;

	class MyListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == jb1) jf.showOpenDialog(FileOpen.this);
			else if(e.getSource() == jb2) jl.setText(jf.getSelectedFile().getName());
		}
	}	

	FileOpen() {
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("파일 선택기 테스트");

		jp = new JPanel();
		jb1 = new JButton("파일 오픈");
		jb2 = new JButton("선택된 파일");
		jl = new JLabel("파일 선택기 컴포넌트 테스트입니다.");
		jf = new JFileChooser();

		jb1.addActionListener(new MyListener());
		jb2.addActionListener(new MyListener());

		add(jp);
		jp.setLayout(null);
		jp.add(jl);
		jp.add(jb1);
		jp.add(jb2);
		jl.setBounds(10, 0, 200, 50);
		jb1.setBounds(10, 50, 100, 50);
		jb2.setBounds(100, 50, 100, 50);
		setVisible(true);
	}
}	

public class problem1 {
	public static void main(String[] args) {
		FileOpen fo = new FileOpen();
	}
}

