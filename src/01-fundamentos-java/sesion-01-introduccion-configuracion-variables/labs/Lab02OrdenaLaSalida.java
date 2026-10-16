public class Lab02OrdenaLaSalida {
    public static void main(String[] args) {
        // TODO 1: Predecir la salida de estas tres instrucciones en un comentario.
        System.out.print("A");
        System.out.println("B");
        System.out.println("C");

        //para mi esta seria la salida
        // A B
        // C



        // TODO 2: Ejecutar y explicar cualquier diferencia con tu predicción.
        // La diferencia radica en que al ejecutar A y B quedan pegadas y yo
        // habia escrito o mostrado antes que quedaban separadas el salto de linea de C si lo predije bien.


        // TODO 3: Modificar las instrucciones anteriores para obtener:
        // A - B - C

        System.out.print("A - ");
        System.out.print("B - ");
        System.out.print("C");

        // TODO 4: Agregar debajo una segunda línea que diga "Fin del laboratorio".
        System.out.println("Fin del laboratiorio");

        // TODO 5: Explicar qué instrucción produce cada salto de línea.
        //cuando hacemos  System.out.println(""); la parte que genera los saltos de linea es ek println mas
        //especificamente el ln asociado a los saltos de linea tanto en Java como en Html.
    }
}
