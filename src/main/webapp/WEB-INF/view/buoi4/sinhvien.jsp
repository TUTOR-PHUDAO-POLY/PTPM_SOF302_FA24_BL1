<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
<form action="/sinh-vien/add" method="post">
    MSSV: <input type="text" name="mssv"/><br/>
    Ten: <input type="text" name="ten"/><br/>
    Dia chi: <input type="text" name="diaChi"/><br/>
    Lop:
    <select name="lopHoc">
        <%-- Value => LUON LUON TRUYEN ID =>  HIEN THI NAME--%>
        <c:forEach items="${listLopHoc}" var="lop">
            <option value="${lop.id}">${lop.name}</option>
        </c:forEach>
    </select>
    <br/>
    <button type="submit">Add</button>
</form>
<table>
    <thead>
    <tr>
        <th>MSSV</th>
        <th>Ten SV</th>
        <th>Dia chi</th>
        <th>Ma lop</th>
        <th>Dia diem lop</th>
        <th>Action</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${listSV}" var="sinhvien">
        <tr>
            <td>${sinhvien.mssv}</td>
            <td>${sinhvien.name}</td>
            <td>${sinhvien.diaChi}</td>
            <td>${sinhvien.lopHoc.name}</td>
            <td>${sinhvien.lopHoc.diaDiemLopHoc}</td>
            <td></td>
            <td>
                <a href="">Detail</a>
                <a href="/sinh-vien/remove/${sinhvien.id}">Remove</a>
                <a href="">View update</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
