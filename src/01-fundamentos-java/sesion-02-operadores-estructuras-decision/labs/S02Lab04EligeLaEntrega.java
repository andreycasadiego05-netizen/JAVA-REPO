public class S02Lab04EligeLaEntrega {
    public static void main(String[] args) {
        String tipoEntrega = "EXPRESS";
        int costoCentavos = 0;
        boolean tipoValido = true;

        // TODO 1 y 2: switch clásico. default marca la opción como inválida.
        switch (tipoEntrega) {
            case "ESTANDAR":
                costoCentavos = 500;
                break;
            case "EXPRESS":
                costoCentavos = 1200;
                break;
            case "RECOGIDA":
                costoCentavos = 0;
                break;
            default:
                tipoValido = false;
                break;
        }

        if (tipoValido) {
            // TODO 3: Costo solo para opciones válidas.
            System.out.println("Costo (centavos): " + costoCentavos);

            // TODO 4 y 5: Ternario para elegir la etiqueta.
            String etiqueta = tipoEntrega.equals("RECOGIDA") ? "Retiro en tienda" : "Entrega a domicilio";
            System.out.println("Etiqueta: " + etiqueta);
        } else {
            // TODO 5: Para inválidos, solo este mensaje.
            System.out.println("Tipo de entrega invalido");
        }

        // TODO 6: Resultados de las pruebas (cambiando solo tipoEntrega):
        //   ESTANDAR -> Costo (centavos): 500  / Etiqueta: Entrega a domicilio
        //   EXPRESS  -> Costo (centavos): 1200 / Etiqueta: Entrega a domicilio
        //   RECOGIDA -> Costo (centavos): 0    / Etiqueta: Retiro en tienda
        //   DRON     -> Tipo de entrega invalido
        //
        // Versión moderna (opcional, en tu copia personal; JDK 17 y 21 la aceptan):
        //   switch (tipoEntrega) {
        //       case "ESTANDAR" -> costoCentavos = 500;
        //       case "EXPRESS" -> costoCentavos = 1200;
        //       case "RECOGIDA" -> costoCentavos = 0;
        //       default -> tipoValido = false;
        //   }
        //
        // break: en el switch clásico, Java sigue ejecutando los casos siguientes una vez
        // que entra a uno (fall-through). break corta ahí; sin él, EXPRESS terminaría
        // ejecutando también RECOGIDA y dejaría el costo en 0.
        // Flechas (->): cada caso ejecuta solo su propia línea o bloque y no cae en el
        // siguiente, así que no necesitan break.
        // Compara textos con equals, no con ==, porque String es una clase.
    }
}