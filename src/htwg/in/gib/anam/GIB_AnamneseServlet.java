package htwg.in.gib.anam;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.*;


@SuppressWarnings("serial")
public class GIB_AnamneseServlet extends HttpServlet {
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		req.getRequestDispatcher("../html/Anamnesebogen.html").include(req, resp); 
		
		String logInName = req.getParameter("Klinik");
		
		resp.setContentType("text/plain");
		resp.getWriter().println("Klinikum: " + logInName);
	}
}
