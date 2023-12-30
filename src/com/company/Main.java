package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        String a = "Tahun Kabisat";
        String b = "Bukan Tahun Kabisat";
        int tahun;

        Scanner input=new Scanner(System.in);
        System.out.print("Masukan Tahun (1900-2030): ");
        tahun=input.nextInt();
        if (tahun<1900){
            System.out.println("Maaf, Tahun yang anda masukkan  Dibawah 1900");
        }
        else if (tahun>2030){
            System.out.println("Maaf, Tahun yang anda masukkan Diatas 2020");
        }
        else if (tahun%4==0){
            System.out.println("Tahun " + tahun + " Adalah " + a);
        }
        else if (tahun%4!=0 || tahun%100==00){
            System.out.println("Tahun " + tahun + " " + b);
        }
        else if(tahun%4!=0 || tahun%100!=00 || tahun%4==0){
            System.out.println("Tahun " + tahun + " Adalah " + a);
        }else{
            System.out.println("Tahun " + tahun + " " + b);
        }
    }
}
