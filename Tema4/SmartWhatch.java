package Tema4;

class SmartWhatch extends SmartDevice {
    double pulgadas;
    String sistema;

    public SmartWhatch() {
        super();

    }

    public SmartWhatch(String marca, String modelo, double precio, double pulgadas, String sistema) {
        super(marca, modelo, precio);
        this.sistema = sistema;
        this.pulgadas = pulgadas;

    }

    @Override
    public String toString() {
        return "SmartWhatch [marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + ", pulgadas="
                + pulgadas
                + ", sistema=" + sistema + "]";
    }

    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("Xiaomi", "redmi note 18 pro", 150, 32, 1);
        SmartWhatch smartWhatch = new SmartWhatch("Amazfit", "GTR 18", 80, 5, "Android");

        System.out.println(
                "El smartphone en el mercado es: " + smartPhone + "\nEl SmartWhatch en el mercado es: " + smartWhatch);
    }
}