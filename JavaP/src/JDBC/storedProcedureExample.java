package JDBC;

import java.sql.*;

public class storedProcedureExample {
	
 
	public static void main(String[] args) {
		
		try {
           
            Class.forName("com.mysql.cj.jdbc.Driver");

           
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/office_db",
                    "root",
                    "Kprakhar@12"  
            );

            
            CallableStatement cs = con.prepareCall("{CALL getAllEmployees()}");

           
            cs.execute();

            
            ResultSet rs = cs.getResultSet();

            System.out.println("Employee Details:");
            System.out.printf("%-5s %-10s %-12s %-10s %-10s\n", "ID", "NAME", "DEPARTMENT", "SALARY", "LOCATION");

            while (rs.next()) {
            	System.out.printf("%-5d %-10s %-12s %-10d %-10s\n",
                        rs.getInt("Emp_ID"),      
                        rs.getString("Emp_Name"),  
                        rs.getString("Department"),
                        rs.getInt("Salary"),      
                        rs.getString("Location"));
            }

            
            con.close();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

 

}
}
