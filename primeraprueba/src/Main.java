import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            String datosdelcliente = "Estuardo";
            String tipodecuenta = "debito";
            double saldo = 3000.46;
            int  opcion = 0;
            System.out.println("*****************************************************");
            System.out.println("El nombre del cliente es: "+ datosdelcliente);
            System.out.println("El tipo de cuenta es: "+ tipodecuenta);
            System.out.println("El saldo es: "+ saldo + "Q");
            System.out.println("*****************************************************");

            String menu  = """
                ***Escriba el numero de la operacion que desea***
                1. Consultar saldo
                2. Retirar
                3. Depositar
                9. Salir""";
Scanner Datos = new Scanner(System.in);
while (opcion !=9){
        System.out.println(menu);
        opcion = Datos.nextInt();
        switch (opcion){
            case 1:
                System.out.println("El saldo actualizado es: "+ saldo);
                break;
            case 2:
                System.out.println("Cual es el valor que desea retirar? ");
                double valoraretirar = Datos.nextDouble();
                if (valoraretirar > saldo){
                    System.out.println("Saldo insuficiente");
                }else {
                    saldo = saldo - valoraretirar;
                    System.out.println("El saldo es de: "+saldo);
                } break;
                case 3: System.out.println("Cual es el valor que desea retirar? ");
                double valoradepositar = Datos.nextDouble();
                saldo += valoradepositar;
                System.out.println("El saldo es de: "+saldo);
                break;
                case 9:
                    System.out.println("Que tenga buen dia, gracias por usar nuestros servicios 😵");
                    break;
            default:
                System.out.println("opcion no valida");
                
        }
}
    }
}