import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Rs{

public static void main(String[] args) throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");  
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","praveen2299");  

        PreparedStatement Np=con.prepareStatement("insert into employee values(?,?,?,?,?)");  
          
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
          
        do{
        System.out.println("ENTER ENO:");  
        int eno=Integer.parseInt(br.readLine());
        System.out.println("ENTER NAME:");  
        String name=br.readLine();  
        System.out.println("ENTER SALARY:");  
        int salary=Integer.parseInt(br.readLine());  
        System.out.println("ENTER MANAGER:"); 
        int manager=Integer.parseInt(br.readLine());
        System.out.println("ENTER DEPT");
        String dept=br.readLine();
          
        Np.setInt(1,eno);  
        Np.setString(2,name);  
        Np.setInt(3,salary);
        Np.setInt(4, manager);
        Np.setString(5, dept);
        int i=Np.executeUpdate();  
        System.out.println(i+" records affected");  
          
        System.out.println("Do you want to continue: y/n");  
        String s=br.readLine();  
        if(s.startsWith("n")){  
        break;  
        }  
        }while(true);  
          
        con.close();  
        }
      

    }