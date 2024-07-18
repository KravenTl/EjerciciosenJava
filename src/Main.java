import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    //metodo para saludar
    public static void holamundo(){
        try {
            System.out.println("mira mami, mi primer programa en java!!!!");
            System.out.println("Hola mundo!");
            System.in.read();
        }catch(Exception e){}
    }

    //metodo para sumar dos numeros
    public static void sumar(){
        try {
            System.out.println("Ingresa los dos numeros que desas sumar");
            Scanner fscanner = new Scanner(System.in);
            Scanner sscanner = new Scanner(System.in);
            int fn = fscanner.nextInt();
            int sn = sscanner.nextInt();
            int result = fn + sn;
            System.out.println("El resultado de la suma es: " + result);
            System.in.read();
        }catch(Exception e){
            System.out.println("Error al sumar");
        }
    }

    //metodo para saber si el numero es par o impar
    public static void poim(){
    try {
        System.out.println("Ingrese el numero que quiere determinar si es par o impar");
        Scanner numscanner = new Scanner(System.in);
        int num = numscanner.nextInt();
        int result = num % 2;
        if (result == 0) {
            System.out.println("El numero: " + num + " es par");
        } else if (result > 0) {
            System.out.println("El numero: " + num + " es impar");
        }
        System.in.read();
    }catch(Exception e){
        System.out.println("Numero ingresado no valido");
    }
    }

    //metodo para obtener el factorial de un numero
    public static void facto(){
        try {
            System.out.println("Ingrese el numero del cual desea saber su factorial");
            Scanner fscanner = new Scanner(System.in);
            int num = fscanner.nextInt();
            int factorial = 1;

            for (int i = 1; i <= num; i++) {
                factorial = factorial * i;
            }
            System.out.println("El factorial del numero " + num + " es: " + factorial);
            System.in.read();
        }catch(Exception e){
            System.out.println("Error al encontrar el factorial");
        }
    }

    //metodo para obtener la tabla de multiplicar de un número, en forma ascendente y descdente
    public static void tabmulti (){
        try {
            System.out.println("Ingrese el numero del cual desea la tabla de multiplicar");
            Scanner numscanner = new Scanner(System.in);
            int num = numscanner.nextInt();

            System.out.println("\nTabla de multiplicar de " + num + " en orden ascendente:");

            for (int i = 1; i <= 10; i++) {
                int r = i * num;
                System.out.println(num + "x" + i + "=" + r);
            }
            System.out.println("\nTabla de multiplicar de " + num + " en orden descendente:");
            for (int i = 10; i >= 1; i--) {
                int r = i * num;
                System.out.println(num + " x " + i + " = " + r);
            }
            System.in.read();
        }catch(Exception e){
            System.out.println("Error al imprimir la tabla");
        }
    }

    //metodo para la serie de numeros enteros
    public static void serie(){
        try {
            System.out.println("Ingrese una serie de numeros enteros positivos");
            Scanner numscanner = new Scanner(System.in);
            //int numero, nmayor = Integer.MIN_VALUE, nmenor = Integer.MAX_VALUE;

            int numero,nmayor,nmenor;
            nmayor =Integer.MAX_VALUE;
            nmenor =Integer.MIN_VALUE;
            while (true) {
                numero = numscanner.nextInt();
                if (numero < 0) {
                    break;
                }
                if (numero > nmenor) {
                    nmenor = numero;
                }
                if (numero < nmayor) {
                    nmayor = numero;
                }
            }
            System.out.println("El número más grande de la serie es: " + nmenor);
            System.out.println("El número más pequeño de la serie es: " + nmayor);
            System.in.read();

        }catch(Exception e){
            System.out.println("Error al imprimir la serie");
        }
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcion;
        try {
            do {
                System.out.println("Menú de Ejercicios:");
                System.out.println("1. Hola Mundo");
                System.out.println("2. Suma de dos números");
                System.out.println("3. Número par o impar");
                System.out.println("4. Factorial de un número");
                System.out.println("5. Tabla de multiplicar");
                System.out.println("6. Serie de numeros enteros positivos");
                System.out.println("7. Salir");
                System.out.print("Selecciona una opción: ");
                opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        holamundo();
                        break;
                    case 2:
                        sumar();
                        break;
                    case 3:
                        poim();
                        break;
                    case 4:
                        facto();
                        break;
                    case 5:
                        tabmulti();
                        break;
                    case 6:
                        serie();
                        break;
                    case 7:
                        System.out.println("Saliendo del programa...chao");
                        break;
                    default:
                        System.out.println("Opcion no válida, intente otra vez");
                }
            } while (opcion != 7);
            scanner.close();
        }catch (Exception e){
            System.out.println("Error al seleccionar una opcion");
        }
    }
}
