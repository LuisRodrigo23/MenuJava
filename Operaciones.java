import java.util.Scanner;

public class Operaciones {

    int a, b;
    Scanner scanner = new Scanner(System.in);

    public void ParImpar() {
        System.out.println("Ingrese un numero");
        a = scanner.nextInt();
        if (a % 2 == 0) {
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }
    }

    public void MayorMenor() {
        System.out.println("Ingrese un numero");
        a = scanner.nextInt();
        System.out.println("Ingrese otro digito");
        b = scanner.nextInt();
        if (a > b) {
            System.out.println(a + " Es mayor a " + b);
        } else {
            System.out.println(a + " Es menor a " + b);
        }
    }

    public int Suma(int a, int b) {
        int total = a + b;
        return total;
    }

    public int Resta(int a, int b) {
        int total = a + b;
        return total;
    }

    public int Multiplicacion(int a, int b) {
        int total = a / b;
        return total;
    }

    public int Div(int a, int b) {
        int total = a / b;
        return total;
    }

}
