package 院长查询端;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JDesktopPane;
import javax.swing.JTable;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JTabbedPane;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;

public class Department extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Department frame = new Department();
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
	public Department() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 520);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton("<<Back");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Director Dir=new Director();
				Dir.setVisible(true);
				dispose();
			}
		});
		button.setBounds(550, 430, 100, 30);
		contentPane.add(button);
		
		String[] columnNames={"科室","挂号量","总金额"}; //列名 
		Object[][] rowData=new Object[20][3]; //表格数据
		table = new JTable(rowData,columnNames);
		table.setFont(new Font("宋体", Font.PLAIN, 20));
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(250, 35, 100, 25);
		contentPane.add(comboBox); 
		try {
			String sql="select DeptName from Department";
			ResultSet rs=MDZZ.SqlSel(sql);
			while(rs.next()){comboBox.addItem(rs.getString("DeptName"));}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		JLabel label = new JLabel("\u79D1\u5BA4\uFF1A");
		label.setBounds(200, 35, 50, 25);
		contentPane.add(label);
		
		JButton button_1 = new JButton("\u641C\u7D22");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int cn=table.getRowCount(); //清空表内数据					
				for(int i=0;i<cn;i++){
						rowData[i][0]=null;
						rowData[i][1]=null;
						rowData[i][2]=null;
						table.updateUI();
				}
				String Dep=comboBox.getSelectedItem().toString();
				String sql="select Department.DeptName ,count(Registration.RegID) as rn,sum(charge.sumprice) as dp from Department,Registration,charge where Registration.RegID=charge.RegID and DeptName='"+Dep+"' group by Department.DeptName";
				try {
					ResultSet rs = MDZZ.SqlSel(sql);			
					int count=0;
					while (rs.next()){ //遍历查询结果
							rowData[count][0]=rs.getString("DeptName"); //初始化数组内容 
							rowData[count][1]=rs.getString("rn");
							rowData[count][2]=rs.getString("dp");
							count++;
							table.updateUI();
						}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		button_1.setBounds(360, 35, 60, 25);
		contentPane.add(button_1);
		
		JButton btnNewButton = new JButton("\u5168\u90E8");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String sql="select Department.DeptName ,count(Registration.RegID) as rn,sum(charge.sumprice) as dp from Department,Registration,charge where Registration.RegID=charge.RegID group by Department.DeptName";
				try {
					ResultSet rs = MDZZ.SqlSel(sql);			
					int count=0;
					while (rs.next()){ //遍历查询结果
							rowData[count][0]=rs.getString("DeptName"); //初始化数组内容 
							rowData[count][1]=rs.getString("rn");
							rowData[count][2]=rs.getString("dp");
							count++;
							table.updateUI();
						}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnNewButton.setBounds(425, 35, 60, 25);
		contentPane.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(45, 80, 600, 300);
		contentPane.add(scrollPane);
		
		table.setEnabled(false);
		table.setRowHeight(30);
		scrollPane.setViewportView(table);
	}
}
