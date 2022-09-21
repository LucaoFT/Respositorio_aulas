/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NewServlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author autologon
 */
public class Formulario extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            
            out.println("<head>");
            out.println("<title>Servlet Formulario</title>");            
            out.println("<meta charset='UTF-8'>");
            out.println("<body>");
            out.println("<div class='container'>");
            out.println("<form class='form-horizontal' action='Calcular' method='post'>");
            out.println("<div class='form-group'>");
            out.println("<label for='inputNota1' class='control-label col-xs-2'>Nota 1:</label>");
            out.println("<div class='col-xs-10'>");
            out.println("<input type='text' class='form-control' id='inputNota1' name='textNota1' placeholder='digite nota1'>");
            out.println("</div");
            out.println("</div");
            out.println("<div class='form-group'>");
            out.println("<label for='inputNota2' class='control-label col-xs-2'>Nota 2:</label>");
            out.println("<div class='col-xs-10'>");
            out.println("<input type='text' class='form-control' id='inputNota2' name='textNota2' placeholder='digite nota2'>");
            out.println("</div");
            out.println("</div");
            out.println("<div class='form-group'>");
            out.println("<div class='col-xs-offset-2 col-xs-10'>");
            out.println("<button type='submit' class'btn btn-primary'>Calcular</button>");
            out.println("</div");
            out.println("</div");
            out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
            out.println("<link rel='stylesheet' href=css/bootstrap.min.css'>");
            out.println("<script src'js/bootstrap.min.js'><;script>");
            out.println("</head>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
