import java.io.*;  
import java.sql.*;  
import javax.servlet.http.*; 
import javax.servlet.*; 

public class adlog extends HttpServlet {

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		PrintWriter out = response.getWriter();
		try { 

			Class.forName("oracle.jdbc.driver.OracleDriver");  
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
			PreparedStatement stmt = conn.prepareStatement("SELECT * FROM adlog WHERE username = ? AND password = ?");
			stmt.setString(1, username);
			stmt.setString(2, password);
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) 
			{
				response.sendRedirect("adminlog.html");
			} 
			else 
			{
                // PrintWriter out = response.getWriter();
				// response.sendRedirect("adlog.html");
                // out.println("<html><body><h1>invalid credentials</h1><html><body>");
				 response.setContentType("text/html");
  				//  out.println("<meta http-equiv='refresh' content='3;URL=adlog.html'>");//redirects after 3 seconds
   				//  out.println("<p style='color:red;'>User or password incorrect!</p>");


				out.println("<script type=\"text/javascript\" >");
  				out.println("alert('User or password incorrect');");
  				out.println("location='adlog.html';");
   				out.println("</script>");

					}
			}
			
			
		catch (Exception e) 
			{
			e.printStackTrace();
			} 
		
	}
}
