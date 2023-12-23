package Java;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;

@WebServlet(urlPatterns = "/de")
public class DeleteServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String sl = request.getParameter("de");

        try {
            Connection conn = Java.DungCuServlet.getView();
            if ("delete dụng cụ".equals(sl)) {
                String s1 = request.getParameter("1");               
                String sql = "DELETE FROM dungcu WHERE MaDungCu = ?";
                PreparedStatement st = conn.prepareStatement(sql);
                st.setString(1, s1);               
                PrintWriter out = response.getWriter();
                int check = st.executeUpdate();
                if (check > 0) {
                    response.sendRedirect("/Web/view.jsp");
                } else {
                    out.print("delete error");
                }

            }
            if ("delete chi tiết mượn".equals(sl)) {

                String s1 = request.getParameter("1");   
                int ss1 = Integer.parseInt(s1);
                String sql = "DELETE FROM ChiTietMuon WHERE SoPhieuMuon = ?";
                PreparedStatement st = conn.prepareStatement(sql);
                st.setInt(1, ss1);                
                PrintWriter out = response.getWriter();
                int check = st.executeUpdate();
                if (check > 0) {
                    response.sendRedirect("/Web/view.jsp");
                } else {
                    out.print("delete error");
                }

            }
            if ("delete giáo viên".equals(sl)) {
                String s1 = request.getParameter("1");
                int ss1 = Integer.parseInt(s1);
                String sql = "DELETE FROM giaovien where MaGiaoVien =? ";
                PreparedStatement st = conn.prepareStatement(sql);
                st.setInt(1, ss1);               
                PrintWriter out = response.getWriter();
                int check = st.executeUpdate();
                if (check > 0) {
                    response.sendRedirect("/Web/view.jsp");
                } else {
                    out.print("delete error");
                }
            }
            if ("delete lớp".equals(sl)) {
                String s1 = request.getParameter("1");          
                int ss1 = Integer.parseInt(s1);
                String sql = "DELETE FROM lop where MaLop =?";
                PreparedStatement st = conn.prepareStatement(sql);
                st.setInt(1, ss1);               
                PrintWriter out = response.getWriter();
                int check = st.executeUpdate();
                if (check > 0) {
                    response.sendRedirect("/Web/view.jsp");
                } else {
                    out.print("delete error");
                }
            }
            if ("delete mượn".equals(sl)) {
                String s1 = request.getParameter("1");
                int ss1 = Integer.parseInt(s1);
                String sql = "DELETE FROM muon where SoPhieuMuon = ?";
                PreparedStatement st = conn.prepareStatement(sql);
                st.setInt(1, ss1);                
                PrintWriter out = response.getWriter();
                int check = st.executeUpdate();
                if (check > 0) {
                    response.sendRedirect("/Web/view.jsp");
                } else {
                    out.print("delete error");
                }

            }

        } catch (SQLException ex) {
            out.print("error");
        }
        out.close();
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}