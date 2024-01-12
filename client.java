package exercice2;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.Scanner;

public class client {
    public static void main(String[] args) throws IOException, XmlRpcException {
        XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
        config.setServerURL(new URL("http://localhost:8081/xmlrpc"));
        XmlRpcClient client = new XmlRpcClient();
        client.setConfig(config);
        Scanner sc = new Scanner (System.in)  ;

        while(true) {
            menu();
            String choix = sc.next();
            if(choix.equals("0")) break;
            String x;
            int y;
            boolean result = true;
            Object[] list;
            switch (choix) {
                case "1":
                    System.out.println("Donner une note: ");
                    x = sc.next();
                    result = (boolean) client.execute("listenote.addNote", new Object[]{x});
                    break;
                case "2":
                    System.out.println("Donner index: ");
                    y = Integer.parseInt(sc.next());
                    result = (boolean) client.execute("listenote.deleteNote", new Object[]{y});
                    break;
                case "3":
                    list = (Object[]) client.execute("listenote.listNotes", new Object[]{});
                    for (Object note : list) {
                        if (note instanceof String)
                            System.out.println(note);
                    }
                    break;
                case "4":
                    System.out.println("Donner une note: ");
                    x = sc.next();
                    System.out.println("Donner index: ");
                    y = Integer.parseInt(sc.next());
                    result = (boolean) client.execute("listenote.updateNote", new Object[]{y, x});
            }
            System.out.println("Result: " + result);
        }
    }
    static void menu(){
        System.out.println("\n. . .     |                        ");
        System.out.println("| | |,---.|    ,---.,---.,-.-.,---.");
        System.out.println("| | ||---'|    |    |   || | ||---'");
        System.out.println("`-'-'`---'`---'`---'`---'` ' '`---'\n");
        System.out.println("0. Exit");
        System.out.println("1. Add note");
        System.out.println("2. Delete note");
        System.out.println("3. Lister note");
        System.out.println("4. Update note");
        System.out.println("Choisir une option:");

    }
}
