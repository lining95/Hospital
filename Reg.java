import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.ButtonGroup;
import javax.swing.DropMode;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;





public class Reg {
    
     
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

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
		frame.setBounds(100, 100, 572, 493);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("xxxx\u533B\u9662");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 40));
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBackground(Color.ORANGE);
		lblNewLabel.setBounds(172, 10, 187, 47);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u75C5\u4EBA\u9884\u7EA6\u62A5\u8868");
		lblNewLabel_1.setFont(new Font("宋体", Font.PLAIN, 18));
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
		
		JComboBox comboBox = new JComboBox();
		comboBox.setToolTipText("");
		comboBox.setBounds(119, 149, 54, 21);
	    comboBox.addItem("男");
		comboBox.addItem("女");
		frame.getContentPane().add(comboBox);
			
		JButton b1 = new JButton("\u63D0\u4EA4");
		//单击按钮执行方法
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				//输入值
				    String S1 =textField.getText().trim();
				    int  S3 =Integer.parseInt(textField_1.getText().trim());
				    String S2 =(String)comboBox.getSelectedItem();
				    String S4 =textField_2.getText().trim();
				    String S5 =textField_3.getText().trim();
				    String S6 =textField_4.getText().trim();
				    
				   //插入病人表
					String sql1="insert into Patient values('"+S1+"','"+S2+"',"+S3+",'"+S4+"',6)";
					Connection con = sqlOperate.Connection();
					sqlOperate.SqlSel(sql1); 
				//获取病人ID
			String sql2 ="select * from Patient where PatName='"+S1+"'";
			ResultSet rs1 = sqlOperate.SqlSel(sql2);
			int userID=-1;
			try {
				while (rs1.next()){
					userID=rs1.getInt("PatID");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//通过科室获取医生ID
			int doctID=-1;
			String sql3="select DoctorID from Doctor where DoctorDeptID=(select DeptID from Department where DeptName='"+S5+"')";
			ResultSet rs2 = sqlOperate.SqlSel(sql3);
			try {
				while (rs2.next()){
					doctID=rs2.getInt("DoctorID");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String sql4="insert into Registration values (PatientID,DoctorID,'"+S6+"','预约')";
			sqlOperate.SqlSel(sql4);
			JOptionPane.showMessageDialog(null,"预约成功！","提示对话框",JOptionPane.INFORMATION_MESSAGE);
			
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
			
			
			
			
			
			
		});
		b1.setBounds(119, 360, 93, 23);
		frame.getContentPane().add(b1);
		
	
		
		JLabel lblNewLabel_3 = new JLabel("\u9884\u7EA6\u65F6\u95F4");
		lblNewLabel_3.setBounds(28, 310, 54, 15);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(119, 307, 85, 21);
		frame.getContentPane().add(textField_4);
		
		JLabel label_4 = new JLabel("\uFF08\u8BF7\u8F93\u5165\u6570\u5B57\uFF09");
		label_4.setBounds(233, 192, 109, 15);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("(\u4E0D\u80FD\u4E3A\u7A7A)");
		label_5.setBounds(233, 116, 69, 15);
		frame.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("\uFF08\u8BF7\u8F93\u516511\u4F4D\u624B\u673A\u53F7\uFF09");
		label_6.setBounds(233, 230, 126, 15);
		frame.getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("\uFF08\u8BF7\u8F93\u5165\u5B8C\u6574\u79D1\u5BA4\u540D\u5B57\uFF09");
		label_7.setBounds(233, 270, 138, 15);
		frame.getContentPane().add(label_7);
		
		JLabel label_8 = new JLabel("\uFF08\u4F8B\uFF1A2000/10/10 )");
		label_8.setBounds(233, 310, 180, 15);
		frame.getContentPane().add(label_8);
		
		JLabel label_9 = new JLabel("\u7D27\u6025\u60C5\u51B5\u8BF7\u62E8\u6253\uFF1A");
		label_9.setForeground(Color.RED);
		label_9.setBounds(28, 406, 109, 15);
		frame.getContentPane().add(label_9);
		
		JLabel lbll = new JLabel("120");
		lbll.setForeground(Color.RED);
		lbll.setBounds(150, 406, 54, 15);
		frame.getContentPane().add(lbll);
		
		JLabel lblNewLabel_4 = new JLabel("\u82E5\u6709\u7591\u95EE\uFF0C\u8BF7\u5230\u54A8\u8BE2\u5904\u54A8\u8BE2\uFF0C\u8054\u7CFB\u7535\u8BDD\uFF1A10086");
		lblNewLabel_4.setForeground(Color.CYAN);
		lblNewLabel_4.setBounds(28, 428, 343, 15);
		frame.getContentPane().add(lblNewLabel_4);
		
		
	   
	}
}
