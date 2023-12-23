package Java;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet(name="LoginServlet", urlPatterns={"/Login"})
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
    throws ServletException, IOException {
        String u = req.getParameter("txtU");
        String p = req.getParameter("txtP");
        PrintWriter out = res.getWriter();
        if (u.equalsIgnoreCase("Phat") && p.equalsIgnoreCase("123456")){
            out.print("<body align=\"center\">");
            out.print("<h1> Hello "+u+"</h1>");
            out.print("<menu>");              
            String view1 = "<a href=\"http://localhost:9999/Web/view.jsp\">view and edit dung cu</a>";
            out.print( "<button>"+ view1+ " </button>");     
            
            out.print("</menu>");
            out.print("</body>");
    }else{

            String link = "<form action=\"http://localhost:9999/Web/Login.html\">\n" +"<button type=\"submit\">Login</button>" +"</form>";
            out.print("<h1>Enter wrong, login again"+link+ "</h1>");     
        }

    }
    }