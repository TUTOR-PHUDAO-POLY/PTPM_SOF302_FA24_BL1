<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    <%--    <form>--%>
    <%--        ID:<input type="text"/>--%>
    <%--        <br/>--%>
    <%--        Ma:<input type="text"/>--%>
    <%--        <br/>--%>
    <%--        Ten:<input type="text"/>--%>
    <%--        <br/>--%>
    <%--        Gia:<input type="text"/>--%>
    <%--        <br/>--%>
    <%--        Loai:--%>
    <%--        <select>--%>
    <%--            <option>Loai 1</option>--%>
    <%--            <option>Loai 2</option>--%>
    <%--            <option>Loai 3</option>--%>
    <%--            <option>Loai 4</option>--%>
    <%--        </select>--%>

    <%--        <br/>--%>
    <%--        <button type="submit">Add</button>--%>
    <%--    </form>--%>
    <form:form action="/san-pham/add" method="post" modelAttribute="sp">
        ID: <form:input path="id"/>
        <form:errors path="id"/>
        <br/>
        Ma: <form:input path="ma"/>
        <form:errors path="ma"/>
        <br/>
        Ten: <form:input path="ten"/>
        <form:errors path="ten"/>
        <br/>
        Gia: <form:input path="gia"/>
        <form:errors path="gia"/>
        <br/>
        Loai:
        <form:select path="loai">
            <form:option value="Loai 1">Loai 1</form:option>
            <form:option value="Loai 2">Loai 2</form:option>
            <form:option value="Loai 3">Loai 3</form:option>
            <form:option value="Loai 4">Loai 4</form:option>
        </form:select>
        <form:button type="submit">Add</form:button>
    </form:form>
</div>
</body>
</html>