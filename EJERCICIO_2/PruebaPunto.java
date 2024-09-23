package PRACTICA_DOMICILIARIA_02.EJERCICIO_2;

import java.util.Scanner;
public class PruebaPunto {
    public static void main(String[] args) {
        
        Punto[] lista;
        Scanner Entrada = new Scanner(System.in);
        int cantidadPuntos;

        // INSTANCIANDO OBJETOS PUNTO
        Punto puntoA = new Punto(-6,5);
        Punto puntoB = new Punto(-2,-9);
        Punto puntoC = new Punto(9,0);

        // IMPRIMIENDO LAS COORDENADAS DE LOS PUNTOS
        System.out.println("Coordenadas del punto A:" + puntoA);
        System.out.println("Coordenadas del punto B:" + puntoB);
        System.out.println("Coordenadas del punto C:" + puntoC);

        // IMPRIMIENDO LA DISTANCIA DEL PUNTO A Y B AL ORIGEN
        System.out.println("\nLa distancia del punto A hasta el origen es de " 
        + puntoA.distanciaOrigen() + " unidades.");
        System.out.println("La distancia del punto B hasta el origen es de " 
        + puntoB.distanciaOrigen() + " unidades.");

        // IMPRIMIENDO LA DISTANCIA DEL PUNTO A HACIA EL PUNTO B
        System.out.println("La distancia entre el punto A y el punto B es de " 
        + puntoA.distanciaPunto(puntoB) + " unidades");

        // INFORMACION SOBRE EL CUADRANTE QUE INDICA EL VALOR ENTERO
        System.out.println("\n(0: Punto ubicado sobre algún eje de coordenadas)");
        System.out.println("(1: Punto ubicado en el primer cuadrante.)");
        System.out.println("(2: Punto ubicado en el segundo cuadrante.)");
        System.out.println("(3: Punto ubicado en el tercer cuadrante.)");
        System.out.println("(4: Punto ubicado en el cuarto cuadrante.)");

        // IMPRIMIENDO EL CUADRANTE EN EL QUE SE ENCUENTRAN LOS PUNTOS A,B,C
        System.out.println("\nEl cuadrante del punto A es el " + puntoA.calcularCuadrante());
        System.out.println("El cuadrante del punto B es el " + puntoB.calcularCuadrante());
        System.out.println("El cuadrante del punto C es el " + puntoC.calcularCuadrante());

        // CANTIDAD DE PUNTOS A COMPARAR CON EL PUNTO A
        System.out.print("\nIndique cuántos puntos desea comparar con el punto A: ");
        cantidadPuntos = Entrada.nextInt();
        lista = new Punto[cantidadPuntos]; 

        // INSTANCIANDO OBJETOS EN UN ARRAY
        for (int i=0; i<cantidadPuntos; i++){
            
            System.out.printf("PUNTO %d:%n",(i+1));
            System.out.print("Ingrese el valor de la abscisa: ");
            double x = Entrada.nextDouble();
            System.out.print("Ingrese el valor de la ordenada: ");
            double y = Entrada.nextDouble();

            lista [i] = new Punto(x,y);
            System.out.println();       
        }

        // IMPRIMIENDO LAS COORDENADAS DEL PUNTO (DENTRO DEL ARRAY) MAS CERCANO AL PUNTO A
        System.out.println("El punto más cercano al punto A es el ubicado en las coordenadas:" 
        + puntoA.calcularMascercano(lista));
        Entrada.close();
    }
}