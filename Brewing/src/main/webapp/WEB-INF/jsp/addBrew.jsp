<%@ page language="java" contentType="text/html;" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>Insert Brew</title>

<%-- <link rel="icon" href="<c:url value="/static/common/img/favicon.png" />" /> --%>
<%-- <link rel="apple-touch-icon-precomposed" href="<c:url value="/static/common/img/touch-icon-precomposed.png" />"> --%>

<link rel="stylesheet" type="text/css"
	href="<c:url value="/static/common/style/css/bootstrap.css" />" />
<link rel="stylesheet" type="text/css"
	href="<c:url value="/static/common/style/css/style.css" />" />


<script src="<c:url value="/static/common/jquery/jquery-1.9.js" />"></script>
<script src="<c:url value="/static/brew.js" />"></script>
<script type="text/javascript">
  var BASE_URL = "${pageContext.request.contextPath}/";
</script>
</head>
<body>
	      
	<table>
		<tr>
			<td><label path="brewName">Brew name</label></td>
			<td><input id="brewName" path="brewName" /></td>
		</tr>
		<tr>
			<td><label path="measuredVolume">measuredVolume</label></td>
			<td><input id="measuredVolume" path="measuredVolume" /></td>
		</tr>
		<tr>
			<td><label path="batchNumber">batchNumber</label></td>
			<td><input id="batchNumber" path="batchNumber" /></td>
		</tr>
		<tr>
			<td><label path="numberOfhalfLiter">numberOfhalfLiter</label></td>
			<td><input id="numberOfhalfLiter" path="numberOfhalfLiter" /></td>
		</tr>
		<tr>
			<td><label path="numberOfZeroPointThreeLiter">numberOfZeroPointThreeLiter</label></td>
			<td><input id="numberOfZeroPointThreeLiter"
				path="numberOfZeroPointThreeLiter" /></td>
		</tr>
		<tr>
			<td><label path="literInKeg">literInKeg</label></td>
			<td><input id="literInKeg" path="literInKeg" /></td>
		</tr>
		<tr>
			<td colspan="2">            <input type="button"
				value="Add Brew" id="add-brew" />         
			</td>
		</tr>
	</table>
	       

</body>
</html>