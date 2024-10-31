package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import concreteclasses.Carro;
import javabeans.BeanUtilities;

/**
 * Servlet implementation class Veiculo
 */

public class Veiculo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Veiculo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		Carro c = new Carro();
		BeanUtilities.populateBean(c, request);
		out.println("<html>");
		out.println("<h1>" + c.getAno() + "</h1>");
		out.println("<h1>" + c.getMarca() + "</h1>");
		out.println("<h1>" + c.getModelo() + "</h1>");
		out.println("</html>");
	}

}
