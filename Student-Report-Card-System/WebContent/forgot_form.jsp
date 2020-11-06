<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
<title>Forgot Password</title>
</head>
<style> 
body {
  background-image: url("img5.jpg");
  background-repeat: no-repeat;
   background-size: 100vw 100vh;
  
}
table {
  border: 2px solid white;
 width:300px;
}
td{
 padding:10px;
 color:white;

}

</style>
<body>
<form action="forgot_password.com" method="post" >
<div class="row bg-white sticky-top" style="height: 50px">
        <div class="col d-flex align-items-center">
            <div class="row bg-white pl-5 text-light" style="height:50px;font-size:20px">
              <h3 style="font-weight:bold;padding-top:5px;color:black">Student Report Card System</h3>
            </div>
        </div>
        
 </div>
	<div style="margin:100px;">
		<table align="center" >
			<tr>
				<td colspan="2" align="center"><b><h3>Forgot Password??</h3></b></td>
			</tr>
		<tr>
			<td style="padding-left:30px">Enter Your Registered Mail ID:</td>
			
		</tr>
		<tr>
		<td style="padding-right:30px;padding-left:30px">
		<input class="form-control form-control-sm" type="text"  name="facultyemailId" >
		</td>
		</tr>
		<tr>
			<td style="padding-right:30px;padding-left:30px" colspan="2"> 
			<button type="submit" class="btn btn-secondary btn-sm btn-block">Submit</button></td>
		</tr>
		
		<tr>
		<td colspan="2" align="center"><a href="prep_login_form.com"><b>BACK</b></a></td>
		</tr>
		
	</table>
	
	</div>
</form>
</body>
</html>