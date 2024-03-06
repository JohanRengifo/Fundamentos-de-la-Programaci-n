package controlador;
import java.util.Arrays;
/**
 *
 * @author Johan Rengifo
 */

public class PreguntasController {
    private String[][] preguntas = {
        // Pregunta     Res 1              Res 2            Res 3           Res 4             Res Cot
       {"¿Qué significa HTML?", "A. Hyper Text Markup Language", "B. High Tech Multi Language", "C. Hyper Transfer Markup Language", "D. Hyperlink and Text Markup Language", "A"},
            {"¿Cuál es el lenguaje de programación utilizado para desarrollo web en el lado del servidor?", "A. JavaScript", "B. Python", "C. Ruby", "D. PHP", "D"},
            {"¿Cuál de los siguientes NO es un lenguaje de programación?", "A. Java", "B. CSS", "C. Swift", "D. Kotlin", ""},
            {"¿En qué año se lanzó la primera versión de Java?", "A. 1990", "B. 1995", "C. 2000", "D. 1985", "B"},
            {"¿Qué es un bucle 'for' en programación?", "A. Una condición", "B. Una función", "C. Una estructura de control", "D. Un tipo de dato", "C"},
            {"¿Cuál es el término correcto para describir 'mezclar' dos ramas en un sistema de control de versiones?", "A. Merge", "B. Split", "C. Branch", "D. Commit", "A"},
            {"¿Cuál de las siguientes no es una base de datos relacional?", "A. MySQL", "B. MongoDB", "C. PostgreSQL", "D. Oracle", "B"},
            {"¿Qué significa 'API'?", "A. Advanced Programming Interface", "B. Application Programming Interface", "C. Automated Program Interaction", "D. Advanced Process Integration", "B"},
            {"¿Cuál es el propósito de 'git clone'?", "A. Crear un nuevo repositorio", "B. Clonar un repositorio existente", "C. Eliminar un repositorio", "D. Actualizar un repositorio", "B"},
            {"¿Qué es un 'framework' en el contexto de desarrollo de software?", "A. Una biblioteca de funciones", "B. Una plataforma de hardware", "C. Una guía de estilo", "D. Una estructura básica para el desarrollo", "D"},
            {"¿Cuál es el operador lógico 'AND' en muchos lenguajes de programación?", "A. &&", "B. ||", "C. !", "D. <>", "A"},
            {"¿Qué es Java Virtual Machine (JVM)?", "A. Una máquina de café especial para programadores", "B. Un compilador de Java", "C. Una máquina virtual que ejecuta código Java", "D. Un entorno de desarrollo para Java", "C"},
            {"¿Cuál de las siguientes NO es una característica de lenguajes de programación orientados a objetos?", "A. Encapsulación", "B. Herencia", "C. Polimorfismo", "D. Composición", "D"},
            {"¿Qué significa 'SQL'?", "A. Simple Question Language", "B. Structured Query Language", "C. Server Quality Language", "D. System Question Language", "B"},
            {"¿En qué lenguaje de programación se utiliza 'print()' para mostrar información?", "A. Java", "B. Python", "C. C++", "D. JavaScript", "B"},
            {"¿Cuál es el propósito de 'npm' en el desarrollo de JavaScript?", "A. Node Package Manager", "B. New Project Manager", "C. Node Program Manager", "D. Node Project Module", "A"},
            {"¿Cuál de las siguientes NO es una forma válida de definir una variable en JavaScript?", "A. var x = 5;", "B. let y = 'Hola';", "C. constant z = 3.14;", "D. const w = true;", "C"},
            {"¿Qué es un 'bug' en programación?", "A. Una característica no planeada", "B. Un error en el código", "C. Un componente de hardware", "D. Un mensaje de advertencia", "B"},
            {"¿Cuál es el lenguaje de programación principal para desarrollo de aplicaciones Android?", "A. Swift", "B. Kotlin", "C. Java", "D. C#", "B"},
            {"¿Qué es 'HTTPS'?", "A. HyperText Transport Protocol Security", "B. High-Level Text Protocol for Secure communication", "C. HyperText Transfer Protocol Secure", "D. Hyperlink and Text Protection Service", "C"}
    };
    
    public int numPreguntaActual = 0;
    private int puntos = 0;
    
    public String[][] obtenerPreguntas() {
        return preguntas;
    }
    
    
    public void agregarPregunta(String nuevaPregunta, String[] nuevasRespuestas, String nuevaRespuestaCorrecta){
        if(preguntas == null){
            preguntas = new String[1][6];
        }else {
            preguntas = Arrays.copyOf(preguntas, preguntas.length + 1);
        }
        
        int nuevaFila = preguntas.length - 1;
        preguntas[nuevaFila] = new String[]{
            nuevaPregunta,
            nuevasRespuestas[0],
            nuevasRespuestas[1],
            nuevasRespuestas[2],
            nuevasRespuestas[3],
            nuevaRespuestaCorrecta
        };
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
            mostrarPregunta(numPreguntaActual, 0);
            // Suma Puntos
            sumarPuntos();
            
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