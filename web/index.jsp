<%-- 
    Document   : index
    Created on : Aug 21, 2011, 12:39:26 PM
    Author     : anderson
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>


 <jsp:useBean id="bibliotex" scope="session" class="edu.ritter.poo.Bibliotex" />
 

 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> 
            <%= bibliotex.getName() %>
            <%= bibliotex.getVersion() %>
        
        
        </title>
       
    </head>
    <body>
        <h1><%= bibliotex.getName() %>
            <%= bibliotex.getVersion() %>
            Administração
        </h1>
            <% bibliotex.saveIDK(); %>
        <a href="cadastro.jsp">Cadastro de Livros</a>
        <br>
        <a href="busca.jsp">Busca de Livros</a>
        <br>
        
         <%= new java.util.Date()%>
      
    </body>
</html>
