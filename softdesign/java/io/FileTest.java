package basic.io;
import java.io.*;

public class FileTest {
    public static void main (String[] args) {
        /*1*/
        File file = new File("basic/io/FileTest.java");
        System.out.println(file.getAbsolutePath());

        /*2*/
        if(file.exists()) {
            System.out.println("このファイルは存在する");
        } else {
            System.out.println("このファイルは存在しない");
        }

        /*3*/
        if(file.canRead()) {
            System.out.println("このファイルは読める");
        } else {
            System.out.println("このファイルは読めない");
        }
            
        
    }
}
