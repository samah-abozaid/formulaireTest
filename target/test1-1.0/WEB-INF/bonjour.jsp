<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:if test="${!empty form.resulte}">
            <p><c:out value="${form.resulte}"/></p>
        </c:if>
        
         <form method="post" action="test1" >
             <p>
                <label for="login">Login : </label>
                <input type="text" name="login" id="login" />
             </p>
                   <p>
                <label for="password">Password : </label>
                <input type="text" name="password" id="password" />
             </p>
             <input type="submit"/> 
            </form>
        
        
        
 </body>
              
</html>       
          
        
        
    
          
                    

