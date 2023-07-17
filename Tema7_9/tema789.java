package Tema7_9;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;

public class tema789 {

    private static void CambioEjercicio() {
        System.out.println("\n ############################################### \n");
    }

    private static void MostrarArray(ArrayList<Integer> n){
        n.toString();
        for (int i=0; i< n.size(); i++){
            System.out.print(n.get(i));
        }
    }

//Escribe el código que devuelva una cadena al revés. Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".

    private static String reverse(String texto) {
        StringBuilder hola = new StringBuilder(texto);
        return hola.reverse().toString();
    } 

//1. Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.

    private static void ArrayUni(){

        String cadena[] = {"Hola", "mundo", "como", "estas"};

        for (String texto : cadena){

            System.out.println(texto);
        }
    }

//2. Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.

    private static void ArrayBi() {

        int numeros[][] = {{1,2,3}, {3,2,1}};

        for(int i = 0; i < numeros.length; i++){
            for(int j = 0; j < numeros[i].length; j++){

                System.out.print("Fila: " + (i + 1) + " | Columna: " + (j + 1) +
                            "\nEl valor es: " + numeros[i][j] + "\n");
            }
        }
    }

//3.Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final.
    private static void Vector(){

        Vector<Integer> vector = new Vector<Integer>();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);

        System.out.println("vector original: " + vector);
        
        vector.remove(1);
        vector.remove(1);

        System.out.println("vector modificado: " + vector);

    }

//4.Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.
    private static void Respuesta(){
        System.out.println("El problema de utilizar un Vector con la capacidad por defecto, se redimensionará automáticamente cada vez que se alcance su capacidad máxima." +
            "Es mejor especificar la capacidad inicial del Vector al crearlo para evitar la necesidad de redimensionarlo automáticamente.");
    }

//5.Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.
    private static void ArrayList_Linked(){
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("elemento1");
        arrayList.add("elemento2");
        arrayList.add("elemento3");
        arrayList.add("elemento4");

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addAll(arrayList);

        for (String element : linkedList){
            System.out.println("LinkedList de un ArrayList: "+ element);
        }

    }

/*6.Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación, con otro bucle, recórrelo y elimina los numeros pares.
Por último, vuelve a recorrerlo y muestra el ArrayList final. Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.*/

    private static void TrabajarArraylist(){
        ArrayList<Integer> elementos = new ArrayList<>();

        System.out.print("ArrayList original: ");
        for(int i=1; i<=10; i++){
            elementos.add(i);
        }
        MostrarArray(elementos);

        System.out.print("\nArrayList sin numeros pares: ");
        for(int j=0; j< elementos.size(); j++){
            if (elementos.get(j)%2 == 0){
                elementos.remove(j);
            }
        }
        MostrarArray(elementos);
    }

/*7.Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo ArithmeticException que será capturada por su llamante (desde "main", por ejemplo).
Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse". Finalmente, mostraremos en cualquier caso: "Demo de código".*/

    private static void DividePorCero(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        }
        System.out.println(a/b);
        
    }

/*8.Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut".
La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado en "fileOut".*/

    private static void Copiar() throws IOException {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Introduce el fichero de origen: ");
            String fileIn = scanner.nextLine();
            System.out.println("Introduce el fichero de destino: ");
            String fileOut = scanner.nextLine();
            CopiarArchivo(fileIn, fileOut);
        }

    }

    public static void CopiarArchivo(String fileIn, String fileOut) throws IOException{
        try {
            FileInputStream in = new FileInputStream(fileIn);
            byte[] buffer = new byte[1024];
            int length;
            in.close();

            PrintStream out = new PrintStream(fileOut);
            while ((length = in.read(buffer)) > 0) {
                out.write(buffer, 0, length);
            }
            out.close();
        } catch (Exception e) {
            System.out.println("Excepcion: " + e.getMessage());
        }

    }

