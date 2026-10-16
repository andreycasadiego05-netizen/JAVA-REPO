public class S02Lab01CalculaYPredice {
    public static void main(String[] args) {
        int unidades = 7;
        int capacidad = 2;
        int contador = 3;

        // TODO 1: Predicción (antes de ejecutar):
        //   Suma: 9
        //   Resta: 5
        //   Producto: 14
        //   Division entera: 3
        //   Resto: 1
        //   Division decimal: 3.5
        //   2 + 3 * 4 = 14
        //   (2 + 3) * 4 = 20
        //   Contador incrementado: 4
        //   Contador decrementado: 3

        // TODO 2: Los cálculos van entre paréntesis; sin ellos "Suma: " + unidades + capacidad
        // concatenaría 7 y 2 y mostraría "Suma: 72".
        System.out.println("Suma: " + (unidades + capacidad));
        System.out.println("Resta: " + (unidades - capacidad));
        System.out.println("Producto: " + (unidades * capacidad));
        System.out.println("Division entera: " + (unidades / capacidad));
        System.out.println("Resto: " + (unidades % capacidad));

        // TODO 3: 7.0 es double. Cuando un operando es double, Java convierte el otro a
        // double y hace una división decimal, por eso conserva .5. Con dos int (7 / 2)
        // la división es entera y descarta la parte decimal.
        System.out.println("Division decimal: " + (7.0 / capacidad));

        // TODO 4: La multiplicación tiene mayor precedencia que la suma; los paréntesis
        // fuerzan a resolver primero la suma.
        System.out.println("2 + 3 * 4 = " + (2 + 3 * 4));
        System.out.println("(2 + 3) * 4 = " + ((2 + 3) * 4));

        // TODO 5: Incremento y decremento en una sentencia cada uno.
        contador++;
        System.out.println("Contador incrementado: " + contador);
        contador--;
        System.out.println("Contador decrementado: " + contador);

        // TODO 6 (opcional): Con unidades = 8 (capacidad = 2) cambia:
        //   Suma: 10, Resta: 6, Producto: 16, Division entera: 4, Resto: 0
        //   y con 8.0 / capacidad el resultado sería 4.0.
        // Lo que más cambia es el resto: 8 es divisible por 2, así que no sobra nada.

        // TODO 7: Registro de predicción vs. resultado:
        //   Mi predicción coincide con la salida de la ejecución. Si en tu ejecución ves
        //   alguna diferencia, anota aquí la causa (p. ej., faltaron paréntesis, o se
        //   usó división entera en vez de decimal).
    }
}