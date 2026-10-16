public class S02Lab05MotorPromociones {
    public static void main(String[] args) {
        long subtotalCentavos = 18_500;
        int cantidad = 4;
        boolean esMiembro = true;
        String tipoEntrega = "EXPRESS";

        // TODO 1: Predicción con los datos iniciales:
        //   descuento 10 % -> 1850 centavos
        //   neto -> 16650
        //   envío EXPRESS -> 1200
        //   total -> 17850

        // TODO 2: Validar subtotal entre 0 y 1000000 inclusive y cantidad mayor que cero.
        boolean datosValidos = subtotalCentavos >= 0 && subtotalCentavos <= 1_000_000 && cantidad > 0;

        if (!datosValidos) {
            System.out.println("Pedido invalido: subtotal o cantidad fuera de rango");
        } else {
            // TODO 3: El envío se elige con switch; -1 es la señal de entrega desconocida.
            long envioCentavos;
            switch (tipoEntrega) {
                case "ESTANDAR":
                    envioCentavos = 500;
                    break;
                case "EXPRESS":
                    envioCentavos = 1200;
                    break;
                case "RECOGIDA":
                    envioCentavos = 0;
                    break;
                default:
                    envioCentavos = -1;
                    break;
            }

            if (envioCentavos < 0) {
                System.out.println("Pedido invalido: tipo de entrega desconocido");
            } else {
                // TODO 4: Una sola tasa por pedido (no se suman tasas).
                int porcentajeDescuento;
                if (esMiembro && subtotalCentavos >= 10_000) {
                    porcentajeDescuento = 10;
                } else if (!esMiembro && subtotalCentavos >= 20_000) {
                    porcentajeDescuento = 5;
                } else {
                    porcentajeDescuento = 0;
                }

                // TODO 5: División entera: descarta las fracciones de centavo.
                long descuentoCentavos = subtotalCentavos * porcentajeDescuento / 100;
                long netoCentavos = subtotalCentavos - descuentoCentavos;

                // TODO 6: Envío gratis solo para ESTANDAR cuando el neto llega a 25000.
                if (tipoEntrega.equals("ESTANDAR") && netoCentavos >= 25_000) {
                    envioCentavos = 0;
                }
                long totalCentavos = netoCentavos + envioCentavos;

                // TODO 7: Desglose en el orden y con las etiquetas del README.
                System.out.println("Subtotal (centavos): " + subtotalCentavos);
                System.out.println("Descuento (%): " + porcentajeDescuento);
                System.out.println("Descuento (centavos): " + descuentoCentavos);
                System.out.println("Neto (centavos): " + netoCentavos);
                System.out.println("Envio (centavos): " + envioCentavos);
                System.out.println("Total (centavos): " + totalCentavos);
            }
        }

        // TODO 8: Cinco pruebas mínimas (asignar todas las entradas de cada fila):
        //   18500 , 4, true , EXPRESS  -> desc 1850, neto 16650, envío 1200, total 17850
        //   26314 , 1, false, ESTANDAR -> desc 1315, neto 24999, envío 500,  total 25499
        //   26315 , 1, false, ESTANDAR -> desc 1315, neto 25000, envío 0,    total 25000
        //   cantidad = 0 (resto inicial)  -> Pedido invalido: subtotal o cantidad fuera de rango
        //   tipoEntrega = "DRON" (resto inicial) -> Pedido invalido: tipo de entrega desconocido

        // TODO 9 (opcional): Breakpoint en la condición del envío gratis; ahí
        // descuentoCentavos = 1850, netoCentavos = 16650 y envioCentavos = 1200
        // con los datos iniciales.

        // TODO 10: El envío gratis depende del neto, no del subtotal, porque lo que
        // cuenta es lo que el cliente paga por los productos después del descuento.
        // Se ve en la frontera: con subtotal 26314 el neto es 24999 (envío 500) y con
        // 26315 el neto es 25000 (envío 0).
    }
}