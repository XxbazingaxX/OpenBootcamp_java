public class Ejercicio_3coche{
    private int NumPuertas;
    public Coche(int numPuertas){
        this.NumPuertas = numPuertas;
    }
    public static void main(String[] args){
        Coche Micoche = new Coche(4);
        System.out.println("Numero de puertas inicial: " + Micoche.getNumPuertas());

        Micoche.IncrementaPuertas(1);
        System.out.println("Numero de puertas despues de incrementarlo: "+Micoche.getNumPuertas());
    }
    public void IncrementaPuertas(int puertas){
        NumPuertas += puertas;
    }
    public int getNumPuertas(){
        return NumPuertas;
    }
}