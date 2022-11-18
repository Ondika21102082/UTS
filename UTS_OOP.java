package com.mycompany.uts_oop;

import java.util.Scanner;

/**
 *
 * @author NIM 21102082 NAMA SILVESTER ONDIKA MAMPUR
 */
public class UTS_OOP {

    public static void main(String[] args) {
        rumahsakit RS = new rumahsakit();
        Scanner dtIN = new Scanner(System.in);
        
        System.out.print("Input Nama DOKTER : ");
        String NN = dtIN.nextLine();
        RS.SetDOKTER(NN);
        
        System.out.print("Input Nama Suster : ");
        NN = dtIN.nextLine();
        RS.SetSUSTER(NN);
        
        System.out.print("Input Nama Perawat : ");
        NN = dtIN.nextLine();
        RS.SetPERAWAT(NN);
        
        System.out.print("Input Nama Pasien : ");
        NN = dtIN.nextLine();
        RS.SetPASIEN(NN);
        
        System.out.print("Input Nama Pegawai : ");
        NN = dtIN.nextLine();
        RS.SetPEGAWAI(NN);
        
        System.out.println("nama dokter : " + NN);
        System.out.println("nama suster : " + NN);
        System.out.println("nama perawat : " + NN);
        System.out.println("nama pasien : " + NN);
        System.out.println("nama pegawai : " + NN);

    }
}

        