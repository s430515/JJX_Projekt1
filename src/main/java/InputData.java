import java.io.IOException;
import java.util.Scanner;

public class InputData {


    private Scanner scan = new Scanner(System.in);


    private FileWithData file ;

    public InputData(String fileName) {


        file = new FileWithData(fileName);
    }

    public  boolean saveData() throws IOException {

        System.out.println("Podaj miasto: ");
        String city = scan.nextLine();
        System.out.println("Podaj imie: ");
        String name = scan.nextLine();
        System.out.println("Podaj nazwisko: ");
        String surname = scan.nextLine();
        System.out.println("Podaj numer PESEL: ");
        String pesel = scan.nextLine();
        if (!PeselAuthentication.checkCorrectness(pesel)) {
            System.out.println("ERROR! Podano nieprawidłowy kod PESEL");
            return false;
        }else {
            file.removeLine(pesel);
            file.savee(city, name, surname, pesel);
        }return true;
    }



}
