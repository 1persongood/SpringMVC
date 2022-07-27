<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorator"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Giỏ hàng</title>
</head>
<body>


	<h2 style="margin-bottom: 20px;">Giỏ hàng của bạn</h2>
	<c:if test="${ Cart.size() > 0 }">
	<form action="" method="post">
	<table id="cart" class="table table-hover table-condensed">
		<thead>
			<tr>
				<th style="width: 50%">Sản phẩm</th>
				<th style="width: 10%">Giá</th>
				<th style="width: 8%">Số lượng</th>
				<th style="width: 22%" class="text-center">Thành tiền</th>
				<th style="width: 10%"></th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="item" items="${ Cart }">
			<tr>
				<td data-th="Product">
					<div class="row">
						<div class="col-sm-2 hidden-xs">
						<img src="<c:url value="/Content/images/${item.value.sachdto.anhBia}"/>"
					alt="${item.value.sachdto.anhBia}" class="img-responsive" />
							
						</div>
						<div class="col-sm-10">
							<h4 class="nomargin">${item.value.sachdto.tenSach}</h4>
						</div>
					</div>
				</td>
				<td data-th="Price">${item.value.sachdto.giaBan}
					VND</td>
				
					<td  data-title="Số lượng">
						<div class="quantity">
							<input type="number" class="quantity" data-id="${item.value.sachdto.maSach }" id="quanty-cart-${item.value.sachdto.maSach}"
								step="1" min="0" max="10"
								name="" value="${ item.value.quanty }" title="Qty" size="4"
								inputmode="numeric" />
						</div>
					</td>
							
							<td data-th="Subtotal" class="text-center">${ item.value.totalPrice }
								VND</td>
							<td class="actions" data-th=""><!-- nút xóa -->
				                                                                         
					<button  href="<c:url value="DeleteCart/${ item.value.sachdto.maSach  }"/>"
						class="btn btn-danger btn-sm" >
						<i class="fa fa-trash-o"></i>
					</button> <!-- kết thúc nút xóa -->
				</td>
			</tr>
			</c:forEach>
		</tbody>
		<tfoot>
			<tr class="visible-xs">
				<td class="text-center"><strong>Total 1.99</strong></td>
			</tr>
			<tr>
				<td><a href="<c:url value="/trang-chu"/>" class="btn btn-warning"><i
						class="fa fa-angle-left"></i> Tiếp tục mua hàng</a> <!-- nút cập nhật -->
					<button id="btnUpdate" class="btn btn-info btn-sm">
						<i class="fa fa-refresh"></i> Cập nhật
					</button> <!-- kết thúc nút cập nhật --> <!-- nút xóa -->
					<button id="btnDeleteAll" class="btn btn-danger btn-sm">
						<i class="fa fa-trash-o"></i> Xóa tất cả
					</button> <!-- kết thúc nút xóa --></td>
				<td colspan="2" class="hidden-xs"></td>
				<td class="hidden-xs text-center"><strong>Tổng cộng:
						${totalPrice} VND</strong></td>
				<td><a href="<c:url value="/Cart/Payment"/>" class="btn btn-success btn-block">Thanh
						toán <i class="fa fa-angle-right"></i>
				</a></td>
			</tr>
		</tfoot>
	</table>
	</form>
	</c:if>
	<c:if test="${ Cart.size() ==null or Cart.size() <= 0}">
	<span class="alert alert-danger">Chưa có sản phẩm nào trong giỏ
		hàng</span>
	<br />
	<a href="/trang-chu" style="margin-top: 20px;" class="btn btn-warning">
		Tiếp tục mua hàng</a> 
	</c:if>
	<content tag="script">
<script>
	$(document).ready(function() {
	    $(".quantity input").on("change", function() {
	        var id = $(this).attr("data-id");
	        var quanty = $("#quanty-cart-"+id).val();
	        if(quanty == 0){
	        	window.location = "DeleteCart/"+id;
	        }else{
	        	window.location = "EditCart/"+id+"/"+quanty;
	        }
	    });
	});
</script>

</content>
</body>
</html>