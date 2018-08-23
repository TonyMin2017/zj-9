<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: tony
  Date: 2018/8/21
  Time: 9:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>显示所有饭店</title>
  <link rel="stylesheet" href="css/bootstrap.min.css">
  <style type="text/css">
    /*自己写的样式；*/
  </style>
</head>
<body>
显示所有饭店

<table class="table table-striped table-bordered table-hover">
<tr class="table-primary">
  <th>序号</th> <th>饭店名</th>    <th>菜名</th>   <td>操作</td>

</tr>

<c:forEach items="${list}" var="f" varStatus="v">

<tr>
  <td>${v.index+1}</td>
  <td>${f.fname}</td>

  <td>


  </td>
  <td> <a  class="btn btn-info btn-sm active" role="button" href="">删除</a>  </td>

</tr>


</c:forEach>

</table>


<nav aria-label="Page navigation example">
  <ul class="pagination justify-content-center">
    <li class="page-item disabled">
      <a class="page-link" href="#" tabindex="-1">Previous</a>
    </li>
    <li class="page-item"><a class="page-link" href="#">1</a></li>
    <li class="page-item"><a class="page-link" href="#">2</a></li>
    <li class="page-item"><a class="page-link" href="#">3</a></li>
    <li class="page-item">
      <a class="page-link" href="#">Next</a>
    </li>
  </ul>
</nav>

<button type="button"  class="btn btn-primary btn-lg btn-block">批量删除</button>
</body>
</html>
