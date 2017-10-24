<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge"> 
<meta name="viewport" content="width=device-width, initial-scale=1"> 
<script type="text/javascript" language="javascript" src="./js/jquery-3.2.1.min.js" ></script>
<style type="text/css">
</style>

<title></title>
<link rel="stylesheet" type="text/css" href="css/normalize.css" />
<link rel="stylesheet" type="text/css" href="css/demo.css" />
<link rel="stylesheet" type="text/css" href="css/component.css" />
<script>
$(function(){
		//取得した要素の順番
		//:first :last
		//console.log("11111");
	}
)

function userLongin(){
	var parStr = "userCd=" + $("#userCd").val();
	parStr += "&pw=" + $("#pw").val();
	
	$.ajax({
		  type:"POST",   
	      url:"./ajaxComm",
	      //dataは普通のストリング場合
	      data:parStr,   
		  dataType:"json",
	      success:callback,
	      error:function(){
	    	        alert("ユーザーコード　または　パースワード入力不正")
	    	    }
	    });
}

function callback(jasonObj){
	var reCheck = jasonObj.longin;
	if(reCheck == "0"){
		alert("ユーザーコード　または　パースワード入力不正")
	} else {
		document.getElementById("form1").submit();
	}
}

function init(){
	//alert(document.getElementById("title").innerHTML);
	alert("abc");
}

</script>
</head>
<body onload="init()">
     <div class="container demo-1">
        <div class="content">
			<div id="large-header" class="large-header">
			    <canvas id="demo-canvas"></canvas>
					<div class="logo_box">
						<h3>湛陽の家計簿</h3>
						<form action="./FirsetServlet" id="form1" method="post">
							<div class="input_outer">
								<span class="u_user"></span>
								<input id="userCd" class="text" style="color: #FFFFFF !important" type="text" placeholder="ユーザーコード">
							</div>
							<div class="input_outer">
								<span class="us_uer"></span>
								<input id="pw" class="text" style="color: #FFFFFF !important; position:absolute; z-index:100;"value="" type="password" placeholder="パースワード">
							</div>
							<div class="mb2"><a class="act-but submit" href="javascript:userLongin();" style="color: #FFFFFF">登录</a></div>
						</form>
					</div>
			 </div>
	     </div>
     </div>
     <script src="js/TweenLite.min.js"></script>
	 <script src="js/EasePack.min.js"></script>
	 <script src="js/rAF.js"></script>
	 <script src="js/demo-1.js"></script>
</body>
</html>