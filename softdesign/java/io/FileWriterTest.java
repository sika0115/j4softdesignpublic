package basic.io;

import java.io.*;

public class FileWriterTest {
  public static void main(String[] args) {
    write255();
    copyfile();
    input2file();
  }
  public static void write255() {
    File f = new File("255.txt");
    FileWriter fw = null;

  }
  public static void copyfile() {
    File f1,f2;
    f1 = new File("255.txt");
    f2 = new File("255copy.txt");
    FileReader fr = null;
    FileWriter fw = null;
    try {
        fr = new FileReader(f1);
        fw = new FileWriter(f2);
        int c;
        while((c = fr.read()) != -1) {
            fw.write(c);
        }
    } catch(FileNotFoundException e) {
        e.printStackTrace();
    } catch(IOException e) {
        
    }
    
    }


  }
  public static void input2file() {
      
}
}