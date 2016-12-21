package director;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

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
		setBounds(100, 100, 600, 340);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("\u67E5\u8BE2\u79D1\u5BA4\u6302\u53F7\u8BE6\u60C5");
		btnNewButton.setBounds(225, 50, 150, 40);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("\u67E5\u8BE2\u836F\u623F\u5E93\u5B58");
		button.setBounds(225, 100, 150, 40);
		contentPane.add(button);
		
		JButton btnNewButton_1 = new JButton("\u67E5\u8BE2\u533B\u751F\u5C31\u8BCA\u8BE6\u60C5");
		btnNewButton_1.setBounds(225, 150, 150, 40);
		contentPane.add(btnNewButton_1);
	}
}
