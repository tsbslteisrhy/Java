package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * ��¥ : 2020/05/26
 * �̸� : ��ȿ�� 
 * ���� : JDBC INSERT �ǽ��ϱ�
 */
public class InsertTest {
	public static void main(String[] args) throws Exception {
		
		// DB����
		String host = "jdbc:mysql://192.168.44.7:3306/rhj";
		String user = "rhj";
		String pass = "1234";
		
		// 1�ܰ� - JDBC ����̹� �����ε�
		Class.forName("com.mysql.jdbc.Driver");
		
		// 2�ܰ� - �����ͺ��̽� ����
		Connection conn = DriverManager.getConnection(host, user, pass);
		
		// 3�ܰ� - SQL ���ఴü ����
		Statement stmt = conn.createStatement();
		
		// 4�ܰ� - SQL ����
		String sql = "INSERT INTO `USER1` VALUES ('J101', '��ö', '010-1231-2121', 52)";
		stmt.executeUpdate(sql);
				
		// 5�ܰ� - �����(ResultSet) ó��(SELECT�� �ش�)
		
		// 6�ܰ� - �����ͺ��̽� ����(����)
		conn.close();
		
		System.out.println("INSERT �Ϸ�...");
	}
}
