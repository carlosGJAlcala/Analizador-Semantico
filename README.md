
# Analizador Semántico

**Descripción:**
Este proyecto implementa un analizador semántico como parte de las prácticas de la asignatura de Compiladores. El analizador semántico es una fase crucial en el proceso de compilación que se encarga de verificar la coherencia lógica y el significado del código fuente, asegurando que las construcciones del lenguaje sean utilizadas correctamente según las reglas definidas.

## Contenido del Repositorio

El repositorio incluye los siguientes directorios y archivos:

- **`src/`**: Contiene el código fuente del proyecto, desarrollado principalmente en Java.
- **`gen/`**: Directorio destinado a archivos generados automáticamente por herramientas como ANTLR.
- **`out/production/PL2Compiladores/`**: Carpeta que almacena los archivos compilados del proyecto.
- **`.idea/`**: Archivos de configuración del entorno de desarrollo integrado (IDE), posiblemente IntelliJ IDEA.
- **`PL2Compiladores.iml`**: Archivo de módulo del proyecto para IntelliJ IDEA.
- **`test.txt`**: Archivo de texto que posiblemente contiene casos de prueba o ejemplos de código para validar el analizador.

## Requisitos Previos

Para ejecutar este proyecto, necesitarás:

- **Java Development Kit (JDK)**: Versión 8 o superior.
- **ANTLR**: Herramienta para generar analizadores léxicos y sintácticos. Puedes descargarla desde [aquí](https://www.antlr.org/download.html).
- **IntelliJ IDEA** u otro IDE compatible con proyectos Java.

## Instalación y Ejecución

1. **Clonar el repositorio:**

   ```bash
   git clone https://github.com/carlosGJAlcala/Analizador-Semantico.git
   cd Analizador-Semantico
   ```

2. **Configurar el proyecto en el IDE:**
   - Si utilizas IntelliJ IDEA:
     - Abre IntelliJ IDEA y selecciona "Open" para importar el proyecto desde la carpeta clonada.
     - Asegúrate de que el SDK de Java esté correctamente configurado en el proyecto.
     - Verifica que las dependencias de ANTLR estén correctamente integradas.

3. **Generar los analizadores léxico y sintáctico:**
   - Utiliza ANTLR para generar los archivos necesarios a partir de las gramáticas definidas en el proyecto. Esto puede implicar ejecutar comandos específicos o configuraciones dentro del IDE.

4. **Compilar y ejecutar el proyecto:**
   - Una vez generados los analizadores, compila el proyecto desde el IDE o utilizando herramientas de construcción como `javac`.
   - Ejecuta la clase principal del analizador para procesar los archivos de entrada deseados.

## Uso

El analizador semántico procesa archivos de código fuente para verificar su coherencia lógica. Para utilizarlo:

- Prepara un archivo de código fuente que desees analizar (por ejemplo, `test.txt`).
- Ejecuta el analizador proporcionando el archivo como entrada.
- Revisa los mensajes de salida para identificar posibles errores semánticos o confirmaciones de que el código es correcto.

## Contribuciones

Las contribuciones son bienvenidas. Si deseas colaborar:

1. Realiza un fork del repositorio.
2. Crea una nueva rama para tus modificaciones.
3. Envía un pull request detallando los cambios propuestos.

## Licencia

Este proyecto se distribuye bajo la licencia MIT. Para más detalles, consulta el archivo `LICENSE` en el repositorio.

---

