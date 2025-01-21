//Importo metodo Scanner
import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) throws Exception {
        //Inizializzo una variabile e chiedo all'utente i suoi dati
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserisci il tuo nome: ");
        String nome = scan.next();
        System.out.println("Inserisci il tuo cognome: ");
        String cognome = scan.next();
        System.out.println("Qual'è il tuo colore preferito ?:  ");
        String colorePreferito = scan.next();
        System.out.println("Giorno di nascita: ");
        int giornoNascita = scan.nextInt();
        System.out.println("Mese di nascita: ");
        int meseNascita = scan.nextInt();
        System.out.println("Anno di nascita: ");
        int annoNascita = scan.nextInt();

        //Genero password concatenando i dati
        String password = (nome) + "-" + (cognome) + "-" + (colorePreferito) + "-" + (giornoNascita + meseNascita + annoNascita); 
        
        //Mando a stampa il risultato finale
        System.out.println("La password è: " + password );
    }
}
