/**
* Ejercicio 4. Muestra un horario con colores
* 
* @asc
*/
public class Ejercicio5 {  // clase principal
    public static void main(String[] args)  {
      System.out.println(" Lunes\tMartes\tMierc.\tJueves\tViernes");
      System.out.println("=======================================");
      System.out.println("\033[31mGuardia\t\033[36mProgDAM\t\t\033[36mProgDAM\t\033[36mProgDAM");
      System.out.println("\033[36mProgDAM\t\033[36mProgDAM\t\033[35mElabMat\t\033[36mProgDAM\t\033[36mProgDAM");
      System.out.println("\033[36mProgDAM\t\033[32mProgDAW\t\033[33mRef.\t\033[32mProgDAW\t\033[32mProgDAW");
      System.out.println("\033[35mElabMat\t\033[32mProgDAW\t\033[31mGuardia\t\033[32mProgDAW\t\033[32mProgDAW");
      System.out.println("\033[35mElabMat\t\033[33mRef\t\t\033[32mProgDAW");
      System.out.println("\033[31mGuardia\t\t\t\033[32mProgDAW\t\033[37m");
    
  }
}
