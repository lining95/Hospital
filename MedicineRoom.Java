import java.sql.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Mdcn extends JFrame implements ActionListener {
      /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Connection con;
      Statement sql;
      JMenuBar bar=null;
      JMenu menu1,menu2,menu3;
      JMenuItem item1,item2,item3;
      JButton b1,b2,b3, b4,b5, b6,b7,b8,b9,b10;
      JTextField tf1,tf2,tf3,tf4, tf5;
      JPasswordField tf6;
      JTextArea ta1,ta2,ta3;
      Box basebox,bv1,bv2,bv3,bv4, bv5,bv6,basebox1, bv7;
      JScrollPane sp1,sp2,sp3;
	@SuppressWarnings({ "deprecation" })
	Mdcn(){
		setLayout(new BorderLayout());
		bar=new JMenuBar();
		menu1=new JMenu("登录");
		menu2=new JMenu("药房");
		menu3=new JMenu("退出");
//		item1=new JMenuItem("登录");
//		item2=new JMenuItem("药房");
		item3=new JMenuItem("退出");
//		menu1.add(item1);
//		menu2.add(item2);
		bar.add(menu1);
		bar.add(menu2);
		bar.add(menu3);
		//menu1.isVisible();
		//menu2.isEnabled();
		menu3.add(item3);
//		item1.addActionListener(this);
//		item2.addActionListener(this);
		item3.addActionListener(this);
		
		
		
		//menu1
		JPanel p3=new JPanel();
		JPanel p4=new JPanel();
	    bv5=Box.createVerticalBox();
	    bv5.add(Box.createVerticalStrut(20));
	    bv5.add(new JLabel("用户名"));
	    bv5.add(Box.createVerticalStrut(40));
	    bv5.add(new JLabel("密码"));
	    bv5.add(Box.createVerticalStrut(40));
	    tf5=new JTextField(16);
	    tf6=new JPasswordField(16);
	    bv6=Box.createVerticalBox();
	    bv6.add(Box.createVerticalStrut(20));
	    bv6.add(tf5);
	    bv6.add(Box.createVerticalStrut(40));
	    bv6.add(tf6);
	    bv6.add(Box.createVerticalStrut(40));
	    basebox1=Box.createHorizontalBox();
	    basebox1.add(bv5);
	    basebox1.add(Box.createHorizontalStrut(10));
	    basebox1.add(bv6);
	   // menu1.add(basebox1);
	    p3.add(basebox1);
	    b4=new JButton("登录");
	    b5=new JButton("重置");
	    b4.addActionListener(this);
	    b5.addActionListener(this);
		p4.add(b4);
		p4.add(Box.createHorizontalStrut(30));
		p4.add(b5);
	    menu1.add(p3);
	    menu1.add(p4);
	    
	    
	    
		
	//药房Menu2	
		JPanel p1=new JPanel();
		JPanel p2=new JPanel();
		JPanel p5=new JPanel();
	
		b1=new JButton("查询最新医生开药信息");
		b2=new JButton("查询药品支付情况");
		b3=new JButton("更新药库信息");
		b6=new JButton("清空列表");
		b7=new JButton("清空列表");
		b8=new JButton("清空列表");
		b9=new JButton("查询药库信息");
		b10=new JButton("清空列表");
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		
		p1.add(Box.createHorizontalStrut(20));
		p1.add(b1);
		p1.add(Box.createHorizontalStrut(70));
		p1.add(b2);
		p1.add(Box.createHorizontalStrut(100));
		p1.add(b9);
		p1.add(Box.createHorizontalStrut(100));
		p1.add(b3);
		p1.add(Box.createHorizontalStrut(30));
		p5.add(b6);
		p5.add(Box.createHorizontalStrut(150));
		p5.add(b7);
		p5.add(Box.createHorizontalStrut(150));
		p5.add(b8);
		p5.add(Box.createHorizontalStrut(150));
		p5.add(b10);
		
	    ta1=new JTextArea();
	    ta2=new JTextArea();
	    ta3=new JTextArea();
	    ta1.setEditable(false);
	    ta1.setColumns(20);
	    ta1.setRows(20);
	    ta1.setBounds(30, 10, 10, 10);
	    ta1.setLineWrap(true);
	    ta2.setEditable(false);
	    ta2.setColumns(20);
	    ta2.setRows(20);
	    ta2.setBounds(30, 10, 10, 10);
	    ta2.setLineWrap(true);
	    ta3.setEditable(false);
	    ta3.setColumns(20);
	    ta3.setRows(20);
	    ta3.setBounds(30, 10, 10, 10);
	    ta3.setLineWrap(true);
	    
	    sp1=new JScrollPane();
	    sp2=new JScrollPane();
	    sp3=new JScrollPane();
	    sp1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
	    sp1.setViewportView(ta1);
	    sp2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
	    sp2.setViewportView(ta2);
	    sp3.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
	    sp3.setViewportView(ta3);
	    bv1=Box.createVerticalBox();
	    bv1.add(sp1);
	    bv2=Box.createVerticalBox();
	    bv2.add(sp2);
	    bv7=Box.createVerticalBox();
	    bv7.add(sp3);
	    tf1=new JTextField(16);
	   // tf1.setBounds(10, 10, 16, 10);
	    tf2=new JTextField(16);
	    tf3=new JTextField(16);
	    tf4=new JTextField(16);
	    bv3=Box.createVerticalBox();
	    bv3.add(new JLabel("药品号"));
	    bv3.add(Box.createVerticalStrut(50));
//	    bv3.add(new JLabel("药品名"));
//	    bv3.add(Box.createVerticalStrut(100));
	    bv3.add(new JLabel("药品数量"));
	    bv3.add(Box.createVerticalStrut(240));
	 //   bv3.add(new JLabel("药品价格"));
	  //  bv3.add(Box.createVerticalStrut(80));
	    
	    bv4=Box.createVerticalBox();
	    bv4.add(tf1);
	    bv4.add(Box.createVerticalStrut(50));
//	    bv4.add(tf2);
//	    bv4.add(Box.createVerticalStrut(80));
	    bv4.add(tf3);
	    bv4.add(Box.createVerticalStrut(240));
	  //  bv4.add(tf4);
	   // bv4.add(Box.createVerticalStrut(80));
	    
	    basebox=Box.createHorizontalBox();
	    basebox.add(bv1);
	    basebox.add(Box.createHorizontalStrut(10));
	    basebox.add(bv2);
	    basebox.add(Box.createHorizontalStrut(10));
	    basebox.add(bv7);
	    basebox.add(Box.createHorizontalStrut(10));
	    basebox.add(bv3);
	    basebox.add(Box.createHorizontalStrut(4));
	    basebox.add(bv4);
	    p2.add(basebox);
	    menu2.add(p1);
	    menu2.add(p2);
	    menu2.add(p5);
	    setJMenuBar(bar);
	    setSize(1100,700);
	    setBackground(Color.pink);
	    
	    menu2.disable();
        menu3.disable();
	    
	       
	    
	    
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Mdcn md=new Mdcn();
md.setVisible(true);
		
		
	}




	@SuppressWarnings({ "deprecation", "unused" })
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
//		if(e.getSource()==item1){
//			this.getContentPane().removeAll();
//			this.getContentPane().add(menu1);
//			this.getContentPane().repaint();
//			this.getContentPane().validate();
//		}
//		if(e.getSource()==item2){
//			this.getContentPane().removeAll();
//			this.getContentPane().add(menu2);
//			this.getContentPane().repaint();
//			this.getContentPane().validate();		
//		}
		if(e.getSource()==b4){
			String num2= tf6.getText().trim();		
			String num1=tf5.getText().trim();			
		    String sql1="select * from Users where userID='"+num1+"' and pwd='"+num2+"' and roleID=4" ;
		   ResultSet rs=SQLOperate.SqlSel(sql1);
	
		    try {
				if(rs.next())
				{
					tf5.setText("");
					tf6.setText("");
					
					menu2.enable();
					menu3.enable();
					JOptionPane.showMessageDialog(this, "登录成功！","提示对话框",JOptionPane.INFORMATION_MESSAGE);
					menu1.disable();
				}	
				else{
					JOptionPane.showMessageDialog(this, "用户名或密码有误！","提示对话框",JOptionPane.INFORMATION_MESSAGE);
				}
			} catch (HeadlessException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if(e.getSource()==b5){
			tf5.setText("");
			tf6.setText("");
		}
		if(e.getSource()==b1){
			String MedItemID,MedID,MedNum,price,chargeID;
			
			String sql2="select * from MedItem order by MedItemID desc";
			ResultSet rs=SQLOperate.SqlSel(sql2);
			try {
				while(rs.next()){
			    MedItemID=rs.getString("MedItemID");
			    MedID=rs.getString("MedID");
			    MedNum=rs.getString("MedNum");
			    price=rs.getString("price");
			    chargeID=rs.getString("chargeID");
			    ta1.append("药品收费单号:"+MedItemID+"\r\n"+"药品号:"+MedID+"\r\n"+"药品数量:"+MedNum+"\r\n"+"单价:"+price+"\r\n"+"预约号"+chargeID+"\r\n\r\n");
			       
				}
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if(e.getSource()==b6){
			ta1.setText("");
		}
		if(e.getSource()==b7){
			ta2.setText("");
		}
		if(e.getSource()==b8){
			ta3.setText("");
		}
		if(e.getSource()==b2){
			String RegID,MedItemID,sumprice,chargeState;
			String sql3="select * from charge order by RegID desc";
			ResultSet rs=SQLOperate.SqlSel(sql3);
			try {
				while(rs.next()){
					RegID=rs.getString("RegID");
					//MedItemID=rs.getString("MedItemID");
					sumprice=rs.getString("sumprice");
					chargeState=rs.getString("chargeState");
					ta2.append("预约序号:"+RegID+"\r\n"+"药品总价:"+sumprice+"\r\n"+"支付状态:"+chargeState+"\r\n\r\n");
				}
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if(e.getSource()==b9){
			String MedID,MedName,MedNum,price;
			String sql4="select * from Medicine order by MedID asc";
			ResultSet rs=SQLOperate.SqlSel(sql4);
			try {
				while(rs.next()){
					MedID=rs.getString("MedID");
					MedName=rs.getString("MedName");
					MedNum=rs.getString("MedNum");
					price=rs.getString("price");
					ta3.append("药品号:"+MedID+"\r\n"+"药品名称:"+MedName+"\r\n"+"药品数量:"+MedNum+"\r\n"+"单价:"+price+"\r\n\r\n");
				}
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if(e.getSource()==b3){
			String MedID,MedNum;
			MedID=tf1.getText().trim();
			MedNum = tf3.getText();
			int n=Integer.parseInt(MedNum);
			String sql5="update Medicine set MedNum= '"+n+"'where MedID='"+MedID+"'";
			int x=SQLOperate.SqlUpdata(sql5);
			if(x==0){
				tf1.setText("");
				tf3.setText("");
				JOptionPane.showMessageDialog(this, "更新失败！","提示对话框",JOptionPane.INFORMATION_MESSAGE);
			}
			else{
				tf1.setText("");
				tf3.setText("");
				JOptionPane.showMessageDialog(this, "更新成功！","提示对话框",JOptionPane.INFORMATION_MESSAGE);
			}
		}
		if(e.getSource()==b10){
			tf1.setText("");
			tf3.setText("");
	}
		if(e.getSource()==item3){
			int n = JOptionPane.showConfirmDialog(null, "你确定要退出吗?", "提示",JOptionPane.YES_NO_OPTION);
			if(n==0){
				
			    menu2.disable();
		        menu3.disable();
				menu1.enable();
			}
		
		}
	}
}
