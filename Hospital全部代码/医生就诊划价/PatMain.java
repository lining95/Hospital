package 医生就诊划价;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;

public class PatMain extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table_1;
	private JTable table_2;
	protected DefaultTableModel tmhavesold;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	//static int regid1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PatMain frame = new PatMain();
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
	public PatMain() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 677, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Connection con = null;
		try{
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		try {
			con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433; DatabaseName=Hospital","sa","sa");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
           Statement st=null;
		//if(con!=null)System.out.println("连接成功！");
           try {
			 st=con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		JButton button = new JButton("\u8FD4\u56DE\u767B\u5F55");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				this.setVisible(false);
				new Doc().setVisible(true);
			}

			private void setVisible(boolean b) {
				// TODO Auto-generated method stub
				
			}
		});
		button.setBounds(412, 6, 94, 23);
		contentPane.add(button);
		
		JLabel label_1 = new JLabel("\u5F00\u5904\u65B9\u836F\uFF1A");
		label_1.setBounds(28, 10, 81, 15);
		contentPane.add(label_1);
		
		JLabel lblid_1 = new JLabel("\u8F93\u5165\u67E5\u8BE2\u836F\u54C1\u540D\uFF1A");
		lblid_1.setBounds(49, 42, 120, 15);
		contentPane.add(lblid_1);
		
		textField = new JTextField();
		textField.setBounds(163, 39, 90, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton button_1 = new JButton("\u67E5\u8BE2");
		button_1.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent e) {
				
				try {
					Vector<String> columnName = new Vector<String>();//字段名
					Vector<Vector<Object>> dataVector = new    
					                        Vector<Vector<Object>>(); //存储所有数据，里面每个小的Vector是存单行的	
					columnName.add("MedID");
					columnName.add("MedName");
					columnName.add("MedNum");
					columnName.add("price");
					

					Connection conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433; DatabaseName=Hospital","sa","sa");
					Statement st = conn.createStatement();
					
					ResultSet rs = st.executeQuery("select * from Medicine where MedName='"+textField.getText()+"'");//zheli 
					while(rs.next()){
					Vector<Object> vec = new Vector<Object>();//就是这个存单行的，最后放到上面的大的Vector里面
					for(int i=1;i<=4;i++){
					vec.add(rs.getObject(i));
					}
					dataVector.add(vec);
					}
					tmhavesold = new DefaultTableModel();//建立默认的JTable模型
					tmhavesold.setDataVector(dataVector, columnName);//设定模型数据和字段
					//Database.free(conn, st, rs);
					} catch (SQLException e1) {
					e1.printStackTrace();
					}
				    table_1.setModel(tmhavesold);
				   
			}
		});
		button_1.setBounds(288, 38, 74, 23);
		contentPane.add(button_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(56, 84, 287, 62);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(0, 0, 287, 62);
		panel_1.add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"MedID", "MedName", "MedNum", "price"
			}
		));
		scrollPane_1.setViewportView(table_1);
		
		JButton btncharge = new JButton("\u67E5\u8BE2charge\u8868");
		btncharge.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Vector<String> columnName = new Vector<String>();//字段名
					Vector<Vector<Object>> dataVector = new    
					                        Vector<Vector<Object>>(); //存储所有数据，里面每个小的Vector是存单行的	
					columnName.add("RegID");
					columnName.add("sumprice");
					columnName.add("chargeState");
					
					Connection conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433; DatabaseName=Hospital","sa","sa");
					Statement st = conn.createStatement();
					
					//int nn=Integer.parseInt(DocMain.NN);
					//int mm=Integer.parseInt(Doc.MM);
					//ResultSet regid=st.executeQuery("select * from Registration where PatientID="+nn+" and DoctorID="+mm+"");
					//regid1=regid.getInt("RegID");
					
					
					ResultSet rs = st.executeQuery("select * from charge");
					while(rs.next()){
					Vector<Object> vec = new Vector<Object>();//就是这个存单行的，最后放到上面的大的Vector里面
					for(int i=1;i<=3;i++){
					vec.add(rs.getObject(i));
					}
					dataVector.add(vec);
					}
					tmhavesold = new DefaultTableModel();//建立默认的JTable模型
					tmhavesold.setDataVector(dataVector, columnName);//设定模型数据和字段
					//Database.free(conn, st, rs);
					} catch (SQLException e1) {
					e1.printStackTrace();
					}
				    table_2.setModel(tmhavesold);
				
			}
		});
		btncharge.setBounds(49, 165, 128, 23);
		contentPane.add(btncharge);
		
		JButton button_3 = new JButton("\u8FD4\u56DE\u4E0A\u4E00\u7EA7");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				this.setVisible(false);
				new DocMain().setVisible(true);
			}

			private void setVisible(boolean b) {
				// TODO Auto-generated method stub
				
			}
		});
		button_3.setBounds(412, 362, 111, 23);
		contentPane.add(button_3);
		
		JPanel panel = new JPanel();
		panel.setBounds(67, 210, 261, 99);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 261, 99);
		panel.add(scrollPane);
		
		table_2 = new JTable();
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"RegID", "sumprice", "chargeState"
			}
		));
		scrollPane.setViewportView(table_2);
		
		JLabel lblNewLabel = new JLabel("sumprice\uFF1A");
		lblNewLabel.setBounds(28, 351, 77, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("chargeState\uFF1A");
		lblNewLabel_1.setBounds(28, 386, 94, 15);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u4E34\u65F6");
		lblNewLabel_2.setBounds(115, 386, 54, 15);
		contentPane.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(99, 348, 66, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btncharge_1 = new JButton("\u751F\u6210\u4E34\u65F6charge\u8868");
		btncharge_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Connection con=null;
				try {
					Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				//建立数据库连接
				try {
					con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433; DatabaseName=Hospital","sa","sa");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			    Statement st=null;
	         	try {
	         		 st=con.createStatement();
	         	} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	         	float sumprice=Float.parseFloat(textField_1.getText());
	         	
	         	
				
	         	
	         	String sql="insert into Charge values("+textField_6.getText()+","+sumprice+", '"+lblNewLabel_2.getText()+"')";
				try {
					st.executeUpdate(sql);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();//增删改一般用executeUpdate方法
				}
				
				try {
					st.close();
					con.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	         	
			}

			private String DocMain(String text) {
				// TODO Auto-generated method stub
				return null;
			}
		});
		btncharge_1.setBounds(193, 382, 135, 23);
		contentPane.add(btncharge_1);
		
		JLabel lblNewLabel_3 = new JLabel("MedID\uFF1A");
		lblNewLabel_3.setBounds(407, 155, 54, 15);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("MedNum\uFF1A");
		lblNewLabel_4.setBounds(407, 192, 65, 15);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("price\uFF1A");
		lblNewLabel_5.setBounds(407, 231, 54, 15);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("chargeID\uFF1A");
		lblNewLabel_6.setBounds(407, 268, 65, 15);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("\u6DFB\u52A0\u836F\u54C1\u8BA2\u5355\uFF1A");
		lblNewLabel_7.setBounds(384, 307, 111, 15);
		contentPane.add(lblNewLabel_7);
		
		JButton btnNewButton = new JButton("\u6DFB\u52A0");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Connection con=null;
				try {
					Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				//建立数据库连接
				try {
					con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433; DatabaseName=Hospital","sa","sa");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			    Statement st=null;
	         	try {
	         		 st=con.createStatement();
	         	} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	         	
	         	//int bb=Integer.parseInt(textField_2.getText());
	         	//int cc=Integer.parseInt(textField_3.getText());
	         	//float dd=Float.parseFloat(textField_4.getText());
	         	//int ee=Integer.parseInt(textField_5.getText());
	         	String sql="insert into MedItem values("+textField_2.getText()+","+textField_3.getText()+","+textField_4.getText()+","+textField_5.getText()+")";
				try {
					st.executeUpdate(sql);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();//增删改一般用executeUpdate方法
				}
				
				try {
					st.close();
					con.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	         	
				
				
			}
		});
		btnNewButton.setBounds(482, 303, 93, 23);
		contentPane.add(btnNewButton);
		
		textField_2 = new JTextField();
		textField_2.setBounds(482, 152, 66, 21);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(482, 189, 66, 21);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(482, 228, 66, 21);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(482, 265, 66, 21);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("  RegID:");
		lblNewLabel_8.setBounds(28, 326, 54, 15);
		contentPane.add(lblNewLabel_8);
		
		textField_6 = new JTextField();
		textField_6.setBounds(99, 320, 66, 21);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
	}

	public JTable getTable() {
		return table_1;
	}

	public void setTable(JTable table) {
	}
}
