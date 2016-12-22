package admin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.JTableHeader;

public class main{
static JFrame frame = new JFrame("管理员客户端");

public static void main(String[] args) {

	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setLayout(null);
		
//窗体大小
frame.setSize(500,300);
frame.setLocation(500, 100);
//按钮1
JButton button1 =new JButton("1.管理医院科室信息");
//在窗体上添加按钮
frame.add(button1);
button1.setBounds(145,50,200,30);
//显示窗体
frame.setVisible(true);
//添加点击事件监听器（你可以使用任何其他监听，看你想在什么情况下创建新的窗口了）
button1.addActionListener(new ActionListener(){
//单击按钮执行的方法
public void actionPerformed(ActionEvent e) {
closeThis();
adminmenu1();
}
});


//按钮2
JButton button2 =new JButton("2.管理药品信息");
//在窗体上添加按钮
frame.add(button2);
button2.setBounds(145,80,200,30);
//显示窗体
frame.setVisible(true);
//添加点击事件监听器（你可以使用任何其他监听，看你想在什么情况下创建新的窗口了）
button2.addActionListener(new ActionListener(){
//单击按钮执行的方法
public void actionPerformed(ActionEvent e) {
closeThis();
adminmenu2();
}
});

//按钮3
JButton button3 =new JButton("3.管理收费信息");
//在窗体上添加按钮
frame.add(button3);
button3.setBounds(145,110,200,30);
//显示窗体
frame.setVisible(true);
//添加点击事件监听器（你可以使用任何其他监听，看你想在什么情况下创建新的窗口了）
button3.addActionListener(new ActionListener(){
//单击按钮执行的方法
public void actionPerformed(ActionEvent e) {
closeThis();
adminmenu3();
}
});

//按钮4
JButton button4 =new JButton("4.管理账号信息");
//在窗体上添加按钮
frame.add(button4);
button4.setBounds(145,140,200,30);
//显示窗体
frame.setVisible(true);
//添加点击事件监听器（你可以使用任何其他监听，看你想在什么情况下创建新的窗口了）
button4.addActionListener(new ActionListener(){
//单击按钮执行的方法
public void actionPerformed(ActionEvent e) {
closeThis();
adminmenu4();
}
});

}
    
 
	public static void adminmenu1(){
	//创建新的窗口
	JFrame frame = new JFrame("管理医院科室信息");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setLayout(null);
	//设置在屏幕的位置
	// 窗体大小
	frame.setSize(500,300);
	frame.setLocation(500, 100);
	// 显示窗体
	frame.setVisible(true);	


	//按钮1
	JButton button1 =new JButton("1.增加医院科室信息");
	//在窗体上添加按钮
	frame.add(button1);
	button1.setBounds(145,50,200,30);
	//显示窗体
	frame.setVisible(true);
	//添加点击事件监听器（你可以使用任何其他监听，看你想在什么情况下创建新的窗口了）
	button1.addActionListener(new  ActionListener(){
		//单击按钮执行的方法
		public void actionPerformed(ActionEvent e) {
	    closeThis();
	adminmenu11();
	}
	});
	
	//按钮2
	JButton button2 =new JButton("2.删除医院科室信息");
	//在窗体上添加按钮
	frame.add(button2);
	button2.setBounds(145,80,200,30);
	//显示窗体
	frame.setVisible(true);
	//添加点击事件监听器（你可以使用任何其他监听，看你想在什么情况下创建新的窗口了）
	button2.addActionListener(new ActionListener(){
	//单击按钮执行的方法
	public void actionPerformed(ActionEvent e) {
   closeThis();
	adminmenu12();
	}
	});
	
	
	
	//按钮3
	JButton button3 =new JButton("3.更改医院科室信息");
	//在窗体上添加按钮
	frame.add(button3);
	button3.setBounds(145,110,200,30);
	//显示窗体
	frame.setVisible(true);
	//添加点击事件监听器（你可以使用任何其他监听，看你想在什么情况下创建新的窗口了）
	button3.addActionListener(new ActionListener(){
	//单击按钮执行的方法
	public void actionPerformed(ActionEvent e) {
	closeThis();
	adminmenu13();
	}
	});

	
	
	//按钮5
	JButton button5 =new JButton("4.查看医院科室信息");
	//在窗体上添加按钮
	frame.add(button5);
	button5.setBounds(145,140,200,30);
	//显示窗体
	frame.setVisible(true);
	//添加点击事件监听器（你可以使用任何其他监听，看你想在什么情况下创建新的窗口了）
	button5.addActionListener(new ActionListener(){
	//单击按钮执行的方法
	public void actionPerformed(ActionEvent e) {
	closeThis();
	adminmenu14();
	}
	});
	
	
	
	
	
	//按钮4
	JButton button4 =new JButton("5.返回");
	//在窗体上添加按钮
	frame.add(button4);
	button4.setBounds(145,170,200,30);
	//显示窗体
	frame.setVisible(true);
	//添加点击事件监听器（你可以使用任何其他监听，看你想在什么情况下创建新的窗口了）
	button4.addActionListener(new ActionListener(){
	//单击按钮执行的方法
	public void actionPerformed(ActionEvent e) {
	closeThis();
	//创建新的窗口
   main(null);
	}
	});
	
	
	
	}

