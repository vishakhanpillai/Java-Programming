import java.sql.*;
public class connection {
	public static void main(String[] args){
		String url = "jdbc:mysql://localhost:3306/java";
		String username = "root";
		String password = "";
		try {
			
			Connection con = DriverManager.getConnection(url, username, password);
			
			PreparedStatement stmt = con.prepareStatement("INSERT INTO EMPLOYEE VALUES(?, ?, ?, ?, ?)");
			
			int id = 8;
			String name = "Tom";
			int age = 36;
			String dept = "Media";
			int salary = 100000;
			
			stmt.setInt(1, id);
			stmt.setString(2, name);
			stmt.setInt(3, age);
			stmt.setString(4, dept);
			stmt.setInt(5, salary);
			
			int rowsAffected = stmt.executeUpdate();
			if(rowsAffected > 0) {
				System.out.println("Inserted");
			}
			
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM EMPLOYEE");
			while(rs.next()) {
				System.out.println("Id: " + rs.getInt(1));
				System.out.println("Name: " + rs.getString(2));
				System.out.println("Age: " + rs.getInt(3));
				System.out.println("Department: " + rs.getString(4));
				System.out.println("Salary: " + rs.getInt(5));
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
