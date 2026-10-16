## Lab 4 · Diagnostica y corrige

Los mensajes de abajo son los habituales de `javac`. Pega el texto exacto que veas en tu IDE.

| Caso | Mensaje observado | Causa | Corrección |
|---|---|---|---|
| 1 | `unclosed character literal` (IntelliJ: *Too many characters in a character literal*) | Las comillas simples son para un solo `char` | `String nombre = "Ana";` |
| 2 | `incompatible types: possible lossy conversion from double to int` | `int` no guarda decimales | `double temperatura = 23.5;` |
| 3 | `variable edad might not have been initialized` | Una variable local no tiene valor por defecto | `int edad = 20;` antes de leerla |
| 4 | `cannot assign a value to final variable CURSO` | `final` impide reasignar | Eliminar `CURSO = "Python";` |

Salida de la clase corregida:

```text
Nombre: Ana
Temperatura: 23.5
Edad: 20
Curso: Java
```