/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package orcamento;

import java.util.Scanner;

/**
 *
 * @author robertocrisppi
 */
public class Orcamento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (Scanner escola = new Scanner(System.in)) {
            
            System.out.println("Digite o valor da escola: ");

            String valor = escola.nextLine();

            System.out.println("Olá, o valor da escola é " + valor + "!");

            escola.close();
        }
    }

}
