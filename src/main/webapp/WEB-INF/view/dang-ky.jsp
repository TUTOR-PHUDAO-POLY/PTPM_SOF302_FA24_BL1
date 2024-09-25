<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!doctype html>
<html lang="vi">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Đăng kí</title>
</head>
<body>
<%--<form action="/home" method="post">--%>
<%--    MSSV: <input type="text" name="mssv">${error}<br><br>--%>
<%--    Tên: <input type="text" name="ten"><br><br>--%>
<%--    Giới tính: <input type="radio" name="gioiTinh" value="true" checked>Nam--%>
<%--    <input type="radio" name="gioiTinh" value="false">Nữ<br><br>--%>
<%--    Địa chỉ: <input type="text" name="diaChi"><br><br>--%>
<%--    <button type="submit">Đăng kí</button>--%>
<%--</form>--%>
<%--<form:form>--%>
<%--    <form:input path=""--%>
<%--</form:form>--%>
<%--Spring Form--%>
<form:form action="/home" method="post" modelAttribute="dangKyRequest" >
    MSSV: <form:input path="mssv"/>
    <form:errors path="mssv"/>
    <br/>
    <%-- Hien thi loi --%>
     Ten: <form:input path="ten"/>
    <form:errors path="ten"/>
    <br/>
    Gioi Tinh:
    <form:radiobutton path="gioiTinh" value="true" checked ="true"/> Nam
    <form:radiobutton path="gioiTinh" value="false" /> Nu
    <form:errors path="gioiTinh"/>
    <br/>
    Dia Chi: <form:input path="diaChi"/>
<%--    <form:errors path="diaChi"/>--%>
    <br/>
    <form:button type="submit">Dang ky</form:button>
</form:form>
</body>
</html>