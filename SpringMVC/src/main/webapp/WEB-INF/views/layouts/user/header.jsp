<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- Navigation -->
    <!-- Start of HubSpot Embed Code -->
    <script type="text/javascript" id="hs-script-loader" async defer src="//js.hs-scripts.com/8722341.js"></script>
    <!-- End of HubSpot Embed Code -->
    <nav style="background-image: linear-gradient(to top, #a8edea 0%, #fed6e3 100%);border-radius: 0px 0px 30px 30px;border:none" class="navbar navbar-inverse navbar-fixed-top" role="navigation">
        <div class="container">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
            </div>
            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                    <li>
                        <a href="/" style="font-size:25px; color:#525151;"><i class="fa fa-home" aria-hidden="true"></i> WEBBANSACH</a>


                    </li>

                    <li>
                        <a href="/Home/Contact" style="color:#525151"><i class="fa fa-phone-square" aria-hidden="true" style="color:#525151"></i> Liên hệ</a>
                    </li>
                </ul>
                <div class="col-sm-3 col-md-3">
                   
        <div class="input-group">
        <form role="search" method="get"  action="/SpringMVC/search/">
            <input style="width: 370px;" type="text" class="form-control" placeholder="Tìm kiếm sách..." name="search">
            <span class="input-group-btn">
                <button style="background: #e658588c; border-radius: 40px;" class="btn btn-default" type="submit">
                    <span style="color:white">Tìm</span>
                </button>
            </span>
          </form>
        </div>
                </div>
                <!--Menu right-->
                <%@include file="/WEB-INF/views/user/loginpage.jsp" %>
                <!--ket thuc Menu right-->
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container -->
    </nav>