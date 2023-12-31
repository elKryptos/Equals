import java.util.Scanner;
public class Equals {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner (System.in);
        String nome1 = "", nome2 = "";

        System.out.println("Inserisce il nome del primo usuario: ");
        nome1 = in.nextLine();

        System.out.println("Inserisce il nome del secondo usuario: ");
        nome2 = in.nextLine();

       if (nome1.equalsIgnoreCase(nome2)){
        System.out.println("I nome degli usuari sono uguali.");
       }else{
        System.out.println("I nomi non sono uguali.");
       }
        
    }
}
