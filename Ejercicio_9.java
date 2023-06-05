// Crear la clase Persona con las variables edad, nombre y telefono
class Persona {
    // Atributos de la clase
    private int edad;
    private String nombre;
    private String telefono;

    // Constructor de la clase
    public Persona(int edad, String nombre, String telefono) {
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    // Método para mostrar las propiedades de la persona
    public void mostrar() {
        System.out.println("Edad: " + edad);
        System.out.println("Nombre: " + nombre);
        System.out.println("Teléfono: " + telefono);
    }
}

// Crear la clase Cliente que hereda de Persona y tiene la variable credito
class Cliente extends Persona {
    // Atributo de la clase
    private double credito;

    // Constructor de la clase
    public Cliente(int edad, String nombre, String telefono, double credito) {
        super(edad, nombre, telefono); // Llamar al constructor de la clase padre
        this.credito = credito;
    }

    // Método para mostrar las propiedades del cliente
    public void mostrar() {
        super.mostrar(); // Llamar al método de la clase padre
        System.out.println("Crédito: " + credito);
    }
}

// Crear la clase Trabajador que hereda de Persona y tiene la variable salario
class Trabajador extends Persona {
    // Atributo de la clase
    private double salario;

    // Constructor de la clase
    public Trabajador(int edad, String nombre, String telefono, double salario) {
        super(edad, nombre, telefono); // Llamar al constructor de la clase padre
        this.salario = salario;
    }

    // Método para mostrar las propiedades del trabajador
    public void mostrar() {
        super.mostrar(); // Llamar al método de la clase padre
        System.out.println("Salario: " + salario);
    }
}

// Clase principal para probar el código
public class Ejercicio_9 {
    public static void main(String[] args) {
        // Crear un objeto de la clase Cliente con los valores dados
        Cliente cliente1 = new Cliente(25, "Carlos", "123456789", 1000);

        // Mostrar las propiedades del objeto por pantalla
        cliente1.mostrar();

        // Crear un objeto de la clase Trabajador con los valores dados
        Trabajador trabajador1 = new Trabajador(30, "Bazinga", "987654321", 1500);

        // Mostrar las propiedades del objeto por pantalla
        trabajador1.mostrar();
    }
}