package server;

import javax.xml.ws.Endpoint;
//import java.util.ArrayList;
 //import java.util.Date;
//import java.util.List;

// import classes.compte;
import service.BanqueService;

public class Server {

    public static void main(String[] args) {
        //List<compte> accounts = new ArrayList<>();
      //  accounts.add(new compte(20F, new Date(), 23));

        String endpointURL = "http://localhost:5555/";
        Endpoint.publish(endpointURL, new BanqueService());

        System.out.println("Server is running at: " + endpointURL);
    }
}	