import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class usersearch extends HttpServlet {
 
  public void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();

    String roll = request.getParameter("roll");

    try {
      Class.forName("oracle.jdbc.driver.OracleDriver");
      Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "manager");
      PreparedStatement sp = conn.prepareStatement("select * from studentdetails where roll=?");
      sp.setString(1,roll);
      ResultSet sr = sp.executeQuery();
      PreparedStatement ps = conn.prepareStatement("SELECT subject.subjectcode, subject.subjectname, result.subjectgrade, result.subjectgradepoint, result.subjectcredits FROM result INNER JOIN subject ON result.subjectcode = subject.subjectcode WHERE result.roll = ? order by subjectcode");
      ps.setString(1, roll);
      ResultSet rs = ps.executeQuery();

      out.println("<html>");
      out.println("<head>");
      out.println("<title> Result</title>");
      out.println("<link rel=stylesheet href=usertable.css ");
      out.println("</head>");
      out.println("<body bgcolor=#c2e4f9>");
      out.println("<h1 align=center >EXAMINATION SECTION</h1>");

      out.println("<br><br><br>");

      out.println("<p align=center><b>2020-BATCH-III B.TECH SEMISTER-REGULAR RESULTS BEFORE REVALUATION</b></p><br>");
      out.println("<div align=center >");
      out.println("<table border=2 align=center ");
      out.println("<tr align=center class=headings >");
      out.println("<th >HTNO</th>");
      out.println("<th >Branch</th>");
      out.println("<th >Name</th>");
      out.println("</tr>");
      
      while (sr.next()) {
        out.println("<tr align=center>");
        out.println("<td>" + sr.getString(1).toUpperCase() + "</td>");
        out.println("<td>" + sr.getString(2).toUpperCase() + "</td>");
        out.println("<td>" + sr.getString(3).toUpperCase() + "</td>");
        out.println("</tr>");
      }
      out.println("</table>");
      
      
      out.println("<br><br><br>");
      out.println("<table width=50% height=50% border=2 align=center ");
      out.println("<tr align=center class=headings >");
      out.println("<th >Subject Code</th>");
      out.println("<th >Subject Title</th>");
      out.println("<th >Grade</th>");
      out.println("<th >Grade Point</th>");
      out.println("<th >Credits</th>");
      out.println("</tr>");
      while (rs.next()) {
        out.println("<tr align=center>");
        out.println("<td>" + rs.getString(1).toUpperCase() + "</td>");
        out.println("<td>" + rs.getString(2).toUpperCase() + "</td>");
        out.println("<td>" + rs.getString(3).toUpperCase() + "</td>");
        out.println("<td>" + rs.getString(4).toUpperCase() + "</td>");
        out.println("<td>" + rs.getString(5).toUpperCase() + "</td>");
        out.println("</tr>");
      }
      out.println("<br>");
      out.println("</div>");
      out.println("</cite>");
      out.println("</body>");
      out.println("</html>");

      conn.close();
    } catch (ClassNotFoundException | SQLException e) {
      e.printStackTrace();
    }
  }
}
