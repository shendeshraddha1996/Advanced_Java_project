<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="spr" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
<title>Home Page</title>
<style>
body {
  background-image: url("img5.jpg");
  background-repeat: no-repeat;
   background-size: 100vw 100vh;
  
}
table{
margin-top:100px;
}
td,tr{
padding:25px;
}
  #GFG { 
            text-decoration: none; 
        } 
</style>
</head>
<body>

<div class="row bg-white sticky-top" style="height: 50px">
        <div class="col d-flex align-items-center">
            <div class="row bg-white pl-5 text-light" style="height:50px;font-size:20px">
              <h3 style="font-weight:bold;padding-top:5px;color:black">Student Report Card System</h3>
            </div>
        </div>
        <a href="home.jsp"><button class="btn btn-secondary mt-1 mb-1 mr-5" >
                Home
        </button></a>
        <a href="logout_here.com"><button class="btn btn-secondary mt-1 mb-1 mr-5" >
                Log Out
        </button></a>
 </div>
<table align="center">
<tr>
<td><button class="btn btn-light btn-lg btn-block mt-1 mb-1 mr-5" >
         <a id = "GFG" href="prep_record_add_form.com"> <b>Add Record</b></a>     
        </button>
</td></tr>
<tr>
<td>
 <button class="btn btn-light btn-lg btn-block mt-1 mb-1 mr-5" >
         <a id = "GFG" href="record_list.com"><b>Show Record</b></a>     
   </button>
</td>
</tr>
</table>
 		
       
       
 
</body>
</html>