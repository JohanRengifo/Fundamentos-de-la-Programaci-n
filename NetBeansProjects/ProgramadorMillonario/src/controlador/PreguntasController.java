package controlador;
/**
 *
 * @author Johan Rengifo
 */

public class PreguntasController {
    private String[][] preguntas = {
        {"Pregunta 1", "A. Respuesta A", "B. Respuesta B", "C. Respuesta C", "D. Respuesta D", "B"},
        {"Pregunta 2", "A. Respuesta A", "B. Respuesta B", "C. Respuesta C", "D. Respuesta D", "B"},
        {"Pregunta 3", "A. Respuesta A", "B. Respuesta B", "C. Respuesta C", "D. Respuesta D", "B"},
        {"Pregunta 4", "A. Respuesta A", "B. Respuesta B", "C. Respuesta C", "D. Respuesta D", "B"},
        {"Pregunta 5", "A. Respuesta A", "B. Respuesta B", "C. Respuesta C", "D. Respuesta D", "B"},
        {"Pregunta 6", "A. Respuesta A", "B. Respuesta B", "C. Respuesta C", "D. Respuesta D", "B"},
        {"Pregunta 7", "A. Respuesta A", "B. Respuesta B", "C. Respuesta C", "D. Respuesta D", "B"},
        {"Pregunta 8", "A. Respuesta A", "B. Respuesta B", "C. Respuesta C", "D. Respuesta D", "B"},
        {"Pregunta 9", "A. Respuesta A", "B. Respuesta B", "C. Respuesta C", "D. Respuesta D", "B"},
        {"Pregunta 10", "A. Respuesta A", "B. Respuesta B", "C. Respuesta C", "D. Respuesta D", "B"},
        {"Pregunta 11", "A. Respuesta A", "B. Respuesta B", "C. Respuesta C", "D. Respuesta D", "B"},
        {"Pregunta 12", "A. Respuesta A", "B. Respuesta B", "C. Respuesta C", "D. Respuesta D", "B"},
        {"Pregunta 13", "A. Respuesta A", "B. Respuesta B", "C. Respuesta C", "D. Respuesta D", "B"},
        {"Pregunta 14", "A. Respuesta A", "B. Respuesta B", "C. Respuesta C", "D. Respuesta D", "B"},
        {"Pregunta 15", "A. Respuesta A", "B. Respuesta B", "C. Respuesta C", "D. Respuesta D", "B"},
        {"Pregunta 16", "A. Respuesta A", "B. Respuesta B", "C. Respuesta C", "D. Respuesta D", "B"},
        {"Pregunta 17", "A. Respuesta A", "B. Respuesta B", "C. Respuesta C", "D. Respuesta D", "B"},
        {"Pregunta 18", "A. Respuesta A", "B. Respuesta B", "C. Respuesta C", "D. Respuesta D", "B"},
        {"Pregunta 19", "A. Respuesta A", "B. Respuesta B", "C. Respuesta C", "D. Respuesta D", "B"},
        {"Pregunta 20", "A. Respuesta A", "B. Respuesta B", "C. Respuesta C", "D. Respuesta D", "B"},
        {"Pregunta 21", "A. Respuesta A", "B. Respuesta B", "C. Respuesta C", "D. Respuesta D", "B"},
        {"Pregunta 22", "A. Respuesta A", "B. Respuesta B", "C. Respuesta C", "D. Respuesta D", "B"},
        {"Pregunta 23", "A. Respuesta A", "B. Respuesta B", "C. Respuesta C", "D. Respuesta D", "B"},
        {"Pregunta 24", "A. Respuesta A", "B. Respuesta B", "C. Respuesta C", "D. Respuesta D", "B"},
        {"Pregunta 25", "A. Respuesta A", "B. Respuesta B", "C. Respuesta C", "D. Respuesta D", "B"}
    };
    
    public int numPreguntaActual = 0;
    private int puntos = 0;
    
    public String[][] obtenerPreguntas() {
        return preguntas;
    }
        
    public String mostrarPregunta(int fila, int columna){
        return preguntas[fila][columna];
    }

    public String mostrarRespuestas(int fila, int columna) {
        return preguntas[fila][columna];
    }

    public boolean validarRespuesta(String respuestaUsuario) {
        String respuestaCorrecta = preguntas[numPreguntaActual][5];
        return respuestaUsuario.equalsIgnoreCase(respuestaCorrecta);
    }

    public void evaluarRespuesta(String respuestaUsuario) {
    if (validarRespuesta(respuestaUsuario)) {
        System.out.println("¡Respuesta Correcta! \nVamos a la Siguiente Pregunta!");
        // Avanzar a la siguiente pregunta
        mostrarSiguientePregunta();
    } else {
        System.out.println("Respuesta Incorrecta.\nFin del juego.");
        finalizarPrograma();
    }
}
    

    private void mostrarSiguientePregunta() {
        if (numPreguntaActual < preguntas.length - 1) {
            // Avanzar a la siguiente pregunta
            numPreguntaActual++;
            // Suma Puntos
            sumarPuntos();
            // Mostrar la siguiente pregunta
            mostrarPregunta(numPreguntaActual, 0);
        } else {
            System.out.println("¡Has respondido todas las preguntas correctamente! Fin del juego.");
            finalizarPrograma();
        }
    }
    
    public void sumarPuntos() {
        puntos++;
        System.out.println("Puntos actuales: " + puntos);
    }
    
    public int obtenerPuntos() {
        return puntos;
    }

    private void finalizarPrograma() {
        System.exit(0);
    }
}
