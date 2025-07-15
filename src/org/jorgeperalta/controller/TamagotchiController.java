package org.jorgeperalta.controller;

import java.util.Scanner;
import java.util.ArrayList;
import org.jorgeperalta.models.Niño;
import org.jorgeperalta.models.Tamagotchi;
import org.jorgeperalta.models.Niña;
import org.jorgeperalta.controller.ComerController;
import org.jorgeperalta.controller.JugarController;
import org.jorgeperalta.controller.NiñoDormir;
import java.util.Random;

public class TamagotchiController {
    Tamagotchi t1 = new Tamagotchi();
    Niño niño = Niño.getInstanse();
    Niña niña = new Niña();
    Random random = new Random();
    ComerController comerController = new ComerController();
    JugarController jugarController = new JugarController();
    NiñoDormir niñoDormir = new NiñoDormir();
    NiñaDormir niñaDormir = new NiñaDormir();
    Scanner sc = new Scanner(System.in);
    ArrayList<String> lista = new ArrayList<>();
    String nombre;
    int menu;
    

    public void inicio(){
        do{
            try {
            System.out.println("                                                                                                                        \r\n" + //
            "            ..                                                                                                                             \r\n" + //
            "           :@@%-                        :+%#                        :*+.                                                                   \r\n" + //
            "           +@@@@*                     =%@@@@                        +@@@%*-                                                                \r\n" + //
            "           #@@#%@#                 .+@@@@@@+                        :@@@@@@@+.                                        .-=*#-               \r\n" + //
            "           #@===+@*               =@#+#@@@%                          #@@@@@%@@#-                                 .-+*%@@@@@+               \r\n" + //
            "           +@====+@-             #@+===%@@:                          -@@@@@@@@%@%-                            -*%@@@@@@@%@#                \r\n" + //
            "           .@#+++*@%           :%%====+@@-                            *@@@@@@@@%%@%:    .-.   ..          .=#@@@@@@@@@@@@%                 \r\n" + //
            "            *@####%@-:=====-:.:@%====*@%:                             .@@@@@@@@@@%%@#@**@@@##%@@+-.     .*@@@@@@@@@@@@@@#                  \r\n" + //
            "             %@###%%#*+++++*#%@%===*%@#.                               :@@@@@@@@@@@@@@%@@%%@@@%@@@@%+::*@@@@@@@@@@@@@@@+       -=.         \r\n" + //
            "             .%@%=----------=*#==+#@%-                                  :@@@@@@@@@@@%####*#####%@##%%@@@@@@@@@@@@@@@@@#=-:::=*@@@%.        \r\n" + //
            "             :@#=----------=====*#%@:                     .:-=**#%*       =@@@@@@@@###*******########%@@@@@@@@@@@@@@%#++*****=:*%@=        \r\n" + //
            "             %#-===================#@:             .:=+#%%%#*+=--@#         =%@@@@##**********#######%@@@@@@@@@@@@%####+=-::....+@+        \r\n" + //
            "            =@##*==========**+======%%       :-+*#%#**=---------+@-           .#@#####******##########@@@@@@@@@@@@@%####+-.:::=+#@*        \r\n" + //
            "            *@@+%========+%:+@%=====*@::=+#%%%*+=--------------:%@             %@%@%###################%@@@@@@@@@@@@@@%*+*#%%***%@=        \r\n" + //
            "           :@%@@*========#@@@@@+====+@@#*++=========-----------=@=             @@@#@#######%%#%@%#######%@@@@@@@@@@@@@@@@@@@%#**@@.        \r\n" + //
            "           *@#====+*======+##%%@%#==+@@===============---------#@              @@@@@#######%@%@@@%######%@@@@@@@@@@@@@@@@@@@@##@@#         \r\n" + //
            "           =@%==+**#***=====*@@@@@*=+@@@+===============----==+@=              %@@@@#######%@@@@@%######@%%@@@@@@@@@@@@@@@@@@@@@@.         \r\n" + //
            "            =@*=============*@@@@#===@=+@*====##%%%%%#####***++-               %@%%%##%#####@@@@@#####%@%*##%@@@@@@@@@@@@@@@@@@%.          \r\n" + //
            "             *@#+============*#*+====%# -@#===*@*.                             #@%%%%%%%###########%%@@#***#%@@@@@@@@@@@@@@@@@#            \r\n" + //
            "            .@*==+===================*@-:*@#===*@*                             :@@@@@@@@@@%%%%%%@@@@@%*******%@@@@@@@@@@@@@@%-             \r\n" + //
            "            +@===+%+======#*==========%@@%#=====+@*                           =@#::+#@@@@@@@@@@@@@%%#++=:-+***@@@@@@@@@@@@*:               \r\n" + //
            "            +@====*@====+%+======+%+==+@%###++**#%@:                         .@@*::-:-=+**####**+==-+::::.-***%@@@@@**+-:                  \r\n" + //
            "            =@+====@*==+@+======+%%====@@@@%#*=-:                            +@@%:*=.:::::::::::.:::::...:+**%@@@@@@.                      \r\n" + //
            "            :@%====%#=+%*=====+#%#=====*@@@+                                 =*%@%%-:=:::::.::::::::.=*:-+*#*@@@@@@@%.                     \r\n" + //
            "            %%*@+=#@+=*@+====*%%+======*@@@@*                                   *@%**%#--:::::::-----#@#*%@@@@@@@@@@@+                     \r\n" + //
            "           -@#++%%#+===#%%*###+=====+*#%@##*+                                    *@@%#@*********%*#@%@@@@@@@@@@@@@@@@:                     \r\n" + //
            "           :@%###***+++++***++***######@@=                                         =@@#%%*%****%%%@@@%%@@@@@@@@@@@@@=                      \r\n" + //
            "            -%@%%####%%%##%%########%%@%#=                                           -=*%@@@#%@@@@@@####%@@@@@@@@@@%                       \r\n" + //
            "            :*@@@%%#@@%#%%%@@%%####%@@=                                                 #@@@@@@@@@@%####%@@@@@@@@@@:                       \r\n" + //
            "            #@@@@@%%#*.     :=#@@##%@+                                                  =@@@@@@@@@%#%##%@#.=*%%%*=.                        \r\n" + //
            "                              .%@%%%%:                                                   .=+**+=%@@@@@@@*                                  \r\n" + //
            "                                -==-                                                             :+**+=.                                   \r\n" + //
            "                                                                                                                                           \r\n" + //
            "                                                                                                                                           \r\n" + //
            "                                                                                                                                           \r\n" + //
            "                                                                                                                                           \r\n" + //
            "                       ::-%%@@-                                                                .-::--:                                     \r\n" + //
            "                         .@@@@-                                                              .#@#   @@@+                                   \r\n" + //
            "                         .@@@@-                                                              -@@@=  %@@@.                                  \r\n" + //
            "                         .@@@@-                                                               .:.  :@@@=                                   \r\n" + //
            "                         .@@@@-                                                                   -@@+                                     \r\n" + //
            "                         .@@@@-                                                                 .**-   .:                                  \r\n" + //
            "                         .@@@@-                                                               :*#-----+@-                                  \r\n" + //
            "                         .@@@@-                                                              :@@@@@@@@@@:                                  \r\n" + //
            "                       .::::::::                                                             .----------                                   \r\n" + //
            "                                                                                                                                           \r\n" + //
            "                                                                                                                                           \r\n" + //
            "                                                                                                                                           \r\n" + //
            "");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Seleccione un personaje");
        System.out.println("1. Pikachu (chico)");
        System.out.println("2. Eevee (chica)");
        menu = sc.nextInt();
        sc.nextLine();

        if(menu == 1){
            System.out.println("Ingrese el nombre del pokemon");
            nombre = sc.nextLine();
            System.out.println("--------------------------------------------------------------------");
            t1 = new Niño(0,0,0,100,"Masculino",nombre);
            break;     
        }else if(menu == 2){
            System.out.println("Ingrese el nombre del pokemon");
            nombre = sc.nextLine();
            System.out.println("--------------------------------------------------------------------");
            t1 = new Niña(0,0,0,100,"Femenino",nombre);
            break;
        }else{
            System.out.println("Ingrese una opcion valida");
        }
            
        } catch (Exception e) {
            System.out.println("    ----ERROR----");
            sc.nextLine();
        }
        }while(menu != 0);
    }

