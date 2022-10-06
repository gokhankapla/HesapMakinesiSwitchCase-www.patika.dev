package com.gokhankaplan.hesapmakinesiswitchcase;

import java.util.Scanner;

public class HesapMakinesiSwitchCase {
    public static void main(String[] args){
        int a,b, select;
        Scanner input= new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        a = input.nextInt();
        System.out.println("İkinci sayıyı giriniz: ");
        b = input.nextInt();
        System.out.println("Bir işlem giriniz: ");
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.println("Sonuc: " + (a+b));
                break;
            case 2:
                System.out.println("Sonuc: " + (a-b));
                break;
            case 3:
                System.out.println("Sonuc: " + (a*b));
                break;
            case 4:
                System.out.println("Sonuc: " + (a/b));
                break;

                default:
                    System.out.println("Lütfen doğru bir sayı giriniz.");

        }


    }

}
