<%@ page import="com.example.javaeepreparation.Article" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="jakarta.servlet.GenericServlet"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Affichage de l'article</h1>
<%!
    // Récupérer l'objet Article à partir du contexte de l'application
    ServletContext context = getServletConfig().getServletContext();
    Article article = (Article) context.getAttribute("article");
%>
<p>ID: <%= article.getId() %></p>
<p>Nom: <%= article.getNom() %></p>
<p>Prix: <%= article.getPrix() %></p>
</body>
</html>
