package Pack1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Files_comparison
{
    public static void main(String[] args) throws IOException {
        BufferedReader reader1=new BufferedReader(new FileReader("FileWriter1.txt"));
        BufferedReader reader2=new BufferedReader(new FileReader("FileWriter2.txt"));

        String Line_File1=reader1.readLine();
        String Line_File2=reader2.readLine();

        boolean Equal=true;
        while(Line_File1!=null && Line_File2!=null)
        {
            if(Line_File1.equalsIgnoreCase(Line_File2))
            {
                Equal=true;
            }
            else
            {
                Equal=false;
                break;
            }
            Line_File1=reader1.readLine();
            Line_File2=reader2.readLine();
        }
        if(Equal)
        {
            System.out.println("Both the files are same!Hurray:");
        }
        else
        {
            System.out.println("Both the files are different :(");
        }

    }
}
