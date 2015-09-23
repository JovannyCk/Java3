<%-- 
    Document   : binevenida
    Created on : 22/09/2015, 09:16:27 PM
    Author     : T-107
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Bienvenido a la pagina de administracion</h1>
        <p>Aqui pondremos mas cosas mas adelante!</p>
        <%
            out.println("Hola" +request.getAttribute("usuario").toString());
            %>
    </body>
</html>
