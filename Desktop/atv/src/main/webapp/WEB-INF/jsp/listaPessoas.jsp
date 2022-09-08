<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- Import da taglib -->
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel = "stylesheet" href="/resources/css/listaPesssoas.css">

</head>
<body>

    <table class ="tabela">
        <tr>
            <td>Nome</td>
            <td>CPF</td>
            <td>Data de Nascimento</td>
        </tr>

        <c:forEach items="${sacolaPessoa}" var="p">
            <tr>
                <td>${p.nome}</td>
                <td>${p.cpf}</td>
                <td><fmt:formatDate pattern="dd/MM/yyyy" value="${p.dataNascimento.time}"/></td>
            </tr>

        </c:forEach>

    </table>

        
</body>
</html>