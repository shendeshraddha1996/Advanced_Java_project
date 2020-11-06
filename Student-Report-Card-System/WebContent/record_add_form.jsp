<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="spr" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
<title>Insert title here</title>
<style>
body {
  background-image: url("img5.jpg");
  background-repeat: no-repeat;
   background-size: 100vw 100vh;
  
}
table{
	margin-top:70px;
}
td{
color:white;
}
tr,td{
padding:5px;
}
</style>
</head>
<body>
<spr:form action="record_add.com" method="post" commandName="record" >
	<div class="row bg-white sticky-top" style="height: 50px">
        <div class="col d-flex align-items-center">
            <div class="row bg-white pl-5 text-light" style="height:50px;font-size:20px">
              <h3 style="font-weight:bold;padding-top:5px;color:black">Student Report Card System</h3>
            </div>
        </div>
      
 </div>
 <div>
	<table align="center" >
		<tr>
			<td>
				Rollno :
			</td>
			<td>
				<spr:input path="rollno" class="form-control form-control-sm" type="text" />
			</td>
		</tr>
		<tr>
			<td>
				Name:
			</td>
			<td>
				<spr:input path="studentName" class="form-control form-control-sm" type="text"/>
			</td>
		</tr>
		<tr>
			<td>
				Physics:
			</td>
			<td>
				<spr:input path="physics" class="form-control form-control-sm" type="text"/>
			</td>
		</tr>
		<tr>
			<td>
				Maths:
			</td>
			<td>
				<spr:input path="maths" class="form-control form-control-sm" type="text"/>
			</td>
		</tr>
		<tr>
			<td>
				English:
			</td>
			<td>
				<spr:input path="english" class="form-control form-control-sm" type="text"/>
			</td>
		</tr>
		<tr>
			
			<td colspan="2">
				<button type="submit" class="btn btn-secondary btn-sm btn-block">ADD</button>
			</td>
		</tr>
			<td colspan="2" align="center">
				
				<a href="home.jsp" ><h4><b>Back</b></h4></a>
	
			</td>
		</tr>
		
		
	</table>
	</spr:form>
</body>
</html>