package Pack1;

import java.io.*;

public class Merging_Files
{
    public static void main(String[] args) throws IOException
    {
        PrintWriter pw1=new PrintWriter(new FileWriter("File1.txt"));
        pw1.println("Azra");
        pw1.println("Farheen Naz");
        pw1.println("Mehreen Naz");
        pw1.flush();
        pw1.close();
        PrintWriter pw2=new PrintWriter(new FileWriter("File2.txt"));
        pw2.println("Wali Raza");
        pw2.println("Ali Raza");
        pw2.println("Manzoor Ahmed");
        pw2.flush();
        pw2.close();
        PrintWriter pw3=new PrintWriter(new FileWriter("File3.txt"));

        //Reading From File1.txt
        BufferedReader reader1=new BufferedReader(new FileReader("File1.txt"));
        String line1=reader1.readLine();
        while(line1!=null)
        {
            pw3.println(line1);
            line1=reader1.readLine();
        }

        //Reading from line2.txt
        reader1 = new BufferedReader(new FileReader("File2.txt"));
        line1=reader1.readLine();
        while(line1!=null)
        {
            pw3.println(line1);
            line1=reader1.readLine();
        }
        pw3.flush();
        reader1.close();
    }
}
