public class S06Inventario {
    // TODO 1: Declarar existencias como int privado y capacidad como final int privado igual a 100.
    private int existencias;
    private final int capacidad = 100;

    public S06Inventario() {
        // TODO 2: Inicializar las existencias en cero.
        existencias = 0;
    }

    public int getExistencias() {
        // TODO 3: Devolver las existencias actuales.
        return existencias;
    }

    public boolean ingresar(int cantidad) {
        // TODO 4: Validar cantidad positiva y espacio disponible antes de sumar.
        // comparo con el espacio que queda (capacidad - existencias) antes de sumar
        if (cantidad <= 0 || cantidad > capacidad - existencias) {
            return false;
        }
        existencias += cantidad;
        return true;
    }

    public boolean retirar(int cantidad) {
        // TODO 5: Validar cantidad positiva y existencias suficientes antes de restar.
        if (cantidad <= 0 || cantidad > existencias) {
            return false;
        }
        existencias -= cantidad;
        return true;
    }
}
