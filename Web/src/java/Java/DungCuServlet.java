package Java;
import jakarta.servlet.http.HttpServlet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author hieu0
 */

public class DungCuServlet extends HttpServlet {
     private static final long serialVersionUID = 1L;

    public static Connection getView() {
      try 
        {  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/truongcap3", "root", "1234");  
            return con;
        }
      catch(ClassNotFoundException | SQLException e){
           Connection con = null;
          return con;
}
    }

}