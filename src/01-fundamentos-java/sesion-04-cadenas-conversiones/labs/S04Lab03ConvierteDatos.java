public class S04Lab03ConvierteDatos {
    public static void main(String[] args) {
        String edadTexto = " 20 ";
        String estaturaTexto = "1.72";
        String estudianteTexto = "true";

        // TODO 1: Limpiar edadTexto antes de convertirlo.
        // sin strip parseInt con espacios lanzaria NumberFormatException
        String edadLimpia = edadTexto.strip();

        // TODO 2: Convertir edad a int y estatura a double.
        int edad = Integer.parseInt(edadLimpia);
        double estatura = Double.parseDouble(estaturaTexto);

        // TODO 3: Convertir estudianteTexto a boolean.
        boolean estudiante = Boolean.parseBoolean(estudianteTexto);

        // TODO 4: Mostrar Edad, Edad siguiente, Estatura (m) y Estudiante.
        System.out.println("Edad: " + edad);
        System.out.println("Edad siguiente: " + (edad + 1));
        System.out.println("Estatura (m): " + estatura);
        System.out.println("Estudiante: " + estudiante);

        // TODO 5: Probar el caso inicial y distinguir conversion de concatenacion.
        // Salida con los datos iniciales:
        // Edad: 20
        // Edad siguiente: 21
        // Estatura (m): 1.72
        // Estudiante: true
        // edad + 1 calcula un numero porque edad ya es un int convertido con parseInt, si fuera texto con + solo se concatenaria y saldria "201"
    }
}
