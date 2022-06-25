package reader_thread;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Producer extends Thread {

        @Override
        public void run() {
            Scanner input = new Scanner(System.in);

                System.out.print("Maç Sonucu : ");
                String data = input.nextLine();
                try {
                    FileOutputStream board = new FileOutputStream("score.txt");
                    byte[] dataByte = data.getBytes();
                    board.write(dataByte);
                    notify();
                } catch (IOException e) {
                    System.out.print(e.getMessage());
                }
            }

        }


