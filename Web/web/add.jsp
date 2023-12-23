<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>them moi</title>
    </head>
    <body>
    <p align="center">them moi dung cu</p>
    <form action="add" method="post" align="center">
    <input type="number" name="1" placeholder="Mã dụng cụ"><br>
    <input type="text" name="2" placeholder="Tên dụng cụ"><br>
    <input type="datetime-local" name="3" placeholder="Ngày mua"><br>
    <input type="text" name="4" placeholder="Giá tiền"><br>
    <input type="number" name="5" placeholder="Còn sử dụng được"><br>
    <input type="submit" name="add" value="thêm dụng cụ">
</form>
    <p align="center">them moi chi tiet muon </p>
        <form action="add" method="post" align="center" >
            <input type="number" name="1" placeholder="Số Phiếu Mượn"><br>
            <input type="number" name="2" placeholder="Mã dụng cụ"><br>
            <input type="datetime-local" name="3" placeholder="Ngày trả"><br>
            <input type="time" name="4" placeholder="Giờ trả"><br>
            <input type="submit" name ="add" value="thêm danh sách chi tiết mượn">
        </form>
    <p align="center">them moi danh sach giao vien </p>
        <form action="add" method="post" align="center" >
            <input type="number" name="1" placeholder="Mã giáo viên"><br>
            <input type="text" name="2" placeholder="Tên giáo viên"><br>
            <input type="text" name="3" placeholder="Thuộc bộ môn"><br>
            <input type="submit" name ="add" value="thêm danh sách giáo viên">
        </form>
    <p align="center">them moi lop </p>
        <form action="add" method="post" align="center" >
            <input type="number" name="1" placeholder="Mã lớp"><br>
            <input type="text" name="2" placeholder="Tên lớp"><br>
            <input type="text" name="3" placeholder="Tên lớp trưởng"><br>
            <input type="submit" name ="add" value="thêm danh sách lớp">
        </form>
    <p align="center">them moi muon </p>
        <form action="add" method="post" align="center" >
            <input type="number" name="1" placeholder="Số phiếu mượn"><br>
            <input type="datetime-local" name="2" placeholder="Ngày mượn"><br>
            <input type="time" name="3" placeholder="Giờ mượn"><br>
            <input type="number" name="4" placeholder="Mã lớp"><br>
            <input type="number" name="5" placeholder="Mã giáo viên"><br>
            <input type="submit" name ="add" value="thêm danh sách mượn">
        </form>
    </body>
</html>