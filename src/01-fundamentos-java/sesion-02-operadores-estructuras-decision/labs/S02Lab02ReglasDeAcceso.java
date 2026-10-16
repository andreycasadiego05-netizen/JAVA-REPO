public class S02Lab02ReglasDeAcceso {
    public static void main(String[] args) {
        int edad = 18;
        boolean esMiembro = false;
        boolean tieneInvitacion = true;
        boolean bloqueado = false;

        // TODO 1: Regla en lenguaje natural (confírmala con la del README del curso):
        // puede entrar quien tiene 18 años o más, es miembro o tiene invitación,
        // y además no está bloqueado.

        // TODO 2: Regla construida con &&, || y !.
        boolean puedeEntrar = edad >= 18 && (esMiembro || tieneInvitacion) && !bloqueado;

        // TODO 3: Resultado según la rama.
        if (puedeEntrar) {
            System.out.println("Acceso permitido");
        } else {
            System.out.println("Acceso denegado");
        }

        // TODO 4: Tres casos mínimos (cambia solo las variables de arriba):
        //   edad 18, esMiembro false, tieneInvitacion true,  bloqueado false -> Acceso permitido
        //   edad 17, esMiembro true,  tieneInvitacion false, bloqueado false -> Acceso denegado (menor de edad)
        //   edad 30, esMiembro true,  tieneInvitacion true,  bloqueado true  -> Acceso denegado (bloqueado)

        // TODO 5: El bloqueo impide siempre el acceso porque !bloqueado está unido con &&
        // al resto de la regla. Si bloqueado es true, !bloqueado es false, y un && con
        // un false da false sin importar edad, membresía o invitación.

        // TODO 6 (opcional): Breakpoint en la línea del if. Ahí puedeEntrar ya tiene su
        // valor (true con los datos de arriba), antes de que se elija la rama.
    }
}