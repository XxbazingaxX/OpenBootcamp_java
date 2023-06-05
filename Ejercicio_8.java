//Crear clase Persona
class Persona {
  // Crear variables las privadas edad, nombre y telefono de la clase Persona
  private int edad;
  private String nombre;
  private String telefono;

  // Crear gets y sets de cada propiedad
  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getTelefono() {
    return telefono;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }
}

// Crear un objeto persona en el main
public class Ejercicio_8 {
  public static void main(String[] args) {
    // Utiliza los gets y sets para darle valores a las propiedades edad, nombre y
    // telefono
    Persona persona = new Persona();
    persona.setEdad(30);
    persona.setNombre("Carlos");
    persona.setTelefono("123456789");

    // Por último muéstralas por consola
    System.out.println("Edad: " + persona.getEdad());
    System.out.println("Nombre: " + persona.getNombre());
    System.out.println("Teléfono: " + persona.getTelefono());
  }
}