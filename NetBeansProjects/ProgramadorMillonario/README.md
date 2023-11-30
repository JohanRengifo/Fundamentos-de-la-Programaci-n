
# Juego de Preguntas y Respuestas

Este es un simple juego de preguntas y respuestas implementado en Java con una interfaz gráfica de usuario (GUI). El juego consta de un controlador (`PreguntasController`) que gestiona las preguntas y respuestas, y una interfaz de usuario (`UI`) que permite al jugador interactuar con el juego.

## Contenido del Repositorio

- `src/controlador/PreguntasController.java`: Contiene la lógica del juego, gestiona las preguntas y evalúa las respuestas del jugador.
- `src/presentacion/UI.java`: La interfaz gráfica de usuario que permite al jugador responder preguntas y muestra el puntaje.

## Instrucciones de Uso

1. Clona o descarga el repositorio.
2. Abre el proyecto en tu entorno de desarrollo.
3. Ejecuta la clase `UI.java` para iniciar el juego (Recuerda ejecutarla como una main class java).

# Controlador del Juego (PreguntasController.java)
El controlador del juego es responsable de gestionar la lógica del juego, incluyendo la carga de preguntas y respuestas, la evaluación de las respuestas del jugador, el seguimiento del puntaje y el control del flujo del juego. Aquí se describen las funciones principales implementadas en PreguntasController.java:

## Atributos
- preguntas: Una matriz que almacena las preguntas y respuestas del juego.
- numPreguntaActual: Un contador que lleva el seguimiento de la pregunta actual.
- puntos: Un contador que acumula el puntaje del jugador.
Métodos

## obtenerPreguntas()

- Descripción: Retorna la matriz de preguntas y respuestas.
- Uso: Utilizado por la interfaz de usuario (UI) para obtener la lista completa de preguntas.

## mostrarPregunta(int fila, int columna)

- Descripción: Retorna la pregunta en la posición especificada de la matriz.
- Uso: Utilizado por la interfaz de usuario (UI) para mostrar la pregunta actual al jugador.

## mostrarRespuestas(int fila, int columna)

- Descripción: Retorna la respuesta en la posición especificada de la matriz.
- Uso: Utilizado por la interfaz de usuario (UI) para mostrar las opciones de respuesta al jugador.

## validarRespuesta(String respuestaUsuario)

- Descripción: Valida si la respuesta proporcionada por el usuario es correcta.
- Uso: Utilizado por la interfaz de usuario (UI) para evaluar la respuesta seleccionada por el jugador.

## evaluarRespuesta(String respuestaUsuario)

- Descripción: Evalúa la respuesta proporcionada por el usuario, mostrando mensajes y avanzando al siguiente nivel si es correcta.
- Uso: Llamado por la interfaz de usuario (UI) después de que el jugador ha seleccionado una respuesta.

## mostrarSiguientePregunta()

- Descripción: Avanza a la siguiente pregunta y muestra la pregunta actual.
- Uso: Utilizado por evaluarRespuesta y por la interfaz de usuario (UI) para avanzar en el juego.

## sumarPuntos()

- Descripción: Aumenta el contador de puntos y muestra la cantidad actual de puntos.
- Uso: Llamado cuando el jugador responde correctamente a una pregunta.

## obtenerPuntos()

- Descripción: Retorna la cantidad de puntos acumulados.
- Uso: Utilizado por la interfaz de usuario (UI) para mostrar el puntaje actual al jugador.

## finalizarPrograma()

- Descripción: Finaliza el programa.
- Uso: Llamado cuando el juego ha terminado