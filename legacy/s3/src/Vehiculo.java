import java.util.Scanner; // import: palabra reservada para importar paquetes. java.util.Scanner: ruta de la clase Scanner que lee datos del teclado.

public class Vehiculo { // public: modificador de acceso público. class: define una clase. Vehiculo: nombre de la clase. llave abierta: inicia el bloque de la clase.
    
    public static void main(String[] args) { // public: acceso público. static: método a nivel de clase. void: no retorna valor. main: método principal. String[]: arreglo de cadenas. args: nombre del argumento. llave abierta: inicia el bloque del método.
        
        Scanner teclado = new Scanner(System.in); // Scanner: tipo de dato u objeto. teclado: nombre de variable. =: operador de asignación. new: instancia un nuevo objeto. Scanner(System.in): constructor que recibe la entrada estándar del sistema.
        
        String marca; // String: tipo de dato de cadena de texto. marca: nombre de la variable para almacenar la marca.
        String modelo; // String: tipo de dato de cadena de texto. modelo: nombre de la variable para almacenar el modelo.
        double cilindrada; // double: tipo de dato numérico con decimales. cilindrada: nombre de la variable.
        String combustible; // String: tipo de dato de texto. combustible: variable para el tipo de combustible.
        int capacidad; // int: tipo de dato entero. capacidad: variable para la cantidad de pasajeros.
        
        System.out.println("Ingrese la marca:"); // System.out.println: método para imprimir texto con salto de línea. "Ingrese la marca:": cadena de texto mostrada al usuario.
        marca = teclado.nextLine(); // marca: variable asignada. =: operador. teclado.nextLine(): lee la línea de texto ingresada por el usuario.
        
        System.out.println("Ingrese el modelo:"); // System.out.println: instrucción de impresión. "Ingrese el modelo:": texto guía para el usuario.
        modelo = teclado.nextLine(); // modelo: variable asignada. =: operador. teclado.nextLine(): captura el texto del teclado.
        
        System.out.println("Ingrese la cilindrada:"); // System.out.println: instrucción de impresión. "Ingrese la cilindrada:": texto guía.
        cilindrada = Double.parseDouble(teclado.nextLine()); // cilindrada: variable double. =: operador. Double.parseDouble(): convierte el texto a número decimal. teclado.nextLine(): captura la entrada.
        
        System.out.println("Ingrese el tipo de combustible:"); // System.out.println: instrucción de impresión. "Ingrese el tipo de combustible:": texto guía.
        combustible = teclado.nextLine(); // combustible: variable asignada. =: operador. teclado.nextLine(): captura el texto del teclado.
        
        System.out.println("Ingrese la capacidad de pasajeros:"); // System.out.println: instrucción de impresión. "Ingrese la capacidad...": texto guía.
        capacidad = Integer.parseInt(teclado.nextLine()); // capacidad: variable entera. =: operador. Integer.parseInt(): convierte texto a entero. teclado.nextLine(): captura la entrada.
        
        System.out.println("La marca que ha ingresado es: " + marca); // System.out.println: imprime. "La marca...": texto fijo. +: operador de concatenación. marca: valor de la variable.
        System.out.println("El modelo que ha ingresado es: " + modelo); // System.out.println: imprime. "El modelo...": texto fijo. +: operador de concatenación. modelo: valor de la variable.
        System.out.println("La cilindrada que ha ingresado es: " + cilindrada); // System.out.println: imprime. "La cilindrada...": texto fijo. +: operador de concatenación. cilindrada: valor numérico decimal.
        System.out.println("El tipo de combustible es: " + combustible); // System.out.println: imprime. "El tipo...": texto fijo. +: operador de concatenación. combustible: valor de la variable.
        System.out.println("Tiene una capacidad de " + capacidad + " pasajeros."); // System.out.println: imprime. "Tiene una...": texto. +: concatena. capacidad: valor numérico. + " pasajeros.": texto final.
        
    } // Llave de cierre del método main.
} // Llave de cierre de la clase Vehiculo.