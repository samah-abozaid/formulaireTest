

import com.octest.forms.ConnectionForm;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrateur
 */
@WebServlet(urlPatterns = {"/test1"})
public class test1 extends HttpServlet {

    
    
  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        request.getServletContext().getRequestDispatcher("/WEB-INF/bonjour.jsp").forward(request, response);
        
        
       
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ConnectionForm form=new ConnectionForm();
        form.VerifierIdentifiants(request);
        
        
        request.setAttribute("form", form);
         request.getServletContext().getRequestDispatcher("/WEB-INF/bonjour.jsp").forward(request, response);
        
        
       
    }

    

}
