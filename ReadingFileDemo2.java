import java.io.*;

public class ReadingFileDemo2 {

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

        BufferedReader br = new BufferedReader(fr);

        String s = null;

        while(true)
        {
            s = br.readLine();
            if(s==null)
            {
                break;
            }
            System.out.println(s);
        }

        fr.close();
    }

    
}
