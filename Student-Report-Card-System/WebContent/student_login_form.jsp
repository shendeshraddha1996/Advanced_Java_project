<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="spr" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
<title>Student Login Form</title>
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
<spr:form action="student_login.com" method="post" commandName="record" >
<div class="row bg-white sticky-top" style="height: 50px">
        <div class="col d-flex align-items-center">
            <div class="row bg-white pl-5 text-light" style="height:50px;font-size:20px">
              <h3 style="font-weight:bold;padding-top:5px;color:black">Student Report Card System</h3>
            </div>
        </div>
        
 </div>
<div style="display:flex;flex-direction:row;">
	<div style="margin-top:120px;margin-left:500px;">
	<table id="tb1"align="center" >
		<tr>
			<td colspan="2" align="center"><b><h3>Login</h3></b>
			
		</tr>
		<tr>
			<td>Roll No  :</td>
			<td><spr:input path="rollno"/></td>
		</tr>
			
		
		
		<tr>
			<td>Faculty ID :</td>
			<td><spr:input path="faculty_user_id"/></td>
		</tr>
		
		<tr>
			<td colspan="2"> <button type="submit" class="btn btn-secondary btn-sm btn-block">Login</button>
			
			</td>
		</tr>
		
		<tr>
		<td align="center" colspan="2"><a href="index.jsp"><b>BACK</b></a></td>
		</tr>
		
	</table>
	</div>

</spr:form>
</body>
</html>