<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="sec"	uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>${titulo}</title>
</head>
<body>

<c:forEach items="${libros}" var="libro">
	<div id="inf">
${libro.idLi}-${libro.ISBN}-${libro.titulo}-${libro.descripcion}-${libro.portada}
	</div>
</c:forEach>

<script type="text/javascript">
$(document).ready(function(){
	$("#inf").on("click", function(){
		alert($(this).text());
	})
	
	
})
</script>


</body>
</html>