package in.ac.vce;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String n="ramya";
		Cookie ck=new Cookie("username", n);//creating cookie object  
	    response.addCookie(ck);
	    HttpSession session = request.getSession(true);
	    Date lastAccessTime = new Date(session.getLastAccessedTime());
	    response.setContentType("text/html");
	      PrintWriter out = response.getWriter();
	    String docType =
	            "<!doctype html public \"-//w3c//dtd html 4.0 " +
	            "transitional//en\">\n";
	    
		out.println(docType +
	            "<html>\n" +
	               "<body>"+
	            "<p>Time of Last Access"+lastAccessTime+"</p></body>"+
	           " </html>"
	    	      );
	}

}
