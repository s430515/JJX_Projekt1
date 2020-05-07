import java.io.IOException;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws IOException {





        System.out.println("Prosze podać nazwe pliku");
        Scanner skan = new Scanner(System.in);
        String fileName = skan.nextLine();


        InputData input = new InputData(fileName);
        input.saveData();



    }
}
