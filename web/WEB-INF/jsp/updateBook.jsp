<%--
  Created by IntelliJ IDEA.
  User: 91156
  Date: 2020/10/22
  Time: 17:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改书籍</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 colume">
            <div class="page-header">
                <h1>
                    <small>
                        修改书籍
                    </small>
                </h1>
            </div>
        </div>
    </div>
    <form action="${pageContext.request.contextPath}/book/updateBook" method="post">

        <%--出现的问题，提交了修改的sql请求，但是修改失败 配置完事务依然完毕 看一下sql语句能否执行成功--%>

            <input type="hidden" name="bookID" value="${QBook.bookID}">
        <div class="form-group">
            <label>书籍名称</label>
            <input type="text" name="bookName" class="form-control" value="${QBook.bookName}" required>
        </div>
        <div class="form-group">
            <label>书籍数量</label>
            <input type="text" name="bookCounts" class="form-control" value="${QBook.bookCounts}" required>
        </div>
        <div class="form-group">
            <label>书籍描述</label>
            <input type="text" name="detail" class="form-control" value="${QBook.detail}" required>
        </div>
        <div class="form-group">
            <input type="submit" class="form-control" value="修改">
        </div>


    </form>
</div>
</body>
</html>
