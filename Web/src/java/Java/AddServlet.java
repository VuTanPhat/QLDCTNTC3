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

/**
 *
 * @author hieu0
 */
@WebServlet(urlPatterns = "/add")
public class AddServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String sl = request.getParameter("add");

        try {
            Connection conn = Java.DungCuServlet.getView();
            if ("thêm dụng cụ".equals(sl)) {
                String s1 = request.getParameter("1");
                int ss1 = Integer.parseInt(s1);
                String s2 = request.getParameter("2");
                String s3 = request.getParameter("3");
                String s4 = request.getParameter("4");
                String s5 = request.getParameter("5");
                int ss5 = Integer.parseInt(s5);
                String sql = "INSERT INTO dungcu (MaDungCu, TenDungCu, NgayMua, GiaTien, ConSuDungDuoc) VALUES (?, ?, ?, ?, ?)";
                PreparedStatement st = conn.prepareStatement(sql);
                
                st.setInt(1, ss1);
                
                st.setString(2, s2);
                st.setString(3, s3);
                st.setString(4, s4);
                st.setInt(5, ss5);
                PrintWriter out = response.getWriter();
                int check = st.executeUpdate();
                if (check > 0) {
                    response.sendRedirect("/Web/view.jsp");
                } else {
                    out.print("data error");
                }
                
            }
            if ("thêm danh sách chi tiết mượn".equals(sl)) {

                String s1 = request.getParameter("1");
                int ss1 = Integer.parseInt(s1);
                String s2 = request.getParameter("2");
                int ss2 = Integer.parseInt(s2);
                String s3 = request.getParameter("3");
                String s4 = request.getParameter("4");
                String sql = "INSERT INTO chitietmuon (SoPhieuMuon, MaDungCu, NgayTra, GioTra) VALUES (?, ?, ?, ?)";
                PreparedStatement st = conn.prepareStatement(sql);
                st.setInt(1, ss1);
                st.setInt(2, ss2);
                st.setString(3, s3);
                st.setString(4, s4);
                PrintWriter out = response.getWriter();
                int check = st.executeUpdate();
                if (check > 0) {
                    response.sendRedirect("/Web/view.jsp");
                } else {
                    out.print("data error");
                }

            }
            if ("thêm danh sách giáo viên".equals(sl)) {
                String s1 = request.getParameter("1");
                int ss1 = Integer.parseInt(s1);
                String s2 = request.getParameter("2");
                String s3 = request.getParameter("3");
                String sql = "INSERT INTO giaovien (MaGiaoVien, TenGiaoVien, ThuocBoMon) VALUES (?, ?, ?, ?)";
                PreparedStatement st = conn.prepareStatement(sql);
                st.setInt(1, ss1);
                st.setString(2, s2);
                st.setString(3, s3);
                PrintWriter out = response.getWriter();
                int check = st.executeUpdate();
                if (check > 0) {
                    response.sendRedirect("/Web/view.jsp");
                } else {
                    out.print("data error");
                }
            }
            if ("thêm danh sách lớp".equals(sl)) {
                String s1 = request.getParameter("1");
                String s2 = request.getParameter("2");
                String s3 = request.getParameter("3");
                int ss1 = Integer.parseInt(s1);
                String sql = "INSERT INTO lop (MaLop, TenLop, TenLopTruong) VALUES (?, ?, ?)";
                PreparedStatement st = conn.prepareStatement(sql);
                st.setInt(1, ss1);
                st.setString(2, s2);
                st.setString(3, s3);
                PrintWriter out = response.getWriter();
                int check = st.executeUpdate();
                if (check > 0) {
                    response.sendRedirect("/Web/view.jsp");
                } else {
                    out.print("data error");
                }
            }
            if ("thêm danh sách mượn".equals(sl)) {
                String s1 = request.getParameter("1");
                String s2 = request.getParameter("2");
                String s3 = request.getParameter("3");
                String s4 = request.getParameter("4");
                String s5 = request.getParameter("5");
                int ss1 = Integer.parseInt(s1);
                int ss4 = Integer.parseInt(s4);
                int ss5 = Integer.parseInt(s5);
                String sql = "INSERT INTO muon (SoPhieuMuon, NgayMuon, GioMuon, MaLop, MaGiaoVien) VALUES (?, ?, ?, ?, ?)";
                PreparedStatement st = conn.prepareStatement(sql);
                st.setInt(1, ss1);
                st.setString(2, s2);
                st.setString(3, s3);
                st.setInt(4, ss4);
                st.setInt(5, ss5);
                PrintWriter out = response.getWriter();
                int check = st.executeUpdate();
                if (check > 0) {
                    response.sendRedirect("/Web/view.jsp");
                } else {
                    out.print("data error");
                }

            }
        } catch (SQLException ex) {
            out.print("data error");
        }
        out.close();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

}