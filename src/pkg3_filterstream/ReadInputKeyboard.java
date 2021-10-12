package pkg3_filterstream;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ReadInputKeyboard {
    
//    public static void main(String[] args) {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("Masukan karakter apapun, [tekan keluar tekan 'q']: ");
//        char input = 0;        
//        do {
//            try {
//                input = (char) br.read();
//                System.out.print("" + input);                
//            }catch(IOException e){                Logger.getLogger(ReadInputKeyboard.class.getName()).log(Level.SEVERE,null, e);
//            }
//        }  while(input != 'q'); 
//    }
    
//    public static void main(String[] args) throws IOException {
//        
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("Masukan karakter apapun, [tekan keluar tekan 'q']: ");
//        String input = "";
//        
//        do {
//            try {
//                input = br.readLine();
//                System.out.println(input);
//                
//            }catch(IOException e){
//                Logger.getLogger(ReadInputKeyboard.class.getName()).log(Level.SEVERE,null, e);
//            }
//        }  while(!input.equals("q")); 
//    }


    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukan karakter apapun, [tekan keluar tekan 'q']: ");
        String input = "";
        do {
            input = sc.nextLine();
            System.out.println(input);            
        }  while(!input.equals("q")); 
    }
}
