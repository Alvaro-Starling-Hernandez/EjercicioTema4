public class Main {
    public static void main(String[] args) {
        //Usando un if, crear una condición que compare si la variable nume..
        int numeroif = 8;
        if (numeroif < 0) {
            System.out.println("NumeroIf es negativo");
        } else if (numeroif == 0) {
            System.out.println("NumeroIf es igual cero");
        } else {
            System.out.println("NumeroIf es positivo");
        }

        //Crea un bucle While, este bucle tendrá que tener...
        int numeroWhile = 0;
        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println(numeroWhile);
        }

        //Para el bucle Do While, deberás crear la misma estructura qu...
        do{
            numeroWhile++;
            System.out.println(numeroWhile);
        }while (numeroWhile < 3);

        //Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0...
        int numeroFor = 0;
        for (int i = 0; i < 3; i++){
            numeroFor++;
            System.out.println(numeroFor);
        }

        //Por último, para el Switch, deberás crear la variable estacion, y distintos cas...
        String estacion = "Primaver";
        switch (estacion){
            case "Primavera":
                System.out.println("Estamos en "+estacion);
                break;
            case "Verano":
                System.out.println("Estamos en "+estacion);
                break;
            case "Otono":
                System.out.println("Estamos en "+estacion);
                break;
            case "Invierno":
                System.out.println("Estamos en "+estacion);
                break;
            default:
                System.out.println("No es una estacion");
        }
    }
}