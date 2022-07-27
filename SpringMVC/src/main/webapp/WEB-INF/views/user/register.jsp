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
<title>Đăng ký</title>
</head>
<body>
<h2>Đăng ký thành viên</h2>
	<c:if test="${ status != null }">
		<div class="row">
			<div class="col-md-12">${statuslogin}</div>
		</div>
	</c:if>
	<form:form action="dang-ky" modelAttribute="kh" method="POST">
		<div style="margin-bottom: 25px" class="input-group">
			 <label for="TaiKhoan">Tên tài khoản&nbsp;<span class="required">*</span>
			</label> 
			<form:input type="text" class="form-control" path="TaiKhoan" placeholder="Mời nhập tên tài khoản" required="required"/>
		</div>
		<div style="margin-bottom: 25px" class="input-group">
			<label for="MatKhau">Mật khẩu&nbsp; <span class="required">*</span>
			</label> <form:input type="password" path="MatKhau" class="form-control" placeholder="Mời nhập mật khẩu" required="required"/>
		</div>
		<div style="margin-bottom: 25px" class="input-group">
			 <label for="TenKH">Tên khách hàng&nbsp;<span class="required">*</span>
			</label> 
			<form:input type="text" class="form-control" path="TenKH" placeholder="Mời nhập tên khách hàng" required="required"/>
		</div>
		<div style="margin-bottom: 25px" class="input-group">
			<label for="Email">Email&nbsp; <span class="required">*</span>
			</label> <form:input type="email" path="Email" class="form-control" placeholder="Mời nhập Email" required="required"/> 
		</div>
		<div style="margin-bottom: 25px" class="input-group">
			 <label for="DiaChi">Địa chỉ&nbsp;<span class="required">*</span>
			</label> 
			<form:input type="text" class="form-control" path="DiaChi" placeholder="Mời nhập địa chỉ" required="required"/>
		</div>
		<div style="margin-bottom: 25px" class="input-group">
			<label for="DienThoai">Điện thoại&nbsp; <span class="required">*</span>
			</label> <form:input type="text" path="DienThoai" class="form-control" placeholder="Mời nhập điện thoại" required="required"/> 
		</div>
		<div style="margin-bottom: 25px" class="input-group">
			<label for="NgaySinh">Ngày Sinh&nbsp; <span class="required">*</span>
			</label> <form:input type="date" path="NgaySinh" class="form-control" placeholder="Mời nhập ngày sinh" required="required"/> 
		</div>
		<div style="margin-top: 10px" class="form-group">
			<div class="col-sm-12 controls">
				<button type="submit" class="btn btn-success" name="register"
					value="Đăng ký">Đăng ký</button>
			</div>
		</div>

	</form:form>
	
</body>
</html>