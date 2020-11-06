<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="spr" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>

<title>Login Form</title>
<style> 
body {
  background-image: url("img5.jpg");
  background-repeat: no-repeat;
   background-size: 100vw 100vh;
  
}
#tb1 {
  border: 2px solid white;

}
td{
 padding:7px;
 color:white;
align:center;
}
</style>
</head>
<body>
<spr:form class="was-validated" action="login.com" method="post" commandName="facultyUser" >
<div class="row bg-white sticky-top" style="height: 50px">
        <div class="col d-flex align-items-center">
            <div class="row bg-white pl-5 text-light" style="height:50px;font-size:20px">
              <h3 style="font-weight:bold;padding-top:5px;color:black">Student Report Card System</h3>
            </div>
        </div>
        
 </div>
<div style="display:flex;flex-direction:row;">
	<div style="margin-top:90px;margin-left:500px;">
	<table id="tb1"align="center" >
		<tr>
			<td colspan="2" align="center"><b><h3>Login</h3></b>
			
		</tr>
		<tr>
			<td style="padding-left:20px;">Username  :</td>
			<td style="padding-right:20px;"><spr:input class="form-control" required="true" minlength="6" maxlength="14" path="facultyUserName"/></td>
		</tr>
			
		
		
		<tr>
			<td style="padding-left:20px;">Password :</td>
			<td style="padding-right:20px;"><spr:input class="form-control" required="true" minlength="6" maxlength="14" path="facultyUserPass" type="password"/></td>
		</tr>
		
		<tr>
			<td colspan="2" style="padding-left:20px;padding-right:20px;"> <button type="submit" class="btn btn-secondary btn-sm btn-block">Login</button>
			
			</td>
		</tr>
		
		<tr>
		<td align="center" colspan="2"><a href="pre_reg_form.com"><b>Register an account</b></a></td>
		</tr>
		<tr>
		<td style="padding-bottom:15px"align="center" colspan="2"><a href="forgot_form.jsp"><b>Forgot Password</b></a></td>
		</tr>
	</table>
	</div>
<div style="margin-left:15px;margin-top:210px;">
	<table >
	<tr><td><font color="red" ><spr:errors path="facultyUserName" ></spr:errors></font></td></tr>
	<tr><td>	<font color="red" ><spr:errors path="facultyUserPass" ></spr:errors></font></td></tr>
	</table>
</div>	
</div>
</spr:form>
</body>
</html>