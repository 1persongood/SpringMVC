<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorator"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Quản trị</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="Trang quản lý sản phẩm">
    <meta name="author" content="MHN">
    <link href="<c:url value="/Content/Admin/jquery.dataTables.min.css"/>" rel="stylesheet" />
    <!-- Bootstrap Core CSS -->
    <link href="<c:url value="/Content/Admin/bower_components/bootstrap/dist/css/bootstrap.min.css"/>" rel="stylesheet">
    <!-- MetisMenu CSS -->
    <link href="<c:url value="/Content/Admin/bower_components/metisMenu/dist/metisMenu.min.css"/>" rel="stylesheet">
    <!-- Timeline CSS -->
    <link href="<c:url value="/Content/Admin/dist/css/timeline.css"/>" rel="stylesheet">
    <!-- Custom CSS -->
    <link href="<c:url value="/Content/Admin/dist/css/sb-admin-2.css"/>" rel="stylesheet">
    <!-- Morris Charts CSS -->
    <link href="<c:url value="/Content/Admin/bower_components/morrisjs/morris.css"/>" rel="stylesheet">
    <!-- Custom Fonts -->
    <link href="<c:url value="/Content/Admin/bower_components/font-awesome/css/font-awesome.min.css"/>" rel="stylesheet" type="text/css">    
</head>
<body>
<div id="wrapper">
        <!-- Navigation -->
        <nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="/Admin/Home">Trang Quản Lý</a>
            </div>
            <!-- /.navbar-header -->
            <ul class="nav navbar-top-links navbar-right">
                <!-- /.dropdown -->
                @Html.Action("AdminProfile", "Login")
                <!-- /.dropdown -->
            </ul>
            <!-- /.navbar-top-links -->
            <div class="navbar-default sidebar" role="navigation">
                <div class="sidebar-nav navbar-collapse">
                    <ul class="nav" id="side-menu">
                        <li>
                            <a href="#"><i class="fa fa-bars"></i> Sản phẩm<span class="fa arrow"></span></a>
                            <ul class="nav nav-second-level">
                                <li>
                                    <a href="/Admin/Home/ShowListBook">Sách</a>
                                </li>
                                <li>
                                    <a href="/Admin/Home/ShowListCategory">Thể loại</a>
                                </li>
                                <li>
                                    <a href="/Admin/Home/ShowListAuthor">Tác giả</a>
                                </li>
                                <li>
                                    <a href="/Admin/Home/ShowListPublish">Nhà xuất bản</a>
                                </li>
                            </ul>
                        </li>
                        <li>
                            <a href="#"><i class="fa fa-cogs"></i> Hệ thống<span class="fa arrow"></span></a>
                            <ul class="nav nav-second-level">
                                <li>
                                    <a href="/Admin/Home/ShowUser">Tài khoản</a>
                                </li>
                                <li>
                                    <a href="/Admin/Home/Order">Đơn hàng</a>
                                </li>
                            </ul>
                        </li>
                        <li>
                            <a href="/Admin/Home/FeedBack"><i class="fa fa-file"></i> Phản hồi</a>
                        </li>
                    </ul>
                </div>
                <!-- /.sidebar-collapse -->
            </div>
            <!-- /.navbar-static-side -->
        </nav>
        <!-- Page Content -->
        <div id="page-wrapper">
            <div class="container-fluid">
               <decorator:body />
            </div>
            <!-- /.container-fluid -->
        </div>
        <!-- /#page-wrapper -->
    </div>
    <!-- /#wrapper -->
    <!-- jQuery -->
    <script src="<c:url value="/Content/Admin/bower_components/jquery/dist/jquery.min.js"/>"></script>
    
    <script src="<c:url value="/Content/Admin/js/jquery.dataTables.min.js"/>"></script>
    
    <script src="<c:url value="/Content/Admin/js/jquery.unobtrusive-ajax.min.js"/>"></script>
    <!-- Bootstrap Core JavaScript -->
    <script src="<c:url value="/Content/Admin/bower_components/bootstrap/dist/js/bootstrap.min.js"/>"></script>
    <!-- Metis Menu Plugin JavaScript -->
    <script src="<c:url value="/Content/Admin/bower_components/metisMenu/dist/metisMenu.min.js"/>"></script>   
    <!-- Custom Theme JavaScript -->
    <script src="<c:url value="/Content/Admin/dist/js/sb-admin-2.js"/>"></script>
    <script type="text/javascript">
        $(document).ready(function () {
            $('#myTable').DataTable();
            $('#thongBaoThanhCong').delay(3000).slideUp();
        });
    </script>
</body>
</html>