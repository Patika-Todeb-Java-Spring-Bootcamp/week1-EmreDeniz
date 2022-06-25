package reader_thread;


import java.io.FileInputStream;
import java.io.IOException;

public class Consumer extends Thread {
    @Override
    public void run() {

        int first_Word = 0;
            try {
                wait();
                FileInputStream input = new FileInputStream("score.txt");
                first_Word = input.read();
                while (first_Word != -1) {
                    System.out.print((char) first_Word);
                    first_Word = input.read();
                }
                System.out.print("\n");
            } catch (IOException e) {
                System.out.print(e.getMessage());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
      }
     }



