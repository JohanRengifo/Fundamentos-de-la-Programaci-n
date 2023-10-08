# Codigo Amigo | Divisores

Este código es un algoritmo para determinar si dos números son amigos. Los números amigos son dos números naturales distintos en los que la suma de los divisores propios del primero es igual al segundo, y viceversa.

El código comienza importando tres bibliotecas de Java:

- java.util.ArrayList: Esta biblioteca proporciona la clase ArrayList, que se utiliza para almacenar una lista de objetos.
- java.util.List: Esta biblioteca proporciona la interfaz List, que define un conjunto de métodos que se pueden utilizar para trabajar con listas.
- java.util.Scanner: Esta biblioteca proporciona la clase Scanner, que se utiliza para leer datos del usuario.
Luego, el código define una clase llamada NumerosAmigos. Esta clase contiene un método principal llamado main(), que es el punto de entrada del programa.

El método principal comienza solicitando al usuario que ingrese dos números. Estos números se almacenan en las variables num1 y num2.

Seguido de esto, el código encuentra los divisores de cada número. Los divisores de un número son todos los números que lo dividen exactamente.

Aquí hay una explicación más detallada de cada parte del código:

- Estas líneas de código importan las bibliotecas de Java necesarias para el programa.

```bash
  //Importa 3 Libreias, 1 de Listas y otra de Arrays
    import java.util.ArrayList;
    import java.util.List;
    import java.util.Scanner;
```

- Estas líneas de código definen la clase NumerosAmigos y su método principal main().

```bash
  class NumerosAmigos {
    public static Scanner digite = new Scanner(System.in);

    public static void main(String[] args) {
        int num1, num2;
```

- Aqui se le solicitan al usuario que ingrese dos números.

```bash
    // Solicita el Primer Numero
    System.out.println("Ingresar un Numero:");
    num1 = digite.nextInt();
    // Solicita el Segundo Nombre
    System.out.println("Ingresar otro Numero:");
    num2 = digite.nextInt();
```

- Se encuentran los divisores del primer número.

```bash
  // Encuentra los divisores del primer número
    List<Integer> divisors1 = new ArrayList<>();
    for (int i = 1; i <= num1; i++) {
        if (num1 % i == 0 && i != num1) {
            divisors1.add(i);
        }
    }
```

- Aqui se calculan la suma de los divisores del primer número.

```bash
  // Calcula la suma de los divisores del primer número
    int sumaDivisores1 = 0;
    for (int divisor : divisors1) {
        sumaDivisores1 += divisor;
    }
```

-Aqui se encuentra los divisores del segundo número.

```bash
  // Encuentra los divisores del segundo número
    List<Integer> divisors2 = new ArrayList<>();
    for (int i = 1; i <= num2; i++) {
        if (num2 % i == 0 && i != num2) {
            divisors2.add(i);
        }
}
```

- Aqui se calcula la suma de los divisores del segundo número.

```bash
  // Calcula la suma de los divisores del segundo número
    int sumaDivisores2 = 0;
    for (int divisor : divisors2) {
        sumaDivisores2 += divisor;
    }
```

- Aqui el Programa Analiza si los Numeros Son Amigos e Imprime el Resultado

```bash
  // Comprueba si los números son amigos e Imprime el Resultado
    if (sumaDivisores1 == num2 || sumaDivisores2 == num1) {
        System.out.println("Los Numeros Son Amigos");
```

## Autor

- [@JohanRengifo](https://github.com/JohanRengifo)
