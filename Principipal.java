package ConversorMonedas;
import java.util.Scanner;

public class Principipal{

 public static void main(String[] args){
     Scanner teclado = new Scanner(System.in);

     int opcion = 0;
     double montoOriginal = 0;

     while (opcion != 7){
         System.out.println("*********** Bienvenido al conversor de monedas ***********");
         System.out.println("1) Dólar           --> Peso argentino");
         System.out.println("2) Peso argentino  --> Dólar");
         System.out.println("3) Dólar           --> Real Brasileño");
         System.out.println("4) Real Brasileño  --> Dólar");
         System.out.println("5) Dólar           --> Peso mexicano");
         System.out.println("6) Peso mexicano   --> Dólar");
         System.out.println("7) Salir");
         System.out.println("Elija una opción válida:");
         System.out.println("**********************************************************");
         opcion = teclado.nextInt();

         switch (opcion) {
             case 1:
                 System.out.println("Ingrese el valor dólares que desee convertir a pesos argentinos:");
                 montoOriginal = teclado.nextInt();
                 ConvertirMoneda.dolarArgentinos(montoOriginal);
                 break;

             case 2:
                 System.out.println("Ingrese el valor de pesos argentinos que desee convertir a dólar:");
                 montoOriginal = teclado.nextInt();
                 ConvertirMoneda.argentinosDolar(montoOriginal);
                 break;

             case 3 :
                 System.out.println("Ingrese el valor de dólares que desee convertir a pesos brasileños:");
                 montoOriginal = teclado.nextInt();
                 ConvertirMoneda.dolarBrasil(montoOriginal);
                 break;

             case 4 :
                 System.out.println("Ingrese el valor de pesos brasileños que desee convertir a dólares:");
                 montoOriginal = teclado.nextInt();
                 ConvertirMoneda.brasilDolar(montoOriginal);
                 break;

             case 5 :
                 System.out.println("Ingrese el valor de dólares que desee convertir a pesos mexicanos:");
                 montoOriginal = teclado.nextInt();
                 ConvertirMoneda.dolarMexicano(montoOriginal);
                 break;

             case 6 :
                 System.out.println("Ingrese el valor de pesos mexicanos que desee convertir a dólares:");
                 montoOriginal = teclado.nextInt();
                 ConvertirMoneda.mexicanoDolar(montoOriginal);
                 break;

             default:

         }
     }
 }
}
