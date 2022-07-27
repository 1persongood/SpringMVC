<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" 
    prefix="decorator" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="BookStore">
    <meta name="author" content="VHP">
    <title><decorator:title default="Master-layout"></decorator:title></title>
    <!-- Bootstrap Core CSS -->
    <link href="<c:url value="/Content/Client/css/bootstrap.css"/>" rel="stylesheet" />
    <!-- Custom CSS -->
    <link href="<c:url value="/Content/Client/css/shop-homepage.css"/>" rel="stylesheet" />
    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    <link href="<c:url value="/Content/font-awesome-4.6.3/css/font-awesome.min.css"/>" rel="stylesheet" />
    
    <link href="<c:url value="/Content/Client/css/jquery.dataTables.min.css"/>" rel="stylesheet" />
    
    <link href="<c:url value="/Content/Client/css/footer.css"/>" rel="stylesheet" />
</head>
<body style="background-color: #F0F0F0;border-bottom: none;">
    
    <%@include file="/WEB-INF/views/layouts/user/header.jsp" %>
    	
    	<decorator:body />
    
    <%@include file="/WEB-INF/views/layouts/user/footer.jsp" %>
    
    <!-- jQuery -->
    <script src="<c:url value="/Content/Client/js/jquery.js"/>"></script>
    
    <script src="<c:url value="/Content/Client/js/jquery.dataTables.min.js"/>"></script>
    
    <!-- Bootstrap Core JavaScript -->
    <script src="<c:url value="/Content/Client/js/bootstrap.min.js"/>"></script>
    <script type="text/javascript">$(document).ready(function () {
            $('#thongBaoThanhCong').delay(3000).slideUp();
        });</script>
   <!--  @RenderSection("jsFooter", required: false) -->
</body>
</html>