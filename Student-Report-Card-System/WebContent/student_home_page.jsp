<%@page import="java.util.List"%>
    <%@page import="com.cdac.dto.RecordData"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
         <%@ taglib uri="http://www.springframework.org/tags/form" prefix="spr" %>
    <%@page import="java.text.DecimalFormat" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
<title>Student Home Page</title>
<style> 
body {
  background-image: url("img5.jpg");
  background-repeat: no-repeat;
   background-size: 100vw 100vh;
  
}
table{
width:100%;
}
th,td{
text-align:center;
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
        <button  class="btn btn-secondary mt-1 mb-1 mr-5" >
             <a href="logout_here.com">Log Out</a>   
        </button>
 </div>
 <table class="table table-hover table-dark table-bordered" align="center">
  <thead>
    <tr>
      <th scope="col" >Roll No.</th>
      <th scope="col" >Student Name</th>
      <th scope="col">Maths</th>
      <th scope="col">Physics</th>
      <th scope="col">English</th>
       <th scope="col">Total</th>
       <th scope="col">Per</th>
    </tr>
  </thead>
	<% 
		List<RecordData> record1 = (List<RecordData>)request.getAttribute("recordList");
		for(RecordData rec : record1){
		%>
  <tbody>
    <tr>
    
      	<td>
				<%=rec.getRollno()%>
			</td>
			<td>
				<%=rec.getStudentName()%>
			</td>
			<td>
				<%=rec.getMaths()%>
			</td>
			<td>
				<%=rec.getPhysics()%>
			</td>
			<td>
				<%=rec.getEnglish()%>
			</td>
			<td>
				<%int a=Integer.parseInt(rec.getMaths());
				int b=Integer.parseInt(rec.getPhysics());
				int c=Integer.parseInt(rec.getEnglish()); 
				float t=a+b+c;%>
			<%=t %>
			</td>
			<td>
			 <%float per=(t/300)*100;
			 DecimalFormat priceFormatter = new DecimalFormat("#0.00");
			String p=priceFormatter.format(per);
			 %>
			<%= p%>
		
			</td>
			
		</tr>
		<% } %>
		
    
   
    
  </tbody>
</table>
</body>
</html>