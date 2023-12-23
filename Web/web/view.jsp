<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> View list dụng cụ</title>
    </head>
    
    <div style =height: 200px; overflow-y: scroll>
    <menu>
        <button><a href="/Web/add.jsp">ADD</a></button><br>
        <button><a href="/Web/up.jsp">EDIT</a></button> 
    </menu>
    </div>
    <body>
        <h1> thêm danh sách dụng cụ </h1>
     

         <table border="1">
        <tr>
            <th>Ma dung cu</th>
            <th>Ten dung cu</th>
            <th>Ngay Mua</th>
            <th>Gia tien</th>
            <th>Con su dung duoc</th>
        </tr>
        <% 
            try {
               
                java.sql.Connection con = Java.DungCuServlet.getView();
                if (con != null) {
                    java.sql.Statement stml = con.createStatement();
                    String sql = "select * from dungcu";
                    java.sql.ResultSet rs = stml.executeQuery(sql);
                    
                    while (rs.next()) {
                        int madc = rs.getInt("MaDungCu");
                        String tendc = rs.getString("TenDungCu");
                        String nm = rs.getString("NgayMua");
                        String gt = rs.getString("GiaTien");
                        int csdd = rs.getInt("ConSuDungDuoc");
        %>
                        <tr>
                            <td><%= madc %></td>
                            <td><%= tendc %></td>
                            <td><%= nm %></td>
                            <td><%= gt %></td>
                            <td><%= csdd %></td>
                             
                            <td><form action="de" method="post">                        
                                    <input type="hidden" name="1" value="<%= madc %>"/>                        
                                    <input type="submit" name="de" value="delete dụng cụ">                    
                                </form>                
                            </td>                                                      
                        </tr>
        <%
                    }
                    rs.close();
                    con.close();
                } else {
                    out.println("Connection is null");
                }
            } catch (Exception e) {
                out.println("Error: " + e.getMessage());
            }
        %>
    </table>

        <h1> thêm danh sách chi tiết mượn </h1>
     

         <table border="1">
        <tr>
            <th>So Phieu Muon</th>
            <th>Ma Dung Cu</th>
            <th>Ngay Tra</th>
            <th>Gio Tra</th>           
        </tr>
        <% 
            try {
               
                java.sql.Connection con = Java.DungCuServlet.getView();
                if (con != null) {
                    java.sql.Statement stml = con.createStatement();
                    String sql = "select * from chitietmuon";
                    java.sql.ResultSet rs = stml.executeQuery(sql);
                    
                    while (rs.next()) {
                        int spm = rs.getInt("SoPhieuMuon");
                        int madc = rs.getInt("MaDungCu");
                        String ntr = rs.getString("NgayTra");
                        String gtr = rs.getString("GioTra");
                        
        %>
                        <tr>
                            <td><%= spm %></td>
                            <td><%= madc %></td>
                            <td><%= ntr %></td>
                            <td><%= gtr %></td>                           
                            
                            <td><form action="de" method="post">                        
                                    <input type="hidden" name="1" value="<%= spm %>"/>                        
                                    <input type="submit" name="de" value="delete chi tiết mượn">                    
                                </form>                
                            </td>                                                      
                        </tr>
        <%
                    }
                    rs.close();
                    con.close();
                } else {
                    out.println("Connection is null");
                }
            } catch (Exception e) {
                out.println("Error: " + e.getMessage());
            }
        %>
    </table>
    <h1> thêm danh sách giáo viên </h1>
     

         <table border="1">
        <tr>
            <th>Ma giao vien</th>
            <th>Ten giao vien</th>
            <th>Thuoc bo mon</th>         
        </tr>
        <% 
            try {
               
                java.sql.Connection con = Java.DungCuServlet.getView();
                if (con != null) {
                    java.sql.Statement stml = con.createStatement();
                    String sql = "select * from giaovien";
                    java.sql.ResultSet rs = stml.executeQuery(sql);
                    
                    while (rs.next()) {
                        int magv = rs.getInt("MaGiaoVien");
                        String tengv = rs.getString("TenGiaoVien");
                        String tbm = rs.getString("ThuocBoMon");                        
        %>
                        <tr>
                            <td><%= magv %></td>
                            <td><%= tengv %></td>
                            <td><%= tbm %></td>                          
                            
                            <td><form action="de" method="post">                        
                                    <input type="hidden" name="1" value="<%= magv %>"/>                        
                                    <input type="submit" name="de" value="delete giáo viên">                    
                                </form>                
                            </td>                                                      
                        </tr>
        <%
                    }
                    rs.close();
                    con.close();
                } else {
                    out.println("Connection is null");
                }
            } catch (Exception e) {
                out.println("Error: " + e.getMessage());
            }
        %>
    </table>
    <h1> thêm danh sách lớp </h1>
     

         <table border="1">
        <tr>
            <th>Ma lop</th>
            <th>Ten lop</th>
            <th>Ten lop truong</th>

        </tr>
        <% 
            try {
               
                java.sql.Connection con = Java.DungCuServlet.getView();
                if (con != null) {
                    java.sql.Statement stml = con.createStatement();
                    String sql = "select * from lop";
                    java.sql.ResultSet rs = stml.executeQuery(sql);
                    
                    while (rs.next()) {
                        int mal = rs.getInt("MaLop");
                        String tl = rs.getString("TenLop");
                        String tlt = rs.getString("TenLopTruong");                                    
        %>
                        <tr>
                            <td><%= mal %></td>
                            <td><%= tl %></td>
                            <td><%= tlt %></td>

                            
                            <td><form action="de" method="post">                        
                                    <input type="hidden" name="1" value="<%= mal %>"/>                        
                                    <input type="submit" name="de" value="delete lớp">                    
                                </form>                
                            </td>                                                      
                        </tr>
        <%
                    }
                    rs.close();
                    con.close();
                } else {
                    out.println("Connection is null");
                }
            } catch (Exception e) {
                out.println("Error: " + e.getMessage());
            }
        %>
    </table>
    <h1> thêm danh sách mượn </h1>
     

         <table border="1">
        <tr>
            <th>so phieu muon</th>
            <th>ngay muon</th>
            <th>gio muon</th>
            <th>ma lop</th>
            <th>ma giao vien</th>
        </tr>
        <% 
            try {
               
                java.sql.Connection con = Java.DungCuServlet.getView();
                if (con != null) {
                    java.sql.Statement stml = con.createStatement();
                    String sql = "select * from muon";
                    java.sql.ResultSet rs = stml.executeQuery(sql);
                    
                    while (rs.next()) {
                        int spm = rs.getInt("SoPhieuMuon");
                        String nmuon = rs.getString("NgayMuon");
                        String gmuon = rs.getString("GioMuon");
                        int mal = rs.getInt("MaLop"); 
                        int magv = rs.getInt("MaGiaoVien"); 
        %>
                        <tr>
                            <td><%= spm %></td>
                            <td><%= nmuon %></td>
                            <td><%= gmuon %></td>
                            <td><%= mal %></td>
                            <td><%= magv %></td>

                            
                            <td><form action="de" method="post">                        
                                    <input type="hidden" name="1" value="<%= spm %>"/>                        
                                    <input type="submit" name="de" value="delete mượn">                    
                                </form>                
                            </td>                                                      
                        </tr>
        <%
                    }
                    rs.close();
                    con.close();
                } else {
                    out.println("Connection is null");
                }
            } catch (Exception e) {
                out.println("Error: " + e.getMessage());
            }
        %>
    </table> 
    </body>   
</html>