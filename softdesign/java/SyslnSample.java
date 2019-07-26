import java.io.*;
    public class SyslnSample {
        public static void main(String[] args) {
            int x = 0;
            System.out.println("入力");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            try {
                String a = br.readLine();
                x = Integer.parseInt(a); 
            } catch(IOException e) {
                e.printStackTrace();
            }
            System.out.println("入力された値の２倍は" + (x*2) +"です" );
        }
    }