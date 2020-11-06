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

<title>Register Form</title>
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
 padding:10px;
 color:white;
}
</style>
</head>
<body>
<spr:form class="was-validated" action="register.com" method="post" commandName="facultyUser" >
<div class="row bg-white sticky-top" style="height: 50px">
        <div class="col d-flex align-items-center">
            <div class="row bg-white pl-5 text-light" style="height:50px;font-size:20px">
              <h3 style="font-weight:bold;padding-top:5px;color:black">Student Report Card System</h3>
            </div>
        </div>
        
 </div>
<div style="display:flex;flex-direction:row;">
	<div style="margin-top:80px;margin-left:450px;">
	<table id="tb1" align="center" >
		<tr>
			<td colspan="2" align="center"><b><h3>Register</h3></b>
			Please fill in this form to create an account.</td>
		</tr>
		<tr>
			<td>Username  :</td>
			<td><spr:input class="form-control" required="true" minlength="6" maxlength="14"  path="facultyUserName"/>
				
			</td>
		</tr>
	
		<tr>
			<td>Email ID   :</td>
			<td><spr:input class="form-control" type="email" required="true" path="facultyemailId"/>
			
			</td>
		</tr>
		
		<tr>
			<td>Password :</td>
			<td><spr:input class="form-control" required="true" minlength="6" maxlength="14" path="facultyUserPass" type="password"/>
			
			</td>
		</tr>
		
		<tr>
			<td colspan="2"> <button type="submit" class="btn btn-secondary btn-sm btn-block">Register</button></td>
		</tr>
		
		<tr>
		<td colspan="2" align="center"><a href="prep_login_form.com"><b>Already have an account</b></a></td>
		</tr>
	</table>
</div>

<div style="margin-left:15px;margin-top:210px;">
	<table >
	<tr><td><font color="red" ><spr:errors path="facultyUserName" ></spr:errors></font></td></tr>
	<tr><td>	<font color="red" ><spr:errors path="facultyemailId" ></spr:errors></font></td></tr>
	<tr><td>	<font color="red" ><spr:errors path="facultyUserPass" ></spr:errors></font></td></tr>
	</table>
</div>
</div>
</spr:form>
</body>
</html>