package projava;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class nobori {
    public static void main(String[] args) throws IOException{

        var f = new JFrame("インターネット自由協会");
        f.setLocation(300, 300);
        f.setSize(800, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        var t = new JTextArea();
        t.setFont((new Font(Font.MONOSPACED, Font.PLAIN, 12)));
        f.add(new JScrollPane(t));
        f.setVisible(true);

        try(var s = new Socket("koukoku.shadan.open.ad.jp", 23);
            var in = s.getInputStream();
            var r = new InputStreamReader(in, "Windows-31J"))
        {
            for(char ch ; (ch = (char)r.read()) != 0;){
                t.append(ch + "");
            }
        }


    }
}