//9.Sorpréndenos creando un programa de tu elección que utilice InputStream, PrintStream, excepciones, un HashMap y un ArrayList, LinkedList o array.

    public static void Final(){
        // Crear un HashMap que almacene el nombre y el número de teléfono de algunos contactos
        HashMap<String, String> agenda = new HashMap<>();
        agenda.put("Ana", "123456789");
        agenda.put("Luis", "987654321");
        agenda.put("Pedro", "456789123");

        // Crear un ArrayList que almacene los nombres de los contactos en orden alfabético
        ArrayList<String> nombres = new ArrayList<>(agenda.keySet());
        Collections.sort(nombres);

        // Crear un InputStream para leer datos del teclado
        InputStream teclado = System.in;

        // Crear un PrintStream para escribir datos en la pantalla
        PrintStream pantalla = System.out;

        // Crear un bucle para mostrar el menú y pedir una opción al usuario
        boolean salir = false;
        while (!salir) {
            pantalla.println("Bienvenido a su agenda electrónica. Elija una opción:");
            pantalla.println("1. Mostrar todos los contactos");
            pantalla.println("2. Buscar un contacto por nombre");
            pantalla.println("3. Añadir un nuevo contacto");
            pantalla.println("4. Salir");

            try {
                // Leer la opción del usuario como un byte
                byte opcion = (byte) teclado.read();

                // Limpiar el buffer de entrada
                teclado.skip(teclado.available());

                // Ejecutar la opción elegida
                switch (opcion) {
                    case '1':
                        mostrarContactos(pantalla, nombres, agenda);
                        break;
                    case '2':
                        buscarContacto(pantalla, teclado, agenda);
                        break;
                    case '3':
                        añadirContacto(pantalla, teclado, nombres, agenda);
                        break;
                    case '4':
                        salir = true;
                        pantalla.println("Gracias por usar el programa de Bing. Hasta pronto.");
                        break;
                    default:
                        pantalla.println("Opción inválida. Inténtelo de nuevo.");
                }
            } catch (IOException e) {
                // Capturar y mostrar la excepción en caso de error de entrada o salida
                pantalla.println("Error de entrada o salida: " + e.getMessage());
            }
        }
    }

    // Método para mostrar todos los contactos en orden alfabético
    public static void mostrarContactos(PrintStream pantalla, ArrayList<String> nombres, HashMap<String, String> agenda) {
        pantalla.println("Estos son todos los contactos:");
        for (String nombre : nombres) {
            pantalla.println(nombre + ": " + agenda.get(nombre));
        }
    }

    // Método para buscar un contacto por nombre y mostrar su número de teléfono
    public static void buscarContacto(PrintStream pantalla, InputStream teclado, HashMap<String, String> agenda) throws IOException {
        pantalla.println("Introduzca el nombre del contacto que desea buscar:");
        // Leer el nombre del contacto como una línea de texto
        BufferedReader lector = new BufferedReader(new InputStreamReader(teclado));
        String nombre = lector.readLine();
        // Comprobar si el nombre existe en el HashMap
        if (agenda.containsKey(nombre)) {
            // Mostrar el número de teléfono asociado al nombre
            pantalla.println(nombre + ": " + agenda.get(nombre));
        } else {
            // Mostrar un mensaje de que el contacto no se ha encontrado
            pantalla.println("No se ha encontrado ningún contacto con ese nombre.");
        }
    }

    // Método para añadir un nuevo contacto al HashMap y al ArrayList
    public static void añadirContacto(PrintStream pantalla, InputStream teclado, ArrayList<String> nombres, HashMap<String, String> agenda) throws IOException {
        pantalla.println("Introduzca el nombre del nuevo contacto:");
        // Leer el nombre del nuevo contacto como una línea de texto
        BufferedReader lector = new BufferedReader(new InputStreamReader(teclado));
        String nombre = lector.readLine();
        // Comprobar si el nombre ya existe en el HashMap
        if (agenda.containsKey(nombre)) {
            // Mostrar un mensaje de que el contacto ya existe
            pantalla.println("Ya existe un contacto con ese nombre.");
        } else {
            // Pedir el número de teléfono del nuevo contacto
            pantalla.println("Introduzca el número de teléfono del nuevo contacto:");
            // Leer el número de teléfono como una línea de texto
            String telefono = lector.readLine();
            // Añadir el nuevo contacto al HashMap y al ArrayList
            agenda.put(nombre, telefono);
            nombres.add(nombre);
            Collections.sort(nombres);
            // Mostrar un mensaje de confirmación
            pantalla.println("Se ha añadido el nuevo contacto: " + nombre + ": " + telefono);
        }
    }

    public static void main(String[] args) throws IOException{
        String str = "hola mundo";
        String reversed = reverse(str);
        System.out.println(reversed);
        CambioEjercicio();
        ArrayUni();
        CambioEjercicio();
        ArrayBi();
        CambioEjercicio();
        Vector();
        CambioEjercicio();
        Respuesta();
        CambioEjercicio();
        ArrayList_Linked();
        CambioEjercicio();
        TrabajarArraylist();
        CambioEjercicio();
        try {DividePorCero(5, 0);} catch (ArithmeticException e) {System.out.println("Esto no puede hacerse");}{System.out.println("Demo del codigo DividePorCero");}
        CambioEjercicio();
        Copiar();
        CambioEjercicio();
        Final();
    }
}