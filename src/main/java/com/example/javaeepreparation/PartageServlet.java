package com.example.javaeepreparation;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "PartageServlet", value = "/PartageServlet")
public class PartageServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        String nom = request.getParameter("nom");
        float prix = Float.parseFloat(request.getParameter("prix"));

        // Créer un objet Article
        Article article = new Article(id, nom, prix);

        // Stocker l'objet Article dans le contexte de l'application
        ServletContext context = getServletContext();
        context.setAttribute("article", article);

        // Rediriger l'utilisateur vers la page d'affichage
        response.sendRedirect("Affichage.jsp");
    }


}
