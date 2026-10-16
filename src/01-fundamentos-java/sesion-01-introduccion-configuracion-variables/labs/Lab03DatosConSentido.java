public class Lab03DatosConSentido {
    public static void main(String[] args) {
        // TODO 1: Elegir y justificar los tipos para nombre, edad, temperatura,
        // inicial y activo. Usa String, int, double, char y boolean.

        // nombre usa un String	porque es texto de varios caracteres
        // edad usa int porque es un entero sin decimales
        // temperatura usa double porque tiene parte decimal
        // inicial usa char porque es un solo carácter
        // activo usa boolean porque es olo true o false


        // TODO 2: Declarar e inicializar las cinco variables con nombres claros.
        string nombre = "thomas";
        int edad = 17;
        double temperatura = 28.2;
        char inicial = 'C';
        boolean activo = false;

        // TODO 3: Mostrar cada dato en su propia línea, con una etiqueta.
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Temperatura: " + temperatura);
        System.out.println("Incicial: " + inicial);
        System.out.println("Activo: " + activo);

        // TODO 4: Probar el caso A del README; el caso B es opcional.

        //Caso A

        //string nombre = "Ana";
        //int edad = 20;
        //double temperatura = 23.5;
        //char inicial = "A";
        //boolean activo = true;

        //Caso B

        //   String nombre = "Luis";
        //   int edad = 25;
        //   double temperatura = 18.0;
        //   char inicial = 'L';
        //   boolean activo = false;

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Temperatura: " + temperatura);
        System.out.println("Incicial: " + inicial);
        System.out.println("Activo: " + activo);


        // TODO 5: Explicar por qué String no es un tipo primitivo.
        //String no es primitivo porque es una clase y representa un objeto con métodos y se escribe usando una mayúscula.
        //char usa comillas simples porque guarda un único carácter ya el usar comillas dobles son para String.

    }
}
