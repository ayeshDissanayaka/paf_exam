<% page import ="javax.sql. *" %>
<% page language="java" contentType ="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%
	Item item = new Item();
	String itemsGrid = "";
	String rudFeedBack = "";
	
	if(request.getParameter(hidMode) != null && request.getParameter("hidMode"). equalsIgnoreCase("save"))
	{
		rudFeedback = item.saveAnItem(request.getParameter("txtItemName"), request.getParameter("txtItemDesc"));
	}
	
	if(request.getParameter(hidMode) != null && request.getParameter("hidMode"). equalsIgnoreCase("update"))
	{
		rudFeedback = item.updateAnItem(request.getParameter("hidID"), request.getParameter("txtItemName")),
		request.getParameter("txtItemDesc"));

	}
	
	if(request.getParameter(hidMode) != null && request.getParameter("hidMode"). equalsIgnoreCase("remove"))
	{
		rudFeedback = item.deleteAnItem(request.getParameter("hidID"));

	}
	
	itemsGrid = item.getItems();
%>



<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src=Controllers/jQuery.js></script>
<script type="text/javascript" src=Controllers/controllerMain.js></script>
</head>
<body>

<form id="formItems" action="items.jsp" method="post">
		<input id="hidMode" name="hidMode" type="hidden" value="save">
		<input id="hidID" name="hidID" type="hidden" value="0">
		Item Name <input id="txtItemName" type="text" name="txtItemName"> <br>
		Item Description <input id="txtItemDesc" type="text" name="txtItemDesc" > <br>
		<input id="btnSave" type="button" name="btnSave"  value="Save"> <br> <br>
		<div id="divStsMsgItem"><% out.println(rudFeedback); %> </div>
		<% out.println(itemsGrid); %> 
	</form> <br>
</body>
</html>