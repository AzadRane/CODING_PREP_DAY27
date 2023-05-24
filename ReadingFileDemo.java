import java.io.*;

public class ReadingFileDemo
{
    public static void main(String args[])throws Exception
    {
        File f = new File(args[0]);

        if(!f.exists())
        {
            System.out.println("File not present");
        }
        if(!f.isFile())
        {
            System.out.println("It is not a file");
        }

        FileReader fr = new FileReader(f);

        int ch =-1;

        while(true)
        {
            ch=fr.read();
            if(ch==-1)
            {
                break;
            }
            System.out.println((char) ch);


        }

        fr.close();

    }
}