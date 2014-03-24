
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * 2014 Roza Infotech Inc.
 *
 */
/**
 *
 * @author Akshay Kadu <akshay@rozainfotech.com>
 */
public class Test {

    private final String url = "jdbc:mysql://localhost:3306/";
    private final String dbName = "seva";
    private final String driver = "com.mysql.jdbc.Driver";
    private final String userName = "root";
    private final String password = "";
    private Statement st;
    private Connection conn;

    public Test() {
        try {
            Class.forName(driver).newInstance();
            conn = DriverManager.getConnection(url + dbName, userName, password);
            st = conn.createStatement();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Model.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void showData() throws SQLException {
        String sql = "SELECT * FROM enquiry WHERE id = '"+5+"'";
        ResultSet rs = st.executeQuery(sql);
        //STEP 5: Extract data from result set
        while (rs.next()) {
            //Retrieve by column name
            int id = rs.getInt("id");
            String name = rs.getString("fname");
            //Display values
            System.out.print("ID: " + id);
            System.out.println("Name : " + name);
        }
    }

    public static void main(String[] args) throws SQLException {
        Test t = new Test();
        t.showData();


    }
}
