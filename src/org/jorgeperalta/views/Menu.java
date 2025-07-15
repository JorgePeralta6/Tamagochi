package org.jorgeperalta.views;
import org.jorgeperalta.controller.TamagotchiController;
import java.util.Scanner;
public class Menu {
    Scanner sc = new Scanner(System.in);
    TamagotchiController tamagotchicontroller = new TamagotchiController();
     
    int menu = 1;

    public void mostrarMenu() throws InterruptedException{
        tamagotchicontroller.inicio();
        
        do{
            try {
            tamagotchicontroller.principal();
            System.out.println("1. Estudiar");
            System.out.println("2. Comer");
            System.out.println("3. Jugar");
            System.out.println("4. Dormir");
            System.out.println("0. Despedirse");
            menu = sc.nextInt();

            switch(menu){
                case 0:
                    System.out.println("Hasta luego crack");
                    System.out.println("Ojala vuelvas pronto");
                    break;
                case 1:
                    tamagotchicontroller.estudiar();
                    break;
                case 2:
                    tamagotchicontroller.comer();
                    break;
                case 3:
                    tamagotchicontroller.jugar();
                    break;
                case 4:
                    tamagotchicontroller.dormir();
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
            }
            } catch (Exception e) {
                System.out.println("        ----ERROR----");
                sc.nextLine();
            }
        }while(menu != 0);
    }
}
