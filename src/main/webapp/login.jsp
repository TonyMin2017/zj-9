<%--
  Created by IntelliJ IDEA.
  User: tony
  Date: 2018/8/22
  Time: 11:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
  <link rel="stylesheet" href="css/bootstrap.min.css">
</head>
<body>
登录页面；



<form>
  <div class="form-group row">
    <label for="inputEmail3" class="col-sm-2 col-form-label">用户：</label>
    <div class="col-sm-10">
      <input type="email" class="form-control" id="inputEmail3" placeholder="请输入用户名">
    </div>
  </div>
  <div class="form-group row">
    <label for="inputPassword3" class="col-sm-2 col-form-label">密码：</label>
    <div class="col-sm-10">
      <input type="password" class="form-control" id="inputPassword3">
    </div>
  </div>


  </div>
  <div class="form-group row">
    <div class="col-sm-12">
      <button type="submit"  class="btn btn-primary btn-lg btn-block">Sign in</button>
    </div>
  </div>
</form>

</body>
</html>
