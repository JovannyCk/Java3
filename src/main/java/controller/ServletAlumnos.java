
package controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Alumno;
import model.GeneradorAlumnos;

/**
 * @JovannyCk
 */
public class ServletAlumnos extends HttpServlet {

   
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        ArrayList <Alumno> alumnos=  GeneradorAlumnos.generar();
        ObjectMapper mapper=new ObjectMapper();
        out.println(mapper.writeValueAsString(alumnos));
        
          
        
    }   
  } 
    

   

