package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @JovannyCk
 */
public class ServletAutenticar extends HttpServlet {

 
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //response.setContentType("text/html;charset=UTF-8");
        //PrintWriter out = response.getWriter();
        //out.println("Este es mi primer servelt!");
       String login= request.getParameter("login");
       String password= request.getParameter("password");
        //Crear un atributo MVC para ser conpartidfo con las vistas
       request.setAttribute("usuario", login);
          RequestDispatcher despachador=request.getRequestDispatcher("/binevenida.jsp");
          despachador.forward(request, response);
          
    }
}
