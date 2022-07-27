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
<title>Thanh Toán</title>
<style>
    .checkout-button {
        display: flex;
        align-items: center;
        border: 1px solid #ae2070;
        padding: 5px;
        border-radius: 5px
    }
    .checkout-button img {
        padding-left: 10px;
        height: 50px;
        width: 50px;
    }
    .content{
        padding-left: 15px;
    }
    .content .checkout-title{
        color: #000;
        font-size: 13pt;
        font-weight: 600;
    }
    .content .description{
        color: #666
    }
    input[type="radio"]:hover{
        cursor: pointer;
    }
</style>
</head>
<body>

<div class="section group">
    <div style="width: 70%; margin: 0 auto;">
        <form:form action="checkout" modelAttribute="bills" method="POST" class="checkout woocommerce-checkout" >
            <div class="form-group">
                <h4>Thông tin khách hàng</h4>
                <form:input path="MaKH" class="form-control" value="${InfoUser.maKH}" type="hidden" />
            </div>
            <div class="form-group">
                <label>Họ tên khách hàng</label>
                <form:input path="TenKH" class="form-control" value="${InfoUser.tenKH}" readonly="readonly" />              
            </div>
                <div class="form-group">
                    <label>Email</label>
                    <form:input path="Email" type="email" class="form-control" value="${InfoUser.email}" readonly="readonly" />  
                </div>
                <div class="form-group">
                    <label>Địa chỉ</label>
                    <form:input path="DiaChi" class="form-control" value="${InfoUser.diaChi}" readonly="readonly" />
                </div>
                <div class="form-group">
                    <label>Điện thoại</label>
                    <form:input path="DienThoai" class="form-control" value="${InfoUser.dienThoai}" readonly="readonly" />
                </div>
                <div class="checkout-button">
                    <div class="checkout-selector">
                        <form:input  type="radio" path="PaymentMethod" value="1" checked="checked" class="btn btn-m2 btn-checkout"/>
                    </div>
                    <div class="content" style="display: flex;align-items: center;">
                        <span class="checkout-title">
                            Thanh Toán Khi Nhận Hàng
                        </span>
                    </div>
                </div>
                <br/>
                <div class="checkout-button">
                    <div class="checkout-selector">
                        <form:input type="radio" path="PaymentMethod" value="2" class="btn btn-m2 btn-checkout"/>
                    </div>
                    <div class="content" style="display: flex;align-items: center;">
                        <span class="checkout-title">
                            Thanh toán bằng MoMo
                        </span>
                    </div>
                </div>
                <br/>
                <button type="submit" class="btn btn-success">Gửi đơn hàng</button>
        </form:form>
    </div>

</div>
</body>
</html>