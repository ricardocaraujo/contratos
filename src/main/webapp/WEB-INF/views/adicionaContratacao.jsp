<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form >
		<div>
			<label>Objeto</label>
			<input type="text" name="nome">
		</div>
		<div>
			<label>Código</label>
			<input type="text" name="codigo">
		</div>
		<div>
			<c:forEach items="${atividades}" var="atividade">
				<div>
					<label></label>
				
				</div>
			
			</c:forEach>
		</div>
		<button type="submit">Cadastrar</button>		
	</form>

</body>
</html>