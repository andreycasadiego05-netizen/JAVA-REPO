public class S06Pedido {
    // TODO 1: Declarar estado como campo privado String.
    private String estado;

    public S06Pedido() {
        // TODO 2: Inicializar el estado en PENDIENTE.
        estado = "PENDIENTE";
    }

    public String getEstado() {
        // TODO 3: Devolver el estado actual.
        return estado;
    }

    public boolean enviar() {
        // TODO 4: Enviar solo un pedido PENDIENTE; cambiar a ENVIADO y devolver si acepta.
        // equals y no == porque comparo el contenido del String
        if (!estado.equals("PENDIENTE")) {
            return false;
        }
        estado = "ENVIADO";
        return true;
    }

    public boolean cancelar() {
        // TODO 5: Cancelar solo un pedido PENDIENTE; cambiar a CANCELADO y devolver si acepta.
        if (!estado.equals("PENDIENTE")) {
            return false;
        }
        estado = "CANCELADO";
        return true;
    }
}
