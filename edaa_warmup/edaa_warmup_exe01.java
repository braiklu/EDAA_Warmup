/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.edaa_warmup;

/**
 *
 * @author lucas braich
 */
public class edaa_warmup_exe01 {

    public static void main(String[] args) {
        int tabuada[][] = new int[10][10];

            for (int line = 0; line < 10; line++) {
                for (int column = 0; column < 10; column++) {

                    int num = line + column;
                    tabuada[line][column] = num;
                    System.out.print(tabuada[line][column] + "\t | ");
                }
                System.out.println("");
            }
    }
}


