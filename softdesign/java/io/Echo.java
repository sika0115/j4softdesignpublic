package basic.io;
import java.io.*;

public class Echo {
    public static void main(String[],args) {
        int x = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System in));
        try {
            while(true) {
                String a = br.readLine();
                if (a == null) {
                    break;
                } else if (a.equals("end")) {
                    break;
                }
                System.out.println(a);
            }
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
}