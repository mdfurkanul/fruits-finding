
package all_classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileReadWrite {
    public static void FileInput(int a,String lv_name) throws IOException
    {
    File outFile = new File ("value\\"+lv_name);
    FileWriter fWriter = new FileWriter (outFile);
        try (PrintWriter pWriter = new PrintWriter (fWriter)) {
            pWriter.print(a);
        }
    }
    public static int FileOutput(String lv_name) throws FileNotFoundException
    {
        File inFile = new File ("value\\"+lv_name);
        int name;
        try (Scanner in = new Scanner (inFile)) {
            name = in.nextInt();
        }
        return name;
    }
}
