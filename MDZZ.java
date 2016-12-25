package director;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MDZZ {

	// 连接数据库
	public static Connection Connection() {
		Connection con = null;
		try {
			// 加载数据库驱动
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			// 建立数据库连接
			// con=(Connection)DriverManager.getConnection("jdbc:sqlserver://localhost:1433;integratedSecurity=true;DatabaseName=Hospital");
			con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433; DatabaseName=hospital", "sa", "sa");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}

	public static int SqlUpdata(String sql) {
		Connection con = Connection();
		// 创建语句对象
		Statement st = null;
		int yt = 0;
		try {
			st = con.createStatement();
			yt = st.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return yt;
		// insert,update,delete,通常用executeUpdate
	}

	public static ResultSet SqlSel(String sql) {
		Connection con = Connection();
		// 创建语句对象
		Statement st = null;
		ResultSet rs = null;
		try {
			st = con.createStatement();
			rs = st.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
		// select语句用executeQuery，返回一个ResultSet结果集，二维表
	}

	
	 //测试是否连接成功 
	public static void main(String[] args) {
	
		Connection
	 con=Connection();
		if(con!=null)
			System.out.println("连接成功！"); 
		
	
	
	
	
	
	
	}
	 
	
	
}