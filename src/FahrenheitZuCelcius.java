import java.util.*;

import java.util.*;
public class FahrenheitZuCelcius {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("gib einen Temperaturwert in Fahrenheit ein : ");
        double x = sc.nextDouble();
        System.out.println(temperatur(x) + " Grad Celsius");
        System.out.println("möchtest du noch eine Temperatur umrechnen? (j oder n)");
        char c = sc.next().charAt(0);

        if (c == 'j')  main(args);  
        else System.out.println("Programm beendet"); 
    }
    public static double temperatur(double x){
        double y = (x-32)*5/9;
        return y;
    }

}
