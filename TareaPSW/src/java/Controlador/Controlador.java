/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controlador;

import BaseDa.ProblemasDAO;
import Problemas.Problema1;
import Problemas.Problema5;
import Problemas.Problema8;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse; 
/**
 *
 * @author artem
 */
public class Controlador extends HttpServlet {
    Problema1 proUn;
    Problema5 proCin;
    Problema8 proOcho;
    ProblemasDAO proD=new ProblemasDAO();
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Controles</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Se ha registrado exitosamente " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
    
        String problemas=request.getParameter("acts");
        
        if (problemas.equalsIgnoreCase("interes"))
        {
        String nombre=request.getParameter("nombre");
        double capital=Double.parseDouble(request.getParameter("dinero"));
        proUn=new Problema1(nombre, capital);
        proUn.calcular();
        proD.registrarUn(proUn);
        }
        else if (problemas.equalsIgnoreCase("porc")){
            String grupo=request.getParameter("grupo");
            int numH=Integer.parseInt(request.getParameter("numNo"));
            int numM=Integer.parseInt(request.getParameter("numNa"));
            proCin=new Problema5(grupo, numH, numM);
            proCin.porcentaje();
            proD.registrarCin(proCin);
        }
        else if(problemas.equalsIgnoreCase("mayor"))
        {
        System.out.println("1");
        int numUn=Integer.parseInt(request.getParameter("num1"));
        int numDos=Integer.parseInt(request.getParameter("num2"));
        int numTres=Integer.parseInt(request.getParameter("num3"));
        proOcho =new Problema8(numUn, numDos, numTres);
        proOcho.mayor();
        proD.registrarOcho(proOcho);
        }
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
