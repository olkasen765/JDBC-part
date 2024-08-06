import java.sql.*;

public class ExecuteQuery02 {
    public static void main(String[] args) throws SQLException {

        // Create developers table through pgAdmin4
        // Task 1: Get all information about the developers whose salary is the lowest
        String url = "jdbc:postgresql://localhost:5432/jobcenter";
        String user = "jobcenter_user";
        String password = "qwerty1";

        Connection connection = DriverManager.getConnection(url, user, password);

        if (connection != null) {
            System.out.println("Connection is successful!");
        } else {
            System.out.println("Connection is NOT successful!");
        }

        Statement statement = connection.createStatement();

        String query1 = "SELECT * FROM developers WHERE salary = (SELECT MIN(salary) FROM developers);";

        ResultSet rs1 = statement.executeQuery(query1);

//        while (rs1.next()) {
//            System.out.println(rs1.getInt(1) + " " + rs1.getString(2) + " " + rs1.getInt(3) + " " + rs1.getString(4));
//        }

        while (rs1.next()) {
            int dev_id = rs1.getInt("id");
            String dev_name = rs1.getString("name");
            int dev_salary = rs1.getInt("salary");
            String dev_prog_lang = rs1.getString("prog_lang");

            System.out.println(dev_id + " " + dev_name + " " + dev_salary + " " + dev_prog_lang);

        }

        System.out.println("===================Task3=====================");
        // Task 1: Display names of the students and their grades if their grades are higher than the pass grade of their department

        String query2 = "SELECT name, grade, students.department FROM students JOIN departments\n" +
                "ON students.department = departments.department WHERE students.grade > departments.pass_grade;";

        ResultSet rs2 = statement.executeQuery(query2);

        while (rs2.next()) {
            String std_name = rs2.getString("name");
            int std_grade = rs2.getInt("grade");
            String std_dept = rs2.getString("department");

            System.out.println(std_name + "-" + std_grade + "-" + std_dept);

        }

        System.out.println("========= HW TASK =========");
        // Print department name and grade of department which has the second-highest pass_grade
        // 1st way: Using SUB-QUERY
        // 2nd way: Using ORDER BY


        if (connection != null){
            statement.close();
            connection.close();
            System.out.println("Connection is closed!!");
        }else {
            System.out.println("Connection is not closed");
        }







    }
}
