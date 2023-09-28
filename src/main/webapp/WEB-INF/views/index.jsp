<%@page import="java.util.List"%>
<%@page import="jakarta.security.auth.message.callback.PrivateKeyCallback.Request"%>
<html>
<head>
<title>Home page</title>
</head>
<body>
<h1>This is home page</h1>
<h1>Called by home controller</h1>
<h1>url /home</h1>

	<%
		String name =(String) request.getAttribute("name"); //Parsing to string and getting the attribute
		int id = (Integer) request.getAttribute("id");
		
		List<String> friends =(List<String>)request.getAttribute("f");
		
		
	%>

<p>Name is: <%=name%></p>
<p>Id: <%=id %></p>


<h3>The list of my friends</h3>
<p> <%  
	for(String s: friends){
		out.println(s);
	%>
	
	 <br>
	 <%
	}
	 
	 %>
  
</p>
</body>
</html>
