# JDBC

JDBC, which stands for **Java Database Connectivity**, is a Java API that provides a standard interface for connecting Java applications with relational databases. It allows Java programs to execute SQL queries, retrieve results, and interact with databases in a platform-independent manner. Here are some key points about JDBC:

1. **Driver Manager**: JDBC provides a `DriverManager` class, which is used to manage database drivers. Database vendors provide JDBC drivers that implement the JDBC API and allow Java applications to connect to their databases. The `DriverManager` class is responsible for loading the appropriate driver and establishing database connections.

2. **Connection**: The `Connection` interface represents a connection to a database. A connection object is obtained using the `DriverManager.getConnection()` method by providing the database URL, username, and password. Once a connection is established, SQL statements can be executed against the database.

3. **Statement**: JDBC supports two types of statements: `Statement` and `PreparedStatement`. `Statement` objects are used to execute SQL queries and updates directly, while `PreparedStatement` objects are precompiled SQL statements that can be reused with different parameter values, providing better performance and security against SQL injection attacks.

4. **ResultSet**: The `ResultSet` interface represents the result set of a database query. It provides methods for iterating over the rows of the result set and retrieving column values. `ResultSet` objects are obtained by executing SQL queries using `Statement` or `PreparedStatement` objects.

5. **Transaction Management**: JDBC supports transaction management through the `Connection` interface. Applications can control transaction boundaries by explicitly starting, committing, or rolling back transactions using the `commit()` and `rollback()` methods.

6. **Exception Handling**: JDBC methods can throw `SQLException` to indicate errors encountered during database operations. Applications should handle exceptions gracefully by catching and handling `SQLExceptions` appropriately.

Here's a simple example demonstrating how to use JDBC to connect to a database, execute a query, and retrieve results:

```java
import java.sql.*;

public class JDBCDemo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "username";
        String password = "password";

        try (Connection connection = DriverManager.getConnection(url, username, password);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT * FROM mytable")) {

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                System.out.println("ID: " + id + ", Name: " + name);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
```

In this example, we connect to a MySQL database using the JDBC URL `"jdbc:mysql://localhost:3306/mydatabase"`, username, and password. We then create a `Statement` object and execute a SELECT query to retrieve data from the "mytable" table. Finally, we iterate over the `ResultSet` to retrieve and print the results.