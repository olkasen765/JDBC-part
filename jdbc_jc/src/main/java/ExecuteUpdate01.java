import java.sql.*;

public class ExecuteUpdate01 {
    public static void main(String[] args) throws SQLException {

        // Create the connection
        String url = "jdbc:postgresql://localhost:5432/jobcenter";
        String user = "jobcenter_user";
        String password = "qwerty1";

        Connection connection = DriverManager.getConnection(url, user, password);
        if (connection != null){
            System.out.println("Connection is successful!");
        }else {
            System.out.println("Connection is not successful!");
        }
        // Create the statement
        Statement statement = connection.createStatement();
        // Execute the query
        // Task 1: -- Update salaries of developers whose salaries are less than average salary with average salary
//        String query1 = "UPDATE developers SET salary = (SELECT AVG(salary) FROM developers) WHERE salary < (SELECT AVG(salary) FROM developers);";
//        // 5410.5
//
//        int noOfRowsUpdated = statement.executeUpdate(query1);
//        System.out.println("Number Of Rows Updated = " + noOfRowsUpdated); // 13

        String query2 = "SELECT * FROM developers;";
        ResultSet rs2 = statement.executeQuery(query2);

        // to reach to the data
        while (rs2.next()){
            String dev_name = rs2.getString("name");
            int dev_id = rs2.getInt("id");
            int dev_salary = rs2.getInt("salary");
            String dev_prog_lang = rs2.getString("prog_lang");

            System.out.println(dev_id +" - "+ dev_name +" - "+ dev_salary +" - "+dev_prog_lang);
        }

        // Close the connection and statement
        if (connection != null){
            statement.close();
            connection.close();
            System.out.println("Connection is closed!!");
        }else {
            System.out.println("Connection is not closed");
        }
    }
}
