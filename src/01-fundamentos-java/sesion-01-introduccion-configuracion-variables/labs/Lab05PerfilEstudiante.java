public class Lab05PerfilEstudiante {
    public static void main(String[] args) {
        // TODO 1: Tipos: nombre -> String, edad -> int, ciudad -> String,
        // promedio -> double, activo -> boolean.

        // TODO 2: Declaración e inicialización (perfil A).
        String nombre = "Ana";
        int edad = 20;
        String ciudad = "Cucuta";
        double promedio = 4.2;
        boolean activo = true;

        // TODO 3: Constante.
        final String CURSO = "Java";

        // TODO 4: Ficha inicial.
        System.out.println("=== Perfil del estudiante ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Ciudad: " + ciudad);
        System.out.println("Promedio: " + promedio);
        System.out.println("Activo: " + activo);
        System.out.println("Curso: " + CURSO);

        // TODO 5 y TODO 7: Reasignación (breakpoint en la línea siguiente).
        // Antes de ejecutarla: ciudad = "Cucuta". Después de Step Over: ciudad = "Bogota".
        ciudad = "Bogota";
        System.out.println("Ciudad actualizada: " + ciudad);

        // TODO 6: Perfil A probado. Perfil B (opcional): cambiar solo los datos:
        //   nombre = "Luis", edad = 25, ciudad = "Medellin", promedio = 3.8,
        //   activo = false, y la ciudad nueva "Cali".

        // TODO 8: Elección de tipo: promedio es double porque 4.2 tiene parte decimal y
        // un int lo truncaría. final en CURSO garantiza que, una vez asignado "Java",
        // el compilador no permite reasignarlo: su valor no cambia durante la ejecución.
    }
}