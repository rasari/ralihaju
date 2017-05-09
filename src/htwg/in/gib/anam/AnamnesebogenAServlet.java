package htwg.in.gib.anam;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class AnamnesebogenAServlet extends HttpServlet{
	
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException{
		String xy = req.getParameter("Test");
		
		resp.setContentType("text/html");
		String htmlResp = "<html>";
		htmlResp += "<head>";
		htmlResp += "<body>";
		PrintWriter writer = resp.getWriter();
		
		writer.println();
	}

}
