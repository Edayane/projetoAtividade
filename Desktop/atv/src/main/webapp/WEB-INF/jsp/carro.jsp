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
        <title>Carro Documento</title>
    </head>
    <body>
        <h1>Página que contém as informações do seu carro</h1>

    
        <form:form action="${s:mvcUrl('CC#createCarro').build()}" method="POST"
	    modelAttribute="carro">
            <div>
                <label>Fabricante</label>
                <form:input path="fabricante" /> <br />
            </div>
            <div>
                <label>Numero de Rodas</label>
                <form:input type="number" path="numeroRodas" />
            </div>

            <div>
                <button type="submit">Cadastrar</button>
            </div>
        </form:form>    
    </body>
    </html>

