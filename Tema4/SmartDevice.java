package Tema4;

public class SmartDevice {
    String marca;
    String modelo;
    double precio;

    // constructor por defecto
    public SmartDevice() {

    }

    // constructor con los parametros que asigna los valores dados a los atributos
    public SmartDevice(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;

    }

    // Definimos la clase SmartPhone como una clase heredada de SmartDevice
    public static class SmartPhone extends SmartDevice {
        int memoriaRam = 0;
        int camaraTrasera = 0;

        public SmartPhone(String marca, String modelo, double precio, int memoriaRam, int camaraTrasera) {
            super(marca, modelo, precio);
            this.memoriaRam = memoriaRam;
            this.camaraTrasera = camaraTrasera;
        }

        @Override
        public String toString() {
            return "SmartPhone [marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + ", ram=" + memoriaRam
                    + ", camaraTrasera=" + camaraTrasera + "]";
        }
    }
}