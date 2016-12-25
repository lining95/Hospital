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
	private JTextField textField_1;
	private JTable table_2;
	protected DefaultTableModel tmhavesold;
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
		setBounds(100, 100, 677, 430);
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
		button.setBounds(387, 38, 94, 23);
		contentPane.add(button);
		
		JLabel label_1 = new JLabel("\u5F00\u5904\u65B9\u836F\uFF1A");
		label_1.setBounds(34, 30, 81, 15);
		contentPane.add(label_1);
		
		JLabel lblid_1 = new JLabel("\u8F93\u5165\u67E5\u8BE2\u836F\u54C1\u540D\uFF1A");
		lblid_1.setBounds(49, 73, 120, 15);
		contentPane.add(lblid_1);
		
		textField = new JTextField();
		textField.setBounds(179, 73, 90, 21);
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
		button_1.setBounds(304, 73, 74, 23);
		contentPane.add(button_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(64, 122, 287, 62);
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
		
		JLabel label_3 = new JLabel("\u8F93\u5165\u836F\u54C1\u6570\u91CF\uFF1A");
		label_3.setBounds(49, 208, 94, 15);
		contentPane.add(label_3);
		
		textField_1 = new JTextField();
		textField_1.setBounds(166, 205, 66, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton button_2 = new JButton("\u751F\u6210\u836F\u54C1\u5355");
		button_2.setBounds(64, 236, 111, 23);
		contentPane.add(button_2);
		
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
		button_3.setBounds(370, 318, 111, 23);
		contentPane.add(button_3);
		
		JPanel panel = new JPanel();
		panel.setBounds(74, 269, 239, 62);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 239, 62);
		panel.add(scrollPane);
		
		table_2 = new JTable();
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{null, null},
			},
			new String[] {
				"RegID", "price"
			}
		));
		scrollPane.setViewportView(table_2);
	}

	public JTable getTable() {
		return table_1;
	}

	public void setTable(JTable table) {
	}
}