	public static void adminmenu2(){
		//创建新的窗口
		JFrame frame = new JFrame("管理药品信息");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		//设置在屏幕的位置
		// 窗体大小
		frame.setSize(500,300);
		frame.setLocation(500, 100);
		// 显示窗体
		frame.setVisible(true);	
		
		//按钮1
		JButton button1 =new JButton("1.增加药品信息");
		//在窗体上添加按钮
		frame.add(button1);
		button1.setBounds(145,50,200,30);
		//显示窗体
		frame.setVisible(true);
		//添加点击事件监听器（你可以使用任何其他监听，看你想在什么情况下创建新的窗口了）
		button1.addActionListener(new ActionListener(){
		//单击按钮执行的方法
		public void actionPerformed(ActionEvent e) {
		closeThis();
		 adminmenu21();
		}
		});
		
		//按钮2
		JButton button2 =new JButton("2.删除药品信息");
		//在窗体上添加按钮
		frame.add(button2);
		button2.setBounds(145,80,200,30);
		//显示窗体
		frame.setVisible(true);
		//添加点击事件监听器（你可以使用任何其他监听，看你想在什么情况下创建新的窗口了）
		button2.addActionListener(new ActionListener(){
		//单击按钮执行的方法
		public void actionPerformed(ActionEvent e) {
		closeThis();
		 adminmenu22();
		}
		});
		
		
		
		//按钮3
		JButton button3 =new JButton("3.更改药品信息");
		//在窗体上添加按钮
		frame.add(button3);
		button3.setBounds(145,110,200,30);
		//显示窗体
		frame.setVisible(true);
		//添加点击事件监听器（你可以使用任何其他监听，看你想在什么情况下创建新的窗口了）
		button3.addActionListener(new ActionListener(){
		//单击按钮执行的方法
		public void actionPerformed(ActionEvent e) {
		closeThis();
		 adminmenu23();
		}
		});
		
		//按钮5
		JButton button5 =new JButton("4.查看药品信息");
		//在窗体上添加按钮
		frame.add(button5);
		button5.setBounds(145,140,200,30);
		//显示窗体
		frame.setVisible(true);
		//添加点击事件监听器（你可以使用任何其他监听，看你想在什么情况下创建新的窗口了）
		button5.addActionListener(new ActionListener(){
		//单击按钮执行的方法
		public void actionPerformed(ActionEvent e) {
		closeThis();
		adminmenu24();
		}
		});
		
		
		//按钮4
		JButton button4 =new JButton("5.返回");
		//在窗体上添加按钮
		frame.add(button4);
		button4.setBounds(145,170,200,30);
		//显示窗体
		frame.setVisible(true);
		//添加点击事件监听器（你可以使用任何其他监听，看你想在什么情况下创建新的窗口了）
		button4.addActionListener(new ActionListener(){
		//单击按钮执行的方法
		public void actionPerformed(ActionEvent e) {
		closeThis();
		//创建新的窗口
	   main(null);
		}
		});
		
		
	}
	
	public static void adminmenu3(){
		//创建新的窗口
		JFrame frame = new JFrame("管理收费信息");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		//设置在屏幕的位置
		// 窗体大小
		frame.setSize(500,300);
		frame.setLocation(500, 100);
		// 显示窗体
		frame.setVisible(true);	
		
		//按钮1
		JButton button1 =new JButton("1.增加药品信息");
		//在窗体上添加按钮
		frame.add(button1);
		button1.setBounds(145,50,200,30);
		//显示窗体
		frame.setVisible(true);
		//添加点击事件监听器（你可以使用任何其他监听，看你想在什么情况下创建新的窗口了）
		button1.addActionListener(new ActionListener(){
		//单击按钮执行的方法
		public void actionPerformed(ActionEvent e) {
		closeThis();
		//创建新的窗口
		JFrame frame = new JFrame("新窗口");
		//设置在屏幕的位置
		frame.setLocation(100,50);
		//窗体大小
		frame.setSize(200,200);
		//显示窗体
		frame.setVisible(true);
		}
		});
		
		//按钮2
		JButton button2 =new JButton("2.删除药品信息");
		//在窗体上添加按钮
		frame.add(button2);
		button2.setBounds(145,80,200,30);
		//显示窗体
		frame.setVisible(true);
		//添加点击事件监听器（你可以使用任何其他监听，看你想在什么情况下创建新的窗口了）
		button2.addActionListener(new ActionListener(){
		//单击按钮执行的方法
		public void actionPerformed(ActionEvent e) {
		closeThis();
		//创建新的窗口
		JFrame frame = new JFrame("新窗口");
		//设置在屏幕的位置
		frame.setLocation(100,50);
		//窗体大小
		frame.setSize(200,200);
		//显示窗体
		frame.setVisible(true);
		}
		});
		
		
		
		//按钮3
		JButton button3 =new JButton("3.更改药品信息");
		//在窗体上添加按钮
		frame.add(button3);
		button3.setBounds(145,110,200,30);
		//显示窗体
		frame.setVisible(true);
		//添加点击事件监听器（你可以使用任何其他监听，看你想在什么情况下创建新的窗口了）
		button3.addActionListener(new ActionListener(){
		//单击按钮执行的方法
		public void actionPerformed(ActionEvent e) {
		closeThis();
		//创建新的窗口
		JFrame frame = new JFrame("新窗口");
		//设置在屏幕的位置
		frame.setLocation(100,50);
		//窗体大小
		frame.setSize(200,200);
		//显示窗体
		frame.setVisible(true);
		}
		});
		
		
		//按钮4
		JButton button4 =new JButton("4.返回");
		//在窗体上添加按钮
		frame.add(button4);
		button4.setBounds(145,140,200,30);
		//显示窗体
		frame.setVisible(true);
		//添加点击事件监听器（你可以使用任何其他监听，看你想在什么情况下创建新的窗口了）
		button4.addActionListener(new ActionListener(){
		//单击按钮执行的方法
		public void actionPerformed(ActionEvent e) {
		closeThis();
		//创建新的窗口
	   main(null);
		}
		});
		
		
		
	}

