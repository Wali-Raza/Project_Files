package Pack1;
import java.io.*;
public class CompareTwoFiles
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader1=new BufferedReader(new FileReader("FileWriter1.txt"));
        BufferedReader reader2=new BufferedReader(new FileReader("FileWriter2.txt"));
        String File1=reader1.readLine();
        String File2= reader2.readLine();
        boolean Equal=true;
        boolean Equal2=true;
        while (File1!=null && File2!=null)
        {
            if(File1.equalsIgnoreCase(File2))
            {
                Equal=true;
            }
            else
            {
                Equal=false;
                break;
            }
            File1=reader1.readLine();
            File2=reader2.readLine();
        }
        if(Equal)
        {
            System.out.println("Both The Files Are same");
        }
        else
        {
            System.out.println("Both the Files are Different!");
        }

    }
}
