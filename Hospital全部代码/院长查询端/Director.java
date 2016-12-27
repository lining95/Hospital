package ‘∫≥§≤È—Ø∂À;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Director extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Director frame = new Director();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Director() {
		setTitle("\u9662\u957F\u67E5\u8BE2\u7AEF");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton Dep = new JButton("\u67E5\u8BE2\u79D1\u5BA4\u6302\u53F7\u8BE6\u60C5");
		Dep.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Department dep = new Department();
				dep.setVisible(true);
				dispose();
			}
		});
		Dep.setBounds(225, 70, 150, 40);
		contentPane.add(Dep);
		
		JButton Pha = new JButton("\u67E5\u8BE2\u836F\u623F\u5E93\u5B58");
		Pha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pharmacy Pha=new Pharmacy();
				Pha.setVisible(true);
				dispose();
			}
		});
		Pha.setBounds(225, 120, 150, 40);
		contentPane.add(Pha);
		
		JButton Doc = new JButton("\u67E5\u8BE2\u533B\u751F\u5C31\u8BCA\u8BE6\u60C5");
		Doc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Doctor Doc=new Doctor();
				Doc.setVisible(true);
				dispose();
			}
		});
		Doc.setBounds(225, 170, 150, 40);
		contentPane.add(Doc);
		
		JButton Exit = new JButton("\u9000\u51FA");
		Exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		Exit.setBounds(225, 220, 150, 40);
		contentPane.add(Exit);
	}
}
