import java.util.Scanner;   // Potrzebne, by m�c u�ywa� klasy Scanner.
import java.io.*;          // Potrzebne, by m�c u�ywa� klas z plikowymi operacjami wej�cia-wyj�cia.

/**
   Ten program zapisuje dane w pliku.
*/

public class FileWriteDemo
{
   public static void main(String[] args) throws IOException
   {
      String filename;      // Nazwa pliku.
     String friendName;  // Imi� znajomego.
     int numFriends;     // Liczba znajomych.

     // Tworzenie obiektu klasy Scanner do pobierania danych z klawiatury.
      Scanner keyboard = new Scanner(System.in);
      
      // Pobieranie liczby znajomych.
     System.out.print("Ilu masz znajomych? ");
     numFriends = keyboard.nextInt();

     // Pobieranie pozostawionego znaku nowego wiersza.
      keyboard.nextLine();
      
      // Pobieranie nazwy pliku.
     System.out.print("Podaj nazw� pliku: ");
      filename = keyboard.nextLine();

      // Otwieranie pliku.
      PrintWriter outputFile = new PrintWriter(filename);

      // Pobieranie danych i zapisywanie ich w pliku.
     for (int i = 1; i <= numFriends; i++)
     {
       // Pobieranie imienia znajomego.
       System.out.print("Podaj imi� znajomego " +
                        "numer " + i + ": ");
       friendName = keyboard.nextLine();

       // Zapisywanie imienia w pliku.
         outputFile.println(friendName);
      }

      // Zamykanie pliku.
     outputFile.close();
     System.out.println("Dane zosta�y zapisane w pliku.");
   }
}
