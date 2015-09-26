/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author silva
 */
public class MainServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void doGet (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String nomeUsuario = request.getParameter("nomeusuario");
            String nota = request.getParameter("nota");
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet MainServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet MainServlet at " + request.getContextPath() + "</h1>");
            out.println("Digite seu nome: <br>");
            out.println("<FORM name=\"+\"loginForm\" ACTION=\"FromServlet.do\" METHOD=\"POST\">");
            out.println("<INPUT TYPE=\"TEXT\" NAME=\"nomeUsuario\" VALUE=\"" + nomeUsuario  + "\"/>");
            out.println("<br> Digite sua nota: <br>");
            out.println("<INPUT TYPE=\"TEXT\" NAME=\"nota\" VALUE=\"" + nota + "\"/>");
            out.println("<br>");
            out.println("<INPUT TYPE=\"SUBMIT\" >");
            out.println("</FORM>");
            out.println("</body>");
            out.println("</html>");
        }
    }
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        processRequest(request, response);
//    }
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        processRequest(request, response);
//    }
}
