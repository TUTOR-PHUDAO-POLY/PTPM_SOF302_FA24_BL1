<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    <form>
        Ten: <input type="text"/>
        <br/>
        <button type="submit">Search</button>
    </form>
    <br/>
    <a href="/san-pham/view-add">Add</a>
    <form>
        ID:<input type="text" value="${sanPham.id}"/>
        <br/>
        Ma:<input type="text" value="${sanPham.ma}"/>
        <br/>
        Ten:<input type="text" value="${sanPham.ten}"/>
        <br/>
        Gia:<input type="text" value="${sanPham.gia}"/>
        <br/>
        Loai:
        <select>
            <%-- selected--%>
            <%-- Ctrl Alt 0 => Xoa import thua
             Ctrl Alt L : format code--%>
            <option value="Loai 1" ${sanPham.loai == "Loai 1" ?"selected":""}>Loai 1</option>
            <option value="Loai 2" ${sanPham.loai == "Loai 2" ?"selected":""} >Loai 2</option>
            <option value="Loai 3" ${sanPham.loai == "Loai 3" ?"selected":""}>Loai 3</option>
            <option value="Loai 4" ${sanPham.loai == "Loai 4" ?"selected":""}>Loai 4</option>
        </select>

        <br/>
        <button type="submit">Add</button>
    </form>
    <table>
        <thead>
        <tr>
            <th>ID</th>
            <th>Ma</th>
            <th>Ten</th>
            <th>Loai</th>
            <th>Gia</th>
            <th>Action</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${lists}" var="sp">
            <tr>
                <td>${sp.id}</td>
                <td>${sp.ma}</td>
                <td>${sp.ten}</td>
                <td>${sp.gia}</td>
                <td>${sp.loai}</td>
                <td>
                    <a href="/san-pham/delete/${sp.id}">Delete</a>
                    <a href="/san-pham/detail/${sp.id}">Detail</a>
                    <a href="/san-pham/view-update/${sp.id}">Update</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>