import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;


public class update extends HttpServlet {
 
  public void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();

    String roll = request.getParameter("roll");
    String branch = request.getParameter("branch");
    String name = request.getParameter("name");
    String subcode = request.getParameter("subcode");
    String grade = request.getParameter("grade");
    String gradepoint = request.getParameter("gradepoint");
    String credits= request.getParameter("credits");

    try {
      Class.forName("oracle.jdbc.driver.OracleDriver");
      Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "manager");
     
      PreparedStatement ps1 = conn.prepareStatement("update studentdetails set branch=?, name=? where roll=?");
      ps1.setString(1,branch);
      ps1.setString(2,name);
      ps1.setString(3,roll);
      ps1.executeUpdate();
    

      PreparedStatement ps2 = conn.prepareStatement("update result set subjectgrade=?,subjectgradepoint=?,subjectcredits=? where roll=? and subjectcode=?");
      ps2.setString(1,grade);
      ps2.setString(2,gradepoint);
      ps2.setString(3,credits);
      ps2.setString(4,roll);
      ps2.setString(5,subcode);
      ps2.executeUpdate();
      

    conn.close();
     
     
      
      // Send success response to the client
     

      out.println("<html><body><h1>Student with roll number " + roll + " updated successfully.</h1></body></html>");
      
    } 
    
    catch (ClassNotFoundException|SQLException e) {
      // Send error response to the client
     
    
      out.println("<html><body><h1>Error updating student with roll number " + roll + ": " + e.getMessage() + "</h1></body></html>");
    }


 }
}