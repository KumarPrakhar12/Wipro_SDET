package JDBC;

import java.sql.*;

public class preparedStatement {
	
	public static void main(String[] args) {

        try {
           
            Class.forName("com.mysql.cj.jdbc.Driver");

            
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/office_db",
                    "root",
                    "Kprakhar@12"
            );

            
            String insertSQL = "INSERT INTO EMP (Emp_ID, Emp_Name, Department, Salary, Location) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement psInsert = con.prepareStatement(insertSQL);

            
            psInsert.setInt(1, 106);            
            psInsert.setString(2, "Rahul");     
            psInsert.setString(3, "IT");        
            psInsert.setInt(4, 48000);          
            psInsert.setString(5, "Bhopal");    

            psInsert.executeUpdate();
            System.out.println("New employee inserted successfully!\n");

            
            String selectSQL = "SELECT Emp_ID, Emp_Name, Department, Salary, Location FROM employee";
            PreparedStatement psSelect = con.prepareStatement(selectSQL);

            ResultSet rs = psSelect.executeQuery();

            
            System.out.println("Employee Details:");
            System.out.printf("%-5s %-10s %-12s %-10s %-10s\n", "ID", "NAME", "DEPARTMENT", "SALARY", "LOCATION");
            System.out.println("-----------------------------------------------------------");

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