	public static void adminmenu4(){
		//创建新的窗口
		JFrame frame = new JFrame("管理账号信息");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		//设置在屏幕的位置
		// 窗体大小
		frame.setSize(500,300);
		frame.setLocation(500, 100);
		// 显示窗体
		frame.setVisible(true);	
		
		//按钮1
		JButton button1 =new JButton("1.新建账号");
		//在窗体上添加按钮
		frame.add(button1);
		button1.setBounds(145,50,200,30);
		//显示窗体
		frame.setVisible(true);
		//添加点击事件监听器（你可以使用任何其他监听，看你想在什么情况下创建新的窗口了）
		button1.addActionListener(new ActionListener(){
		//单击按钮执行的方法
		public void actionPerformed(ActionEvent e) {
		closeThis();
		adminmenu41();
		}
		});
		
		//按钮2
		JButton button2 =new JButton("2.删除账号");
		//在窗体上添加按钮
		frame.add(button2);
		button2.setBounds(145,80,200,30);
		//显示窗体
		frame.setVisible(true);
		//添加点击事件监听器（你可以使用任何其他监听，看你想在什么情况下创建新的窗口了）
		button2.addActionListener(new ActionListener(){
		//单击按钮执行的方法
		public void actionPerformed(ActionEvent e) {
		closeThis();
		adminmenu42();
		}
		});
		
		
		
		//按钮3
		JButton button3 =new JButton("3.更改账号");
		//在窗体上添加按钮
		frame.add(button3);
		button3.setBounds(145,110,200,30);
		//显示窗体
		frame.setVisible(true);
		//添加点击事件监听器（你可以使用任何其他监听，看你想在什么情况下创建新的窗口了）
		button3.addActionListener(new ActionListener(){
		//单击按钮执行的方法
		public void actionPerformed(ActionEvent e) {
		closeThis();
		adminmenu43();
		}
		});
		
		
		//按钮5
		JButton button5 =new JButton("4.查看账号信息");
		//在窗体上添加按钮
		frame.add(button5);
		button5.setBounds(145,140,200,30);
		//显示窗体
		frame.setVisible(true);
		//添加点击事件监听器（你可以使用任何其他监听，看你想在什么情况下创建新的窗口了）
		button5.addActionListener(new ActionListener(){
		//单击按钮执行的方法
		public void actionPerformed(ActionEvent e) {
		closeThis();
		adminmenu44();
		}
		});
		
		
		//按钮4
		JButton button4 =new JButton("5.返回");
		//在窗体上添加按钮
		frame.add(button4);
		button4.setBounds(145,170,200,30);
		//显示窗体
		frame.setVisible(true);
		//添加点击事件监听器（你可以使用任何其他监听，看你想在什么情况下创建新的窗口了）
		button4.addActionListener(new ActionListener(){
		//单击按钮执行的方法
		public void actionPerformed(ActionEvent e) {
		closeThis();
		//创建新的窗口
	   main(null);
		}
		});
		
		
		
		
	}

	
	public static void adminmenu11(){
		//创建新的窗口
		JFrame frame = new JFrame("增加医院科室信息");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setLayout(null);
		//设置在屏幕的位置
		// 窗体大小
		frame.setSize(500,300);
		frame.setLocation(500, 100);
		// 显示窗体
		frame.setVisible(true);	
		
		final JTextField  text1=new JTextField(15);
		final JTextField  text2=new JTextField(15);
		JLabel la=new JLabel("ID:");
		JLabel la2=new JLabel("名称:");
		JButton jbn=new JButton("确定");
        frame.add(la);
        la.setBounds(170,50,50,20);
        frame.add(text1);
        text1.setBounds(200,50,100,20);
        frame.add(la2);
        la2.setBounds(170,90,50,20);
        frame.add(text2);
        text2.setBounds(200,90,100,20);
        frame.add(jbn);
        jbn.setBounds(200,140,100,30);
        
      
        
        jbn.addActionListener(new ActionListener(){
		//单击按钮执行的方法
		public void actionPerformed(ActionEvent e) {
			  Statement st=null;
			Connection con=null;
			try {
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433; DatabaseName=Hospital","sa","sa");
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		      try {
				st=con.createStatement();
			} catch (SQLException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
		       String m=text1.getText();
		       int i = Integer.parseInt(m);
		       String s= text2.getText();
		      
		       String sql="set IDENTITY_INSERT Department on;insert into Department (DeptID,DeptName ) values("+i+","+s+")";
			try {
				st.executeUpdate(sql);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
		closeThis();
		adminmenu1();
		}
		});
		
		//按钮4
		JButton button4 =new JButton("返回");
		//在窗体上添加按钮
		frame.add(button4);
		button4.setBounds(200,200,100,30);
		//显示窗体
		frame.setVisible(true);
		//添加点击事件监听器（你可以使用任何其他监听，看你想在什么情况下创建新的窗口了）
		button4.addActionListener(new ActionListener(){
		//单击按钮执行的方法
		public void actionPerformed(ActionEvent e) {
		closeThis();
		//创建新的窗口
		adminmenu1();
		}
		});
		
        
	}
	
	public static void adminmenu12(){
		//创建新的窗口
		JFrame frame = new JFrame("删除医院科室信息");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		//设置在屏幕的位置
		// 窗体大小
		frame.setSize(500,300);
		frame.setLocation(500, 100);
		// 显示窗体
		frame.setVisible(true);	
		
		
		final JTextField  text1=new JTextField(15);
		JLabel la=new JLabel("ID:");
		JButton jbn=new JButton("删除");
        frame.add(la);
        la.setBounds(170,50,50,20);
        frame.add(text1);
        text1.setBounds(200,50,100,20);
        frame.add(jbn);
        jbn.setBounds(200,140,100,30);
        
        
        jbn.addActionListener(new ActionListener(){
		//单击按钮执行的方法
		public void actionPerformed(ActionEvent e) {
			  Statement st=null;
			Connection con=null;
			try {
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433; DatabaseName=Hospital","sa","sa");
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		      try {
				st=con.createStatement();
			} catch (SQLException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
		       String m=text1.getText();
		       int i = Integer.parseInt(m);
		
		      
		       String sql="delete from Department where DeptID="+i+"";
			try {
				st.executeUpdate(sql);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
		closeThis();
		adminmenu1();
		}
		});
        
		//按钮4
		JButton button4 =new JButton("返回");
		//在窗体上添加按钮
		frame.add(button4);
		button4.setBounds(200,200,100,30);
		//显示窗体
		frame.setVisible(true);
		//添加点击事件监听器（你可以使用任何其他监听，看你想在什么情况下创建新的窗口了）
		button4.addActionListener(new ActionListener(){
		//单击按钮执行的方法
		public void actionPerformed(ActionEvent e) {
		closeThis();
		//创建新的窗口
		adminmenu1();
		}
		});
		
        
        
		
		
		
	}
	
	public static void adminmenu13(){
		//创建新的窗口
		JFrame frame = new JFrame("修改医院科室信息");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		//设置在屏幕的位置
		// 窗体大小
		frame.setSize(500,300);
		frame.setLocation(500, 100);
		// 显示窗体
		frame.setVisible(true);	
		
		final JTextField  text1=new JTextField(15);
		final JTextField  text2=new JTextField(15);
		JLabel la=new JLabel("原ID:");
		JLabel la2=new JLabel("新名称:");
		JButton jbn=new JButton("确定修改");
        frame.add(la);
        la.setBounds(170,50,50,20);
        frame.add(text1);
        text1.setBounds(220,50,100,20);
        frame.add(la2);
        la2.setBounds(170,90,50,20);
        frame.add(text2);
        text2.setBounds(220,90,100,20);
        frame.add(jbn);
        jbn.setBounds(200,140,100,30);
		
        
        jbn.addActionListener(new ActionListener(){
		//单击按钮执行的方法
		public void actionPerformed(ActionEvent e) {
			  Statement st=null;
			Connection con=null;
			try {
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433; DatabaseName=Hospital","sa","sa");
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		      try {
				st=con.createStatement();
			} catch (SQLException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
		       String m=text1.getText();
		       int i = Integer.parseInt(m);
		       String s= text2.getText();
		      
		       String sql="UPDATE Department SET DeptName="+s+"  WHERE DeptID="+i+"";
			try {
				st.executeUpdate(sql);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
		closeThis();
		adminmenu1();
		}
		});
		
		//按钮4
		JButton button4 =new JButton("返回");
		//在窗体上添加按钮
		frame.add(button4);
		button4.setBounds(200,200,100,30);
		//显示窗体
		frame.setVisible(true);
		//添加点击事件监听器（你可以使用任何其他监听，看你想在什么情况下创建新的窗口了）
		button4.addActionListener(new ActionListener(){
		//单击按钮执行的方法
		public void actionPerformed(ActionEvent e) {
		closeThis();
		//创建新的窗口
		adminmenu1();
		}
		});
		
		
		
		
	}
	
	public static void adminmenu14() {
		//创建新的窗口
		JFrame frame = new JFrame("查看医院科室信息");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		//设置在屏幕的位置
		// 窗体大小
		frame.setSize(500,300);
		frame.setLocation(500, 100);
		// 显示窗体
		frame.setVisible(true);	
		
		
		JScrollPane scpDemo;
		JTableHeader jth;
	    JTable tabDemo;
	    JScrollPane sc = new JScrollPane();
		sc.setBounds(0,0,500,200);
		frame.add(sc);		
		
		
		//加载数据库驱动	
		//建立数据库连接	
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		} catch (ClassNotFoundException e6) {
			// TODO Auto-generated catch block
			e6.printStackTrace();
		}
		Connection conn = null;
		try {
			conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433; DatabaseName=Hospital","sa","sa");
		} catch (SQLException e5) {
			// TODO Auto-generated catch block
			e5.printStackTrace();
		}

		// 建立查询条件
		String sql = "select * from Department"; 
		PreparedStatement pstm = null;
		try {
			pstm = conn.prepareStatement(sql);
		} catch (SQLException e4) {
			// TODO Auto-generated catch block
			e4.printStackTrace();
		}
		// 执行查询
		ResultSet rs = null;
		try {
			rs = pstm.executeQuery();
		} catch (SQLException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
		}
		// 计算有多少条记录
		int count = 0;
		try {
			while(rs.next()){
			count++;
			}
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		try {
			rs = pstm.executeQuery();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		// 将查询获得的记录数据，转换成适合生成JTable的数据形式
		Object[][] info = new Object[count][2];
		count = 0;
		try {
			while(rs.next()){
			info[count][0] = Integer.valueOf( rs.getInt("DeptID"));
			info[count][1] = rs.getString("DeptName");
			count++;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 定义表头
		String[] title = {"ID","名称"};
		// 创建JTable
		JTable tab = new JTable(info,title);
		// 显示表头
		jth = tab.getTableHeader();
		// 将JTable加入到带滚动条的面板中
		sc.getViewport().add(tab); 
		
		
		//按钮4
		JButton button4 =new JButton("返回");
		//在窗体上添加按钮
		frame.add(button4);
		button4.setBounds(200,200,100,30);
		//显示窗体
		frame.setVisible(true);
		//添加点击事件监听器（你可以使用任何其他监听，看你想在什么情况下创建新的窗口了）
		button4.addActionListener(new ActionListener(){
		//单击按钮执行的方法
		public void actionPerformed(ActionEvent e) {
		closeThis();
		//创建新的窗口
		adminmenu1();
		}
		});
		
		
		
		
		
		
 /*    	JLabel jlb1 = new JLabel();
		frame.add(jlb1);
		jlb1.setBounds(145,50,200,30);
					
		try {
			while(rs.next()){			
				try {
					jlb1.setText("科室ID："+rs.getInt("DeptID"));
					jlb1.setText("科室名称："+rs.getString("DeptName"));
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}		
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		
		
	}
	
	
	public static void adminmenu21(){
		
		//创建新的窗口
		JFrame frame = new JFrame("增加药品信息");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		//设置在屏幕的位置
		// 窗体大小
		frame.setSize(500,300);
		frame.setLocation(500, 100);
		// 显示窗体
		frame.setVisible(true);	
		
		final JTextField  text1=new JTextField(15);
		final JTextField  text2=new JTextField(15);
		final JTextField  text3=new JTextField(15);
		final JTextField  text4=new JTextField(15);
		JLabel la=new JLabel("ID:");
		JLabel la2=new JLabel("名称:");
		JLabel la3=new JLabel("数量:");
		JLabel la4=new JLabel("价格:");
		JButton jbn=new JButton("确定");
        frame.add(la);
        la.setBounds(170,50,50,20);
        frame.add(text1);
        text1.setBounds(200,50,100,20);
        
        frame.add(la2);
        la2.setBounds(170,90,50,20);
        frame.add(text2);
        text2.setBounds(200,90,100,20);
        
        frame.add(la3);
        la3.setBounds(170,130,50,20);
        frame.add(text3);
        text3.setBounds(200,130,100,20);
        
        frame.add(la4);
        la4.setBounds(170,170,50,20);
        frame.add(text4);
        text4.setBounds(200,170,100,20);
              
        frame.add(jbn);
        jbn.setBounds(200,220,100,30);
		
		
        jbn.addActionListener(new ActionListener(){
		//单击按钮执行的方法
		public void actionPerformed(ActionEvent e) {
			  Statement st=null;
			Connection con=null;
			try {
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433; DatabaseName=Hospital","sa","sa");
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		      try {
				st=con.createStatement();
			} catch (SQLException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
		       String m1=text1.getText();
		       int i1= Integer.parseInt(m1);
		       String s= text2.getText();
		       String  m2=text3.getText();
		       int i2 = Integer.parseInt(m2);
		       String m3=text4.getText();
		       int i3 = Integer.parseInt(m3);
		      
		       String sql="insert into Medicine values("+i1+","+s+","+i2+","+i3+")";
			try {
				st.executeUpdate(sql);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}	
		closeThis();
		adminmenu2();
		}
		});
        
		//按钮4
		JButton button4 =new JButton("返回");
		//在窗体上添加按钮
		frame.add(button4);
		button4.setBounds(200,200,100,30);
		//显示窗体
		frame.setVisible(true);
		//添加点击事件监听器（你可以使用任何其他监听，看你想在什么情况下创建新的窗口了）
		button4.addActionListener(new ActionListener(){
		//单击按钮执行的方法
		public void actionPerformed(ActionEvent e) {
		closeThis();
		//创建新的窗口
		adminmenu1();
		}
		});
		
		
		
	}
	
	public static void adminmenu22(){
		//创建新的窗口
				JFrame frame = new JFrame("删除药品信息");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setLayout(null);
				//设置在屏幕的位置
				// 窗体大小
				frame.setSize(500,300);
				frame.setLocation(500, 100);
				// 显示窗体
				frame.setVisible(true);	
				
				
				final JTextField  text1=new JTextField(15);
				JLabel la=new JLabel("ID:");
				JButton jbn=new JButton("删除");
		        frame.add(la);
		        la.setBounds(170,50,50,20);
		        frame.add(text1);
		        text1.setBounds(200,50,100,20);
		        frame.add(jbn);
		        jbn.setBounds(200,140,100,30);
		        
		        
		        jbn.addActionListener(new ActionListener(){
				//单击按钮执行的方法
				public void actionPerformed(ActionEvent e) {
					  Statement st=null;
					Connection con=null;
					try {
						Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
					} catch (ClassNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					try {
						con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433; DatabaseName=Hospital","sa","sa");
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				      try {
						st=con.createStatement();
					} catch (SQLException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					}
				       String m=text1.getText();
				       int i = Integer.parseInt(m);
				
				      
				       String sql="delete from Department where DeptID="+i+"";
					try {
						st.executeUpdate(sql);
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				
				closeThis();
				adminmenu1();
				}
				});
		
				//按钮4
				JButton button4 =new JButton("返回");
				//在窗体上添加按钮
				frame.add(button4);
				button4.setBounds(200,200,100,30);
				//显示窗体
				frame.setVisible(true);
				//添加点击事件监听器（你可以使用任何其他监听，看你想在什么情况下创建新的窗口了）
				button4.addActionListener(new ActionListener(){
				//单击按钮执行的方法
				public void actionPerformed(ActionEvent e) {
				closeThis();
				//创建新的窗口
				adminmenu1();
				}
				});
				
		
	}
	
	public static void adminmenu23(){
		//创建新的窗口
		JFrame frame = new JFrame("修改药品信息");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		//设置在屏幕的位置
		// 窗体大小
		frame.setSize(500,300);
		frame.setLocation(500, 100);
		// 显示窗体
		frame.setVisible(true);	
		

		final JTextField  text1=new JTextField(15);
		final JTextField  text2=new JTextField(15);
		final JTextField  text3=new JTextField(15);
		final JTextField  text4=new JTextField(15);
		JLabel la=new JLabel("现ID:");
		JLabel la2=new JLabel("新名称:");
		JLabel la3=new JLabel("新数量:");
		JLabel la4=new JLabel("新价格:");
		JButton jbn=new JButton("确定修改");
        frame.add(la);
        la.setBounds(170,50,50,20);
        frame.add(text1);
        text1.setBounds(210,50,100,20);
        
        frame.add(la2);
        la2.setBounds(170,70,50,20);
        frame.add(text2);
        text2.setBounds(210,70,100,20);
        
        frame.add(la3);
        la3.setBounds(170,90,50,20);
        frame.add(text3);
        text3.setBounds(210,90,100,20);
        
        frame.add(la4);
        la4.setBounds(170,110,50,20);
        frame.add(text4);
        text4.setBounds(210,110,100,20);
              
        frame.add(jbn);
        jbn.setBounds(200,140,100,30);
		
        
        
        jbn.addActionListener(new ActionListener(){
		//单击按钮执行的方法
		public void actionPerformed(ActionEvent e) {
			  Statement st=null;
			Connection con=null;
			try {
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433; DatabaseName=Hospital","sa","sa");
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		      try {
				st=con.createStatement();
			} catch (SQLException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
		       String m1=text1.getText();
		       int i1= Integer.parseInt(m1);
		       String s= text2.getText();
		       String  m2=text3.getText();
		       int i2 = Integer.parseInt(m2);
		       String m3=text4.getText();
		       int i3 = Integer.parseInt(m3);
		      
		       String sql1="UPDATE Medicine SET MedName="+s+"  WHERE MedID="+i1+"";
			try {
				st.executeUpdate(sql1);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			  String sql2="UPDATE Medicine SET MedNum="+i2+"  WHERE MedID="+i1+"";
			  try {
				st.executeUpdate(sql2);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			  
			  String sql3="UPDATE Medicine SET price="+i3+"  WHERE MedID="+i1+"";
			  try {
				st.executeUpdate(sql3);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
		closeThis();
		adminmenu1();
		}
		});
		
		//按钮4
		JButton button4 =new JButton("返回");
		//在窗体上添加按钮
		frame.add(button4);
		button4.setBounds(200,200,100,30);
		//显示窗体
		frame.setVisible(true);
		//添加点击事件监听器（你可以使用任何其他监听，看你想在什么情况下创建新的窗口了）
		button4.addActionListener(new ActionListener(){
		//单击按钮执行的方法
		public void actionPerformed(ActionEvent e) {
		closeThis();
		//创建新的窗口
		adminmenu1();
		}
		});
		
        
        
		
		
	}
	
	public static void adminmenu24(){
		//创建新的窗口
		JFrame frame = new JFrame("查看药品信息");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		//设置在屏幕的位置
		// 窗体大小
		frame.setSize(500,300);
		frame.setLocation(500, 100);
		// 显示窗体
		frame.setVisible(true);	
		
		
		JScrollPane scpDemo;
		JTableHeader jth;
	    JTable tabDemo;
	    JScrollPane sc = new JScrollPane();
		sc.setBounds(0,0,500,200);
		frame.add(sc);		
		
		
		//加载数据库驱动	
		//建立数据库连接	
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		} catch (ClassNotFoundException e6) {
			// TODO Auto-generated catch block
			e6.printStackTrace();
		}
		Connection conn = null;
		try {
			conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433; DatabaseName=Hospital","sa","sa");
		} catch (SQLException e5) {
			// TODO Auto-generated catch block
			e5.printStackTrace();
		}

		// 建立查询条件
		String sql = "select * from Medicine"; 
		PreparedStatement pstm = null;
		try {
			pstm = conn.prepareStatement(sql);
		} catch (SQLException e4) {
			// TODO Auto-generated catch block
			e4.printStackTrace();
		}
		// 执行查询
		ResultSet rs = null;
		try {
			rs = pstm.executeQuery();
		} catch (SQLException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
		}
		// 计算有多少条记录
		int count = 0;
		try {
			while(rs.next()){
			count++;
			}
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		try {
			rs = pstm.executeQuery();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		// 将查询获得的记录数据，转换成适合生成JTable的数据形式
		Object[][] info = new Object[count][4];
		count = 0;
		try {
			while(rs.next()){
			info[count][0] = Integer.valueOf( rs.getInt("MedID"));
			info[count][1] = rs.getString("MedName");
			info[count][2] = Integer.valueOf( rs.getInt("MedNum"));
			info[count][3] = Integer.valueOf( rs.getInt("price"));
			count++;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 定义表头
		String[] title = {"ID","名称","数量","价格"};
		// 创建JTable
		JTable tab = new JTable(info,title);
		// 显示表头
		jth = tab.getTableHeader();
		// 将JTable加入到带滚动条的面板中
		sc.getViewport().add(tab); 
		
		
		//按钮4
		JButton button4 =new JButton("返回");
		//在窗体上添加按钮
		frame.add(button4);
		button4.setBounds(200,200,100,30);
		//显示窗体
		frame.setVisible(true);
		//添加点击事件监听器（你可以使用任何其他监听，看你想在什么情况下创建新的窗口了）
		button4.addActionListener(new ActionListener(){
		//单击按钮执行的方法
		public void actionPerformed(ActionEvent e) {
		closeThis();
		//创建新的窗口
		adminmenu2();
		}
		});
		
		
		
	}
	
	
	public static void adminmenu41(){
		
		//创建新的窗口
		JFrame frame = new JFrame("新建账号");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		//设置在屏幕的位置
		// 窗体大小
		frame.setSize(500,300);
		frame.setLocation(500, 100);
		// 显示窗体
		frame.setVisible(true);	
		

		final JTextField  text2=new JTextField(15);
		final JTextField  text3=new JTextField(15);
		JLabel la2=new JLabel("职业ID:");
		JLabel la3=new JLabel("密码:");
		JButton jbn=new JButton("确定");
        
        frame.add(la2);
        la2.setBounds(170,50,50,20);
        frame.add(text2);
        text2.setBounds(210,50,100,20);
        
        frame.add(la3);
        la3.setBounds(170,70,50,20);
        frame.add(text3);
        text3.setBounds(210,70,100,20);
                     
        frame.add(jbn);
        jbn.setBounds(200,100,100,30);
		
		
        jbn.addActionListener(new ActionListener(){
		//单击按钮执行的方法
		public void actionPerformed(ActionEvent e) {
			  Statement st=null;
			Connection con=null;
			try {
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433; DatabaseName=Hospital","sa","sa");
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		      try {
				st=con.createStatement();
			} catch (SQLException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
		       String  m2=text2.getText();
		       int i2 = Integer.parseInt(m2);
		       String s= text3.getText();
		      
		       String sql="insert into Users  values("+i2+","+s+")";
			try {
				st.executeUpdate(sql);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}	
								
		closeThis();
		//adminmenu411();
		adminmenu4();
		}
		});
        
		//按钮4
		JButton button4 =new JButton("返回");
		//在窗体上添加按钮
		frame.add(button4);
		button4.setBounds(200,200,100,30);
		//显示窗体
		frame.setVisible(true);
		//添加点击事件监听器（你可以使用任何其他监听，看你想在什么情况下创建新的窗口了）
		button4.addActionListener(new ActionListener(){
		//单击按钮执行的方法
		public void actionPerformed(ActionEvent e) {
		closeThis();
		//创建新的窗口
		adminmenu4();
		}
		});
		
		
		
	}
	
	@SuppressWarnings("null")
	public static void adminmenu411(){
		//创建新的窗口
		JFrame frame= new JFrame("账号ID");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setLayout(null);
		//设置在屏幕的位置
		// 窗体大小
		frame.setSize(300,100);
		frame.setLocation(550, 10);
		// 显示窗体
		frame.setVisible(true);	
		
		
		JLabel la2=new JLabel("职业ID:");
        frame.add(la2);
        la2.setBounds(100,20,50,20);

        
        ResultSet rs=null;
		Connection con=null;
		Statement st=null;
        
        try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433; DatabaseName=Hospital","sa","sa");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		   
		   try {
			st=con.createStatement();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		   
		   String sql2="select max(userID) from Users";
			try {
				rs=st.executeQuery(sql2);
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		    
	        JLabel la3=new JLabel("i");
	        frame.add(la3);
	        la3.setBounds(130,20,100,20);
		
		
		
		
	}
	
	public static void adminmenu42(){
		
		//创建新的窗口
				JFrame frame = new JFrame("删除账号");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setLayout(null);
				//设置在屏幕的位置
				// 窗体大小
				frame.setSize(500,300);
				frame.setLocation(500, 100);
				// 显示窗体
				frame.setVisible(true);	
				
				
				final JTextField  text1=new JTextField(15);
				JLabel la=new JLabel("ID:");
				JButton jbn=new JButton("删除");
		        frame.add(la);
		        la.setBounds(170,50,50,20);
		        frame.add(text1);
		        text1.setBounds(200,50,100,20);
		        frame.add(jbn);
		        jbn.setBounds(200,140,100,30);
		        
		        
		        jbn.addActionListener(new ActionListener(){
				//单击按钮执行的方法
				public void actionPerformed(ActionEvent e) {
					  Statement st=null;
					Connection con=null;
					try {
						Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
					} catch (ClassNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					try {
						con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433; DatabaseName=Hospital","sa","sa");
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				      try {
						st=con.createStatement();
					} catch (SQLException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					}
				       String m=text1.getText();
				       int i = Integer.parseInt(m);
				
				      
				       String sql="delete from Users where userID="+i+"";
					try {
						st.executeUpdate(sql);
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				
				closeThis();
				adminmenu4();
				}
				});
		        
				//按钮4
				JButton button4 =new JButton("返回");
				//在窗体上添加按钮
				frame.add(button4);
				button4.setBounds(200,200,100,30);
				//显示窗体
				frame.setVisible(true);
				//添加点击事件监听器（你可以使用任何其他监听，看你想在什么情况下创建新的窗口了）
				button4.addActionListener(new ActionListener(){
				//单击按钮执行的方法
				public void actionPerformed(ActionEvent e) {
				closeThis();
				//创建新的窗口
				adminmenu1();
				}
				});
				
		        
		        
				
		
		
	}
	
	public static void adminmenu43(){
		//创建新的窗口
		JFrame frame = new JFrame("修改账号信息");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		//设置在屏幕的位置
		// 窗体大小
		frame.setSize(500,300);
		frame.setLocation(500, 100);
		// 显示窗体
		frame.setVisible(true);	
		

		final JTextField  text1=new JTextField(15);
		final JTextField  text2=new JTextField(15);
		final JTextField  text3=new JTextField(15);
		JLabel la=new JLabel("现ID:");
		JLabel la2=new JLabel("新职业ID:");
		JLabel la3=new JLabel("新密码:");
		JButton jbn=new JButton("确定修改");
        frame.add(la);
        la.setBounds(170,50,50,20);
        frame.add(text1);
        text1.setBounds(210,50,100,20);
        
        frame.add(la2);
        la2.setBounds(170,70,50,20);
        frame.add(text2);
        text2.setBounds(210,70,100,20);
        
        frame.add(la3);
        la3.setBounds(170,90,50,20);
        frame.add(text3);
        text3.setBounds(210,90,100,20);
   
              
        frame.add(jbn);
        jbn.setBounds(200,140,100,30); 
		
        
        
        jbn.addActionListener(new ActionListener(){
		//单击按钮执行的方法
		public void actionPerformed(ActionEvent e) {
			  Statement st=null;
			Connection con=null;
			try {
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433; DatabaseName=Hospital","sa","sa");
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		      try {
				st=con.createStatement();
			} catch (SQLException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
		       String m1=text1.getText();
		       int i1= Integer.parseInt(m1);
		       String m2= text2.getText();
		       int i2= Integer.parseInt(m2);
		       String  s=text3.getText();
		      
		       String sql1="UPDATE Users SET roleID="+i2+"  WHERE userID="+i1+"";
			try {
				st.executeUpdate(sql1);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			  String sql2="UPDATE Users SET pwd="+s+"  WHERE userID="+i1+"";
			  try {
				st.executeUpdate(sql2);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			  
			
			
		closeThis();
		adminmenu4();
		}
		});
		
		//按钮4
		JButton button4 =new JButton("返回");
		//在窗体上添加按钮
		frame.add(button4);
		button4.setBounds(200,200,100,30);
		//显示窗体
		frame.setVisible(true);
		//添加点击事件监听器（你可以使用任何其他监听，看你想在什么情况下创建新的窗口了）
		button4.addActionListener(new ActionListener(){
		//单击按钮执行的方法
		public void actionPerformed(ActionEvent e) {
		closeThis();
		//创建新的窗口
		adminmenu1();
		}
		});
		
	}
	
	public static void adminmenu44(){
		//创建新的窗口
				JFrame frame = new JFrame("查看账号信息");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setLayout(null);
				//设置在屏幕的位置
				// 窗体大小
				frame.setSize(500,300);
				frame.setLocation(500, 100);
				// 显示窗体
				frame.setVisible(true);	
				
				
				JScrollPane scpDemo;
				JTableHeader jth;
			    JTable tabDemo;
			    JScrollPane sc = new JScrollPane();
				sc.setBounds(0,0,500,200);
				frame.add(sc);		
				
				
				//加载数据库驱动	
				//建立数据库连接	
				try {
					Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				} catch (ClassNotFoundException e6) {
					// TODO Auto-generated catch block
					e6.printStackTrace();
				}
				Connection conn = null;
				try {
					conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433; DatabaseName=Hospital","sa","sa");
				} catch (SQLException e5) {
					// TODO Auto-generated catch block
					e5.printStackTrace();
				}

				// 建立查询条件
				String sql = "select * from Users"; 
				PreparedStatement pstm = null;
				try {
					pstm = conn.prepareStatement(sql);
				} catch (SQLException e4) {
					// TODO Auto-generated catch block
					e4.printStackTrace();
				}
				// 执行查询
				ResultSet rs = null;
				try {
					rs = pstm.executeQuery();
				} catch (SQLException e3) {
					// TODO Auto-generated catch block
					e3.printStackTrace();
				}
				// 计算有多少条记录
				int count = 0;
				try {
					while(rs.next()){
					count++;
					}
				} catch (SQLException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				try {
					rs = pstm.executeQuery();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				// 将查询获得的记录数据，转换成适合生成JTable的数据形式
				Object[][] info = new Object[count][3];
				count = 0;
				try {
					while(rs.next()){
					info[count][0] = Integer.valueOf( rs.getInt("userID"));
					info[count][1] = Integer.valueOf(rs.getString("roleID"));
					info[count][2] =rs.getInt("pwd");
					count++;
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				// 定义表头
				String[] title = {"ID","职业ID","密码"};
				// 创建JTable
				JTable tab = new JTable(info,title);
				// 显示表头
				jth = tab.getTableHeader();
				// 将JTable加入到带滚动条的面板中
				sc.getViewport().add(tab); 
				
				
				//按钮4
				JButton button4 =new JButton("返回");
				//在窗体上添加按钮
				frame.add(button4);
				button4.setBounds(200,200,100,30);
				//显示窗体
				frame.setVisible(true);
				//添加点击事件监听器（你可以使用任何其他监听，看你想在什么情况下创建新的窗口了）
				button4.addActionListener(new ActionListener(){
				//单击按钮执行的方法
				public void actionPerformed(ActionEvent e) {
				closeThis();
				//创建新的窗口
				adminmenu2();
				}
				});
				
				
		
		
		
		
	}
	
	
	
	public static void closeThis() {     frame.dispose();   }
	
	 public class QuitAction implements ActionListener {
		    private JFrame frame;
		    public QuitAction(JFrame frame){this.frame = frame;}
		 @Override
		 public void actionPerformed(ActionEvent e) {
		  // TODO Auto-generated method stub
		  frame.dispose();
		 }
		}
	 
}