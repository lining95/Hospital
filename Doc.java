import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.*;
import java.awt.event.ActionEvent;
import javax.swing.JProgressBar;
import javax.swing.JPasswordField;

public class Doc<SQLExecption> extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
    public static String MM;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Doc frame = new Doc();
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
	public Doc() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u533B\u751F\u8D26\u53F7\uFF1A");
		lblNewLabel.setBounds(53, 36, 65, 18);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(117, 35, 93, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
		JLabel lblNewLabel_1 = new JLabel("   \u5BC6\u7801\uFF1A");
		lblNewLabel_1.setBounds(53, 78, 65, 21);
		contentPane.add(lblNewLabel_1);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(117, 78, 93, 21);
		contentPane.add(passwordField_1);
		
		JButton btnNewButton = new JButton("\u767B\u5F55");
		btnNewButton.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent e) {
				Connection con = null;
				try{
					Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				}catch(ClassNotFoundException e1){
					e1.printStackTrace();
				}
				try {
					con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433; DatabaseName=Hospital","sa","sa");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		           Statement st=null;
				//if(con!=null)System.out.println("连接成功！");
		           try {
					 st=con.createStatement();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		           String text1=textField.getText(); 
		           MM=textField.getText();
		           int i1 =0;
		   	       i1 =Integer.valueOf(text1);
		           String sql="select * from Users where UserID="+i1+"";
		           ResultSet rs=null;	
					try {
						rs=st.executeQuery(sql);
						
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					   
					int i=0;
					String password=null;
					char[] text3=passwordField_1.getPassword();
					String t3=new String(text3);
					
					try {
						while(rs.next())
						{i=rs.getInt("roleID");
						password=rs.getString("pwd");}
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}			
					if(i==3)
					{if(t3.equals(password))				
			          {
						dispose();
						
						this.setVisible(false);
						new DocMain().setVisible(true);
						
			         	}		
				    else 
				    	{	dispose();main(null);}
					}
				    else 
				    	{  dispose(); main(null);}

			}

			private void setVisible(boolean b) {
				// TODO Auto-generated method stub
				
			}
		});
		btnNewButton.setBounds(96, 109, 65, 28);
		contentPane.add(btnNewButton);
		
		
		}
}



