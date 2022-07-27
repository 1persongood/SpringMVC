<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorator"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sản phẩm</title>
</head>
<body>
	<div class="row">
		<c:forEach var="item" items="${sach}" begin="0" end="0">
			<div style="float: left; margin-right: 15px; margin-left: 80px;"
				class="span5">
				<img src="<c:url value="/Content/images/${item.anhBia}"/>"
					alt="${item.anhBia}" width="180" height="250" />
			</div>
			<div style="max-width: 600px; float: left;" class="span7">
				<h2>${item.tenSach}</h2>
				<h4 class="muted">Thể loại : <c:forEach var="item1" items="${tentheloai}" begin="0" end="0">${item1.tenLoai}</c:forEach> - Tác giả:
					<c:forEach var="item2" items="${tentg}" begin="0" end="0">${item2.tenTG}</c:forEach></h4>
				<p>Nhà xuất bản : <c:forEach var="item3" items="${tennxb}" begin="0" end="0">${item3.tenNXB}</c:forEach></p>
				<!-- <p>moTa</p> -->
				<hr>
				<c:if test="${item.soLuongTon>0}">
				<p>Tình trạng: Còn hàng - Số lượng: ${item.soLuongTon}</p>
				</c:if>
				<c:if test="${item.soLuongTon<=0}">
				<p>Tình trạng: Liên hệ</p>
				</c:if>
				<c:if test="${item.giaBan>0}">
					<h3>Giá - ${item.getGiaBan()}VNĐ</h3>
				</c:if>
				<c:if test="${item.giaBan<=0}">
					<h3>Giá - Liên hệ</h3>
				</c:if>
				<br>
				<p>
				<form action="<c:url value="/AddCart/${item.maSach}"/>" method="get" enctype="multipart/form-data">
					 <button type="submit" class="btn btn-warning btn-large">THÊM
						VÀO GIỎ HÀNG</button>
                </form>
					
				</p>
				
			</div>
		</c:forEach>
	</div>




	<hr />
	<h3>Sách bán chạy</h3>
	<div class="row">
					<c:forEach var="item" items="${sachbanchay}">
						<div class="col-sm-4 col-lg-4 col-md-4">
						<div class="thumbnail">
							<a title="${item.tenSach}" href="<c:url value="/user/san-pham/${item.maSach}"/>">
									<img src="<c:url value="/Content/images/${item.anhBia}"/>" alt="${item.anhBia}" width="180" height="250" />
								</a>
							<div class="caption">
								<h4>
									<a title="${item.tenSach}" href="<c:url value="/user/san-pham/${item.maSach}"/>" style="color: #087BB0;">
									${item.tenSach}
									</a>
								</h4>
								<a style="color: black" class="btn btn-warning"
									href="/Cart/AddItem/?id=@item.MaSach&quantity=1">Mua</a>
									<c:if test="${item.giaBan>0}">
										<h4 class="pull-right" style="color: black;">${item.getGiaBan()}
											VNĐ</h4>
									</c:if>
									<c:if test="${item.giaBan<=0}">
										<h4 class="pull-right" style="color: red;">Liên hệ</h4>
									</c:if>
								</div>
						</div>
					</div>
					</c:forEach>
					
				</div>
</body>
</html>