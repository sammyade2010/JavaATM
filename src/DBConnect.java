import java.sql.*;

/**
 * 
 */

/**
 * @author B00095805
 *
 */
public class DBConnect {
	/**
	 * @param args
	 */
	private Connection con;
	private static Statement st;
	private static ResultSet rs;
	
	
	public DBConnect() {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm","root","");
			st = con.createStatement();
			
		}catch(Exception ex){
			System.out.println("Error: "+ex);
		}
	}
	
	public void getData() {
		try{
		
			String query = "select * from logins";
			rs = st.executeQuery(query);
			System.out.println("Records from Database");
			while(rs.next()){
				String cardNo = rs.getString("cardNo");
				String name = rs.getString("name");
				String pinNo = rs.getString("pinNo");
				System.out.println("CardNo: "+cardNo+" "+" "+"name"+name+" "+"pinNo"+pinNo);
		
		}
		}catch(Exception ex) {
			System.out.println("Error: "+ex);
		}
		
	}
	public static void main(String[] args) {
		
	}
}

