package com.algo.conversor;

public class Conversiones {
    public String MillasKms(String op1){
        Double resultado=Double.parseDouble(op1)*1.60934;
        return String.valueOf(resultado);
    }
    public String KmsMillas(String op1){
        Double resultado=Double.parseDouble(op1)*0.621;
        return String.valueOf(resultado);
    }
    public String CFarenheit(String op1){
        Double resultado=((Double.parseDouble(op1)*9)/5)+32;
        return String.valueOf(resultado);
    }
    public String FarenheitC(String op1){
        Double resultado=((Double.parseDouble(op1)-32)*5)/9;
        return String.valueOf(resultado);
    }
}
