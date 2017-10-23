<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="jap.com.MyDataModel" %>
<%
%>  
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="icon" href="img/logo.png"/>
    <title>湛陽の家計簿</title>
    <link href="css/bootstrap.css" rel="stylesheet">
    <link rel="stylesheet" href="css/mmss.css"/>
    <link rel="stylesheet" href="css/font-awesome.min.css"/>
    <style>
    </style>
</head>

<body>
<header>
    <div class="container-fluid navbar-fixed-top bg-primary">
        <ul class="nav navbar-nav  left">
            <li class="text-white h4">
                &nbsp;&nbsp;&nbsp;&nbsp;<span class="glyphicon glyphicon-leaf"></span>&nbsp;&nbsp;<b>湛陽の家計簿</b>
            </li>
        </ul>
    </div>
</header>

<section>
    <div class="container-fluid">
        <div class="row">
            <div class="col-xs-2 bg-blue">
                <br/>
                <div class="panel-group sidebar-menu" id="accordion" aria-multiselectable="true">
                    <div class="panel panel-default menu-first menu-first-active">
                        <a data-toggle="collapse" data-parent="#accordion" href="index.html" aria-expanded="true"
                           aria-controls="collapseOne">
                            <i class="icon-home icon-large"></i> ホーム
                        </a>
                    </div>
                    <div class="panel panel-default menu-first">
                        <a data-toggle="collapse" data-parent="#accordion" href="#collapseOne" aria-expanded="true"
                           aria-controls="collapseOne">
                            <i class="icon-user-md icon-large"></i> 管理システム</a>
                        </a>

                         
                        <div id="collapseOne" class="panel-collapse collapse " >
                            <ul class="nav nav-list menu-second">
                                <li><a href="javascript:mybook();"><i class="icon-user"></i> 家計簿明細</a></li>
                                <li><a href="p2.html"><i class="icon-edit"></i> 機能２</a></li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
            
            <div class="col-xs-10">
                <iframe id="iframe1" src="" frameborder="0" width="1375px" height="690px"></iframe>
            </div>
        </div>
    </div>
</section>

<footer class="bg-primary navbar-fixed-bottom">
    <p class="text-center text-white">湛陽のものです</p>
</footer>

<script src="js/jquery-1.11.3.js"></script>
<script src="js/bootstrap.js"></script>
<script>
    $(function () {
        $('dt').click(function () {
            $(this).parent().find('dd').show().end().siblings().find('dd').hide();
        });
    });

    function mybook(){
    	document.getElementById("iframe1").src = "./mainPage";
    }
</script>
</body>
</html>