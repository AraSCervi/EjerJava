/**
* Ejercicio 5bis. Muestra un horario con colores
* Usando variables para guardar los códigos de los colores
* 
* @asc
*/
public class Ejercicio5bis {  // clase principal
    public static void main(String[] args)  {
      String rojo ="\033[31m";
      String verde ="\033[32m";
      String naranja ="\033[33m";
      String azul ="\033[34m";
      String morado ="\033[35m";
      String blanco ="\033[37m";
      System.out.println();   
      System.out.println(" Lunes\tMartes\tMierc.\tJueves\tViernes");
      System.out.println("=======================================");
      System.out.println(rojo + "Guardia\t"+azul+"ProgDAM\t\tProgDAM\tProgDAM");
      System.out.println(azul+"ProgDAM\tProgDAM\t"+morado+"ElabMat\t"+azul+"ProgDAM\tProgDAM");
      System.out.println(azul+"ProgDAM\t"+verde+"ProgDAW\t"+naranja+"Ref.\t"+verde+"ProgDAW\tProgDAW");
      System.out.println(morado+"ElabMat\t"+verde+"ProgDAW\t"+rojo+"Guardia\t"+verde+"ProgDAW\tProgDAW");
      System.out.println(morado+"ElabMat\t"+naranja+"Ref.\t\t"+verde+"ProgDAW");
      System.out.println(rojo+"Guardia\t\t\t"+verde+"ProgDAW\t");
      System.out.println(blanco);   // Volvemos al blanco 
    
  }
}
