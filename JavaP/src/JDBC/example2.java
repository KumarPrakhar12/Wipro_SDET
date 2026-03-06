package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class example2 {
	
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
            
            System.out.printf("%-5s %-10s %-10s %-10s\n", "ID", "NAME", "DEPT", "SALARY");

            
            while (rs.next()) {
                int id = rs.getInt("Emp_ID");
                String name = rs.getString("Emp_Name");
                
                String dept = rs.getString("department");
                int salary = rs.getInt("salary");
                


                System.out.printf("%-5d %-10s %-10s %-10s\n", id, name, dept, salary);
            }

            
           
            con.close();

        } catch (Exception e) {
        	System.out.println(e);
        }
    }

}
