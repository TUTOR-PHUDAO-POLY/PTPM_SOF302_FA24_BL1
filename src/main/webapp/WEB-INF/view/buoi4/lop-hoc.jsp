<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <thead>
    <tr>
        <td>ID</td>
        <TD>Ten</TD>
        <td>Diemn lop hoc</td>
        <td>Hanh dong</td>
    </tr>
    </thead>
    <tbody>
    <%-- Load du lieu: MSSV, TenSV, Dia CHi, Ma Lop, TenLop --%>
    <%--  2 bang
        => Load du lieu bang SV
       --%>
        <c:forEach items="${listLopHoc}" var="lophoc">
            <tr>
                <td>${lophoc.id}</td>
                <td>${lophoc.name}</td>
                <td>${lophoc.diaDiemLopHoc}</td>
                <td>
                    <a href="/lop-hoc/detail/${lophoc.id}">Detail</a>
                    <a href="/lop-hoc/detele/${lophoc.id}">Remove</a>
                    <a href="">Update</a>
                </td>
            </tr>
        </c:forEach>
    </tbody>
</table>
</body>
</html>