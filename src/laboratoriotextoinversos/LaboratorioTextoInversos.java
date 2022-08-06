/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package laboratoriotextoinversos;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Fabricio Laureano
 */
public class LaboratorioTextoInversos {

    /**
     * @param args the command line arguments
     */
 
    public static void reverse(char str[])

    {
        
        int r = str.length - 1, l = 0;
        
        

        while (l < r) {


            if (!Character.isAlphabetic(str[l]))

                l++;

            else if (!Character.isAlphabetic(str[r]))

                r--;
 

            else {

                char tmp = str[l];

                str[l] = str[r];

                str[r] = tmp;

                l++;

                r--;

            }

        }

    }
 

    public static void main(String[] args)

    {
         Scanner entrada= new Scanner(System.in);

       
        System.out.println("ingrese un texto");
         String str = entrada.nextLine();
        

        char[] charArray = str.toCharArray();
 

        System.out.println("texto original: " + str);

        reverse(charArray);

        String revtexto = new String(charArray);
 

        System.out.println("texto revertidohola: " + revtexto);

    }
}

