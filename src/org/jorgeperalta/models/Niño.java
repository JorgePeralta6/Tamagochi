package org.jorgeperalta.models;
import org.jorgeperalta.controller.ITamagotchi;


public class Niño extends Tamagotchi implements ITamagotchi {
    private String nombreH;
    private static Niño instanse;
    
    public static Niño getInstanse(){
        if (instanse == null){
            instanse = new Niño();
        }
        return instanse;
    }

    public Niño(){
        super();
    }
    public Niño(int inteligencia, int hambre, int diversion, int vida, String genero, String nombreH){
        super(inteligencia, hambre, diversion, vida, genero);
        this.nombreH = nombreH;
    }

    public String getNombreH(){
        return nombreH;
    }
    public void setNombreH(String nombreH){
        this.nombreH = nombreH;
    } 

    @Override
    public void mostrarPersona(){
        System.out.println(" :@@%-                        :+%#                       \r\n" + //
                            " +@@@@*                     =%@@@@                       \r\n" + //
                            " #@@#%@#                 .+@@@@@@+                       \r\n" + //
                            " #@===+@*               =@#+#@@@%                        \r\n" + //
                            " +@====+@-             #@+===%@@:                        \r\n" + //
                            " .@#+++*@%           :%%====+@@-                         \r\n" + //
                            "  *@####%@-:=====-:.:@%====*@%:                          \r\n" + //
                            "   %@###%%#*+++++*#%@%===*%@#.                           \r\n" + //
                            "   .%@%=----------=*#==+#@%-                             \r\n" + //
                            "   :@#=----------=====*#%@:                     .:-=**#%*\r\n" + //
                            "   %#-===================#@:             .:=+#%%%#*+=--@#\r\n" + //
                            "  =@##*==========**+======%%       :-+*#%#**=---------+@-\r\n" + //
                            "  *@@+%========+%:+@%=====*@::=+#%%%*+=--------------:%@ \r\n" + //
                            " :@%@@*========#@@@@@+====+@@#*++=========-----------=@= \r\n" + //
                            " *@#====+*======+##%%@%#==+@@===============---------#@  \r\n" + //
                            " =@%==+**#***=====*@@@@@*=+@@@+===============----==+@=  \r\n" + //
                            "  =@*=============*@@@@#===@=+@*====##%%%%%#####***++-   \r\n" + //
                            "   *@#+============*#*+====%# -@#===*@*.                 \r\n" + //
                            "  .@*==+===================*@-:*@#===*@*                 \r\n" + //
                            "  +@===+%+======#*==========%@@%#=====+@*                \r\n" + //
                            "  +@====*@====+%+======+%+==+@%###++**#%@:               \r\n" + //
                            "  =@+====@*==+@+======+%%====@@@@%#*=-:                  \r\n" + //
                            "  :@%====%#=+%*=====+#%#=====*@@@+                       \r\n" + //
                            "  %%*@+=#@+=*@+====*%%+======*@@@@*                      \r\n" + //
                            " -@#++%%#+===#%%*###+=====+*#%@##*+                      \r\n" + //
                            " :@%###***+++++***++***######@@=                         \r\n" + //
                            "  -%@%%####%%%##%%########%%@%#=                         \r\n" + //
                            "  :*@@@%%#@@%#%%%@@%%####%@@=                            \r\n" + //
                            "  #@@@@@%%#*.     :=#@@##%@+                             \r\n" + //
                            "                    .%@%%%%:                             \r\n" + //
                            "                      -==-                               ");                 
    }
}
    