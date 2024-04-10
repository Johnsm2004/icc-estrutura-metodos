import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        

        //Crear instacion de la (calse u obejto) MetodosOrdenaimetos 
        MetodosOrdenamiento metodosOrdenamiento = new MetodosOrdenamiento();

        
        
        int[] numeros;
        

        Scanner tecaldo = new Scanner(System.in);
         System.out.println("MENU");
         numeros = tecaldo.nextInt();

        int[] arregloOrdenado = metodosOrdenamiento.sortByBubble(numeros,true );
        metodosOrdenamiento.imprime(arregloOrdenado);
        

    }
}
