import sys
import math

def main():
    # Solicita el primer número
    num1 = int(input("Ingresar un Numero: "))

    # Solicita el segundo número
    num2 = int(input("Ingresar otro Numero: "))

    # Encuentra los divisores del primer número
    divisors1 = []
    for i in range(1, num1 + 1):
        if num1 % i == 0 and i != num1:
            divisors1.append(i)

    # Calcula la suma de los divisores del primer número
    sumaDivisores1 = 0
    for divisor in divisors1:
        sumaDivisores1 += divisor

    # Encuentra los divisores del segundo número
    divisors2 = []
    for i in range(1, num2 + 1):
        if num2 % i == 0 and i != num2:
            divisors2.append(i)

    # Calcula la suma de los divisores del segundo número
    sumaDivisores2 = 0
    for divisor in divisors2:
        sumaDivisores2 += divisor

    # Comprueba si los números son amigos
    if sumaDivisores1 == num2 or sumaDivisores2 == num1:
        print("Los Numeros Son Amigos")
    else:
        print("Los Numeros no son Amigos")

if __name__ == "__main__":
    main()
