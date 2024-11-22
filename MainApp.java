import javax.swing.*;

public class MainApp {
    public static void main(String[] args) {
        int filas = PedirEntero("Ingrese el número de filas (n):");
        int columnas = PedirEntero("Ingrese el número de columnas (m):");

        int[][] matriz = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = PedirEntero("Elemento [" + i + "][" + j + "]:");
            }
        }

        int opcion;
        do {
            opcion = PedirEntero(
                    "Seleccione una opción:\n" +
                            "1: Suma de las filas\n" +
                            "2: Suma de las columnas\n" +
                            "3: Factorial de la dimensión de filas\n" +
                            "4: Números de la matriz ordenados de mayor a menor\n" +
                            "5: Salir");

            switch (opcion) {
                case 1:
                    String FilasSuma = OperacionesMatriz.sumaFilas(matriz);
                    JOptionPane.showMessageDialog(null, FilasSuma);
                    break;
                case 2:
                    String ColumnasSuma = OperacionesMatriz.sumaColumnas(matriz);
                    JOptionPane.showMessageDialog(null, ColumnasSuma);
                    break;
                case 3:
                    int Factorial = Factor.factorial(filas);
                    JOptionPane.showMessageDialog(null, "El factorial del número de filas (" + filas + ") es: " + Factorial);
                    break;
                case 4:
                    String Ordenados = OperacionesMatriz.ordenarNumeros(matriz);
                    JOptionPane.showMessageDialog(null, Ordenados);
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 5);
    }


    public static int PedirEntero(String mensaje) {
        while (true) {
            try {
                String entrada = JOptionPane.showInputDialog(mensaje);
                if (entrada == null) { 
                    JOptionPane.showMessageDialog(null, "Operación cancelada.");
                    System.exit(0);
                }
                int numero = Integer.parseInt(entrada);
                if (numero <= 0) { 
                    JOptionPane.showMessageDialog(null, "Por favor, ingrese un número entero positivo.");
                } else {
                    return numero;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada no válida. Por favor, ingrese un número entero.");
            }
        }
    }
}