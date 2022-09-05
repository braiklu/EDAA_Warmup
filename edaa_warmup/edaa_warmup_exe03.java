/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.edaa_warmup;
import java.text.DecimalFormat;

/**
 *
 * @author lucas braich
 */
public class edaa_warmup_exe03 {

    public static void main(String args[]) {
        
        DecimalFormat formatador = new DecimalFormat("0.00");
        String modelo[] = {"UP", "MOBI", "UNO", "ONIX", "KWID"};			
        double consumo[] = {15.3, 9.2, 12.2, 9.6, 13.7};
        double maiorCons = 0;
        int posicao = 0;
        double consumo1000;
        
        for (int i = 0; i < consumo.length; i++) {

                if (maiorCons < consumo[i]) {
                        maiorCons = consumo[i];
                        posicao = i;
                }
        }

        System.out.println("Modelo de carro mais econômico apresentado é o " + modelo[posicao] + ". O seu consumo é de "+ maiorCons + " Km/L de Gasolina na Cidade.");

        for (int i = 0; i < modelo.length; i++) {
                consumo1000 = (1000 / consumo[i]);				
                System.out.println("O carro de modelo "+ modelo[i] + " consome em média " + formatador.format(consumo1000)+ " litros a cada 1000 Km rodados");
        }
    }
}
