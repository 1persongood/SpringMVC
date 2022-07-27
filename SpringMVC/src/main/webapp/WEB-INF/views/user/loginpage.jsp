<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorator"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
<ul class="nav navbar-nav navbar-right">
    <c:if test="${ empty InfoUser }">
        <li><a href="<c:url value="/dang-ky"/>" style="color: #525151;"> Đăng kí</a></li>
            <li class="dropdown">
                <a href="<c:url value="/dang-nhap"/>" style="color: #525151;" > Đăng nhập </a>
               <!--  <ul class="dropdown-menu" style="padding: 15px;min-width: 250px">
					
					<li>
                        <div class="row">
                            <div class="col-md-12">
								<form:form action="loginpage" modelAttribute="user" method="post">
									<div class="form-group">
										<label for="username">Tên tài khoản&nbsp;<span class="required">*</span></label>
										<input type="text" path="TaiKhoan" placeholder="Mời nhập tên tài khoản" />
									</div>
									<div class="form-group">
										<label for="password">Mật khẩu&nbsp;<span class="required">*</span></label> <span>
											<input type="password" path="MatKhau" placeholder="Mời nhập mật khẩu" /> <span></span>
										</span>
									</div>


									<div class="checkbox">
										<label >
											<input name="rememberme" type="checkbox" id="rememberme" value="forever"> <span>Ghi nhớ?</span>
										</label>
									</div>
									<div class="form-group">
										<button style="background-color:#0094ff" type="submit" class="btn btn-success btn-block" name="login" value="Đăng nhập">Đăng nhập</button>
										
									</div>
									
								</form:form>
								
                            </div>
                        </div>
                    </li>
                </ul> -->
            </li>
            <li>
                <a href="/Admin/Login"><i class="fa fa-user-secret" aria-hidden="true" style="color: #525151;"></i></a>
            </li>
			
			<%@include file="/WEB-INF/views/user/cart_header.jsp" %>
		</c:if>
    <c:if test="${ not empty InfoUser }">
        <li class="dropdown">
            <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                <i class="fa fa-user-o" aria-hidden="true"></i> Tài Khoản : ${InfoUser.tenKH} <i class="fa fa-caret-down"></i>
            </a>
            <ul class="dropdown-menu dropdown-user">
                <li>
                    <a href="/User/EditUser"><i class="fa fa-smile-o" style="margin-right: 5px;" aria-hidden="true"></i> Hồ sơ</a>
                </li>
                <li><a href="/Cart"><i class="fa fa-cart-plus" style="margin-right: 6px;" aria-hidden="true"></i>Giỏ Hàng</a></li>
                <li>
                    <a href="/Cart/TrackingOder"><i class="fa fa-archive"></i> Đơn Hàng</a>
                </li>
                <li>
                    <a href="<c:url value="/dang-xuat"/>"><i class="fa fa-sign-out fa-fw"></i> Đăng xuất</a>
                </li>
            </ul>
            <!-- /.dropdown-user -->
        </li>
    </c:if>

</ul>
</body>
</html>