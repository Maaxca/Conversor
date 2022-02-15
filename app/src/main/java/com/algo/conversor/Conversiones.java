package com.algo.conversor;

public class Conversiones {
    Double resultado;
    long resultado2;
    int resul;

    /**
     * Conversor de Millas a Kms
     * @param op1
     * @return
     */
    public String MillasKms(String op1){
        try{
        resultado=Double.parseDouble(op1)*1.60934;
        }
        catch(NumberFormatException e){
            return "Error";
        }
        return String.valueOf(resultado);
    }

    /**
     * Conversor de Kms a Millas
     * @param op1
     * @return
     */
    public String KmsMillas(String op1){
        try{
        resultado2=Math.round(Double.parseDouble(op1)*0.621);
        }
        catch(NumberFormatException e){
            return "Error";
        }
        return String.valueOf(resultado2);
    }

    /**
     * Conversor de Celsius a Farenheit
     * @param op1
     * @return
     */
    public String CFarenheit(String op1){
        try {
            resultado = ((Double.parseDouble(op1) * 9) / 5) + 32;
        }
        catch(NumberFormatException e){
            return "Error";
        }
        return String.valueOf(resultado);
    }

    /**
     * Conversor de Farenheit a Celsius
     * @param op1
     * @return
     */
    public String FarenheitC(String op1){
        try{
        resultado=((Double.parseDouble(op1)-32)*5)/9;
        }
        catch(NumberFormatException e){
            return "Error";
        }
        return String.valueOf(resultado);
    }

    public String pasarKBaMB(String op1){
        try{
            resul=Integer.parseInt(op1)/1024;
        }
        catch(NumberFormatException e){
            return "Error";
        }
        return String.valueOf(resul);
    }
}
