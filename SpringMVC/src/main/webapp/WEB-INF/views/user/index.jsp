<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorator"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<title>Trang chủ</title>
<body>
	<!-- Page Content -->
	<div class="container">
		<div class="row">
			<div class="col-md-3"
				style="border-radius: 26px; border: 1px solid #dea3a3; background-image: linear-gradient(to top, #a8edea 0%, #fed6e3 100%);">
				<p
					style="text-align: center; margin: 5px; font-size: 25px; font-weight: 600;">
					<font style="color: #525151;"> DANH MỤC SÁCH</font>
				</p>
				<div class="text-links" style="font-size: 21px;">

					<c:forEach var="item" items="${theloai}">
						<a style="color: #a71717; font-family: Roboto;" href="<c:url value="/user/san-pham-the-loai/${item.maLoai}"/>" class=""><c:out
								value="${item.getTenLoai()}" /></a>
						<br />
					</c:forEach>
				</div>
			</div>
			<div style="width: 71%" class="col-md-9">
				<!-- sách nổi bật -->
				<div class="row carousel-holder">
					<div class="col-md-12">
						<div id="carousel-example-generic" class="carousel slide"
							data-ride="carousel">
							<ol class="carousel-indicators">
								<li data-target="#carousel-example-generic" data-slide-to="0"
									class="active"></li>
								<li data-target="#carousel-example-generic" data-slide-to="1"></li>
								<li data-target="#carousel-example-generic" data-slide-to="2"></li>
							</ol>

							<div class="carousel-inner">
								<div class="item active">
									<a href="<c:url value="/user/san-pham/${item.maSach}"/>"> <img
										src="<c:url value="/Content/images/combo1.jpg"/>"
										alt="slideImage1" />
									</a>
								</div>
								<div class="item">
									<a href="<c:url value="/user/san-pham/${item.maSach}"/>"> <img
										src="<c:url value="/Content/images/combo2.jpg"/>"
										alt="sildeImage2" />
									</a>
								</div>
								<div class="item">
									<a href="<c:url value="/user/san-pham/${item.maSach}"/>"> <img
										src="<c:url value="/Content/images/combo3.jpg"/>"
										alt="slideImage3" />
									</a>
								</div>
							</div>
							<a class="left carousel-control" href="#carousel-example-generic"
								data-slide="prev"> <span
								class="glyphicon glyphicon-chevron-left"></span>
							</a> <a class="right carousel-control"
								href="#carousel-example-generic" data-slide="next"> <span
								class="glyphicon glyphicon-chevron-right"></span>
							</a>
						</div>
					</div>
				</div>
				<!-- kết thúc sách nổi bật -->
				<hr />
				<!-- sách bán chạy -->
				<div class="row">
					<div style="position: absolute; width: 800px; height: 70px; left: 19px; top: 443px; background-image: linear-gradient(to top, #a8edea 0%, #fed6e3 100%); border-radius: 50px; line-height: 2.1;">
						<div class="row">
							<div class="col-lg-1" style="margin: 1rem 0rem 0rem 5rem">
								<img style="width: 46px; height: 46px; left: 50px; top: 484px;" src="<c:url value="/Content/images/topSach.png"/>"></img>
							</div>
							<div class="col-lg-4" style="margin: 2rem 0rem 0 -1rem">
								<h4>Sách mới cập nhật</h4>
							</div>
							
						</div>
						
					</div>
				</div>

				<div style="margin-top: 10rem" class="row">
					<c:forEach var="item" items="${sachmoicn}">
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
										href="/AddCart/${item.maSach}">Mua</a> 
										<c:if test="${item.giaBan>0}">
											<h4 class="pull-right" style="color: black;">${item.getGiaBan()} VNĐ</h4>
										</c:if>
										<c:if test="${item.giaBan<=0}">
											<h4 class="pull-right" style="color: red;">Liên hệ</h4>
										</c:if>
									
								</div>
							</div>
						</div>
					</c:forEach>
					
				</div>
				<!-- @*kết thúc sách nổi bật*@ -->
				<!-- @*Những cuốn sách trong kho và xem tất cả*@ -->
				<hr />
				<h3>
					<font style="color: #087BB0">Sách Bán Chạy</font>
				</h3>
				<p style="text-align: right">
					<a href="<c:url value="/user/allbook"/>">Xem tất cả</a>
				</p>
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
									href="/AddCart/${item.maSach}">Mua</a>
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
				<!-- @*kết thúc sách mới cập nhật*@ -->

			</div>
		</div>
	</div>
</body>
