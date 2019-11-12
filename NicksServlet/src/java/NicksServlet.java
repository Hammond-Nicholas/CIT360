/*
 * Source code is a default template provided in NetBeans
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * Sandbox code provided by NetBeans IDE
 */
public class NicksServlet extends HttpServlet {
    
    @Override
    public void init() throws ServletException {
        // initialize servlet
    }
    
    // form uses POST method, so we are using doPost
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // set response as text/html
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter pw = response.getWriter();
        try {
            // set variables using data from form
            String name = request.getParameter("name");
            String age = request.getParameter("age");
            
            // print back to html file the following
            pw.println("<h1>Servlet NicksServlet at " + request.getContextPath() + "</h1>");
            pw.println("Your name is: "+name);
            pw.println("Your age is: "+age);

        } finally {
            pw.close();
        }
    }
    
    @Override
    public void destroy() {
        // close servlet
    }
}
