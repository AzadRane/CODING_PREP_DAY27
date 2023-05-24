import java.io.*;

public class WriteOnlyEvenNumbers {

    public static void main(String args[])throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number ");
        int n = Integer.parseInt(br.readLine());

        FileWriter fw = new FileWriter("even.txt");

        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the number");

            int no = Integer.parseInt(br.readLine());

            String s = Integer.toString(no);

            if(no%2==0)
            {
                fw.write(s+"\t");
            }
        }

        fw.close();

    }
}
