package lang.mml.out;

public class Terminal {
    //Outputs text, using Prefix and system time.
    public static void print(String text) {
        int sysTime = (int)(System.currentTimeMillis()/100);
        System.out.println("<" + sysTime + "> $mml: " + text);
    }
}
