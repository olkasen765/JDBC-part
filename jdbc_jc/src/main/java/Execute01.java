import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Execute01 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        /*
        NOTES:
        * pgAdmin4 is used for MANUAL Test of the DB
        * JDBC driver is used for AUTOMATION TEST of db

        To connect with the DB, follow these steps:
        Step 1: Register the class with the Driver (optional)
        Step 2: Create connection with the DB (using given credentials)
        Step 3: Create a statement
        Step 4: Execute the query
        Step 5: Close the connection

         */

//        Step 1: Register the class with the Driver (optional since Java 7)
        Class.forName("org.postgresql.Driver");

//        Step 2: Create connection with the DB (using given credentials)
        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/jobcenter", "jobcenter_user", "qwerty1");

        if (connection != null) {
            System.out.println("Connection is successful!");
        } else {
            System.out.println("Connection is NOT successful!");
        }

//        Step 3: Create a statement
        Statement statement = connection.createStatement();

//        Step 4: Execute the query
        System.out.println(statement.execute("CREATE TABLE IF NOT EXISTS employees (employee_id INT, employee_name VARCHAR (30), salary INT);"));

        /*
        NOTES:
        1. execute() method returns boolean
        2. This method can be used with DDL (CREATE, ALTER, DROP table etc.) DML (ADD, UPDATE data) and DQL (SELECT)
        3. execute() method with DDL and DML => ALWAYS returns 'false' because the query is executed but no resultSet is created
        4. execute() method with DQL => can return TRUE or FALSE
                                        With SELECT statements, execute() checks if resultSet is created or not.
                                        Because, resultSet is created it will return true.
         */

        // Add a column to the employees table
        String query = "ALTER TABLE employees ADD COLUMN IF NOT EXISTS employees_address VARCHAR (50);";

        boolean sql1 = statement.execute(query);
        System.out.println("sql1 = " + sql1); // false because no resultSet as produced.

        // Read the data from the table
        boolean sql2 = statement.execute("SELECT * FROM employees;");
        System.out.println("Table with no data: " + sql2);
        // true because SELECT statement is DQL and resultSet is generated and execute() method is telling us that 'yes' resultSet is generated

        // Add some data into this table
        boolean sql3 = statement.execute("INSERT INTO employees VALUES(101, 'John Doe', 9000, 'Hendon, UK');");
        System.out.println("Table after entering the data = " + sql3); // false

        // Drop the table
        boolean sql4 = statement.execute("DROP TABLE employees;");
        System.out.println("sql4 = " + sql4); // false, because execute() is used with DDL

//        Step 5: Close the connection
        if (connection != null) {
            statement.close();
            connection.close();
            System.out.println("Connection is CLOSED");
        } else {
            System.out.println("Connection is NOT closed");
        }


    }


}
