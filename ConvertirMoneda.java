package ConversorMonedas;

public class ConvertirMoneda{



    public static void  dolarArgentinos(double montoOriginal){
        double valorArg = 890.27;
        double montoConvertido = montoOriginal * valorArg;
        System.out.println("La conversión de "+ montoOriginal + " [USD] corresponde a " +montoConvertido+ " [ARS].\n \n ***********************************************");

    }
    public static void argentinosDolar(double montoOriginal){
        double valorUsdArg = 0.0011;
        double montoConvertido = montoOriginal * valorUsdArg;
        System.out.println("La conversión de "+ montoOriginal + " [ARS] corresponde a " +montoConvertido+ " [USD].\n \n ***********************************************");
    }
    public static void dolarBrasil(double montoOriginal){
        double valorBrl = 5.17;
        double montoConvertido = montoOriginal * valorBrl;
        System.out.println("La conversión de "+ montoOriginal + " [USD] corresponde a " +montoConvertido+ " [BRL].\n \n ***********************************************");
    }
    public static void brasilDolar(double montoOriginal){
        double valorUsdBrl = 0.19;
        double montoConvertido = montoOriginal * valorUsdBrl;
        System.out.println("La conversión de "+ montoOriginal + " [BRL] corresponde a " +montoConvertido+ " [USD].\n \n ***********************************************");
    }
    public static void dolarMexicano(double montoOriginal){
        double valorMxn = 0.060;
        double montoConvertido = montoOriginal * valorMxn;
        System.out.println("La conversión de "+ montoOriginal + " [USD] corresponde a " +montoConvertido+ " [MXN].\n \n ***********************************************");
    }
    public static void mexicanoDolar(double montoOriginal){
        double valorUsdMxn = 16.70;
        double montoConvertido = montoOriginal * valorUsdMxn;
        System.out.println("La conversión de "+ montoOriginal + " [MXN] corresponde a " +montoConvertido+ " [USD].\n \n ***********************************************");
    }
}
