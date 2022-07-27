<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorator"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tìm kiếm</title>
</head>
<body>
<div class="row">
    <div class="col-md-3" style="border-radius: 26px;border: 1px solid #dea3a3;   background-image: linear-gradient(to top, #a8edea 0%, #fed6e3 100%);">
        <p style="text-align: center; margin: 5px;font-size: 25px;font-weight: 600;"><i aria-hidden="true"></i><font style="color:#087BB0; text-align:center"> DANH MỤC SẢN PHẨM</font></p>
        <div class="text-links" style="font-size: 21px;">

					<c:forEach var="item" items="${theloai}">
						<a style="color: #a71717; font-family: Roboto;" href="<c:url value="/user/san-pham-the-loai/${item.maLoai}"/>" class=""><c:out
								value="${item.getTenLoai()}" /></a>
						<br />
					</c:forEach>
				</div>
    </div>
    <div class="col-md-9">
        <h3>Kết quả tìm kiếm</h3>
        <p>Có ${search.size()} kết quả tìm kiếm tên "${namesearch}"</p>
        <hr />        
        <div class="row">
            <c:forEach var="item" items="${search}">
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
       
    </div>
</div>
</body>
</html>