package projava;

import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import java.io.*;
import java.net.Socket;

public class WeClient {
    public static void main(String[] args) throws IOException{
        var domain = "www.google.com";

        SocketFactory factory = SSLSocketFactory.getDefault();
        try(
                Socket soc = factory.createSocket(domain, 443);
                var pw = new PrintWriter(soc.getOutputStream());
                var isr = new InputStreamReader(soc.getInputStream());
                var bur = new BufferedReader(isr);
                ){
            pw.println("GET /index.html HTTP/1.1");
            pw.println("HOST: " + domain);
            pw.println();
            pw.flush();
            bur.lines().limit(100).forEach(System.out::println);
        }
    }
}
