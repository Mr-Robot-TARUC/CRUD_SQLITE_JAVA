import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class case2Insert {
    public static void main(String[] args) {
        Connection connection = null;
        try {
            // create a database connection
            connection = DriverManager.getConnection("jdbc:sqlite:ex1.db");
            Statement statement = connection.createStatement();
            statement.setQueryTimeout(30); // set timeout to 30 sec.
            ResultSet rs = statement.executeQuery("select * from person");
            int total_Count = 0;
            String INPUT;
            while (rs.next()) {
                // read the result set

                System.out.println("name = " + rs.getString("name"));
                System.out.println("id = " + rs.getInt("id"));
                total_Count += 1;
            }
            total_Count += 1;
            System.out.println("Enter The Name:\n ");
            Scanner scanner = new Scanner(System.in);
            INPUT = scanner.nextLine();

            scanner.close();

            statement.executeUpdate("insert into person values(" + total_Count + ", '" + INPUT + "')");

            System.out.println("Update Successfully...");

        } catch (SQLException e) {
            // if the error message is "out of memory",
            // it probably means no database file is found
            System.err.println(e.getMessage());
        } finally {
            try {
                if (connection != null)
                    connection.close();
            } catch (SQLException e) {
                // connection close failed.
                System.err.println(e.getMessage());
            }
        }
    }

}
