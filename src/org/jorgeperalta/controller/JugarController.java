package org.jorgeperalta.controller;
import java.util.Random;
import java.util.Scanner;
import org.jorgeperalta.models.Tamagotchi;

public class JugarController {
    Scanner sc = new Scanner(System.in);
    Random random = new Random();
    Tamagotchi t1 = new Tamagotchi();

    public void jugarcontroller(){
    System.out.println("Bienvenido al juego de sumas y restas aleatorios");
    System.out.println("Se le presentara una operacion");

    int numPregunta = 1;
    int corractaRespuesta = 0;

        for (int i = 0; i < numPregunta; i++){
            int number1 = random.nextInt(100);
            int number2 = random.nextInt(100);
            boolean z = random.nextBoolean();

            if(z){
                int resultado = number1 + number2;
                System.out.println(number1 + "+" + number2);
                int usuarioRespuesta = sc.nextInt();
                if(usuarioRespuesta == resultado){
                    System.out.println("Correcto eros muy inteligente");
                    t1.setHambre(t1.getHambre()+6);
                    corractaRespuesta++;
                }else{
                    System.err.println("Incorrecto, el numero es: "+resultado + "   Anda a ver tutorias");
                    t1.setVida(t1.getVida()-6);
                    t1.setHambre(t1.getHambre()+3);
                }
            }else {
                int resultado = number1 - number2;
                System.out.println(number1 + "-" + number2);
                int usuarioRespuesta = sc.nextInt();
                if(usuarioRespuesta == resultado){
                    System.out.println("Correcto eros muy inteligente");
                    t1.setHambre(t1.getHambre()+6);
                    corractaRespuesta++;
                }else{
                    System.err.println("Incorrecto, el numero es: "+resultado + "   Anda a ver tutorias");
                    t1.setVida(t1.getVida()-6);
                    t1.setHambre(t1.getHambre()+3);            
                }
            }
        }
        System.out.println("Juego acabado sigue asi crack");
    }
}

