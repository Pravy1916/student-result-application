import java.io.*;  
import java.sql.*;  
import javax.servlet.*;  
import javax.servlet.http.*;  
  public class insert extends HttpServlet {    
public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
                response.setContentType("text/html");
                PrintWriter out =response.getWriter();
                String roll,branch,name,sub1,sub2,sub3,sub4,sub5,sub6,sub7,sub8,sub9,sub10;
                String sub1grade,sub2grade,sub3grade,sub4grade,sub5grade,sub6grade,sub7grade,sub8grade,sub9grade,sub10grade;
                String sub1gradepoint,sub2gradepoint,sub3gradepoint,sub4gradepoint,sub5gradepoint,sub6gradepoint,sub7gradepoint,sub8gradepoint,sub9gradepoint,sub10gradepoint;
                String sub1credits,sub2credits,sub3credits,sub4credits,sub5credits,sub6credits,sub7credits,sub8credits,sub9credits,sub10credits;
                // stdent details
                roll=(String)request.getParameter("roll");
                branch=(String)request.getParameter("branch");
                name=(String)request.getParameter("name");
                       
                        // result details
                
                // subjects
                sub1=(String)request.getParameter("sub1");
                sub2=(String)request.getParameter("sub2");
                sub3=(String)request.getParameter("sub3");
                sub4=(String)request.getParameter("sub4");
                sub5=(String)request.getParameter("sub5");
                sub6=(String)request.getParameter("sub6");
                sub7=(String)request.getParameter("sub7");
                sub8=(String)request.getParameter("sub8");
                sub9=(String)request.getParameter("sub9");
                sub10=(String)request.getParameter("sub10");
                // subject grade
                sub1grade=(String)request.getParameter("sub1grade");
                sub2grade=(String)request.getParameter("sub2grade");
                sub3grade=(String)request.getParameter("sub3grade");
                sub4grade=(String)request.getParameter("sub4grade");
                sub5grade=(String)request.getParameter("sub5grade");
                sub6grade=(String)request.getParameter("sub6grade");
                sub7grade=(String)request.getParameter("sub7grade");
                sub8grade=(String)request.getParameter("sub8grade");
                sub9grade=(String)request.getParameter("sub9grade");
                sub10grade=(String)request.getParameter("sub10grade");
                // subject gradepoint
                sub1gradepoint=(String)request.getParameter("sub1gradepoint");
                sub2gradepoint=(String)request.getParameter("sub2gradepoint");
                sub3gradepoint=(String)request.getParameter("sub3gradepoint");
                sub4gradepoint=(String)request.getParameter("sub4gradepoint");
                sub5gradepoint=(String)request.getParameter("sub5gradepoint");
                sub6gradepoint=(String)request.getParameter("sub6gradepoint");
                sub7gradepoint=(String)request.getParameter("sub7gradepoint");
                sub8gradepoint=(String)request.getParameter("sub8gradepoint");
                sub9gradepoint=(String)request.getParameter("sub9gradepoint");
                sub10gradepoint=(String)request.getParameter("sub10gradepoint");

                // subject credits
                sub1credits=(String)request.getParameter("sub1credits");
                sub2credits=(String)request.getParameter("sub2credits");
                sub3credits=(String)request.getParameter("sub3credits");
                sub4credits=(String)request.getParameter("sub4credits");
                sub5credits=(String)request.getParameter("sub5credits");
                sub6credits=(String)request.getParameter("sub6credits");
                sub7credits=(String)request.getParameter("sub7credits");
                sub8credits=(String)request.getParameter("sub8credits");
                sub9credits=(String)request.getParameter("sub9credits");
                sub10credits=(String)request.getParameter("sub10credits");


          int count=0;         
      
          
            // // for subject 1
                if(sub1grade.length()>0)
                {
                  if(sub1grade.equals("A+")||sub1grade.equals("a+"))
                  {
                    sub1gradepoint="10";
                    sub1credits="3.0";
                     count=count+1;
                  }
                  else if(sub1grade.equals("A")||sub1grade.equals("a"))
                  {
                    sub1gradepoint="9";
                    sub1credits="3.0";
                     count=count+1;
                  }
                  else if(sub1grade.equals("B")||sub1grade.equals("b"))
                  {
                    sub1gradepoint="8";
                    sub1credits="3.0";
                     count=count+1;
                  }
                  else if(sub1grade.equals("C")||sub1grade.equals("c"))
                  {
                    sub1gradepoint="7";
                    sub1credits="3.0";
                     count=count+1;
                  }
                  else if(sub1grade.equals("D")||sub1grade.equals("d"))
                  {
                    sub1gradepoint="6";
                    sub1credits="3.0";
                     count=count+1;
                  }
                  else if(sub1grade.equals("E")||sub1grade.equals("e"))
                  {
                    sub1gradepoint="5";
                    sub1credits="3.0";
                     count=count+1;
                  }
                  else if(sub1grade.equals("F")||sub1grade.equals("f"))
                  {
                    sub1gradepoint="0";
                    sub1credits="0.0";
                     count=count+1;
                  }
                    else if(sub1grade.equals("S")||sub1grade.equals("s")){
                     sub1gradepoint="0";
                    sub1credits="0.0";
                     count=count+1;
                  }

                }

              // for subject 2
                if(sub2grade.length()>0)
                {
                  if(sub2grade.equals("A+")||sub2grade.equals("a+"))
                  {
                    sub2gradepoint="10";
                    sub2credits="3.0";
                     count=count+1;
                  }
                  else if(sub2grade.equals("A")||sub2grade.equals("a"))
                  {
                    sub2gradepoint="9";
                    sub2credits="3.0";
                     count=count+1;
                  }
                  else if(sub2grade.equals("B")||sub2grade.equals("b"))
                  {
                    sub2gradepoint="8";
                    sub2credits="3.0";
                     count=count+1;
                  }
                  else if(sub2grade.equals("C")||sub2grade.equals("c"))
                  {
                    sub2gradepoint="7";
                    sub2credits="3.0";
                     count=count+1;
                  }
                  else if(sub2grade.equals("D")||sub2grade.equals("d"))
                  {
                    sub2gradepoint="6";
                    sub2credits="3.0";
                     count=count+1;
                  }
                  else if(sub2grade.equals("E")||sub2grade.equals("e"))
                  {
                    sub2gradepoint="5";
                    sub2credits="3.0";
                     count=count+1;
                  }
                  else if(sub2grade.equals("F")||sub2grade.equals("f"))
                  {
                    sub2gradepoint="0";
                    sub2credits="0.0";
                     count=count+1;
                  }
                  else if(sub2grade.equals("S")||sub2grade.equals("s")){
                     sub2gradepoint="0";
                    sub2credits="0.0";
                     count=count+1;
                  }
                
                }

        // for subject 3
           if(sub3grade.length()>0)
                {
                  if(sub3grade.equals("A+")||sub3grade.equals("a+"))
                  {
                    sub3gradepoint="10";
                    sub3credits="3.0";
                     count=count+1;
                  }
                  else if(sub3grade.equals("A")||sub3grade.equals("a"))
                  {
                    sub3gradepoint="9";
                    sub3credits="3.0";
                     count=count+1;
                  }
                  else if(sub3grade.equals("B")||sub3grade.equals("b"))
                  {
                    sub3gradepoint="8";
                    sub3credits="3.0";
                     count=count+1;
                  }
                  else if(sub3grade.equals("C")||sub3grade.equals("c"))
                  {
                    sub3gradepoint="7";
                    sub3credits="3.0";
                     count=count+1;
                  }
                  else if(sub3grade.equals("D")||sub3grade.equals("d"))
                  {
                    sub3gradepoint="6";
                    sub3credits="3.0";
                     count=count+1;
                  }
                  else if(sub3grade.equals("E")||sub3grade.equals("e"))
                  {
                    sub3gradepoint="5";
                    sub3credits="3.0";
                     count=count+1;
                  }
                  else if(sub3grade.equals("F")||sub3grade.equals("f"))
                  {
                    sub3gradepoint="0";
                    sub3credits="0.0";
                     count=count+1;
                  }

                  else if(sub3grade.equals("S")||sub3grade.equals("s")){
                     sub3gradepoint="0";
                    sub3credits="0.0";
                     count=count+1;
                  }
          
              }
                 
                 
                  


           // for subject 4
                 if(sub4grade.length()>0)
                {
                  if(sub4grade.equals("A+")||sub4grade.equals("a+"))
                  {
                    sub4gradepoint="10";
                    sub4credits="3.0";
                     count=count+1;
                  }
                  else if(sub4grade.equals("A")||sub4grade.equals("a"))
                  {
                    sub4gradepoint="9";
                    sub4credits="3.0";
                     count=count+1;
                  }
                  else if(sub4grade.equals("B")||sub4grade.equals("b"))
                  {
                    sub4gradepoint="8";
                    sub4credits="3.0";
                     count=count+1;
                  }
                  else if(sub4grade.equals("C")||sub4grade.equals("c"))
                  {
                    sub4gradepoint="7";
                    sub4credits="3.0";
                     count=count+1;
                  }
                  else if(sub4grade.equals("D")||sub4grade.equals("d"))
                  {
                    sub4gradepoint="6";
                    sub4credits="3.0";
                     count=count+1;
                  }
                  else if(sub4grade.equals("E")||sub4grade.equals("e"))
                  {
                    sub4gradepoint="5";
                    sub4credits="3.0";
                     count=count+1;
                  }
                  else if(sub4grade.equals("F")||sub4grade.equals("f"))
                  {
                    sub4gradepoint="0";
                    sub4credits="0.0";
                     count=count+1;
                  }
                    else if(sub4grade.equals("S")||sub4grade.equals("s")){
                     sub4gradepoint="0";
                    sub4credits="0.0";
                     count=count+1;
                  }
                

              }

              // for subject 5
                 if(sub5grade.length()>0)
                {
                  if(sub5grade.equals("A+")||sub5grade.equals("a+"))
                  {
                    sub5gradepoint="10";
                    sub5credits="1.5";
                     count=count+1;
                  }
                  else if(sub5grade.equals("A")||sub5grade.equals("a"))
                  {
                    sub5gradepoint="9";
                    sub5credits="1.5";
                     count=count+1;
                  }
                  else if(sub5grade.equals("B")||sub5grade.equals("b"))
                  {
                    sub5gradepoint="8";
                    sub5credits="1.5";
                     count=count+1;
                  }
                  else if(sub5grade.equals("C")||sub5grade.equals("c"))
                  {
                    sub5gradepoint="7";
                    sub5credits="1.5";
                     count=count+1;
                  }
                  else if(sub5grade.equals("D")||sub5grade.equals("d"))
                  {
                    sub5gradepoint="6";
                    sub5credits="1.5";
                     count=count+1;
                  }
                  else if(sub5grade.equals("E")||sub5grade.equals("e"))
                  {
                    sub5gradepoint="5";
                    sub5credits="1.5";
                     count=count+1;
                  }
                  else if(sub5grade.equals("F")||sub5grade.equals("f"))
                  {
                    sub5gradepoint="0";
                    sub5credits="0.0";
                     count=count+1;
                  }
                    else if(sub5grade.equals("S")||sub5grade.equals("s")){
                     sub5gradepoint="0";
                    sub5credits="0.0";
                     count=count+1;
                  }
                

              }


              // for subject 6
                 if(sub6grade.length()>0)
                {
                  if(sub6grade.equals("A+")||sub6grade.equals("a+"))
                  {
                    sub6gradepoint="10";
                    sub6credits="1.5";
                     count=count+1;
                  }
                  else if(sub6grade.equals("A")||sub6grade.equals("a"))
                  {
                    sub6gradepoint="9";
                    sub6credits="1.5";
                     count=count+1;
                  }
                  else if(sub6grade.equals("B")||sub6grade.equals("b"))
                  {
                    sub6gradepoint="8";
                    sub6credits="1.5";
                     count=count+1;
                  }
                  else if(sub6grade.equals("C")||sub6grade.equals("c"))
                  {
                    sub6gradepoint="7";
                    sub6credits="1.5";
                     count=count+1;
                  }
                  else if(sub6grade.equals("D")||sub6grade.equals("d"))
                  {
                    sub6gradepoint="6";
                    sub6credits="1.5";
                     count=count+1;
                  }
                  else if(sub6grade.equals("E")||sub6grade.equals("e"))
                  {
                    sub6gradepoint="5";
                    sub6credits="1.5";
                     count=count+1;
                  }
                  else if(sub6grade.equals("F")||sub6grade.equals("f"))
                  {
                    sub6gradepoint="0";
                    sub6credits="0.0";
                     count=count+1;;
                  }
                    else if(sub6grade.equals("S")||sub6grade.equals("s")){
                     sub6gradepoint="0";
                    sub6credits="0.0";
                     count=count+1;
                  }
              

              }

              // for subject 7

                 if(sub7grade.length()>0)
                {
                  if(sub7grade.equals("A+")||sub7grade.equals("a+"))
                  {
                    sub7gradepoint="10";
                    sub7credits="0.0";
                     count=count+1;
                  }
                  else if(sub7grade.equals("A")||sub7grade.equals("a"))
                  {
                    sub7gradepoint="9";
                    sub7credits="0.0";
                     count=count+1;
                  }
                  else if(sub7grade.equals("B")||sub7grade.equals("b"))
                  {
                    sub7gradepoint="8";
                    sub7credits="0.0";
                     count=count+1;
                  }
                  else if(sub7grade.equals("C")||sub7grade.equals("c"))
                  {
                    sub7gradepoint="7";
                    sub7credits="0.0";
                     count=count+1;
                  }
                  else if(sub7grade.equals("D")||sub7grade.equals("d"))
                  {
                    sub7gradepoint="6";
                    sub7credits="0.0";
                     count=count+1;
                  }
                  else if(sub7grade.equals("E")||sub7grade.equals("e"))
                  {
                    sub7gradepoint="5";
                    sub7credits="0.0";
                     count=count+1;
                  }
                  else if(sub7grade.equals("F")||sub7grade.equals("f"))
                  {
                    sub7gradepoint="0";
                    sub7credits="0.0";
                     count=count+1;
                  }
                  else if(sub7grade.equals("S")||sub7grade.equals("s")){
                     sub7gradepoint="0";
                    sub7credits="0.0";
                     count=count+1;
                  }
                

              }


              // for subject 8

                 if(sub8grade.length()>0)
                {
                  if(sub8grade.equals("A+")||sub8grade.equals("a+"))
                  {
                    sub8gradepoint="10";
                    sub8credits="2.0";
                     count=count+1;
                  }
                  else if(sub8grade.equals("A")||sub8grade.equals("a"))
                  {
                    sub8gradepoint="9";
                    sub8credits="2.0";
                     count=count+1;
                  }
                  else if(sub8grade.equals("B")||sub8grade.equals("b"))
                  {
                    sub8gradepoint="8";
                    sub8credits="2.0";
                     count=count+1;
                  }
                  else if(sub8grade.equals("C")||sub8grade.equals("c"))
                  {
                    sub8gradepoint="7";
                    sub8credits="2.0";
                     count=count+1;
                  }
                  else if(sub8grade.equals("D")||sub8grade.equals("d"))
                  {
                    sub8gradepoint="6";
                    sub8credits="2.0";
                     count=count+1;
                  }
                  else if(sub8grade.equals("E")||sub8grade.equals("e"))
                  {
                    sub8gradepoint="5";
                    sub8credits="2.0";
                     count=count+1;
                  }
                  else if(sub8grade.equals("F")||sub8grade.equals("f"))
                  {
                    sub8gradepoint="0";
                    sub8credits="0.0";
                     count=count+1;
                  }
                  else if(sub8grade.equals("S")||sub8grade.equals("s")){
                     sub8gradepoint="0";
                    sub8credits="0.0";
                     count=count+1;
                  }

               

              }


              // for subject 9

                 if(sub9grade.length()>0)
                {
                  if(sub9grade.equals("A+")||sub9grade.equals("a+"))
                  {
                    sub9gradepoint="10";
                    sub9credits="3.0";
                     count=count+1;
                  }
                  else if(sub9grade.equals("A")||sub9grade.equals("a"))
                  {
                    sub9gradepoint="9";
                    sub9credits="3.0";
                     count=count+1;
                  }
                  else if(sub9grade.equals("B")||sub9grade.equals("b"))
                  {
                    sub9gradepoint="8";
                    sub9credits="3.0";
                     count=count+1;
                  }
                  else if(sub9grade.equals("C")||sub9grade.equals("c"))
                  {
                    sub9gradepoint="7";
                    sub9credits="3.0";
                     count=count+1;
                  }
                  else if(sub9grade.equals("D")||sub9grade.equals("d"))
                  {
                    sub9gradepoint="6";
                    sub9credits="3.0";
                     count=count+1;
                  }
                  else if(sub9grade.equals("E")||sub9grade.equals("e"))
                  {
                    sub9gradepoint="5";
                    sub9credits="3.0";
                     count=count+1;
                  }
                  else if(sub9grade.equals("F")||sub9grade.equals("f"))
                  {
                    sub9gradepoint="0";
                    sub9credits="0.0";
                     count=count+1;
                  }
                  else if(sub9grade.equals("S")||sub9grade.equals("s")){
                     sub9gradepoint="0";
                    sub9credits="0.0";
                     count=count+1;
                  }

                 
              }

              // for subject 10
                 if(sub10grade.length()>0)
                {
                  if(sub10grade.equals("A+")||sub10grade.equals("a+"))
                  {
                    sub10gradepoint="10";
                    sub10credits="1.5";
                     count=count+1;
                  }
                  else if(sub10grade.equals("A")||sub10grade.equals("a"))
                  {
                    sub10gradepoint="9";
                    sub10credits="1.5";
                     count=count+1;
                  }
                  else if(sub10grade.equals("B")||sub10grade.equals("b"))
                  {
                    sub10gradepoint="8";
                    sub10credits="1.5";
                     count=count+1;
                  }
                  else if(sub10grade.equals("C")||sub10grade.equals("c"))
                  {
                    sub10gradepoint="7";
                    sub10credits="1.5";
                     count=count+1;
                  }
                  else if(sub10grade.equals("D")||sub10grade.equals("d"))
                  {
                    sub10gradepoint="6";
                    sub10credits="1.5";
                     count=count+1;
                  }
                  else if(sub10grade.equals("E")||sub10grade.equals("e"))
                  {
                    sub10gradepoint="5";
                    sub10credits="1.5";
                     count=count+1;
                  }
                  else if(sub10grade.equals("F")||sub10grade.equals("f"))
                  {
                    sub10gradepoint="0";
                    sub10credits="0.0";
                     count=count+1;
                  }
                  else if(sub10grade.equals("S")||sub10grade.equals("s")){
                    sub10gradepoint="0";
                    sub10credits="0.0";
                     count=count+1;
                  }


                }



 if(count==10)
 {

 


        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");  
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");  
            Statement st=con.createStatement();
            String std="insert into studentdetails values('"+roll+"','"+branch+"','"+name+"')" ;
            String s1="insert into result values('"+roll+"','"+branch+"','"+sub1+"','"+sub1grade+"','"+sub1gradepoint+"','"+sub1credits+"')";
            String s2="insert into result values('"+roll+"','"+branch+"','"+sub2+"','"+sub2grade+"','"+sub2gradepoint+"','"+sub2credits+"')";
            String s3="insert into result values('"+roll+"','"+branch+"','"+sub3+"','"+sub3grade+"','"+sub3gradepoint+"','"+sub3credits+"')";
            String s4="insert into result values('"+roll+"','"+branch+"','"+sub4+"','"+sub4grade+"','"+sub4gradepoint+"','"+sub4credits+"')";
            String s5="insert into result values('"+roll+"','"+branch+"','"+sub5+"','"+sub5grade+"','"+sub5gradepoint+"','"+sub5credits+"')";
            String s6="insert into result values('"+roll+"','"+branch+"','"+sub6+"','"+sub6grade+"','"+sub6gradepoint+"','"+sub6credits+"')";
            String s7="insert into result values('"+roll+"','"+branch+"','"+sub7+"','"+sub7grade+"','"+sub7gradepoint+"','"+sub7credits+"')";
            String s8="insert into result values('"+roll+"','"+branch+"','"+sub8+"','"+sub8grade+"','"+sub8gradepoint+"','"+sub8credits+"')";
            String s9="insert into result values('"+roll+"','"+branch+"','"+sub9+"','"+sub9grade+"','"+sub9gradepoint+"','"+sub9credits+"')";
            String s10="insert into result values('"+roll+"','"+branch+"','"+sub10+"','"+sub10grade+"','"+sub10gradepoint+"','"+sub10credits+"')";
            
            int a=st.executeUpdate(std);
            int b=st.executeUpdate(s1);
            int c=st.executeUpdate(s2);
            int d=st.executeUpdate(s3);
            int e=st.executeUpdate(s4);
            int f=st.executeUpdate(s5);
            int g=st.executeUpdate(s6);
            int h=st.executeUpdate(s7);
            int i=st.executeUpdate(s8);
            int j=st.executeUpdate(s9);
            int k=st.executeUpdate(s10);

            if((a>0)&&(b>0)&&(c>0)&&(d>0)&&(e>0)&&(f>0)&&(g>0)&&(h>0)&&(i>0)&&(j>0)&&(k>0))
            {
               
                out.println("<html><body><h1>Student with roll number " + roll + " inserted succesful successfully.</h1></body></html>");
            }
            else{
                out.println("not inserted");
            }
           st.close();
           con.close();    
         } 
    
      catch (ClassNotFoundException|SQLException e) {
      // Send error response to the client
      out.println("<html><body><h1>Error inserting student with roll number " + roll + ": " + e.getMessage() + "</h1></body></html>");
      }

 }
            
else{
  response.sendRedirect("error.html");
}

}
}
  
