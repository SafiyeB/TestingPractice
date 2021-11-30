package Practice_folder.jdbcPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcCreate {

    public static void main(String[] args) throws Exception {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection con = DriverManager.getConnection("jdbc:sqlserver://184.168.194.58:1433;databaseName=crystalkeyhotels2;user=Ahmet_User;password=Ahmet123!");
        Statement st = con.createStatement();

       /* String q1 = "DROP TABLE tHOTEL";
       boolean isDropped= st.execute(q1);
        System.out.println(!isDropped);*/


    }
}
