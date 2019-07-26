package basic.io;

import java.io.*;

public class FileReaderTest {
  public static void main(String[] args) {
    File f = new File("basic/io/FileReaderTest.java");
    FileReader fr = null;
    try {
      fr = new FileReader(f);
      System.out.println(fr.getEncoding());
      int c;
      while((c = fr.read()) != -1) {
        System.out.print((char)c);
      }
    }
    catch(FileNotFoundException e) {
      e.printStackTrace();
    }
    catch(IOException e) {
      e.printStackTrace();
    }
    finally {
      try {
        if(fr != null) {
          fr.close();
        }
      }
      catch(IOException e) {
        e.printStackTrace();
      }
    }
  }
}
