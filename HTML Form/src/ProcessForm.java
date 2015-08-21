import java.io.IOException;
import java.util.Properties;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ProcessForm")
public class ProcessForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ProcessForm() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String first = request.getParameter("firstname");
    	String last = request.getParameter("lastname");
        String species = request.getParameter("species");
        String descrip = request.getParameter("description");
        
        String total = first + " " + last + " species: " + species + ", description: " + descrip;
        
		request.setAttribute("total", total);
		getServletContext().getRequestDispatcher("/output.jsp").forward(request, response);
        
	
	}

}
