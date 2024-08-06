import java.sql.*;

public class ExecuteQuery01 {
    public static void main(String[] args) throws SQLException {

//        Step 1: Create connection with the DB
        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/jobcenter", "jobcenter_user", "qwerty1");

        if (connection != null) {
            System.out.println("Connection is successful!");
        } else {
            System.out.println("Connection is NOT successful!");
        }

//        2. Create a statement
        Statement statement = connection.createStatement();

//        3. Execute the query
        // Task 1: Get the country_name from countries table where id is between 3 and 9
        String query1 = "SELECT country_name, id FROM countries WHERE id BETWEEN 3 AND 9;";
        ResultSet rs1 = statement.executeQuery(query1);

        // System.out.println("rs1 = " + rs1); // org.postgresql.jdbc.PgResultSet@30b8a058

//        System.out.println(rs1.next());  // true
//        System.out.println(rs1.getInt("id")); // 3
//        System.out.println(rs1.getString("country_name")); // Algeria
//        System.out.println(rs1.next()); // true
//        System.out.println(rs1.getInt("id")); // 4
//        System.out.println(rs1.getString("country_name")); // Argentina


        while (rs1.next()){
            // System.out.println(rs1.getString("country_name") + " - " + rs1.getInt("id"));
            // we can also use index of the column (as used in th query)
            System.out.println(rs1.getString(1) + " - " + rs1.getInt(2));
        }

        System.out.println("===================Task2=====================");
        // Task 2: Get phone_code and country_name from the countries table where code is greater than 500
        String query2 = "SELECT phone_code, country_name FROM countries WHERE phone_code > 500;";
        ResultSet rs2 = statement.executeQuery(query2);

        while (rs2.next()) {
            System.out.println(rs2.getInt(1) + " " + rs2.getString(2));
        }





//        4. Close the connection
        if (connection != null){
            statement.close();
            connection.close();
            System.out.println("Connection is closed!!");
        }else {
            System.out.println("Connection is not closed");
        }
















    }
}
