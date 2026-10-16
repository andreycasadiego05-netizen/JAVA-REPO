public class Lab04DiagnosticaYCorrige {
    public static void main(String[] args) {
        // En tu copia personal, activa un caso por vez, lee el error y repáralo.
        // Los casos están comentados para que esta plantilla pueda compilar.

        // Caso 1: String nombre = 'Ana';
        // TODO 1: Corregir las comillas, mostrar el nombre y explicar la causa.
        //correcion:
        String nombre = "Ana";
        System.out.println("nombre: "+nombre);
        //el error ocurria porque usaba comillas simples reservadas para  un char cuando estamos usando un
        // valor en la variable que corresponde a string


        // Caso 2: int temperatura = 23.5;
        // TODO 2: Conservar el valor decimal usando un tipo adecuado y mostrarlo.
            double temperatura = 23.5;
            System.out.println("Temperatura: "+temperatura);

        // Caso 3:
        // int edad;
        // System.out.println(edad);
        // TODO 3: Inicializar edad antes de mostrarla y explicar por qué es necesario.
            int edad;
                edad = 20;
            System.out.println("Edad: "+edad);

            //Es super importante porque si esta declarada sabemos que tipo de dato sera pero no vale nada
            // no Posee ningun valor no podemos trabajar con ella


        // Caso 4:
        // final String CURSO = "Java";
        // CURSO = "Python";
        // TODO 4: Conservar CURSO como final y mostrar "Java", sin reasignarlo.
        final String CURSO = "Java";
        System.out.println("Curso: " + CURSO);


        // TODO 5: Registrar los cuatro mensajes del compilador en tu README personal,
        // junto con la causa y la corrección aplicada a cada caso.
    }
}
