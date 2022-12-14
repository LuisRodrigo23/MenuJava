import java.util.Scanner;

public class MenuPrincipal {
    public static void main(String args[]) {

        Operaciones operaciones = new Operaciones();
        Scanner scanner = new Scanner(System.in);
        int opcion, a, b, total;

        System.out.println("1. Par o Impar");
        System.out.println("2. Numero mayor y menor");
        System.out.println("3. Calculadora");
        System.out.println("4. Salir");
        opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                operaciones.ParImpar();
                break;
            case 2:
                operaciones.MayorMenor();
                break;
            case 3:
                System.out.println("1. Suma");
                System.out.println("2. Resta");
                System.out.println("3. Division");
                System.out.println("4. Multiplicacion");
                opcion = scanner.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("Ingrese un numero");
                        a = scanner.nextInt();
                        System.out.println("Ingrese el otro numero");
                        b = scanner.nextInt();
                       System.out.println("El total de la suma es: "+operaciones.Suma(a, b));
                        break;
                        case 2:
                        System.out.println("Ingrese un numero");
                        a=scanner.nextInt();
                        System.out.println("Ingrese otro numero");
                        b=scanner.nextInt();
                        System.out.println("El total de la resta es: "+operaciones.Resta(a, b));
                        break;
                        case 3:
                        System.out.println("Ingrese un numero ");
                        a=scanner.nextInt();
                        System.out.println("Ingrese otro numero");
                        b=scanner.nextInt();
                        System.out.println("El total de la division es: "+operaciones.Div(a, b));
                        break;
                        case 4:
                        System.out.println("Ingrese un nuemero");
                        a=scanner.nextInt();
                        System.out.println("Ingrese otro numero");
                        b=scanner.nextInt();
                        System.out.println("El total de la multiplicacion es: "+operaciones.Multiplicacion(a, b));
                        break;
                }
                break;

        }
    }
}
