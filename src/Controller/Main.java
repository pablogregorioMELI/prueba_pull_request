package Controller;

import java.util.Scanner;

public class Main {
    public static void numerosPares(int numero){
        for (int i = 0; i <= numero; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void numerosMultiplos(int n, int m){
        for (int i = 0; i <= m; i++) {
            if (i%n == 0) {
                System.out.println(i);
            }
        }
    }

    public static boolean esPrimo(int n){
            if (n <= 1)
                return false;

            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }

            return true;
    }

    public static void numerosPrimos(int numero){
        int count;

        for (int i = 1; i <= numero; i++) {
            count = 0;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }

            if (count == 0) {
                System.out.println(i);
            }

        }
    }

    public static boolean cumpleCondicion(int h, int b, int l) {
        String s = Integer.toString(h);
        char c = (char)(l+48);
        return charCount(s, c)==b;
    }

    private static int charCount(String s, char c){
        int cont = 0;
        for (int i = 0; i<s.length(); i++){
            if (s.charAt(i) == c) {
                cont++;
            }
        }
        return cont;
    }



    public static void main(String[] args) {
        System.out.println("Hola, bienvenido!!");
        System.out.println("Estimado por favor ingrese un numero para ver los pares atras del numero ingresado");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        numerosPares(n);

        System.out.println("Estimado por favor ingrese dos numeros para verificar sus multiplos");
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        int j = scan1.nextInt();
        int m = scan2.nextInt();
        numerosMultiplos(j,m);

        System.out.println("Estimado por favor ingrese un numero para verificar si es primo");
        Scanner scan3 = new Scanner(System.in);
        int p = scan3.nextInt();
        if (esPrimo(p) == true) {
            System.out.println("Es primo");
        } else {
            System.out.println("No es primo");
        }

        System.out.println("Estimado por favor ingrese un numero para mostrarle los numeros primos que tiene delante de el");
        Scanner scan4 = new Scanner(System.in);
        int k = scan4.nextInt();
        numerosPrimos(k);

        System.out.println("Ingrese la cantidad de numeros que quiere imprimir en INGRESE N, elija la cantidad de digitos que quiera que se repitan en INGRESE M y el digito a repetir en INGRESE D:");

        Scanner scan5 = new Scanner(System.in);
        System.out.println("INGRESE N");
        int z = scan5.nextInt();
        System.out.println("INGRESE M");
        int b = scan5.nextInt();
        System.out.println("INGRESE D");
        int l = scan5.nextInt();

        int h = 1;
        int cont = 0;

        while (cont<z){
            if (cumpleCondicion(h, b, l)){
                System.out.println(h);
                cont++;
            }
            h++;
        }



    }
}

