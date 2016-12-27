package 院长查询端;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.JScrollPane;

public class Pharmacy extends JFrame {

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
					Pharmacy frame = new Pharmacy();
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
	public Pharmacy() {
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
		
		JLabel lblNewLabel = new JLabel("\u836F\u54C1\uFF1A");
		lblNewLabel.setBounds(200, 35, 50, 25);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(250, 35, 150, 25);
		contentPane.add(textField);
		textField.setColumns(10);
		
		String[] columnNames={"药品ID","药名","库存","单价"}; //列名 
		Object[][] rowData=new Object[20][4]; //表格数据
		table = new JTable(rowData,columnNames);
		table.setFont(new Font("宋体", Font.PLAIN, 20));
		
		JButton btnNewButton = new JButton("\u641C\u7D22");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int cn=table.getRowCount(); //清空表内数据					
				for(int i=0;i<cn;i++){
						rowData[i][0]=null;
						rowData[i][1]=null;
						rowData[i][2]=null;
						rowData[i][3]=null;
						table.updateUI();
				}

				String Med=textField.getText();
				String sql="select * from Medicine where MedName='"+Med+"'";
				try {
					ResultSet rs = MDZZ.SqlSel(sql);			
					int count=0;
					while (rs.next()){ //遍历查询结果
							rowData[count][0]=rs.getString("MedID"); //初始化数组内容 
							rowData[count][1]=rs.getString("MedName");
							rowData[count][2]=rs.getString("MedNum");
							rowData[count][3]=rs.getString("price");
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
		
		
		JButton button_1 = new JButton("\u5168\u90E8");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String sql="select * from Medicine";
				try {
					ResultSet rs = MDZZ.SqlSel(sql);			
					int count=0;
					while (rs.next()){ //遍历查询结果
							rowData[count][0]=rs.getString("MedID"); //初始化数组内容 
							rowData[count][1]=rs.getString("MedName");
							rowData[count][2]=rs.getString("MedNum");
							rowData[count][3]=rs.getString("price");
							count++;
							table.updateUI();
						}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		button_1.setBounds(475, 35, 60, 25);
		contentPane.add(button_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(45, 80, 600, 300);
		contentPane.add(scrollPane);
		
	    table.setEnabled(false);
		table.setRowHeight(30);
		scrollPane.setViewportView(table);

	}
}	

