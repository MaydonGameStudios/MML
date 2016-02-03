package lang.mml.output;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Terminal {
    //Outputs text, using Prefix and system time.
    static String hostname = "user";
    public static void print(String text) {
        try
        {
            InetAddress address;
            address = InetAddress.getLocalHost();
            hostname = address.getHostName().toLowerCase();
        }
        catch (UnknownHostException ex)
        {
            System.out.println("Hostname can not be resolved");
        }
        System.out.println("<" + hostname + "> $mml: " + text);
    }
}
