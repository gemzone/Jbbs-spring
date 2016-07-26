<%@

	page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
	
%><%@ 

	taglib prefix="spring" uri="http://www.springframework.org/tags" 
	
%><%@ 

	page session="true"

%><!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<title>Insert title here</title>
	<link rel="stylesheet" href="./css/bootstrap.min.css" />
	<link rel="stylesheet" href="./css/bootstrap-theme.css" />
	<script src="./js/jquery-1.12.4.min.js"></script>
	<script src="./js/bootstrap.min.js"></script>
 	<script>
 	
 		$(document).ready(function () {
 			
 			
 			$.ajax({
 	            type: "post",
 	            url: "",
 	            data: "",
 	            
 	            success: function (data) {
 	            	
 	            }
 	        });
 			
 			
//  			statusCode: {
//                 404: function () { console.log("Ajax:: 404 Error. "); },
//                 403: function () { console.log("Ajax:: 403 Error. "); },
//                 500: function () { console.log("Ajax:: 500 Error. " + jspFile); }
//             },

 		});
 	</script>
</head>
<body>
		{{#items}}
		Name: {{name}}
		Price: {{price}}
		  {{#features}}
		  Feature: {{description}}
		  {{/features}}
		{{/items}}


		<!-- 
		<c:choose>
	    <c:when test="${not empty id}">
	        <h2>로그인 성공 </h2>
	        이름 : ${id}
	        <a href="logout">로그아웃</a>
	    </c:when>
	     <c:otherwise>
		    로그아웃상태
		  </c:otherwise>
		</c:choose>  
	     -->
        <h2>로그인 </h2>
        <!-- 
        <form name="form1" method="post" action="loginProcess">
        <table>
            <tr height="40px">
                <td>유저ID</td>
                <td><input type="text" name="userId"></td>
            </tr>
            <tr height="40px">
                <td>패스워드</td>
                <td><input type="password" name="password"></td>
            </tr>
        </table>
        <table>
            <tr>
                <td align="center"><input type="submit" value="로그인"></td>
                <td align="center"><input type="reset" value="리셋"></td>
            </tr>
        </table>
        </form> -->
	
	<div style="padding:20px;text-align:center;">
	
		<form name="form1" method="post" action="./loginProcess">
		
			 <div style="width:300px;display:inline-block;">
				<div style="background-color:#F9F9F9;border-bottom:2px solid #DDDDDD;padding:8px;text-align:center;font-size:12px;height:33px;font-weight:bold;">
					회원 로그인
				</div>
				<div style="border-bottom:1px solid #DDDDDD;padding:8px;width:300px;text-align:center;font-size:12px;overflow:hidden;">
					
					<div class="row-fluid">
						<div class="col-sm-4" style="padding-left:0px;padding-top:5px;">
							<span>아이디</span>
						</div>
						<div class="col-sm-8">
							<input class="form-control input-sm" name="user_id" id="user_id" type="text" style="width:100%;" />
						</div>
					</div>
				</div>
				<div style="border-bottom:1px solid #DDDDDD;padding:8px;width:300px;text-align:center;font-size:12px;overflow:hidden;">
					<div class="row-fluid">
						<div class="col-sm-4" style="padding-left:0px;padding-top:5px;">
							<span>비밀번호</span>
						</div>
						<div class="col-sm-8">
							<input class="form-control input-sm" name="user_password" id="user_password" type="password" style="width:100%;" />
						</div>
					</div>
				</div>
				
				<div class="row-fluid" style="margin-top:8px;">
					<div class="col-sm-6" style="text-align:right;">
						<button type="submit" class="btn btn-default btn-sm">로그인</button>
					</div>
					<div class="col-sm-6" style="text-align:left;">
						<button type="button" class="btn btn-default btn-sm">목록보기</button>
					</div>
				</div>
			</div>
			
		</form>
	</div>



</body>
</html>