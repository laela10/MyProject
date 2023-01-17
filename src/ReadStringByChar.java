import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class ReadStringByChar {
    public static void main(String[] args) {
        try
        {
            Scanner inputData = new Scanner(System.in);
            String directory = System.getProperty("user.dir");
            System.out.println("Current directory => " + directory);
            System.out.println("Type Filename = ");
            String fileName = inputData.nextLine();
            System.out.println("Type Directory = ");
            String dirName = inputData.nextLine();
            if((fileName.isEmpty())||(dirName.isEmpty())){
                System.out.println("Procces cannot continue...");
                System.exit(0);
            }
            File myFile = new File( dirName+"/"+fileName);
            if (myFile.exists()){
                FileReader fr=new FileReader(dirName+"/"+fileName);
                System.out.println("file content: ");
                int r=0;
                while((r=fr.read())!=-1)
                {
                    System.out.println((char)r);
                    TimeUnit.MILLISECONDS.sleep(120);
                }
            }else{
                System.out.println("File does not exits...");
                System.exit(0);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
