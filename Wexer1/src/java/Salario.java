
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
public class Salario extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        Double salario = Double.parseDouble(request.getParameter("salario"));
        
        double fgts = (salario * 8) /100; 
        double inss = 0;
        double ir = 0;
        double soma =0;
        
        if(salario <=1045.00){
               inss = (salario*7.5)/100;
               
                
            }else if(salario >1045.01 && salario<=2089.60){
                inss = (salario*9)/100;
                
            }else if(salario>2089.61 && salario<=3134.40){
                inss = (salario*12)/100;
                
            }else if(salario>3134.41){
                inss = (salario*14)/100;
                
            }
            
            if(salario < 1903.98){
                ir = 0;
            }else if(salario>1903.99 && salario<=2826.65){
                ir = (salario*7.5)/100;
                
            }else if(salario>2826.66 && salario <=3751.05){
                ir = (salario*15)/100;
                
            }else if(salario>3751.06 && salario<=4664.68){
                ir = (salario*22.5)/100;
                
            }else if(salario>4664.68){
                ir=(salario*27.5)/100;
                
            }
            soma = salario  - inss - ir;
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Salario</title>");            
            out.println("</head>");
            out.println("<body>");
            
            
            out.println("Salario Bruto " + salario + "<br\">"
                       +"FGTS " + fgts + "<br><hr>"
                       +"INSS " + inss + "<br>"
                       +"<h4>IR " + ir + "</h4><br>"
                       +"<h2>Salario Liquido" + soma
            
            );
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

    private String Float(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
