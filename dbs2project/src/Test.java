import java.sql.*;
public class Test {
    public static void main(String[] a)
            throws Exception {
        Class.forName("org.h2.Driver");
        Connection conn = DriverManager.
            getConnection("jdbc:h2:data/skiresort", "randoms", "randoms");
        
        System.out.println("jsem pripojenej kamo cas udelat statementy");
        // add application code here
        conn.close();
    }
}
