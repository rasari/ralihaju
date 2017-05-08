package htwg.in.gib.anam;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class GIB_AnamneseServlet extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello ich teste die world");
	}
}
