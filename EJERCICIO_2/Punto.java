package PRACTICA_DOMICILIARIA_02.EJERCICIO_2;

public class Punto {
    // ATRIBUTOS
    private double x;
    private double y;

    // CONSTRUCTORES
    public Punto(){
    }
    public Punto(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    // SETTERS
    public void setX(double x){
        this.x = x;
    }
    public void setY(double y){
        this.y = y;
    }

    // GETTERS
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }

    // METODO PARA DAR FORMATO DE SALIDA
    public String toString(){
        return "(" + Formato(x) + "," + Formato(y) + ")";
    }

    // METODO PARA CALCULAR LA DISTANCIA AL ORIGEN
    public double distanciaOrigen(){
        double distancia = Math.sqrt(x*x + y*y);
        return Aproximar(distancia);
    }

    // METODO PARA CALCULAR LA DISTANCIA HACIA UN PUNTO
    public double distanciaPunto(Punto p){
        double dx, dy;
        dx=p.x - this.x;        
        dy=p.y - this.y;        
        return Aproximar(Math.sqrt(dx*dx + dy*dy));
    }

    // METODO PARA CALCULAR EL CUADRANTE DE UN PUNTO
    public int calcularCuadrante(){
        if(x>0 && y>0){
            return 1;
        }else if(x<0 && y>0){
            return 2;
        }else if(x<0 && y<0){
            return 3;
        }else if(x>0 && y<0){
            return 4;
        }else{
            return 0;
        }
    }

    // METODO PARA DETERMINAR EL PUNTO MAS CERCANO EN UN ARRAY
    public Punto calcularMascercano(Punto[] lista){
        // Inicializamos los valores
        double distanciaCercana = this.distanciaPunto(lista[0]);
        Punto masCercano = lista[0];
        // Iteramos para encontrar el punto más cercano
        for (int i=1;i<lista.length;i++){
            double distancia = this.distanciaPunto(lista[i]);
            if (distancia < distanciaCercana){
                distanciaCercana = distancia;
                masCercano = lista[i];
            }
        } 
        return masCercano;
    }

    //METODO PARA DAR FORMATO A LAS COORDENADAS DE LOS PUNTOS
    // TANTO SI LA COORDENADA ES INT O DOUBLE
    public Object Formato(double x){
        if(x == (long) x){
            return (int) x;
        }
        return Aproximar(x);
    }

    // METODO PARA APROXIMAR LOS DECIMALES DE UN DOUBLE
    public double Aproximar(double x){
        return Double.parseDouble(String.format("%.3f",x));
    }
}