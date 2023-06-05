public class Ejercicio_4 {
    public static void main(java.lang.String[] args) {
        int numeroIF = -10;
        int numero = 0;

        System.out.println(Condicional (numeroIF));
        BucleWhile(numero);
        DoWhile(numero);
        Bublefor();
        Menu();
    }

    public static String Condicional (int numero){
        if (numero > 0) {
            return "El numero es positivo";
        }
        else if (numero < 0) {
            return "El numero es negativo";
        }
        else {
            return "El numero es 0";
        }
    }
    
    public static void BucleWhile (int numero){
        while (numero < 3) {
            numero++;
            System.out.println("el numero se incremento y ahora vale: " + numero);
        }
    }

    public static void DoWhile(int numero){
        do{
            numero++;
            System.out.println("el numero se incremento y ahora vale: " + numero);
        }while (numero < 1);
    }
    public static void Bublefor(){
        int numeroFor;
        for ( numeroFor = 0; numeroFor <= 3 ; numeroFor++ ){
            System.out.println("el numero se incremento en for y ahora vale: " + numeroFor);
        }
    }
    public static void Menu(){
        var estacion = "Verano";
        switch (estacion){
            case "Primavera":
                System.out.println("Estamos en Primavera");
                break;
            case "Verano":
                System.out.println("Estamos en Verano");
                break;
            case "Otoño":
                System.out.println("Estamos en Otoño");
                break;
            case "Invierno":
                System.out.println("Estamos en Invierno");
                break;
            default:
                System.out.println("No es ninguna estación");
                break;
        }
    }
}