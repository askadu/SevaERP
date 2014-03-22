
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 *  2014 Roza Infotech Inc. 

 */
/**
 *
 * @author Akshay Kadu <akshay@rozainfotech.com>
 */
public class Model {

    private final String url = "jdbc:mysql://localhost:3306/";
    private final String dbName = "seva";
    private final String driver = "com.mysql.jdbc.Driver";
    private final String userName = "root";
    private final String password = "";
    private Statement st;
    private Connection conn;
    public Model() {
        try {
            Class.forName(driver).newInstance();
            conn = DriverManager.getConnection(url + dbName, userName, password);
            st = conn.createStatement();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Model.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public  void insert(String[] data) {
        try {
            
            int val = st.executeUpdate("insert into enquiry(`created_by`,`customer_type`, `title`, `fname`, `mname`, `lname`, `address`, `state`, `city`, `district`, `pin`, `email`, `phone`, `mobile`, `model`, `variant`, `color`) VALUES('"+data[0]+"','"+data[1]+"','"+data[2]+"','"+data[3]+"','"+data[4]+"','"+data[5]+"','"+data[6]+"','"+data[7]+"','"+data[8]+"','"+data[9]+"','"+data[10]+"','"+data[11]+"','"+data[12]+"','"+data[13]+"','"+data[14]+"','"+data[15]+"','"+data[16]+"')");
            if (val == 1) {
                System.out.print("Successfully inserted value");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Model.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
