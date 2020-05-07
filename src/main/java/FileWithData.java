import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.stream.Collectors;

public class FileWithData
{
    private static String separator = ";";


    public File file;

    public FileWithData(String fileName)
    {
        try{


            file =new File(fileName);

            if(!file.exists()){
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file,true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.close();

            System.out.println("Plik tekstowy został prawidłowo utworzony");

        }catch(IOException ioe){
            System.out.println("Exception occurred:");
            ioe.printStackTrace();
        }
    }






    public void savee(String city,String name, String surname, String pesel) throws IOException {

        FileWriter fw = new FileWriter(file, true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(city + separator + name + separator + surname + separator + pesel + "\n");
        bw.close();



    }


    public void removeLine(String pesel) throws IOException
    {
        List<String> out = Files.lines(file.toPath())
                .filter(line -> !line.contains(pesel))
                .collect(Collectors.toList());
        Files.write(file.toPath(), out, StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING);
        System.out.println("Zapisano dane");
    }













}