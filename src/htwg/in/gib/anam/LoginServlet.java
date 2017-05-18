package htwg.in.gib.anam;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class LoginServlet extends HttpServlet {
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

		String username = req.getParameter("Klinik");
		String passwort = req.getParameter("Passwort");

		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		String htmlResponse = "<html>";
		htmlResponse += "<head>";
		htmlResponse += "<body>";
	    htmlResponse +=  "<h2>Ihr Benutzername lautet: " + username + "</h2>";
		htmlResponse += "<h2>Ihr Passwort lautet: " + passwort + "</h2>";
		htmlResponse += "</body>";
		htmlResponse += "</html>";		
		writer.println(htmlResponse);
	}
}
