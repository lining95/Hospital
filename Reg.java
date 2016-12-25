import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.DropMode;
import javax.swing.JRadioButton;





public class Reg {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Reg window = new Reg();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
    
	
	public Reg() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 572, 482);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("xxxx\u533B\u9662");
		lblNewLabel.setFont(new Font("ËÎÌו", Font.PLAIN, 40));
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBackground(Color.ORANGE);
		lblNewLabel.setBounds(172, 10, 187, 47);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u75C5\u4EBA\u9884\u7EA6\u62A5\u8868");
		lblNewLabel_1.setFont(new Font("ËÎÌו", Font.PLAIN, 18));
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setBounds(28, 68, 130, 26);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u6027\u522B");
		lblNewLabel_2.setBounds(28, 150, 54, 19);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel label = new JLabel("\u59D3\u540D");
		label.setBounds(28, 110, 54, 26);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("\u5E74\u9F84");
		label_1.setBounds(28, 190, 54, 19);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("\u8054\u7CFB\u65B9\u5F0F");
		label_2.setBounds(28, 230, 54, 15);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("\u9884\u7EA6\u79D1\u5BA4");
		label_3.setBounds(28, 270, 54, 15);
		frame.getContentPane().add(label_3);
		
		textField = new JTextField();
		textField.setBounds(119, 113, 85, 21);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(119, 189, 85, 21);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(119, 227, 85, 21);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(119, 267, 85, 21);
		frame.getContentPane().add(textField_3);
		
		JButton btnNewButton = new JButton("\u63D0\u4EA4");
		btnNewButton.setBounds(119, 339, 93, 23);
		frame.getContentPane().add(btnNewButton);
		
		JTextPane textPane = new JTextPane();
		textPane.setBackground(Color.CYAN);
		textPane.setForeground(Color.CYAN);
		textPane.setContentType("image/png");
		textPane.setBounds(279, 110, 203, 175);
		frame.getContentPane().add(textPane);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("\u7537");
		rdbtnNewRadioButton.setBounds(121, 148, 37, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("\u5973");
		rdbtnNewRadioButton_1.setBounds(167, 148, 37, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
	}
}
