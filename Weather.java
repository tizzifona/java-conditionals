import java.util.Scanner;

public class Weather {
    public static void main(String[] args) {
        //Escribe un programa que pida al usuario que ingrese la temperatura en celcius de su ciudad (La pregunta y la respuesta deberá estar en una sola línea) y según ello devuelva lo siguiente:

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la temperatura en °C de tu ciudad: ");
        int temperature = scanner.nextInt();

        //Si es bajo 0: Te estás congelando
        if (temperature < 0) {
            System.out.println("Te estás congelando");
        }
        //Si es entre 0 y 10: Hace mucho frío 
        else if (temperature <= 10) {
            System.out.println("Hace mucho frío");
        }
        //Si es entre 11 y 17: Con un abrigo estás bien
        else if (temperature <= 17) {
            System.out.println("Con un abrigo estás bien");
        }
        //Si es entre 18 y 25: Parece que ha llegado el verano
        else if (temperature <= 25){
            System.out.println("Parece que ha llegado el verano");
        }
        //Si es entre 26 y 35: Que calooorrrrr
        else if (temperature <= 35) {
            System.out.println("Que calooorrrrr");
        }
        //Si es mayor a 36: Ahí no hay quien viva
        else if (temperature > 36) {
            System.out.println(" Ahí no hay quien viva");
        }

        else {
            System.out.println("Temperatura no válida");
        }
        //Imprime el resultado
    }
}