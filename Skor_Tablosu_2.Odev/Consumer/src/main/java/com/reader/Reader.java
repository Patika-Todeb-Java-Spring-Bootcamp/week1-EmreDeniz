package com.reader;

import com.Skor_Tablosu.Writer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Reader {

    public static void readOut(){
        int first_Word = 0;
        try {
            FileInputStream input = new FileInputStream("score.txt");
            first_Word = input.read();
            while(first_Word != -1){
                System.out.print( (char) first_Word);
                first_Word = input.read();
            }
            System.out.print("\n");
        } catch (IOException e) {
            System.out.print(e.getMessage());
        }
    }

    public static void main(String[] args) {
        while(true) {
            Writer.sendIn();
            readOut();
        }
    }

}
