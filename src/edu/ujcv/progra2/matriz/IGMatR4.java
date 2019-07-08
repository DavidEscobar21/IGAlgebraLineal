package edu.ujcv.progra2.matriz;

import edu.ujcv.progra2.vector.IGVecR4;

public class IGMatR4 {

    private IGVecR4 colX;
    private IGVecR4 colY;
    private IGVecR4 colZ;
    private IGVecR4 colW;


        public IGMatR4(){
            colX = new IGVecR4(1,0,0,0);
            colY = new IGVecR4(0,1,0,0);
            colZ = new IGVecR4(0,0,1,0);
            colW = new IGVecR4(0,0,0,1);
        }

    public IGMatR4(IGVecR4 colX, IGVecR4 colY, IGVecR4 colZ, IGVecR4 colW){
            this.colX = new IGVecR4(colX);
            this.colY = new IGVecR4(colY);
            this.colZ = new IGVecR4(colZ);
            this.colW = new IGVecR4(colW);
        }

    public IGMatR4(IGMatR4 b){
            this.colX = new IGVecR4(b.colX);
            this.colY = new IGVecR4(b.colY);
            this.colZ = new IGVecR4(b.colZ);
            this.colW = new IGVecR4(b.colW);
        }
        // public static IGVecR2 rotacionZ (double angulo, IGVecR2 vector){
//
//    }

        // public static IGVecR2 rotacionX (double angulo, IGVecR2 vector){
//
//    }

        // public static IGVecR2 rotacionY (double angulo, IGVecR2 vector){
//
//    }


public IGVecR4 getColX() {
        return colX;
        }

public void setColX(IGVecR4 colX) {
        this.colX = colX;
        }
    public IGVecR4 getColY() {
        return colY;
    }

    public void setColY(IGVecR4 colY) {
        this.colY = colY;
    }
    public IGVecR4 getColZ() {
        return colZ;
    }

    public void setColZ(IGVecR4 colZ) {
        this.colZ = colZ;
    }
    public IGVecR4 getColW() {
        return colW;
    }

    public void setColW(IGVecR4 colW) {
        this.colW = colW;
    }

}