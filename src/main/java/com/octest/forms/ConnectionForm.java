
package com.octest.forms;

import javax.servlet.http.HttpServletRequest;


public class ConnectionForm {
    
    public void VerifierIdentifiants(HttpServletRequest request){
        String login=request.getParameter("login");
        String password= request.getParameter("password");
        
        if(password.equals(login+"123")){
            resulte="vous etes bien conecté!";
            
        }else{
            resulte="identifiantsincorrect!";
            
        }
    }
      
    
    
    
    private String resulte;

    public String getResulte() {
        return resulte;
    }

    public void setResulte(String resulte) {
        this.resulte = resulte;
    }
    
    
}
