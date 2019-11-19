package encryptionproject;

import java.time.Clock;
import java.util.Scanner;

public class ROT13 {

    private static Scanner in;

    public static void main(String[] args) {
        in = new Scanner(System.in);
        System.out.println("1. Encriptacion\n2. Desencriptacion\n3. Elige 1 o 2:");
        int elige = in.nextInt();
        in.nextLine();

        if (elige == 1) {
            System.out.println("---- Encriptacion ----");
            Encriptacion();
        } else if (elige == 2) {
            System.out.println("---- Desencriptacion ----");
            Desencriptacion();
        } else {
            System.out.println("---- Eleccion Incorrecta ----");
        }
               
    }

    private static void Encriptacion() {
        System.out.println("Solo texto alfabetico");
        System.out.println(" Ingresa el Mensaje a Encriptar");
        String mensaje = in.nextLine();
        in.nextLine();
        mensaje = mensaje.toUpperCase();

        int clave = 13;
        String encriptarTexto = "";
        for (int i = 0; i < mensaje.length(); i++) {
            int temp = (int) mensaje.charAt(i) + clave;
            if ((int) mensaje.charAt(i) == 32) {
                encriptarTexto += "";
            }else if(temp > 90){
                temp -= 26;
                encriptarTexto += (char)temp;
            }else{
                encriptarTexto += (char)temp;
            }
        }
        
        System.out.println("Mensaje Encriptado: " + encriptarTexto);

    }

    private static void  Desencriptacion(){
        System.out.println("Solo texto alfabetico");
        System.out.println(" Ingresa el Mensaje a Desencriptar");
        String mensaje = in.nextLine();
        in.nextLine();
        mensaje = mensaje.toUpperCase();

        int clave = 13;
        String desencriptarTexto = "";
        for (int i = 0; i < mensaje.length(); i++) {
            int temp = (int) mensaje.charAt(i) - clave;
            if ((int) mensaje.charAt(i) == 32) {
                desencriptarTexto += "";
            }else if(temp < 65){
                temp += 26;
                desencriptarTexto += (char)temp;
            }else{
                desencriptarTexto += (char)temp;
            }
        }
        
        System.out.println("Mensaje Desencriptado: " + desencriptarTexto);

    }
}

