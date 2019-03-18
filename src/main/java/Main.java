import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.*;
import java.net.URI;
import java.net.URISyntaxException;

public class Main extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    resp.getWriter().print("Khawahish meri aatish bani, kiya kiya magar sazish bani..\r\n" + 
    		"Khawahish meri aatish bani, kiya kiya magar sazish bani..\r\n" + 
    		"\r\n" + 
    		"Cheeny koi sansein meri looty mera chaina\r\n" + 
    		"Soona lagy mera manwa bhujne lage naina\r\n" + 
    		"\r\n" + 
    		"Jaise sitara, taqdeer hara karta raha iltija\r\n" + 
    		"\r\n" + 
    		"Koi chand rakh meri shaam par\r\n" + 
    		"Mera dil jale tere naam par\r\n" + 
    		"\r\n" + 
    		"\r\n" + 
    		"Koi chand rakh meri shaam par\r\n" + 
    		"Mera dil jale tere naam par\r\n" + 
    		"\r\n" + 
    		"Rukhe rukhe se lamhe awarapan ka sila\r\n" + 
    		"Sookhy sookhy se rishtey bheega bheega gila\r\n" + 
    		"\r\n" + 
    		"Rukhe rukhe se lamhe awarapan ka sila\r\n" + 
    		"Sookhy sookhy se rishtey bheega bheega gila\r\n" + 
    		"\r\n" + 
    		"Shab-o-roz ka milna tha kya murjha ke youn khilna tha kya\r\n" + 
    		"Dil tha mera toota hua kehta tha bhujta hua\r\n" + 
    		"\r\n" + 
    		"Koi chand rakh meri shaam par mera dil jale tere naam par\r\n" + 
    		"Koi chand rakh meri shaam par mera dil jale tere naam par\r\n" + 
    		"\r\n" + 
    		"Soona soona wo rasta kab meri manzil hua\r\n" + 
    		"Khooya khooya wo milna kitna mushkil hua\r\n" + 
    		"\r\n" + 
    		"Soona soona wo rasta kab meri manzil hua\r\n" + 
    		"Khooya khooya wo milna kitna mushkil hua\r\n" + 
    		"\r\n" + 
    		"Do jism they roohein na thin, milna agar mumkin nahi\r\n" + 
    		"Tu chor de is haal per, sunn le magar ye dua..\r\n" + 
    		"\r\n" + 
    		"Koi chand rakh meri shaam par\r\n" + 
    		"Mera dil jale tere naam par\r\n" + 
    		"\r\n" + 
    		"Koi chand rakh meri shaam par\r\n" + 
    		"Mera dil jale tere naam par..!");
  }
}
