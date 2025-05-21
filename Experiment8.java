import java.sql.*;

public class Experiment8 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb"; 
        String user = "root"; 
        String password = "root"; 

        try {
            try (Connection con = DriverManager.getConnection(url, user, password)) {
                Statement stmt = con.createStatement();
                
                // Insert
                stmt.executeUpdate("INSERT INTO students (id, name) VALUES (1, 'Rahul')");
                
                // Update
                stmt.executeUpdate("UPDATE students SET name='Amit' WHERE id=1");
                
                // Select
                ResultSet rs = stmt.executeQuery("SELECT * FROM students");
                while (rs.next()) {
                    System.out.println(rs.getInt("id") + " " + rs.getString("name"));
                }
                
                // Delete
                stmt.executeUpdate("DELETE FROM students WHERE id=1");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}