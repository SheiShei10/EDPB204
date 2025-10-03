
import java.util.*;

/**
 * *******************************************************************
 * Class Name: PilasPr3B2E04
 * Author/s name: SCS, MGP Y DHP
 * Release/Creation date: 30/09/2025
 * Class version: Main
 * Description: Evalúa la expresión utilizando una pila.
 * La expresión se leerá por teclado y se utilizará el espacio como separador.
 *
 **********************************************************************
 */

public class PracticasPr3B2E04 {
    static Scanner TECLADO = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("PRÁCTICA 3. USO DE PILAS");
        System.out.print("Introduzca una cadena de caracteres: ");
        String cadena = TECLADO.nextLine();

        Stack<String> pila = evaluarCadena(cadena);

        if (!pila.isEmpty()) {
            System.out.println("El resultado: " + pila.pop());
        } else {
            System.out.println("Error, la pila está vacía");
        }
    }

    public static Stack<String> evaluarCadena(String cadena) {
        Stack<String> pila = new Stack<>();
        StringTokenizer st = new StringTokenizer(cadena);
        String op1, op2 = null;

        while (st.hasMoreTokens()) {
            String token = st.nextToken();

            if (token.equals("+")) {
                op2 = pila.pop();
                op1 = pila.pop();
                pila.push(op1 + op2);

            } else if (token.equals("-")) {
                op2 = pila.pop();
                op1 = pila.pop();
                String eliminar = "";
                for (int i = 0; i < op1.length(); i++) {
                    if (op2.indexOf(op1.charAt(i)) == -1) {
                        eliminar += op1.charAt(i);
                    }
                }
                pila.push(eliminar);

            } else if (token.equals("@")) {
                op1 = pila.pop();
                pila.push(new StringBuilder(op1).reverse().toString());

            } else if (token.equals("*")) {
                op2 = pila.pop();
                op1 = pila.pop();
                String interseccion = "";
                for (int i = 0; i < op1.length(); i++) {
                    if (op2.indexOf(op1.charAt(i)) != -1 && interseccion.indexOf(op1.charAt(i)) == -1) {
                        interseccion += op1.charAt(i);
                    }
                }
                pila.push(interseccion);

            } else {
                // Si no es operador   se considera un operando
                pila.push(token);
            }
        }

        return pila;
    }
}

