package 滚动大屏;

import java.awt.EventQueue;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

import 门诊挂号收费.SQLOperate;

public class Screen {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Screen window = new Screen();
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
	public Screen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("滚动大屏");
		frame.setBounds(500, 300, 600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(268, 267, 188, 32);
		frame.getContentPane().add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		
		comboBox.setBounds(107, 267, 103, 32);
		frame.getContentPane().add(comboBox);
		String sltDept = "select DeptName from Department";
		ResultSet rs = SQLOperate.SqlSel(sltDept);
		try {
			while (rs.next()) {
				comboBox.addItem(rs.getString("DeptName"));
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				try {
					String dept=(String)comboBox.getSelectedItem();
					String sql="select COUNT(RegID) as regnum from Registration where RegState='挂号' and DoctorID=(select DoctorID from Doctor where DoctorDeptID=(select Department.DeptID from Department where DeptName='"+dept+"'))";
					ResultSet rs=SQLOperate.SqlSel(sql);
					while(rs.next()){
						String regNum=rs.getString("regnum");
						lblNewLabel.setText("排队人数为："+regNum);
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("F:\\JAVA\u533B\u9662\\lineUp.jpg"));
		lblNewLabel_1.setBounds(107, 24, 349, 215);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
