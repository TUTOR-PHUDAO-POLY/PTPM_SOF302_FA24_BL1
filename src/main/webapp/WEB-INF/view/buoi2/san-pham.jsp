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
    <form>
        ID:<input type="text"/>
        <br/>
        Ma:<input type="text"/>
        <br/>
        Ten:<input type="text"/>
        <br/>
        Gia:<input type="text"/>
        <br/>
        Loai:
        <select>
        </select>
        <option>Loai 1</option>
        <option>Loai 2</option>
        <option>Loai 3</option>
        <option>Loai 4</option>
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
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>