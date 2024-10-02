import java.util.Scanner; 

public class Codigo5 {
	public static void main (String[] args) { // Se agrego esta parte
	Scanner s = new Scanner(System.in); //Se importo Scanner y se completo esta sección
    
	System.out.println("Introduzca un número: "); //Se quito ' y se sustituyo por ", arreglando error de sintaxis
    String ni = s.nextLine();
    int c = Integer.parseInt(ni); //Se completo esta línea 
    
    int afo = 0;
    int noAfo = 0;
    
    while (c > 0) { // Se cambio el ni x c en las líneas 14,15 y 21
	  int digito = (int)(c % 10);
      if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
		afo++;
      } else {
		noAfo++;
	  
	  c /= 10;
    }
    if (afo > noAfo) {
      System.out.println("El " + c + " es un número afortunado."); //Se arreglo el println, error de sintaxis
    } else {
      System.out.println("El " + c + " no es un número afortunado.");
    }
    s.close(); // Se agregó para cerrar el scanner
    }
	} // se agrego una llave faltante
}// class Codigo5
