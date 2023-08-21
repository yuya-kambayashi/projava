package projava;

import java.io.*;
import java.net.Socket;

public class WeClient {
    public static void main(String[] args) throws IOException{
        var domain = "example.com";
        try(
                var soc = new Socket(domain, 80);
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
