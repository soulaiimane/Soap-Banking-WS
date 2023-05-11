package org.sid;

import jakarta.xml.ws.Endpoint;
import org.sid.WS.BanqueService;
//import ws.BanqueService;

    public class ServerJws {
        public static void main(String[] args) {
            Endpoint.publish("http://0.0.0.0:9191/",new BanqueService());
            System.out.println("web service déploiyer sur http://0.0.0.0:9191/");
        }
    }
