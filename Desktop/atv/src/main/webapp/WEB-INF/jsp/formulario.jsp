<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- Import da taglib -->
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel = "stylesheet" href="/resources/css/index.css">

</head>
<body>
    ${home}
    <form:form action="${s:mvcUrl('FC#create').build()}" method="POST"
			modelAttribute="pessoa">

            <label>Nome: </label>
            <form:input path="nome" /> <br>

            <label>Data de Nascimento: </label>
            <form:input path="dataNascimento" /> <br>

            <label>CPF:</label>
            <form:input path="cpf" /><br>

            <div calss ="botao">

                <button type="submit">Cadastrar</button>

            </div>


</form:form>

</body>
</html>

