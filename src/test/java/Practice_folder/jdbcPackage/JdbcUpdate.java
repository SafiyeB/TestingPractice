package Practice_folder.jdbcPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JdbcUpdate {

    public static void main(String[] args) throws Exception {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection con = DriverManager.getConnection("jdbc:sqlserver://184.168.194.58:1433;databaseName=crystalkeyhotels2;user=Ahmet_User;password=Ahmet123!");
        Statement st = con.createStatement();
     /*  String q1 = "INSERT INTO tHOTEL (IDHotel, Code, Name) VALUES (2 , '50000','Emir Hotel')";

        int r1 = st.executeUpdate(q1);
        System.out.println(r1 + " row inserted");


      /*  String q2 = "UPDATE tHOTEL SET Name = 'Famous Hotel' WHERE IDHotel = 1";
        int r2 = st.executeUpdate(q2);
        System.out.println(r2 + "row updated");*/

        String q3 = "SELECT * FROM tHOTEL WHERE IDHotel = 253";
        ResultSet r3 = st.executeQuery(q3);
        while (r3.next()) {
            System.out.println(r3.getInt(1) + "," + r3.getString(3));


        }
      /*  String q4 = "DELETE FROM tHOTEL WHERE IDHotel=253";
        int r4= st.executeUpdate(q4);
        System.out.println(r4);*/

        List<HotelsPojo> li = new ArrayList<>();
        li.add(new HotelsPojo(255, "Guzel Hotel", 444));
        li.add(new HotelsPojo(256, "Sirin Hotel", 445));
        li.add(new HotelsPojo(257, "Bay Hotel", 446));
        int counter = 0;
        for (HotelsPojo w : li) {
            //"INSERT INTO tHOTEL VALUES ( 255, 444, 'Guzel Hotel')

            String q5 = "INSERT INTO tHOTEL (IDHotel, Code, Name) VALUES (" + w.getIdHotel() + "," + w.getCode() + ",'" + w.getName() + "')";
            counter += st.executeUpdate(q5);
        }
        System.out.println(counter+"rows inserted");

    }
}
