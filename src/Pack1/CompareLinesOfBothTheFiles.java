package Pack1;
import java.io.*;
public class CompareLinesOfBothTheFiles
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader1=new BufferedReader(new FileReader("FileWriter1.txt"));
        BufferedReader reader2=new BufferedReader(new FileReader("FileWriter2.txt"));
        String Line1_FirstFile=reader1.readLine();
        String Line2_FirstFile=reader1.readLine();
        String Line1_SecondFile= reader2.readLine();
        String Line2_SecondFile=reader2.readLine();
        boolean Equal=true;
        boolean Equal2=true;
        while (Line1_FirstFile!=null && Line1_SecondFile!=null)
        {
            if(Line1_FirstFile.equalsIgnoreCase(Line1_SecondFile))
            {
                Equal=true;
            }
            else
            {
                Equal=false;
                break;
            }
            while (Line2_FirstFile!=null && Line2_SecondFile!=null)
            {
                if(Line2_FirstFile.equalsIgnoreCase(Line2_SecondFile))
                {
                    Equal2=true;
                }
                else
                {
                    Equal2=false;
                    break;
                }
            }
            Line1_FirstFile=reader1.readLine();
            Line2_FirstFile=reader1.readLine();
            Line1_SecondFile= reader2.readLine();
            Line2_FirstFile= reader2.readLine();
        }
        if(Equal)
        {
            System.out.println("First Line OF both The Files Are same");
        }
        else
        {
            System.out.println("First Line Of both the Files are Different!");
        }
        if(Equal2)
        {
            System.out.println("Second Line Of both The Files Are same");
        }
        else
        {
            System.out.println("Second Line Of both the Files are Different!");
        }

    }
}
