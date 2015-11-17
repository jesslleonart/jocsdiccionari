/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Consola;

import java.util.Scanner;

/**
 *
 * @author solde
 */
public class EntraDades {
/**
 *  Demana un nombre de tipus double per consola i el retorna
 * @param text per a mostrar per consola abans de captar el número
 * @return el double que necessitem
 */
    public double entrarUnDouble(String text) {
        Scanner scanner = new Scanner(System.in);
        double num = 0;
        System.out.println(text);
        while (!scanner.hasNextDouble()) {
            System.out.println("Entra un nombre sencer, si et plau");
            scanner.nextLine();
        }
        num = scanner.nextDouble();
        //clear scanner
        scanner.nextLine();
        return num;
    }
/**
 * Demana un nombre de tipus double per consola i el retorna
 * @param text per a mostrar per consola abans de captar el número
 * @return el float que necessitem
 */
    public float entrarUnFloat(String text) {
        Scanner scanner = new Scanner(System.in);
        float num;
        System.out.println(text);
        while (!scanner.hasNextFloat()) {
            System.out.println("Entra un nombre decimal, si et plau");
            scanner.nextLine();
        }
        num = scanner.nextFloat();
        //clear scanner
        scanner.nextLine();
        return num;
    }
/**
 * Demana un nombre per consola i l'acota dins un rang establert i el retorna
 * @param text text de presentació per a demanar el nombre
 * @param min el número més baix del rang. Inclusiu
 * @param max el número més alt del rang. Inclusiu
 * @return el nombre que l'usuari ha entrat per consola
 */
    public float FloatEnRang(String text, float min, float max) {
        Scanner scanner = new Scanner(System.in);
        float num;
        //en cas que s'hagin equivocat en l'ordre, els intercanviarem
        if (min>max){
            num= max;
            max= min;
            min= num;
        }
        
        num = entrarUnFloat(text);
        while (num < min || num > max) {
            num = entrarUnFloat("No està dins el rang, " + text);
        }
       
        return num;
    }

}
