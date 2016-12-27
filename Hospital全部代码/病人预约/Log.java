package 病人预约;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.HeadlessException;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Log {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Log window = new Log();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Log() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 487, 279);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("xxxx\u533B\u9662");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.BLUE);
		label.setFont(new Font("宋体", Font.PLAIN, 40));
		label.setBackground(Color.ORANGE);
		label.setBounds(41, 22, 187, 59);
		frame.getContentPane().add(label);
		
		JLabel lblNewLabel = new JLabel("\u767B\u9646\u754C\u9762");
		lblNewLabel.setForeground(Color.CYAN);
		lblNewLabel.setBounds(261, 54, 78, 15);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u8D26\u6237\uFF1A");
		lblNewLabel_1.setFont(new Font("宋体", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(92, 91, 59, 23);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel label_1 = new JLabel("\u5BC6\u7801\uFF1A");
		label_1.setFont(new Font("宋体", Font.PLAIN, 15));
		label_1.setBounds(92, 124, 59, 23);
		frame.getContentPane().add(label_1);
		
		textField = new JTextField();
		textField.setBounds(161, 91, 108, 21);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton button = new JButton("\u53D6\u6D88");
		button.addActionListener(new ActionListener() {
			//取消按钮
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				passwordField.setText(null);
			}
		});
		button.setBounds(92, 173, 93, 23);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("\u767B\u5F55");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//登陆按钮
				int usersid = Integer.parseInt(textField.getText());
				String pwd = passwordField.getText();
				String sql1 = "select * from Users where userID= "+usersid+" and roleID=6";
			
			try{
					Connection con  = SQLOperate.Connection();
					/*PreparedStatement state = con.prepareStatement(sql1);
					state.setInt(1, usersid);
					ResultSet rs = state.executeQuery();
					**/
					ResultSet rs = SQLOperate.SqlSel(sql1);
						if(rs.next()){
							if(pwd.equals(rs.getString("pwd"))){
								
								
							JOptionPane.showMessageDialog(null, "登录成功","提示对话框",JOptionPane.INFORMATION_MESSAGE);
							
							frame.dispose();
						    new Reg();
							
							
						}else{
							JOptionPane.showMessageDialog(null, "密码错误！","提示对话框",JOptionPane.INFORMATION_MESSAGE);
						}

						}else{JOptionPane.showMessageDialog(null, "用户名不存在","提示对话框",JOptionPane.INFORMATION_MESSAGE);
						}
					} catch (HeadlessException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					textField.setText(null);
					passwordField.setText(null);
				
			}
			});
		button_1.setBounds(197, 173, 93, 23);
		frame.getContentPane().add(button_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(161, 125, 108, 21);
		frame.getContentPane().add(passwordField);
	}
}
