package basic.test;
import java.io.*;

public class SystemSampleDouble {
    public static void main(String[] args) {
        double x = 0;

        System.out.println("入力");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            while(true) {
                String a = br.readLine();
                if(a == null) {
                    break;
                }else if(a.equals("end")) {
                    break;
                }
                System.out.println(a);
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    
    }
}

