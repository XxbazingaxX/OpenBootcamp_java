public abstract class SmartDevice{
        String marca;
        String modelo;
        double precio;

        //constructor por defecto
        public SmartDevice(){
            marca = "";
            modelo = "";
            precio = 0.0;

        }

        //constructor con los parametros que asigna los valores dados a los atributos
        public SmartDevice(String marca, String modelo, double precio){
            this.marca = marca;
            this.modelo = modelo;
            this.precio = precio;
        }

        //Definimos la clase SmartPhone como una clase heredada de SmartDevice
        public class SmartPhone extends SmartDevice{
            int memoriaRam;
            int camaraTraserar;
            int camaraDelantera;
        }

        //Definimos el constructor vacio que llama a la clase heredada y le asigna valores
        public SmartPhone(){
            super();
            memoriaRam = 0;
            camaraTraserar = 0;
            camaraDelantera = 0;
        }

        public SmartWhatch extends SmartDevice(){
            double pulgadas;
            String sistema;
        }
}