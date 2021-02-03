package user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class UserDAO {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public UserDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdb:oracle:thin:@localhost:1521:system";
			String id = "test20509";
			String pw = "20509";
			conn = DriverManager.getConnection(url, id, pw);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<User> search(String Name){
		String sql = "SELECT * FROM AJAX WHERE Name = ?";
		ArrayList<User> userList = new ArrayList<User>();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, Name);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				User user = new User();
				user.setName(rs.getString(1));
				user.setAge(rs.getInt(2));
				user.setGender(rs.getString(3));
				user.setEmail(rs.getString(4));
				userList.add(user);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return userList;
	}
}
