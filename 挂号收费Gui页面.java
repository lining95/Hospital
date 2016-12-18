package com.lining;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTable;

public class Gui {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	private JTable table;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui window = new Gui();
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
	public Gui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		JFrame jFrame = new JFrame("挂号收费");
		jFrame.setBounds(550, 350, 800, 500);
		jFrame.setResizable(false);
		jFrame.setVisible(true);

		JPanel jPanelLogin = new JPanel();
		JPanel jPanelReg = new JPanel();
		JPanel jPanelCharge = new JPanel();


		JTabbedPane jTabbedPane = new JTabbedPane(SwingConstants.TOP);//选项卡上添加组件
		jTabbedPane.add("登录", jPanelLogin);
		jPanelLogin.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u7528\u6237ID\uFF1A");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 20));
		lblNewLabel.setBounds(232, 82, 97, 31);
		jPanelLogin.add(lblNewLabel);
		
		JLabel label = new JLabel("\u5BC6\u3000\u7801\uFF1A");
		label.setFont(new Font("宋体", Font.PLAIN, 20));
		label.setBounds(232, 128, 97, 31);
		jPanelLogin.add(label);
		
		textField = new JTextField();
		textField.setBounds(355, 82, 156, 31);
		jPanelLogin.add(textField);
		textField.setColumns(1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(355, 130, 156, 31);
		jPanelLogin.add(passwordField);
		
		JButton btnNewButton = new JButton("\u767B\u5F55");
		btnNewButton.setBounds(253, 190, 97, 31);
		jPanelLogin.add(btnNewButton);
		
		JButton button = new JButton("\u53D6\u6D88");
		button.setBounds(396, 190, 97, 31);
		jPanelLogin.add(button);
		JPanel jPanelApt = new JPanel();
		jTabbedPane.add("查看预约信息", jPanelApt);
		jPanelApt.setLayout(null);
		
		table = new JTable();
		table.setBounds(32, 76, 715, 209);
		jPanelApt.add(table);
		
		JLabel lblNewLabel_1 = new JLabel("\u9884\u7EA6\u53F7\uFF1A");
		lblNewLabel_1.setFont(new Font("宋体", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(52, 31, 86, 33);
		jPanelApt.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(148, 27, 200, 33);
		jPanelApt.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("\u67E5\u770B");
		btnNewButton_1.setBounds(386, 32, 74, 23);
		jPanelApt.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\u67E5\u770B\u5168\u90E8");
		btnNewButton_2.setBounds(492, 31, 93, 25);
		jPanelApt.add(btnNewButton_2);
		jTabbedPane.setEnabledAt(1, false);
		jTabbedPane.add("挂号", jPanelReg);
		jPanelReg.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("\u59D3\u3000\u3000\u540D\uFF1A");
		lblNewLabel_2.setFont(new Font("宋体", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(198, 36, 110, 30);
		jPanelReg.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\u6027\u3000\u3000\u522B\uFF1A");
		lblNewLabel_3.setFont(new Font("宋体", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(198, 76, 110, 30);
		jPanelReg.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("\u5E74\u3000\u3000\u9F84\uFF1A");
		lblNewLabel_4.setFont(new Font("宋体", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(198, 116, 110, 30);
		jPanelReg.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("\u8054\u7CFB\u65B9\u5F0F\uFF1A");
		lblNewLabel_5.setFont(new Font("宋体", Font.PLAIN, 20));
		lblNewLabel_5.setBounds(198, 156, 110, 30);
		jPanelReg.add(lblNewLabel_5);
		
		JLabel label_1 = new JLabel("\u79D1\u3000\u3000\u5BA4\uFF1A");
		label_1.setFont(new Font("宋体", Font.PLAIN, 20));
		label_1.setBounds(198, 196, 110, 30);
		jPanelReg.add(label_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(308, 36, 215, 30);
		jPanelReg.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(308, 76, 215, 30);
		jPanelReg.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(308, 116, 215, 30);
		jPanelReg.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(308, 156, 215, 30);
		jPanelReg.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(308, 196, 215, 30);
		jPanelReg.add(textField_6);
		
		JButton btnNewButton_3 = new JButton("\u6302\u53F7");
		btnNewButton_3.setFont(new Font("宋体", Font.PLAIN, 20));
		btnNewButton_3.setBounds(226, 264, 93, 30);
		jPanelReg.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("\u53D6\u6D88");
		btnNewButton_4.setFont(new Font("宋体", Font.PLAIN, 20));
		btnNewButton_4.setBounds(376, 264, 93, 30);
		jPanelReg.add(btnNewButton_4);
		jTabbedPane.add("收费", jPanelCharge);
		jPanelCharge.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("\u8BF7\u8F93\u5165\u6536\u8D39\u5355\u53F7\uFF1A");
		lblNewLabel_6.setFont(new Font("宋体", Font.PLAIN, 20));
		lblNewLabel_6.setBounds(73, 34, 160, 30);
		jPanelCharge.add(lblNewLabel_6);
		
		textField_7 = new JTextField();
		textField_7.setBounds(229, 34, 191, 28);
		jPanelCharge.add(textField_7);
		textField_7.setColumns(10);
		
		JButton btnNewButton_5 = new JButton("\u67E5\u770B");
		btnNewButton_5.setBounds(450, 40, 76, 23);
		jPanelCharge.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("\u67E5\u770B\u5168\u90E8");
		btnNewButton_6.setBounds(565, 34, 93, 29);
		jPanelCharge.add(btnNewButton_6);
		
		table_1 = new JTable();
		table_1.setBounds(36, 98, 712, 223);
		jPanelCharge.add(table_1);
		jTabbedPane.setEnabledAt(0, true);
		jTabbedPane.setEnabledAt(2, false);
		jTabbedPane.setEnabledAt(3, false);
		jFrame.getContentPane().add(jTabbedPane);
		JOptionPane.showMessageDialog(null, "欢迎使用，请登录");
		jTabbedPane.setSelectedIndex(0);//显示第一个
	}
}
