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
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.table.DefaultTableModel;
import javax.xml.crypto.Data;



public class DocMain extends JFrame {


	
	private JPanel contentPane;
	private JTextField textField;
	private JTable table;
	protected DefaultTableModel tmhavesold;
	protected Object Database;
	private JTable table_1;
    public static String NN;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DocMain frame = new DocMain();
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
	public DocMain() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 603, 474);
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
        
		JButton btnNewButton_1 = new JButton("\u67E5\u770B\u75C5\u4EBA\u9884\u7EA6\u4FE1\u606F");
		btnNewButton_1.setBounds(118, 27, 156, 23);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					Vector<String> columnName = new Vector<String>();//字段名
					Vector<Vector<Object>> dataVector = new    
					                        Vector<Vector<Object>>(); //存储所有数据，里面每个小的Vector是存单行的	
					columnName.add("RegID");
					columnName.add("PatientID");
					columnName.add("DoctorID");
					columnName.add("RegTime");
					columnName.add("RegState");

					Connection conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433; DatabaseName=Hospital","sa","sa");
					Statement st = conn.createStatement();
					
					int mm = Integer.parseInt(Doc.MM);
					
					ResultSet rs = st.executeQuery("select * from Registration where DoctorID='"+mm+"'");
					while(rs.next()){
					Vector<Object> vec = new Vector<Object>();//就是这个存单行的，最后放到上面的大的Vector里面
					for(int i=1;i<=5;i++){
					vec.add(rs.getObject(i));
					}
					dataVector.add(vec);
					}
					tmhavesold = new DefaultTableModel();//建立默认的JTable模型
					tmhavesold.setDataVector(dataVector, columnName);//设定模型数据和字段
					//Database.free(conn, st, rs);
					} catch (SQLException e) {
					e.printStackTrace();
					}
					table.setModel(tmhavesold);

		           
			}

		
		});
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u9009\u62E9\u67E5\u8BE2\u75C5\u4EBAID\uFF1A");
		lblNewLabel_2.setBounds(35, 263, 121, 15);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(147, 260, 66, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton button = new JButton("\u67E5\u8BE2");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Vector<String> columnName = new Vector<String>();//字段名
					Vector<Vector<Object>> dataVector = new    
					                        Vector<Vector<Object>>(); //存储所有数据，里面每个小的Vector是存单行的	
					columnName.add("PatID");
					columnName.add("PatName");
					columnName.add("PatGender");
					columnName.add("PatAge");
					columnName.add("PatPhone");

					Connection conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433; DatabaseName=Hospital","sa","sa");
					Statement st = conn.createStatement();
					NN=textField.getText();
					ResultSet rs = st.executeQuery("select * from Patient where PatID='"+textField.getText()+"'");//zheli 
					while(rs.next()){
					Vector<Object> vec = new Vector<Object>();//就是这个存单行的，最后放到上面的大的Vector里面
					for(int i=1;i<=5;i++){
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
		button.setBounds(246, 259, 79, 23);
		contentPane.add(button);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 72, 460, 170);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 460, 170);
		panel.add(scrollPane);
		scrollPane.setEnabled(false);
		
		table = new JTable();
		table.setToolTipText("");
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"RegID", "PatientID", "DoctorID", "RegTime", "RegState"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, Integer.class, Object.class, Object.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.setEnabled(false);
		scrollPane.setViewportView(table);
		
		JLabel label = new JLabel("\u75C5\u4EBA\u4FE1\u606F\uFF1A");
		label.setBounds(63, 304, 100, 15);
		contentPane.add(label);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 329, 460, 59);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(0, 0, 460, 69);
		panel_1.add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"PatID", "PatName", "PatGender", "PatAge", "PatPhone"
			}
		));
		scrollPane_1.setViewportView(table_1);
		
		JButton btnNewButton_2 = new JButton("\u5F00\u5904\u65B9\u836F");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 
			    dispose();
		        this.setVisible(false);
			    new PatMain().setVisible(true);
			   
                
			}

			private void setVisible(boolean b) {
				// TODO Auto-generated method stub
				
			}
		});
		btnNewButton_2.setBounds(246, 402, 108, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton = new JButton("\u8FD4\u56DE\u767B\u5F55");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				    dispose();
			        this.setVisible(false);
				    new Doc().setVisible(true);
			}

			private void setVisible(boolean b) {
				// TODO Auto-generated method stub
				
			}
		});
		btnNewButton.setBounds(429, 27, 93, 23);
		contentPane.add(btnNewButton);
	}
}
