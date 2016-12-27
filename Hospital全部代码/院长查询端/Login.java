package 院长查询端;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField ID;
	private JButton Login;
	private JButton Back;
	private JPasswordField pwd;

	/**
	 * Launch the application.
	 */
	private void clearText() {//清空文本框, 密码框的输入
        ID.setText("");
        pwd.setText("");
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 340);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel label = new JLabel("\u8D26\u53F7\uFF1A");
		label.setBounds(200, 50, 50, 25);
		panel.add(label);
		
		ID = new JTextField();
		ID.setBounds(250, 50, 150, 25);
		panel.add(ID);
		ID.setColumns(10);
		
		JLabel Label1 = new JLabel("\u5BC6\u7801\uFF1A");
		Label1.setBounds(200, 110, 50, 25);
		panel.add(Label1);
		
		pwd = new JPasswordField();
		pwd.setBounds(250, 110, 150, 25);
		panel.add(pwd);
		
		Login = new JButton("\u767B\u5F55");
		Login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cmd = e.getActionCommand();
				if(cmd.equals("登录")){
					String Account=ID.getText();
					String pass= pwd.getText();
					int UserID = Integer.parseInt(Account);
					
	 				String sql = "select * from Users where userID=? and roleID=5";
	 				try {
	 				Connection con = MDZZ.Connection();
	 					PreparedStatement state = con.prepareStatement(sql);
	 					state.setInt(1, UserID);
	 					ResultSet rs = state.executeQuery();
	 					if (rs.next()) {
	 						if (pass.equals(rs.getString("pwd"))) {
	 							
	 							JOptionPane.showMessageDialog(null, "登录成功");
	 							Director dir = new Director();
	 							dir.setVisible(true);
	 							dispose();
	 						} else {
	 							JOptionPane.showMessageDialog(null, "密码输入错误!");
	 							clearText();
	 						}
	 				} else {
	 					JOptionPane.showMessageDialog(null, "用户名不存在");clearText();
	 					}
	 				} catch (SQLException e2) {
	 					// TODO Auto-generated catch block
	 					e2.printStackTrace();
	 				}
				}
			}
		});
		
		
		Login.setToolTipText("");
		Login.setBounds(250, 160, 60, 25);
		panel.add(Login);
		
		Back = new JButton("\u8FD4\u56DE");
		Back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		Back.setBounds(320, 160, 60, 25);
		panel.add(Back);
		
		
	}
}
