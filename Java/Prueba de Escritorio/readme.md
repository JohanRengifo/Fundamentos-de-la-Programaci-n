# Calculadora de Porcentaje de Reprobados

Este es un programa Java simple que calcula el porcentaje de estudiantes que han reprobado en un conjunto de 50 calificaciones. El programa solicita al usuario que ingrese las calificaciones y luego muestra el porcentaje de estudiantes reprobados.

## Codigo Explicado

1. El programa solicitará ingresar las calificaciones de 50 estudiantes.

2. En este punto entra en funcionamiento el Ciclo For. Mientras se registran las notas, el ciclo cumple con una condicion adicional.

3. Si 'calificacion < 3.5' se considerará que el estudiante ha reprobado, y agraga ese valor al contador 'contadorReprobados' y se vuelve a repetir el Ciclo. En caso de que no se cumpla la funcion de 'calificacion < 3.5' solamente repite el ciclo.

4. Al finalizar, el programa mostrará el porcentaje de estudiantes que han reprobado. Esta informacion la sacara del total de registros almacenados en 'contador Reprobados'

## Ejemplo de Ejecución

```bash
Ingrese la calificación 1: 2.5
Ingrese la calificación 2: 3.7
Ingrese la calificación 50: 2.0
El porcentaje de reprobados es: XX.X%
```
