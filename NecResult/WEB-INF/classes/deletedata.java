import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class deletedata extends HttpServlet {
  
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String roll = request.getParameter("roll");

    try {
      // Establish connection to the database
      Class.forName("oracle.jdbc.driver.OracleDriver");
      Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "manager");
      
      // Delete child records from the result table
      PreparedStatement ps1 = connection.prepareStatement("DELETE FROM result WHERE roll = ?");
      ps1.setString(1, roll);
      ps1.executeUpdate();
      
      // Delete parent record from the studentdetails table
      PreparedStatement ps2 = connection.prepareStatement("DELETE FROM studentdetails WHERE roll = ?");
      ps2.setString(1, roll);
      ps2.executeUpdate();
      
      // Close the database connection
      connection.close();
      
      // Send success response to the client
      response.setContentType("text/html");
      PrintWriter out = response.getWriter();
      out.println("<html><body><h1>Student with roll number " + roll + " deleted successfully.</h1></body></html>");
      
    } catch (ClassNotFoundException|SQLException e) {
      // Send error response to the client
      response.setContentType("text/html");
      PrintWriter out = response.getWriter();
      out.println("<html><body><h1>Error deleting student with roll number " + roll + ": " + e.getMessage() + "</h1></body></html>");
    }
  }
}
