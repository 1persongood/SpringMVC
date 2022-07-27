<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorator"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Đăng nhập</title>
</head>
<body>
	<div id="loginbox" style="margin-top: 50px;"
		class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">
		<div class="panel panel-info">
			<div class="panel-heading">
				<div class="panel-title">Đăng nhập</div>
			</div>
			
			<div style="padding-top: 30px" class="panel-body">
				<div style="display: none" id="login-alert"
					class="alert alert-danger col-sm-12"></div>
				<c:if test="${not empty statuslogin }">
					<div class="row">
						<div class="col-md-12">${statuslogin}</div>
					</div>
				</c:if>
				<form:form action="dang-nhap" modelAttribute="kh" method="POST">
					<div style="margin-bottom: 25px" class="input-group"><span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
						<label for="username">Tên tài khoản&nbsp;<span
							class="required">*</span></label>
						<form:input type="text" class="form-control" path="TaiKhoan" placeholder="Mời nhập tên tài khoản" required="required"/>
					</div>
					<div style="margin-bottom: 25px" class="input-group">
					<span class="input-group-addon"><i
						class="glyphicon glyphicon-lock"></i></span>
						<label for="password">Mật khẩu&nbsp;<span class="required">*</span></label>
						<form:input type="password" path="MatKhau" class="form-control"
								placeholder="Mời nhập mật khẩu" required="required"/> 
					</div>

					<div class="input-group">
					<div class="checkbox">
						<label> <input name="rememberme" type="checkbox"
							id="rememberme" value="forever"> <span>Ghi nhớ?</span>
						</label>
					</div>
					</div>
					<div style="margin-top: 10px" class="form-group">
					<div class="col-sm-12 controls">
						<button type="submit" class="btn btn-success" name="login" value="Đăng nhập">Đăng
							nhập</button>
					</div>
					</div>
					
					<div class="form-group">
					<div class="col-md-12 control">
						<div
							style="border-top: 1px solid #888; padding-top: 15px; font-size: 85%">
							Bạn không có tài khoản! <a href="<c:url value="/dang-ky"/>">Đăng kí tại
								đây</a>
						</div>
					</div>
				</div>
				</form:form>
				


				
			</div>
		</div>
	</div>
</body>
</html>