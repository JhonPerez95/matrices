package matrices;

import java.util.Random;
import javax.swing.JOptionPane;

public class Matrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Random randon = new Random();

        int rango;

        rango = Integer.parseInt(JOptionPane.showInputDialog("INSERTE EL RANGO DE LA MATRIZ"));

        int Matriz[][] = new int[rango][rango];
        int vector[] = new int[rango];
        String vector2[] = new String[rango];
        int cont_esp = 0, cont_val = 0;

        System.out.println("==================== MATRIZ COMPLETA ============================ \n");
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz.length; j++) {
                Matriz[i][j] = 0;

                System.out.println("[" + Matriz[i][j] + "]");
            }

            System.out.println("");

        }

        System.out.print("===================== DIAGONAL SECUNDARIA ===========================\n");
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz.length; j++) {
                if ((i + j) == Matriz.length - 1) {
                    Matriz[i][j] = randon.nextInt(9);
                    System.out.println("[" + Matriz[i][j] + "]");
                    vector[i] = Matriz[i][j];
                    vector2[i] = "[" + i + "]\t[" + j + "]";
                    if (vector[i] != 0);
                    {
                        cont_val++;
                    }

                } else {
                    System.out.print("[0]");
                    cont_esp++;
                }
            }
            System.out.print("");

        }
        int suma = 0;

        System.out.print("\n================================================\n");
        for (int v = 0; v < Matriz.length; v++) {
            System.out.print("[" + vector[v] + "]");
            suma = suma + vector[v];
        }

        System.out.println("\n");

        int cant_total = cont_val + cont_esp;
        System.out.print("====================== RESUMEN ==========================\n");
        System.out.println("ESPACIOS EN LA MATRIZ: " + cant_total);
        System.out.println("ESPACIOS UTILIZADOS FUERON: " + cont_val);
        System.out.println("ESPACIOS DISPOBLES SON: " + cont_esp);
        System.out.println("LA SUMA TOTAL DE LA DIAGONAL SECUNDARIA: " + suma);
        System.out.print("=========================================================");

    }

}
