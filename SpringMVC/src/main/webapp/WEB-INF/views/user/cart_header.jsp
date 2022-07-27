<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorator"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<ul class="nav navbar-nav navbar-right">
		<li><a href="<c:url value="/gio-hang"/>" style="color: #525151;"><i
				class="fa fa-shopping-cart " aria-hidden="true">
					${Cart.size()}
			</i></a></li>
	</ul>
</body>
</html>