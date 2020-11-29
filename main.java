package u3e3_pilas;

import java.util.InputMismatchException;
import java.util.Scanner;
import pilas.Pila;

public class U3E3_pilas {

    public static void main(String[] args) {

        Scanner t = new Scanner(System.in);
        int op = 1, tamaño_actual = 0, valor_rand = 0;
        Pila pila = new Pila();

        while (op != 0) {

            System.out.println("\n=== M E N U ===");
            System.out.println("1. Mostrar");
            System.out.println("2. Eliminar");
            System.out.println("3. Insertar");
            System.out.println("0. Salir");
            System.out.print("OPCION -> ");
            op = t.nextInt();
            System.out.println("");

            switch (op) {
                case 1:
                    pila.listar();//Muestra la pila completa
                    break;

                case 2:
                    pila.retirar();//Elimina solo el elemento en el tope de la lisata
                    pila.listar();//Muestra la pila completa
                    break;

                case 3:
                    tamaño_actual = 10 - pila.getTamanio(); //Le resta 10 (Valor maximo de la pila) y le resta el tamaño actual de la pila
                    
                    for (int i = 0; i < tamaño_actual; i++) { //Inicia un ciclo fora dependiendo del tamaño actual de la pila
                        
                        valor_rand = (int) (Math.random() * (500 - 50 + 1) + 50); //Genera un valor aleatorio entre 50 y 500
                        
                        pila.apilar(valor_rand);//Incerta el valor en la pila
                    }
                    
                    pila.listar(); //Muestra la pila completa
                    break;

                case 0:
                    System.out.println("BYE! BYE!");
                    break;

                default:
                    System.out.println("OPCIÓN INVALIDA");
                    op = 1;
                    break;
            }
        }
    }
}
