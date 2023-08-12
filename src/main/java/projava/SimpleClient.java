package projava;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class SimpleClient {
    public static void main(String[] args) throws IOException{

        try(var soc = new Socket("localhost", 1600);
            OutputStream out = soc.getOutputStream())
        {
            out.write(234);

        }
    }
}
