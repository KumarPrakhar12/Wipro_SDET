package JDBC;

import java.sql.*;

public class example3 {
	
	public static void main(String[] args) {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/officedb",
                    "root",
                    "Kprakhar@12"
            );

            
            Statement stmt = con.createStatement();

           
            String createTable = "CREATE TABLE IF NOT EXISTS employee12 ("
                    + "id INT PRIMARY KEY, "
                    + "name VARCHAR(50), "
                    + "department VARCHAR(50), "
                    + "salary DOUBLE, "
                    + "location VARCHAR(50))";

            stmt.executeUpdate(createTable);
            System.out.println("Table 'employee' created successfully!");

           
            String insertData1 = "INSERT INTO employee12 VALUES(101, 'Arjun', 'IT', 45000, 'Bhopal')";
            String insertData2 = "INSERT INTO employee12 VALUES(102, 'Neha', 'IT', 52000, 'Indore')";
            String insertData3 = "INSERT INTO employee12 VALUES(103, 'Suman', 'HR', 30000, 'Delhi')";
            String insertData4 = "INSERT INTO employee12 VALUES(104, 'Rohit', 'HR', 38000, 'Mumbai')";
            String insertData5 = "INSERT INTO employee12 VALUES(105, 'Kavita', 'Finance', 65000, 'Pune')";

            stmt.executeUpdate(insertData1);
            stmt.executeUpdate(insertData2);
            stmt.executeUpdate(insertData3);
            stmt.executeUpdate(insertData4);
            stmt.executeUpdate(insertData5);

            System.out.println("Data inserted successfully!");
            
            String updateSQL = "UPDATE employee12 SET salary = 55000 WHERE name = 'Neha'";
            stmt.executeUpdate(updateSQL);
            
            ResultSet rs = stmt.executeQuery("SELECT * FROM employee");
            
            System.out.printf("%-5s %-10s %-10s %-10s %-10s\n", "ID", "NAME", "DEPT", "SALARY", "LOCATION");
            
            while (rs.next()) {
                System.out.printf("%-5d %-10s %-10s %-10.2f %-10s\n",
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("department"),
                        rs.getDouble("salary"),
                        rs.getString("location"));
            }

            

            
            con.close();

        }
        
        catch (Exception e) {
        	System.out.println(e);
        }

}
            
           
        
       

}

