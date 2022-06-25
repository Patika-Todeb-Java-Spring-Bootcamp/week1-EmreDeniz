package com.Skor_Tablosu;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Writer {

    public static void sendIn (){
        Scanner input = new Scanner(System.in);
        System.out.print("Maç Sonucu : ");
        String data = input.nextLine();
        try {
            FileOutputStream board = new FileOutputStream("score.txt");
            byte[] dataByte = data.getBytes();
            board.write(dataByte);
            board.close();
        } catch (IOException e) {
            System.out.print(e.getMessage());
        }
    }

    public static void main(String[] args)  {


    }
}
