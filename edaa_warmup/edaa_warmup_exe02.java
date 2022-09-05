/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.edaa_warmup;
import java.util.Scanner;

/**
 *
 * @author lucas braich
 */
public class edaa_warmup_exe02 {
    
    public static void main(String[] args) {
        int[] arr = {7, 8, 9, 10, 11, 12, 13, 23, 29, 113};
        
        boolean flag = true;
        for(int number = 0; number < 10; number++){
            for(int confere = 2; confere < arr[number]; confere++){
                if(arr[number]%confere == 0){
                    flag = false;
                }
            }
            
            if(flag && arr[number] > 2){
                System.out.println("O número " + arr[number] + " é primo e está na posição " + number + " do vetor.");
            }
            flag = true;
        }
    }
}