    public void principal(){
        try {
            if(t1.getGenero().equals("Masculino")){
            niño.mostrarPersona();
            System.out.println("--------------------------------------------------------------------");
            System.out.println("----------------------HOLA MI NOMBRE ES -----------------------------");
            System.out.println("--------------------------" + nombre + "---------------------------");
            System.out.println("--------------------------------------------------------------------");
            System.out.println("------------------------Estadistica---------------------------------");
            System.out.println("--------------------------------------------------------------------"); 
            System.out.println("Inteligencia    " + t1.getInteligencia() + "%");
            System.out.println("Hambre  " + t1.getHambre() + "%");
            System.out.println("Diversion    " + t1.getDiversion() + "%");
            System.out.println("Vida    " + t1.getVida() + "%");
            System.out.println("Genero  " + t1.getGenero());
            System.out.println("--------------------------------------------------------------------");

            
        }else if(t1.getGenero().equals("Femenino")){
            niña.mostrarPersona();
            System.out.println("--------------------------------------------------------------------");
            System.out.println("----------------------HOLA MI NOMBRE ES -----------------------------");
            System.out.println("----------------------------" + nombre + "-----------------------------");
            System.out.println("--------------------------------------------------------------------"); 
            System.out.println("------------------------Estadistica---------------------------------");
            System.out.println("--------------------------------------------------------------------"); 
            System.out.println("Inteligencia    " + t1.getInteligencia() + "%");
            System.out.println("Hambre  " + t1.getHambre() + "%");
            System.out.println("Diversion    " + t1.getDiversion() + "%");
            System.out.println("Vida    " + t1.getVida() + "%");
            System.out.println("Genero  " + t1.getGenero());
        }
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("        ----ERROR----");
            sc.nextLine();
        }catch (Exception e) {
            System.out.println("        ----ERROR----");
            sc.nextLine();
        }
    }
    public void estudiar(){
        do {
            try {
            System.out.println("Escoja una opcion");
            System.out.println("1. Aprender algo nuevo");
            System.out.println("2. Mostrar datos");
            int estudio = sc.nextInt();
            sc.nextLine();

            if(estudio == 1){
                System.out.println("Dime lo que quieres aprender");

                lista.add(sc.nextLine());
                t1.setInteligencia(t1.getInteligencia()+3);
                t1.setHambre(t1.getHambre()+5);
                break;
            }else if(estudio == 2){
                System.out.println("Estos son los datos aprendidos");
                for (String dato : lista) {
                    System.out.println(dato);
                    t1.setInteligencia(t1.getInteligencia()+1);
                }
                break;
            }
            
            limet();
            } catch (Exception e) {
                System.out.println("        ----ERROR----");
                sc.nextLine();
            }            
        } while (menu != 0);
    }
    public void comer(){
        do{
            try {
            comerController.comercontroller();

            System.out.println("Piense lo que desee comer");
            System.out.println("1. Carne");
            System.out.println("2. Pollo");
            System.out.println("3. Tarta");
            int tragar = sc.nextInt();
            sc.nextLine();
            
            if(tragar == 1){
                t1.setHambre(t1.getHambre()-5);
                limet();
                break;     
            }else if(tragar == 2){
                t1.setHambre(t1.getHambre()-4);
                limet();
                break;
            }else if(tragar == 3){
                t1.setHambre(t1.getHambre()-3);
                limet();
                break;
            }
            } catch (Exception e) {
                System.out.println("        ----ERROR----");
                sc.nextLine();
            }

        }while(menu !=0);
    }
    public void jugar(){
        do {
        try {
        int menu;
        int contador = 0;
        System.out.println("Seleccione un juego");
        System.out.println("1. Sumas o Resta aleatoria");
        System.out.println("2. Adivinaza de numero aleatorio");
        menu = sc.nextInt();
        sc.nextLine();
        if(menu == 1){
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
                        System.out.println("Correcto eres muy inteligente");
                        t1.setHambre(t1.getHambre()+6);
                        t1.setInteligencia(t1.getInteligencia()+4);
                        t1.setDiversion(t1.getDiversion()+5);
                        corractaRespuesta++;
                    }else{
                        System.err.println("Incorrecto, el numero es: "+resultado + "   Anda a recibir tutorias");
                        t1.setVida(t1.getVida()-2);
                        t1.setHambre(t1.getHambre()+10);
                        t1.setInteligencia(t1.getInteligencia()-1);
                        t1.setDiversion(t1.getDiversion()-2);
                        limet();
                    }
                }else {
                    int resultado = number1 - number2;
                    System.out.println(number1 + "-" + number2);
                    int usuarioRespuesta = sc.nextInt();
                    if(usuarioRespuesta == resultado){
                        System.out.println("Correcto eres muy inteligente");
                        t1.setHambre(t1.getHambre()+6);
                        t1.setInteligencia(t1.getInteligencia()+4);
                        t1.setDiversion(t1.getDiversion()+5);
                        corractaRespuesta++;
                    }else{
                        System.err.println("Incorrecto, el numero es: "+resultado + " Anda a recibir tutorias");
                        t1.setVida(t1.getVida()-2);
                        t1.setHambre(t1.getHambre()+10);
                        t1.setInteligencia(t1.getInteligencia()-1);
                        t1.setDiversion(t1.getDiversion()-2);     
                        limet();       
                    }
                }
            }
            System.out.println("Juego acabado sigue asi crack");
            break;
        }else if(menu == 2){
        int numeroSecreto = random.nextInt(100)+1; 
        System.out.println("Adivina el número secreto entre 1 y 100:");
        int intento;
        do {
            intento = sc.nextInt();
            if (intento == numeroSecreto) {
                System.out.println("Correcto Has adivinado el número secreto");
                break;
            } else if (intento < numeroSecreto) {
                System.out.println("El número secreto es mayor. Intenta de nuevo:");
                contador++;
            } else {
                System.out.println("El número secreto es menor. Intenta de nuevo:");
                contador++;
            }
        } while (intento != numeroSecreto);
        t1.setDiversion(t1.getDiversion()+3);
        t1.setHambre(t1.getHambre()+4);
        t1.setVida(t1.getVida()- contador);
        limet();
        break;
        }
        limet();
        } catch (Exception e) {
            System.out.println("        ----ERROR----");
            sc.nextLine();
        }
        } while (menu != 0);
    }
    public void dormir() throws InterruptedException{
        try {
        if(t1.getGenero().equals("Masculino")){
        niñoDormir.niñodcontroller();
        System.out.print("\rDurmiendo espera un rato");
        Thread.sleep(1400);
        System.out.print("\rDurmiendo sigue esperando");
        Thread.sleep(1400);
        System.out.print("\rDurmiendo espera                     ");
        Thread.sleep(1200);
        System.out.print("\rDurmiendo ESPERA                      ");
        Thread.sleep(1200);
        System.out.print("\rDurmiendo perdon sigue esperando");
        Thread.sleep(1200);
        System.out.print("\rDurmiendo aun sigue               ");
        Thread.sleep(1200);
        System.out.print("\rDurmiendo falta poco               ");
        Thread.sleep(1200);
        System.out.print("\rDurmiendo Ya esta                   ");
        Thread.sleep(1200);
        
        t1.setVida(t1.getVida()+25);
        t1.setHambre(t1.getHambre()+8);

        }else if(t1.getGenero().equals("Femenino")){
        niñaDormir.niñadcontroller();
        System.out.print("\rDurmiendo espera un rato");
        Thread.sleep(1400);
        System.out.print("\rDurmiendo sigue esperando");
        Thread.sleep(1400);
        System.out.print("\rDurmiendo espera                      ");
        Thread.sleep(1200);
        System.out.print("\rDurmiendo ESPERA                       ");
        Thread.sleep(1200);
        System.out.print("\rDurmiendo perdon sigue esperando");
        Thread.sleep(1200);
        System.out.print("\rDurmiendo aun sigue                  ");
        Thread.sleep(1200);
        System.out.print("\rDurmiendo falta poco                   ");
        Thread.sleep(1200);
        System.out.print("\rDurmiendo Ya esta                      ");
        Thread.sleep(1200);

        t1.setVida(t1.getVida()+25);
        t1.setHambre(t1.getHambre()+8);
        }
        limet();
        } catch (Exception e) {
            System.out.println("        ----ERROR----");
        }
    }
    public void limet(){
        try {
            if(t1.getHambre() < 0){
            t1.setHambre(0);
        }
        if(t1.getVida() > 100){
            t1.setVida(100);
        }
        if(t1.getInteligencia() < 0){
            t1.setInteligencia(0);
        }
        if(t1.getDiversion() < 0){
            t1.setDiversion(0);
        }
        } catch (Exception e) {
            System.out.println("        ----ERROR----");
        }
    }
}