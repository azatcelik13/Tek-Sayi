package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden
        // ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
        Scanner inp=new Scanner(System.in);
        int k ,total=0;
       // while (k<0)
      do {
        System.out.print("Bir sayı giriniz=");
        k = inp.nextInt();
         if (k%4==0){
            total=total+k;

            }

        }
        while (k%2==0);
        System.out.println("Toplam="+total);



        }}



