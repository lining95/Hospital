package director;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Doctor extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Doctor frame = new Doctor();
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
	public Doctor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 520);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u533B\u751F\uFF1A");
		lblNewLabel.setBounds(200, 35, 50, 25);
		contentPane.add(lblNewLabel);
		
		String[] columnNames={"医生","就诊数","金额"}; //列名 
		Object[][] rowData=new Object[20][3]; //表格数据
		table = new JTable(rowData,columnNames);
		table.setFont(new Font("宋体", Font.PLAIN, 20));
		
		JButton btnNewButton = new JButton("\u641C\u7D22");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int cn=table.getRowCount(); //清空表内数据					
				for(int i=0;i<cn;i++){
						rowData[i][0]=null;
						rowData[i][1]=null;
						rowData[i][2]=null;
						//rowData[i][3]=null;
						table.updateUI();
				}
				String Dor=textField.getText();
				String sql="select Doctor.DoctorName, COUNT(charge.RegID) as dn,SUM(charge.sumprice) as money from Doctor,charge where charge.RegID=( select RegID from Registration where DoctorID=(select DoctorID from Doctor where Doctor.DoctorName=Doctor.DoctorName)) and Doctor.DoctorName='"+Dor+"' group by Doctor.DoctorName";
				try {
					ResultSet rs = MDZZ.SqlSel(sql);			
					int count=0;
					while (rs.next()){ //遍历查询结果
							rowData[count][0]=rs.getString("DoctorName"); //初始化数组内容 
							rowData[count][1]=rs.getString("dn");
							rowData[count][2]=rs.getString("money");
							count++;
							table.updateUI();
						}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnNewButton.setBounds(410, 35, 60, 25);
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(250, 35, 150, 25);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("\u5168\u90E8");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Dor=textField.getText();
				String sql="select Doctor.DoctorName, COUNT(charge.RegID) as dn,SUM(charge.sumprice) as money from Doctor,charge where charge.RegID=( select RegID from Registration where DoctorID=(select DoctorID from Doctor where Doctor.DoctorName=Doctor.DoctorName))group by Doctor.DoctorName";
				try {
					ResultSet rs = MDZZ.SqlSel(sql);			
					int count=0;
					while (rs.next()){ //遍历查询结果
							rowData[count][0]=rs.getString("DoctorName"); //初始化数组内容 
							rowData[count][1]=rs.getString("dn");
							rowData[count][2]=rs.getString("money");
							count++;
							table.updateUI();
						}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			
			}
			
		});
		btnNewButton_1.setBounds(475, 35, 60, 25);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("<<Back");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Director Dir=new Director();
				Dir.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setBounds(550, 430, 100, 30);
		contentPane.add(btnNewButton_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(45, 80, 600, 300);
		contentPane.add(scrollPane);
		
	    table.setEnabled(false);
		table.setRowHeight(30);
		scrollPane.setViewportView(table);
		
	}
}
