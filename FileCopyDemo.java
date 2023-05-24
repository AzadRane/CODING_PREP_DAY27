import java.io.*;

public class FileCopyDemo {

    public static void main(String args[])throws Exception
    {
        File f1 = new File(args[0]);

        if(!f1.exists())
        {
            System.out.println("File not present");
        }
        if(!f1.isFile())
        {
            System.out.println("It is not a file");
        }
        File f2 = new File(args[1]);

        if(!f2.exists())
        {
            System.out.println("File not present");
        }
        if(!f2.isFile())
        {
            System.out.println("It is not a file");
            
        }

        FileReader fr = new FileReader(f1);
        FileWriter fw = new FileWriter(f2);

        fw.write("Author  : HARISH RANE 24/05/2023");

        int ch =-1;

        while(true)
        {
            ch=fr.read();
            if(ch==-1)
            break;

            fw.write(ch);
        }

        fw.write("END-OF-FILE");
        fr.close();
        fw.close();
    }
}
