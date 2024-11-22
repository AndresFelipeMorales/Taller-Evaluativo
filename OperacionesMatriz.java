import java.util.Stack;

public class OperacionesMatriz {

    public static String sumaFilas(int[][] matriz) {
        Stack<Integer> pila = new Stack<>();
        String resultado = "";

        for (int[] fila : matriz) {
            int suma = 0;
            for (int num : fila) {
                suma += num;
            }
            pila.push(suma);
        }

        while (!pila.isEmpty()) {
            resultado += pila.pop() + "\n";
        }

        return resultado;
    }

    public static String sumaColumnas(int[][] matriz) {
        Stack<Integer> pila = new Stack<>();
        String resultado = "";

        for (int j = 0; j < matriz[0].length; j++) {
            int suma = 0;
            for (int i = 0; i < matriz.length; i++) {
                suma += matriz[i][j];
            }
            pila.push(suma);
        }

        while (!pila.isEmpty()) {
            resultado += pila.pop() + "\n";
        }

        return resultado;
    }

    public static String ordenarNumeros(int[][] matriz) {
        Stack<Integer> pila = new Stack<>();
        for (int[] fila : matriz) {
            for (int num : fila) {
                pila.push(num);
            }
        }

        pila.sort((a, b) -> b - a); // Ordenar de mayor a menor
        String resultado = "";
        for (int num : pila) {
            resultado += num + "\n";
        }

        return resultado;
    }
}