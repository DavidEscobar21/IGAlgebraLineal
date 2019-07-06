package edu.ujcv.progra2.vector;

public class IGVecR2 {
    private double y;
    private double x;

public IGVecR2(){
    this.x = 0;
    this.y = 0;
}
public IGVecR2(double x, double y){
    this.x = x;
    this.y = y;
    }
    public IGVecR2(IGVecR2 b){
    this.x = b.x;
    this.y = b.y;
    }

    //privado los datos
    // un escalar que represente 'x' y 'y' los componentes del vector


    // publico los constructores por defecto, copia, y conveniencia. recuerden a bob

//contencion

    // publico accesoras y mutadoras (getters and setters)
    //    controla el acceso a la variable
    //    controla como se cambia la variable
    //publico interfase

    //this es el vector a
    // c.x = a.x + b.x
    // c.y = a.y + b.y
    public IGVecR2 suma(IGVecR2 b){
        IGVecR2 a1 = new IGVecR2();
        a1.x = x + b.x;
        a1.y = y + b.y;
        return a1;
        //TODO: implementar
    }

    public IGVecR2 resta(IGVecR2 b){
        //TODO: implementar
        IGVecR2 a1 = new IGVecR2();
        a1.x = x - (b.x);
        a1.y = y - (b.y);
        return a1;
    }

    //producto.
    public  IGVecR2 escalarPorVector(double alpha){

        //TODO: implementar
        return new IGVecR2();
    }

    public double productoPunto(IGVecR2 b){
        IGVecR2 a1 = new IGVecR2();
        a1.x = x * b.x;
        a1.y = y * b.y;
        double a = a1.x + a1.y;
        return a;
        //TODO: implementar
        
    }


    // no esta definido en R2.!!!!!
    //public IGVecR2 productoCruz(IGVecR2 b){

    //}


    public double determinante(){
        //TODO: implementar
        return 0.0;
    }

    public double angulo(IGVecR2 b){
        //TODO: implementar
        return 0.0;
    }

    public double magnitud(IGVecR2 b){
        IGVecR2 a1 = new IGVecR2();
        a1.x = (b.x) - x;
        a1.y = (b.y) - y;
        double a = Math.pow(a1.x, 2) + Math.pow(a1.y,2);
        return Math.sqrt(a);

    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }


    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
