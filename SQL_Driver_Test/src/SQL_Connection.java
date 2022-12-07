import java.sql.*;

public class SQL_Connection {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DATABASE_URL = "jdbc:mysql://localhost/PROSELYTE_TUTORIALS";

    static final String USER = "ббедхре бюье хлъ онкэгнбюрекъ";
    static final String PASSWORD = "ббедхре бюь оюпнкэ";

    public static Connection Connect() throws ClassNotFoundException, SQLException {
        Connection connection = null;
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
        return connection;
    }
}