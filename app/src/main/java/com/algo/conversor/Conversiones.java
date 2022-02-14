package com.algo.conversor;

public class Conversiones {
    Double resultado;
    //Conversor de Millas a Kms
    public String MillasKms(String op1){
        try{
        resultado=Double.parseDouble(op1)*1.60934;
        }
        catch(NumberFormatException e){
            return "Error";
        }
        return String.valueOf(resultado);
    }
    //Conversor de Kms a Millas
    public String KmsMillas(String op1){
        try{
        resultado=Double.parseDouble(op1)*0.621;
        }
        catch(NumberFormatException e){
            return "Error";
        }
        return String.valueOf(resultado);
    }
    //Conversor de Celsius a Farenheit
    public String CFarenheit(String op1){
        try {
            resultado = ((Double.parseDouble(op1) * 9) / 5) + 32;
        }
        catch(NumberFormatException e){
            return "Error";
        }
        return String.valueOf(resultado);
    }
    //Conversor de Farenheit a Celsius
    public String FarenheitC(String op1){
        try{
        resultado=((Double.parseDouble(op1)-32)*5)/9;
        }
        catch(NumberFormatException e){
            return "Error";
        }
        return String.valueOf(resultado);
    }
}
