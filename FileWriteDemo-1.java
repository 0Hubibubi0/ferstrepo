import java.util.Scanner;   // Potrzebne, by móc u¿ywaæ klasy Scanner.
import java.io.*;          // Potrzebne, by móc u¿ywaæ klas z plikowymi operacjami wejœcia-wyjœcia.

/**
   Ten program zapisuje dane w pliku.
*/

public class FileWriteDemo
{
   public static void main(String[] args) throws IOException
   {
      String filename;      // Nazwa pliku.
     String friendName;  // Imiê znajomego.
     int numFriends;     // Liczba znajomych.

     // Tworzenie obiektu klasy Scanner do pobierania danych z klawiatury.
      Scanner keyboard = new Scanner(System.in);
      
      // Pobieranie liczby znajomych.
     System.out.print("Ilu masz znajomych? ");
     numFriends = keyboard.nextInt();

     // Pobieranie pozostawionego znaku nowego wiersza.
      keyboard.nextLine();
      
      // Pobieranie nazwy pliku.
     System.out.print("Podaj nazwê pliku: ");
      filename = keyboard.nextLine();

      // Otwieranie pliku.
      PrintWriter outputFile = new PrintWriter(filename);

      // Pobieranie danych i zapisywanie ich w pliku.
     for (int i = 1; i <= numFriends; i++)
     {
       // Pobieranie imienia znajomego.
       System.out.print("Podaj imiê znajomego " +
                        "numer " + i + ": ");
       friendName = keyboard.nextLine();

       // Zapisywanie imienia w pliku.
         outputFile.println(friendName);
      }

      // Zamykanie pliku.
     outputFile.close();
     System.out.println("Dane zosta³y zapisane w pliku.");
   }
}
