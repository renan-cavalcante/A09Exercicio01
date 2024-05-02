<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Imposto</title>
</head>
<body>
	<h1>Calculo imposto:</h1>
	<form action="imovel" method="post">
		<label>Endereço</label> <input name="endereco"> <br> 
		
		<label>Cidade</label>
		<select name="cidade">
			<c:if test="${not empty cidades }">


				<c:forEach var="c" items="${cidades.keySet() }">

					<option value="${c}">${cidades.get(c).getNome() }</option>
				</c:forEach>

			</c:if>
		</select> <br> <label>Area do terreno</label> <input name="area_terreno">
		<br> <label>Numero de quartos</label> <input name="numquartos">
		<br> <label>Numero de comodos</label> <input name="num_comodos">
		<br> <label>Area da garagem</label> <input name="area_garagem">
		<br> <label>Idade do imovel</label> <input name="idade">
		<br>


	<button type="submit"> Calcular imposto</button>
	</form>
	
	<c:if test="${not empty Imposto }">
	<p>Valor do imposto R$${Imposto }</p>
	</c:if>
</body>
</html>