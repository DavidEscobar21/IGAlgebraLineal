package edu.ujcv.progra2.vector;

public class IGVecR4 {
    private double x;
    private double y;
    private double z;
    private double w;
    
    public IGVecR4 suma(IGVecR4 b){
        //TODO: implementar
        return new IGVecR4();
    }

    public IGVecR4 resta(IGVecR4 b){
        //TODO: implementar
        return new IGVecR4();
    }

    //producto.
    public  IGVecR4 escalarPorVector(double alpha){
        //TODO: implementar
        return new IGVecR4();
    }

    public double productoPunto(IGVecR4 b){
        //TODO: implementar
        return 0.0;
    }


    // no esta definido en R4.!!!!!
    //public IGVecR4 productoCruz(IGVecR4 b){

    //}


    public double determinante(){
        //TODO: implementar
        return 0.0;
    }

    public double angulo(IGVecR4 b){
        //TODO: implementar
        return 0.0;
    }

    public double magnitud(){
        return Math.sqrt(productoPunto(this));
    }
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
}
    public double getW() {
        return w;
    }

    public void setW(double w) {
        this.w = w;
    }}
