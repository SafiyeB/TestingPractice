package Practice_folder.jdbcPackage;

import java.sql.*;

public class JdbcSelect {
    public static void main(String[] args) throws Exception {


        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection con = DriverManager.getConnection("jdbc:sqlserver://184.168.194.58:1433;databaseName=crystalkeyhotels2;user=Ahmet_User;password=Ahmet123!");
        Statement st = con.createStatement();
        String q1 = "SELECT * FROM tHOTEL";
        ResultSet r1 = st.executeQuery(q1);
        while (r1.next()) {
            System.out.println(r1.getInt(1) + "," + r1.getString(3));
        }

        String q2 = "SELECT * FROM tHOTEL " +
                "WHERE IDHotel BETWEEN 0 AND 10";
        ResultSet r2 = st.executeQuery(q2);
        while (r2.next()) {

            System.out.println(r2.getInt(1) + "," + r2.getString(3));
        }
        st.close();
        r1.close();
        r2.close();
        con.close();
    }

}