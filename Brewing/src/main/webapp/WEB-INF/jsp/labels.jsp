<%@ page language="java" contentType="text/html;" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
	<c:forEach items="${img}" var="i">
		<img src=${pageContext.request.contextPath}/static/image/${i}
			alt="Smiley face" height="300px" width="150px">

	</c:forEach>
</body>
</html>