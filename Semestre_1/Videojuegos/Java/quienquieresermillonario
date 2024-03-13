import java.util.Scanner;

public class JuegoMillonario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int puntos = 0;

        // Definir la matriz con preguntas, opciones y respuestas correctas
        String[][] preguntas = {
            {"¿Cuál es la capital de Francia?", "A. Madrid", "B. París", "C. Roma", "D. Berlín", "B"},
            {"¿En qué año se descubrió América?", "A. 1492", "B. 1776", "C. 1812", "D. 1603", "A"},
            {"¿Cuál es el río más largo del mundo?", "A. Amazonas", "B. Nilo", "C. Yangtsé", "D. Misisipi", "A"},
            {"¿Quién escribió 'Cien años de soledad'?", "A. Mario Vargas Llosa", "B. Gabriel García Márquez", "C. Pablo Neruda", "D. Isabel Allende", "B"},
            {"¿Cuál es el componente principal del aire?", "A. Oxígeno", "B. Nitrógeno", "C. Dióxido de carbono", "D. Argón", "B"},
            {"¿En qué continente se encuentra Egipto?", "A. África", "B. Asia", "C. Europa", "D. América", "A"},
            {"¿Cuál es la montaña más alta del mundo?", "A. Everest", "B. Kilimanjaro", "C. Aconcagua", "D. Denali", "A"},
            {"¿Quién pintó la Mona Lisa?", "A. Vincent van Gogh", "B. Leonardo da Vinci", "C. Pablo Picasso", "D. Claude Monet", "B"},
            {"¿Cuál es el planeta más grande del sistema solar?", "A. Tierra", "B. Júpiter", "C. Saturno", "D. Neptuno", "B"},
            {"¿En qué año comenzó la Segunda Guerra Mundial?", "A. 1935", "B. 1939", "C. 1941", "D. 1945", "B"},
            {"¿Cuántos huesos tiene el cuerpo humano?", "A. 206", "B. 214", "C. 226", "D. 230", "A"},
            {"¿Cuál es el océano más grande?", "A. Atlántico", "B. Índico", "C. Pacífico", "D. Ártico", "C"},
            {"¿En qué país se encuentra la Torre Eiffel?", "A. Italia", "B. Alemania", "C. Francia", "D. España", "C"},
            {"¿Cuál es el metal más abundante en la corteza terrestre?", "A. Hierro", "B. Aluminio", "C. Oro", "D. Plata", "B"},
            {"¿Cuál es la capital de Japón?", "A. Pekín", "B. Seúl", "C. Tokio", "D. Bangkok", "C"},
            {"¿Quién fue el primer presidente de Estados Unidos?", "A. Thomas Jefferson", "B. George Washington", "C. John Adams", "D. Benjamin Franklin", "B"},
            {"¿Cuál es la moneda oficial de México?", "A. Peso argentino", "B. Real brasileño", "C. Dólar estadounidense", "D. Peso mexicano", "D"},
            {"¿Qué elemento químico tiene el símbolo 'O'?", "A. Oro", "B. Oxígeno", "C. Plata", "D. Ozono", "B"},
            {"¿En qué año llegó el hombre a la Luna?", "A. 1962", "B. 1969", "C. 1975", "D. 1981", "B"},
            {"¿Cuál es la lengua más hablada del mundo?", "A. Inglés", "B. Mandarín", "C. Español", "D. Hindi", "B"}
        };

        // Iterar a través de las preguntas
        for (int i = 0; i < preguntas.length; i++) {
            System.out.println("Pregunta " + (i + 1) + ": " + preguntas[i][0]);
            for (int j = 1; j < 5; j++) {
                System.out.println(preguntas[i][j]);
            }

            System.out.print("Ingresa tu respuesta (A, B, C, o D): ");
            String respuestaUsuario = scanner.nextLine().toUpperCase();

            // Verificar la respuesta
            if (respuestaUsuario.equals(preguntas[i][5])) {
                System.out.println("¡Correcto! Has ganado 100,000 puntos.\n");
                puntos += 100000;
            } else {
                System.out.println("Incorrecto. La respuesta correcta es " + preguntas[i][5] + ".\n");
                break; // Si la respuesta es incorrecta, termina el juego
            }
        }

        // Mostrar puntos finales
        System.out.println("Fin del juego. Tienes un total de " + puntos + " puntos.");
    }
}
