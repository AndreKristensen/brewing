<%@ page language="java" contentType="text/html;" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Brews</title>


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

	<table class="table table-striped">
		<tr>
			<th>Batch #</th>
			<th>Brew Name</th>
			<th>Measured ABV (‰)</th>
			<th>Style</th>
			<th>Type</th>
			<th>Version</th>
			<th>Date</th>
			<th>Bottle Date</th>
			<th>End Date</th>
			<th>Tot Hops (g)</th>
			<th>Tot Grains (kg)</th>
			<th>Measured Bottling (l)</th>
			<th>Measured Mash Eff (%)</th>
			
		</tr>
		

		<c:forEach items="${brews}" var="brew">
			<tr>
				<td>${brew.batchNumber}</td>
				<td>${brew.name}</td>
				<td>${brew.mABV}</td>
				<td>${brew.style}</td>
				
				<td>${brew.type}</td>
				<td>${brew.version}</td>
				<td>${brew.brewDate}</td>
				<td>${brew.bottledDate}</td>
				<td>${brew.endDate}</td>
				<td>${brew.hops}</td>
				<td>${brew.grains}</td>
				<td>${brew.mBottlingVolume}</td>
				<td>${brew.mMashEff}</td>
			
			</tr>
		</c:forEach>

	</table>


</body>
</html>