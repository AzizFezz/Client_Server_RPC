package exercice2;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.server.PropertyHandlerMapping;
import org.apache.xmlrpc.server.XmlRpcServer;
import org.apache.xmlrpc.webserver.WebServer;
import impl.CalculatriceServiceImpl;

import java.io.IOException;

public class serveur {
    public static void main(String[] args) throws
            XmlRpcException, IOException {
        WebServer webServer = new WebServer(8081);
        XmlRpcServer xmlRpcServer = webServer.getXmlRpcServer();
        PropertyHandlerMapping phm = new PropertyHandlerMapping();
        phm.addHandler("listenote", noteServiceImpl.class);

        xmlRpcServer.setHandlerMapping(phm);
        webServer.start();
        System.out.println("Server is running...");
    }
}
