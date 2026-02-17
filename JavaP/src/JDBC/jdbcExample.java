package JDBC;

import java.sql.*;

public class jdbcExample {
	public static void main(String[] args) {

        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");

            
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/officedb",
                    "root",
                    "Kprakhar@12"
            );

            System.out.println("Database connected successfully");

            
            Statement stmt = con.createStatement();

           
            ResultSet rs = stmt.executeQuery("SELECT * FROM EMP");
            
            System.out.println("ID | NAME | DEPT | SALARY");

            
            while (rs.next()) {
                int Emp_ID = rs.getInt("Emp_ID");
                String name = rs.getString("Emp_Name");
                
                String department = rs.getString("department");
                int salary = rs.getInt("salary");
                


                System.out.println(Emp_ID + " " + name + " " + department + " " + salary);
            }

            
           
            con.close();

        } catch (Exception e) {
        	System.out.println(e);
        }
    }
      
}
