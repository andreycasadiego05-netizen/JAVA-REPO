public class S02Lab03ClasificaResultados {
    public static void main(String[] args) {
        int nota = 85;

        // TODO 1, 2 y 3: Primero se rechaza lo inválido; después se clasifica de mayor a menor.
        if (nota < 0 || nota > 100) {
            System.out.println("Nota invalida");
        } else if (nota >= 90) {
            System.out.println("Categoria A");
        } else if (nota >= 80) {
            System.out.println("Categoria B");
        } else if (nota >= 70) {
            System.out.println("Categoria C");
        } else if (nota >= 60) {
            System.out.println("Categoria D");
        } else {
            System.out.println("Categoria E");
        }

        // TODO 4: Casos probados (cambiando solo el valor de nota):
        //   nota = 85  -> Categoria B
        //   nota = 90  -> Categoria A (el límite de 90 pertenece a A porque se usa >=)
        //   nota = 101 -> Nota invalida

        // TODO 5: El orden importa porque if/else if se detiene en la primera condición
        // verdadera. Con nota = 95, si la primera condición fuera nota >= 60, ya sería
        // verdadera y se mostraría "Categoria D", sin llegar nunca a revisar nota >= 90.
        // Por eso se empieza por la condición más exigente (A) y se baja hasta E.
    }
}