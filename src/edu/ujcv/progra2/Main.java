package edu.ujcv.progra2;

import edu.ujcv.progra2.matriz.IGMatR2;
import edu.ujcv.progra2.vector.IGVecR2;
import edu.ujcv.progra2.vector.IGVecR3;
import edu.ujcv.progra2.vector.IGVecR4;

import java.util.Scanner;

public class Main {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        int x;
        do {
            System.out.println("1. vectores\n2. matrices\n3. salir");
            x = leerEntero(sc, "Ingrese una opcion", "Ha ingresado un caracter no valido");
            switch (x){
                case 1:
                    int z;
                    do {
                        System.out.println("1. Vector en R2\n2. Vector en R3\n3. Vector en R4\n4. Regresar");
                        z = leerEntero(sc, "Ingrese una opcion", "Ha ingresado un caracter no valido");
                        switch (z){
                            case 1:
                                int y;
                                do {
                                    System.out.println("ingrese la oprecion que desea realizar");
                                    System.out.println("1. Suma\n2. Resta\n3. Escalar * Vector\n4. Producto punto\n5. Angulo\n6. Magnitud\n7. Regresar");
                                    y = leerEntero(sc, "Ingrese una opcion", "Ha ingresado un caracter no valido");
                                    switch (y){
                                        case 1:
                                            IGVecR2 a = new IGVecR2();
                                            System.out.println("Ingrese X1 y Y1");
                                            a.setX(leerReal(sc, "X1", "Ha ingresado un caracter no valido"));
                                            a.setY(leerReal(sc, "Y1", "Ha ingresado un caracter no valido"));
                                            IGVecR2 b = new IGVecR2();
                                            System.out.println("Ingrese X2 y Y2");
                                            b.setX(leerReal(sc, "X2", "Ha ingresado un caracter no valido"));
                                            b.setY(leerReal(sc, "Y2", "Ha ingresado un caracter no valido"));
                                            IGVecR2 resul = a.suma(b);
                                            System.out.println("El resultado es: ("+resul.getX()+", "+resul.getY()+")\n");
                                            break;
                                        case 2:
                                            a = new IGVecR2();
                                            System.out.println("Ingrese X1 y Y1");
                                            a.setX(leerReal(sc, "X1", "Ha ingresado un caracter no valido"));
                                            a.setY(leerReal(sc, "Y1", "Ha ingresado un caracter no valido"));
                                            b = new IGVecR2();
                                            System.out.println("Ingrese X2 y Y2");
                                            b.setX(leerReal(sc, "X2", "Ha ingresado un caracter no valido"));
                                            b.setY(leerReal(sc, "Y2", "Ha ingresado un caracter no valido"));
                                            resul = a.resta(b);
                                            System.out.println("El resultado es: ("+resul.getX()+", "+resul.getY()+")\n");
                                            break;
                                        case 3:
                                            a = new IGVecR2();
                                            System.out.println("Ingrese X1 y Y1");
                                            a.setX(leerReal(sc, "X1", "Ha ingresado un caracter no valido"));
                                            a.setY(leerReal(sc, "Y1", "Ha ingresado un caracter no valido"));
                                            double alpha = leerReal(sc, "ingrese el Alpha", "Ha ingresado un caracter no valido");
                                            resul = a.escalarPorVector(alpha);
                                            System.out.println("El resultado es: ("+resul.getX()+", "+resul.getY()+")\n");
                                            break;
                                        case 4:
                                            a = new IGVecR2();
                                            System.out.println("Ingrese X1 y Y1");
                                            a.setX(leerReal(sc, "X1", "Ha ingresado un caracter no valido"));
                                            a.setY(leerReal(sc, "Y1", "Ha ingresado un caracter no valido"));
                                            b = new IGVecR2();
                                            System.out.println("Ingrese X2 y Y2");
                                            b.setX(leerReal(sc, "X2", "Ha ingresado un caracter no valido"));
                                            b.setY(leerReal(sc, "Y2", "Ha ingresado un caracter no valido"));
                                            double t = a.productoPunto(b);
                                            System.out.println("El resultado es: "+t);
                                            break;
                                        case 5:
                                            a = new IGVecR2();
                                            System.out.println("Ingrese X1 y Y1");
                                            a.setX(leerReal(sc, "X1", "Ha ingresado un caracter no valido"));
                                            a.setY(leerReal(sc, "Y1", "Ha ingresado un caracter no valido"));
                                            b = new IGVecR2();
                                            System.out.println("Ingrese X2 y Y2");
                                            b.setX(leerReal(sc, "X2", "Ha ingresado un caracter no valido"));
                                            b.setY(leerReal(sc, "Y2", "Ha ingresado un caracter no valido"));
                                            t = a.angulo(b);
                                            System.out.println("El resultado es: "+t+" grados");
                                            break;
                                        case 6:
                                            a = new IGVecR2();
                                            System.out.println("Ingrese X1 y Y1");
                                            a.setX(leerReal(sc, "X1", "Ha ingresado un caracter no valido"));
                                            a.setY(leerReal(sc, "Y1", "Ha ingresado un caracter no valido"));
                                            b = new IGVecR2();
                                            System.out.println("Ingrese X2 y Y2");
                                            b.setX(leerReal(sc, "X2", "Ha ingresado un caracter no valido"));
                                            b.setY(leerReal(sc, "Y2", "Ha ingresado un caracter no valido"));
                                            t = a.magnitud(b);
                                            System.out.println("El resultado es: "+t);
                                            break;
                                    }
                                }while (y!=7);
                                break;
                            case 2:
                                do {
                                    System.out.println("ingrese la oprecion que desea realizar");
                                    System.out.println("1. Suma\n2. Resta\n3. Escalar * Vector\n4. Producto punto\n5. Angulo\n6. Magnitud\n7. Producto cruz\n8. Regresar");
                                    y = leerEntero(sc, "Ingrese una opcion", "Ha ingresado un caracter no valido");
                                    switch (y){
                                        case 1:
                                            IGVecR3 a = new IGVecR3();
                                            System.out.println("Ingrese X1, Y1 y Z1");
                                            a.setX(leerReal(sc, "X1", "Ha ingresado un caracter no valido"));
                                            a.setY(leerReal(sc, "Y1", "Ha ingresado un caracter no valido"));
                                            a.setZ(leerReal(sc, "Z1", "Ha ingresado un caracter no valido"));
                                            IGVecR3 b = new IGVecR3();
                                            System.out.println("Ingrese X2, Y2 y Z2");
                                            b.setX(leerReal(sc, "X2", "Ha ingresado un caracter no valido"));
                                            b.setY(leerReal(sc, "Y2", "Ha ingresado un caracter no valido"));
                                            b.setZ(leerReal(sc, "Z2", "Ha ingresado un caracter no valido"));
                                            IGVecR3 resul = a.suma(b);
                                            System.out.println("El resultado es: ("+resul.getX()+", "+resul.getY()+", "+resul.getZ()+")\n");
                                            break;
                                        case 2:
                                            a = new IGVecR3();
                                            System.out.println("Ingrese X1, Y1 y Z1");
                                            a.setX(leerReal(sc, "X1", "Ha ingresado un caracter no valido"));
                                            a.setY(leerReal(sc, "Y1", "Ha ingresado un caracter no valido"));
                                            a.setZ(leerReal(sc, "Z1", "Ha ingresado un caracter no valido"));
                                            b = new IGVecR3();
                                            System.out.println("Ingrese X2, Y2 y Z2");
                                            b.setX(leerReal(sc, "X2", "Ha ingresado un caracter no valido"));
                                            b.setY(leerReal(sc, "Y2", "Ha ingresado un caracter no valido"));
                                            b.setZ(leerReal(sc, "Z2", "Ha ingresado un caracter no valido"));
                                            resul = a.resta(b);
                                            System.out.println("El resultado es: ("+resul.getX()+", "+resul.getY()+", "+resul.getZ()+")\n");
                                            break;
                                        case 3:
                                            a = new IGVecR3();
                                            System.out.println("Ingrese X1, Y1 y Z1");
                                            a.setX(leerReal(sc, "X1", "Ha ingresado un caracter no valido"));
                                            a.setY(leerReal(sc, "Y1", "Ha ingresado un caracter no valido"));
                                            a.setZ(leerReal(sc, "Z1", "Ha ingresado un caracter no valido"));
                                            double alpha = leerReal(sc, "ingrese el Alpha", "Ha ingresado un caracter no valido");
                                            resul = a.escalarPorVector(alpha);
                                            System.out.println("El resultado es: ("+resul.getX()+", "+resul.getY()+", "+resul.getZ()+")\n");
                                            break;
                                        case 4:
                                            a = new IGVecR3();
                                            System.out.println("Ingrese X1, Y1 y Z1");
                                            a.setX(leerReal(sc, "X1", "Ha ingresado un caracter no valido"));
                                            a.setY(leerReal(sc, "Y1", "Ha ingresado un caracter no valido"));
                                            a.setZ(leerReal(sc, "Z1", "Ha ingresado un caracter no valido"));
                                            b = new IGVecR3();
                                            System.out.println("Ingrese X2, Y2 y Z2");
                                            b.setX(leerReal(sc, "X2", "Ha ingresado un caracter no valido"));
                                            b.setY(leerReal(sc, "Y2", "Ha ingresado un caracter no valido"));
                                            b.setZ(leerReal(sc, "Z2", "Ha ingresado un caracter no valido"));
                                            double t = a.productoPunto(b);
                                            System.out.println("El resultado es: "+t);
                                            break;
                                        case 5:
                                            a = new IGVecR3();
                                            System.out.println("Ingrese X1, Y1 y Z1");
                                            a.setX(leerReal(sc, "X1", "Ha ingresado un caracter no valido"));
                                            a.setY(leerReal(sc, "Y1", "Ha ingresado un caracter no valido"));
                                            a.setZ(leerReal(sc, "Z1", "Ha ingresado un caracter no valido"));
                                            b = new IGVecR3();
                                            System.out.println("Ingrese X2, Y2 y Z2");
                                            b.setX(leerReal(sc, "X2", "Ha ingresado un caracter no valido"));
                                            b.setY(leerReal(sc, "Y2", "Ha ingresado un caracter no valido"));
                                            b.setZ(leerReal(sc, "Z2", "Ha ingresado un caracter no valido"));
                                            t = a.angulo(b);
                                            System.out.println("El resultado es: "+t+" grados");
                                            break;
                                        case 6:
                                            a = new IGVecR3();
                                            System.out.println("Ingrese X1, Y1 y Z1");
                                            a.setX(leerReal(sc, "X1", "Ha ingresado un caracter no valido"));
                                            a.setY(leerReal(sc, "Y1", "Ha ingresado un caracter no valido"));
                                            a.setZ(leerReal(sc, "Z1", "Ha ingresado un caracter no valido"));
                                            b = new IGVecR3();
                                            System.out.println("Ingrese X2, Y2 y Z2");
                                            b.setX(leerReal(sc, "X2", "Ha ingresado un caracter no valido"));
                                            b.setY(leerReal(sc, "Y2", "Ha ingresado un caracter no valido"));
                                            b.setZ(leerReal(sc, "Z2", "Ha ingresado un caracter no valido"));
                                            t = a.magnitud(b);
                                            System.out.println("El resultado es: "+t);
                                            break;
                                        case 7:
                                            a = new IGVecR3();
                                            System.out.println("Ingrese X1, Y1 y Z1");
                                            a.setX(leerReal(sc, "X1", "Ha ingresado un caracter no valido"));
                                            a.setY(leerReal(sc, "Y1", "Ha ingresado un caracter no valido"));
                                            a.setZ(leerReal(sc, "Z1", "Ha ingresado un caracter no valido"));
                                            b = new IGVecR3();
                                            System.out.println("Ingrese X2, Y2 y Z2");
                                            b.setX(leerReal(sc, "X2", "Ha ingresado un caracter no valido"));
                                            b.setY(leerReal(sc, "Y2", "Ha ingresado un caracter no valido"));
                                            b.setZ(leerReal(sc, "Z2", "Ha ingresado un caracter no valido"));
                                            resul = a.productoCruz(b);
                                            System.out.println("El resultado es: ("+resul.getX()+" I, "+resul.getY()+" J, "+resul.getZ()+" K)\n");
                                            break;
                                    }
                                }while (y!=8);
                                break;
                            case 3:
                                do {
                                    System.out.println("ingrese la oprecion que desea realizar");
                                    System.out.println("1. Suma\n2. Resta\n3. Escalar * Vector\n4. Producto punto\n5. Angulo\n6. Magnitud\n7. Regresar");
                                    y = leerEntero(sc, "Ingrese una opcion", "Ha ingresado un caracter no valido");
                                    switch (y){
                                        case 1:
                                            IGVecR4 a = new IGVecR4();
                                            System.out.println("Ingrese X1, Y1, Z1 y W1");
                                            a.setX(leerReal(sc, "X1", "Ha ingresado un caracter no valido"));
                                            a.setY(leerReal(sc, "Y1", "Ha ingresado un caracter no valido"));
                                            a.setZ(leerReal(sc, "Z1", "Ha ingresado un caracter no valido"));
                                            a.setW(leerReal(sc, "W1", "Ha ingresado un caracter no valido"));
                                            IGVecR4 b = new IGVecR4();
                                            System.out.println("Ingrese X2, Y2, Z2 y W2");
                                            b.setX(leerReal(sc, "X2", "Ha ingresado un caracter no valido"));
                                            b.setY(leerReal(sc, "Y2", "Ha ingresado un caracter no valido"));
                                            b.setZ(leerReal(sc, "Z2", "Ha ingresado un caracter no valido"));
                                            b.setW(leerReal(sc, "W2", "Ha ingresado un caracter no valido"));
                                            IGVecR4 resul = a.suma(b);
                                            System.out.println("El resultado es: ("+resul.getX()+", "+resul.getY()+", "+resul.getZ()+", "+resul.getW()+")");
                                            break;
                                        case 2:
                                            a = new IGVecR4();
                                            System.out.println("Ingrese X1, Y1, Z1 y W1");
                                            a.setX(leerReal(sc, "X1", "Ha ingresado un caracter no valido"));
                                            a.setY(leerReal(sc, "Y1", "Ha ingresado un caracter no valido"));
                                            a.setZ(leerReal(sc, "Z1", "Ha ingresado un caracter no valido"));
                                            a.setW(leerReal(sc, "W1", "Ha ingresado un caracter no valido"));
                                            b = new IGVecR4();
                                            System.out.println("Ingrese X2, Y2, Z2 y W2");
                                            b.setX(leerReal(sc, "X2", "Ha ingresado un caracter no valido"));
                                            b.setY(leerReal(sc, "Y2", "Ha ingresado un caracter no valido"));
                                            b.setZ(leerReal(sc, "Z2", "Ha ingresado un caracter no valido"));
                                            b.setW(leerReal(sc, "W2", "Ha ingresado un caracter no valido"));
                                            resul = a.resta(b);
                                            System.out.println("El resultado es: ("+resul.getX()+", "+resul.getY()+", "+resul.getZ()+", "+resul.getW()+")");
                                            break;
                                        case 3:
                                            a = new IGVecR4();
                                            System.out.println("Ingrese X1, Y1, Z1 y W1");
                                            a.setX(leerReal(sc, "X1", "Ha ingresado un caracter no valido"));
                                            a.setY(leerReal(sc, "Y1", "Ha ingresado un caracter no valido"));
                                            a.setZ(leerReal(sc, "Z1", "Ha ingresado un caracter no valido"));
                                            a.setW(leerReal(sc, "W1", "Ha ingresado un caracter no valido"));
                                            double alpha = leerReal(sc, "ingrese el Alpha", "Ha ingresado un caracter no valido");
                                            resul = a.escalarPorVector(alpha);
                                            System.out.println("El resultado es: ("+resul.getX()+", "+resul.getY()+", "+resul.getZ()+", "+resul.getW()+")");
                                            break;
                                        case 4:
                                            a = new IGVecR4();
                                            System.out.println("Ingrese X1, Y1, Z1 y W1");
                                            a.setX(leerReal(sc, "X1", "Ha ingresado un caracter no valido"));
                                            a.setY(leerReal(sc, "Y1", "Ha ingresado un caracter no valido"));
                                            a.setZ(leerReal(sc, "Z1", "Ha ingresado un caracter no valido"));
                                            a.setW(leerReal(sc, "W1", "Ha ingresado un caracter no valido"));
                                            b = new IGVecR4();
                                            System.out.println("Ingrese X2, Y2, Z2 y W2");
                                            b.setX(leerReal(sc, "X2", "Ha ingresado un caracter no valido"));
                                            b.setY(leerReal(sc, "Y2", "Ha ingresado un caracter no valido"));
                                            b.setZ(leerReal(sc, "Z2", "Ha ingresado un caracter no valido"));
                                            b.setW(leerReal(sc, "W2", "Ha ingresado un caracter no valido"));
                                            double t = a.productoPunto(b);
                                            System.out.println("El resultado es: "+t);
                                            break;
                                        case 5:
                                            a = new IGVecR4();
                                            System.out.println("Ingrese X1, Y1, Z1 y W1");
                                            a.setX(leerReal(sc, "X1", "Ha ingresado un caracter no valido"));
                                            a.setY(leerReal(sc, "Y1", "Ha ingresado un caracter no valido"));
                                            a.setZ(leerReal(sc, "Z1", "Ha ingresado un caracter no valido"));
                                            a.setW(leerReal(sc, "W1", "Ha ingresado un caracter no valido"));
                                            b = new IGVecR4();
                                            System.out.println("Ingrese X2, Y2, Z2 y W2");
                                            b.setX(leerReal(sc, "X2", "Ha ingresado un caracter no valido"));
                                            b.setY(leerReal(sc, "Y2", "Ha ingresado un caracter no valido"));
                                            b.setZ(leerReal(sc, "Z2", "Ha ingresado un caracter no valido"));
                                            b.setW(leerReal(sc, "W2", "Ha ingresado un caracter no valido"));
                                            t = a.angulo(b);
                                            System.out.println("El resultado es: "+t+" grados");
                                            break;
                                        case 6:
                                            a = new IGVecR4();
                                            System.out.println("Ingrese X1, Y1, Z1 y W1");
                                            a.setX(leerReal(sc, "X1", "Ha ingresado un caracter no valido"));
                                            a.setY(leerReal(sc, "Y1", "Ha ingresado un caracter no valido"));
                                            a.setZ(leerReal(sc, "Z1", "Ha ingresado un caracter no valido"));
                                            a.setW(leerReal(sc, "W1", "Ha ingresado un caracter no valido"));
                                            b = new IGVecR4();
                                            System.out.println("Ingrese X2, Y2, Z2 y W2");
                                            b.setX(leerReal(sc, "X2", "Ha ingresado un caracter no valido"));
                                            b.setY(leerReal(sc, "Y2", "Ha ingresado un caracter no valido"));
                                            b.setZ(leerReal(sc, "Z2", "Ha ingresado un caracter no valido"));
                                            b.setW(leerReal(sc, "W2", "Ha ingresado un caracter no valido"));
                                            t = a.magnitud(b);
                                            System.out.println("El resultado es: "+t);
                                            break;
                                    }
                                }while (y!=7);
                                break;
                        }
                    }while (z!=4);
                    break;
                case 2:
                    do {

                        System.out.println("ingrese el tipo de matriz");
                        System.out.println("1. Matriz en R2\n2. Matriz en R3\n3. Matriz en R4\n4. regresar");
                        z = leerEntero(sc, "Ingrese una opcion", "Ha ingresado un caracter no valido");
                        switch (z) {
                            case 1:
                                int y;
                                do {
                                    System.out.println("ingrese la oprecion que desea realizar");
                                    System.out.println("1. Multiplicacion\n2. Columna * Matriz\n3. Suma\n4. Escalar * Matriz\n5. Rotacion\n6. Regresar");
                                    y = leerEntero(sc, "Ingrese una opcion", "Ha ingresado un caracter no valido");
                                    switch (y){
                                        case 1:
                                            System.out.println("| X  Y |");
                                            System.out.println("| Z  W |");
                                            System.out.println("Ingrese X, Y, Z y W");
                                            IGVecR2 a = new IGVecR2();
                                            a.setX(leerReal(sc, "X", "Ha ingresado un caracter no valido"));
                                            a.setY(leerReal(sc, "Y", "Ha ingresado un caracter no valido"));
                                            IGVecR2 b = new IGVecR2();
                                            b.setX(leerReal(sc, "Z", "Ha ingresado un caracter no valido"));
                                            b.setY(leerReal(sc, "W", "Ha ingresado un caracter no valido"));
                                            System.out.println("| X  Y |");
                                            System.out.println("| Z  W |");
                                            System.out.println("Ingrese X, Y, Z y W");
                                            IGVecR2 c = new IGVecR2();
                                            c.setX(leerReal(sc, "X", "Ha ingresado un caracter no valido"));
                                            IGVecR2 d = new IGVecR2();
                                            d.setX(leerReal(sc, "Y", "Ha ingresado un caracter no valido"));
                                            c.setY(leerReal(sc, "Z", "Ha ingresado un caracter no valido"));
                                            d.setY(leerReal(sc, "W", "Ha ingresado un caracter no valido"));
                                            double t = a.productoPunto(c);
                                            double o = a.productoPunto(d);
                                            double e = b.productoPunto(c);
                                            double v = b.productoPunto(d);
                                            System.out.println( "|"+t+" "+o+"|");
                                            System.out.println( "|"+e+" "+v+"|");

                                            break;
                                        case 2:
                                            System.out.println("| X  Y |");
                                            System.out.println("| Z  W |");
                                            System.out.println("Ingrese X, Y, Z y W");
                                            a = new IGVecR2();
                                            b = new IGVecR2();
                                            a.setX(leerReal(sc, "X", "Ha ingresado un caracter no valido"));
                                            b.setX(leerReal(sc, "Y", "Ha ingresado un caracter no valido"));
                                            b.setY(leerReal(sc, "Z", "Ha ingresado un caracter no valido"));
                                            a.setY(leerReal(sc, "W", "Ha ingresado un caracter no valido"));
                                            IGVecR2 r= new IGVecR2();
                                            System.out.println("Ingrese X1 y Y1");
                                            r.setX(leerReal(sc, "X1", "Ha ingresado un caracter no valido"));
                                            r.setY(leerReal(sc, "Y1", "Ha ingresado un caracter no valido"));
                                            double g = r.productoPunto(a);
                                            double m = r.productoPunto(b);
                                            System.out.println("El resultado es: ("+g+", "+m+")\n");
                                            break;
                                        case 3:
                                            IGVecR4 p = new IGVecR4();
                                            IGVecR4 q = new IGVecR4();
                                            System.out.println("| X  Y |");
                                            System.out.println("| Z  W |");
                                            System.out.println("Ingrese X, Y, Z y W");
                                            p.setX(leerReal(sc, "X", "Ha ingresado un caracter no valido"));
                                            p.setY(leerReal(sc, "Y", "Ha ingresado un caracter no valido"));
                                            p.setZ(leerReal(sc, "Z", "Ha ingresado un caracter no valido"));
                                            p.setW(leerReal(sc, "W", "Ha ingresado un caracter no valido"));
                                            System.out.println("| X  Y |");
                                            System.out.println("| Z  W |");
                                            System.out.println("Ingrese X, Y, Z y W");
                                            q.setX(leerReal(sc, "X", "Ha ingresado un caracter no valido"));
                                            q.setY(leerReal(sc, "Y", "Ha ingresado un caracter no valido"));
                                            q.setZ(leerReal(sc, "Z", "Ha ingresado un caracter no valido"));
                                            q.setW(leerReal(sc, "W", "Ha ingresado un caracter no valido"));
                                            IGVecR4 resul = p.suma(q);
                                            System.out.println( "|"+resul.getX()+" "+resul.getY()+"|");
                                            System.out.println( "|"+resul.getZ()+" "+resul.getW()+"|");
                                            break;
                                        case 4:
                                            p = new IGVecR4();
                                            double alpha = leerReal(sc, "ingrese el Alpha", "Ha ingresado un caracter no valido");
                                            System.out.println("| X  Y |");
                                            System.out.println("| Z  W |");
                                            System.out.println("Ingrese X, Y, Z y W");
                                            p.setX(leerReal(sc, "X", "Ha ingresado un caracter no valido"));
                                            p.setY(leerReal(sc, "Y", "Ha ingresado un caracter no valido"));
                                            p.setZ(leerReal(sc, "Z", "Ha ingresado un caracter no valido"));
                                            p.setW(leerReal(sc, "W", "Ha ingresado un caracter no valido"));
                                            resul = p.escalarPorVector(alpha);
                                            System.out.println( "|"+resul.getX()+" "+resul.getY()+"|");
                                            System.out.println( "|"+resul.getZ()+" "+resul.getW()+"|");
                                            break;
                                        case 5:
                                            r = new IGVecR2();
                                            System.out.println("Ingrese X1 y Y1");
                                            r.setX(leerReal(sc, "X1", "Ha ingresado un caracter no valido"));
                                            r.setY(leerReal(sc, "Y1", "Ha ingresado un caracter no valido"));
                                            double angu = leerReal(sc, "ingrese el angulo", "Ha ingresado un caracter no valido");
                                            double angulo = Math.toRadians(angu);
                                            a = new IGVecR2();
                                            b = new IGVecR2();
                                            a.setX(Math.cos(angulo));
                                            a.setY(Math.sin(angulo));
                                            b.setX(-(Math.sin(angulo)));
                                            b.setY(Math.cos(angulo));
                                            g = r.productoPunto(a);
                                            m = r.productoPunto(b);
                                            System.out.println("El resultado es: ("+g+", "+m+")\n");
                                            break;
                                    }
                                } while (y != 6);
                                break;
                            case 2:
                                do {
                                    System.out.println("ingrese la oprecion que desea realizar");
                                    System.out.println("\n1. Rotacion en X\n2. Rotacion en Y\n3. Rotacion en Z\n4. Regresar");
                                    y = leerEntero(sc, "Ingrese una opcion", "Ha ingresado un caracter no valido");
                                    switch (y){
                                        case 1:
                                            IGVecR3 r = new IGVecR3();
                                            System.out.println("Ingrese X1, Y1 y Z1");
                                            r.setX(leerReal(sc, "X1", "Ha ingresado un caracter no valido"));
                                            r.setY(leerReal(sc, "Y1", "Ha ingresado un caracter no valido"));
                                            r.setZ(leerReal(sc, "Z1", "Ha ingresado un caracter no valido"));
                                            double angu = leerReal(sc, "ingrese el angulo", "Ha ingresado un caracter no valido");
                                            double angulo = Math.toRadians(angu);
                                            IGVecR3 a = new IGVecR3();
                                            a.setX(1);
                                            a.setY(0);
                                            a.setZ(0);
                                            IGVecR3 b = new IGVecR3();
                                            b.setX(0);
                                            b.setY(Math.cos(angulo));
                                            b.setZ(-(Math.sin(angulo)));
                                            IGVecR3 c = new IGVecR3();
                                            c.setX(0);
                                            c.setY(Math.sin(angulo));
                                            c.setZ(Math.cos(angulo));
                                            double x1 = r.productoPunto(a);
                                            double y1 = r.productoPunto(b);
                                            double z1 = r.productoPunto(c);
                                            System.out.println("El resultado es: ("+x1+", "+y1+", "+z1+")\n");
                                            break;
                                        case 2:
                                            r = new IGVecR3();
                                            System.out.println("Ingrese X1, Y1 y Z1");
                                            r.setX(leerReal(sc, "X1", "Ha ingresado un caracter no valido"));
                                            r.setY(leerReal(sc, "Y1", "Ha ingresado un caracter no valido"));
                                            r.setZ(leerReal(sc, "Z1", "Ha ingresado un caracter no valido"));
                                            angu = leerReal(sc, "ingrese el angulo", "Ha ingresado un caracter no valido");
                                            angulo = Math.toRadians(angu);
                                            a = new IGVecR3();
                                            a.setX(Math.cos(angulo));
                                            a.setY(0);
                                            a.setZ(-(Math.sin(angulo)));
                                            b = new IGVecR3();
                                            b.setX(0);
                                            b.setY(1);
                                            b.setZ(0);
                                            c = new IGVecR3();
                                            c.setX(Math.sin(angulo));
                                            c.setY(0);
                                            c.setZ(Math.cos(angulo));
                                            x1 = r.productoPunto(a);
                                            y1 = r.productoPunto(b);
                                            z1 = r.productoPunto(c);
                                            System.out.println("El resultado es: ("+x1+", "+y1+", "+z1+")\n");
                                            break;
                                        case 3:
                                            r = new IGVecR3();
                                            System.out.println("Ingrese X1, Y1 y Z1");
                                            r.setX(leerReal(sc, "X1", "Ha ingresado un caracter no valido"));
                                            r.setY(leerReal(sc, "Y1", "Ha ingresado un caracter no valido"));
                                            r.setZ(leerReal(sc, "Z1", "Ha ingresado un caracter no valido"));
                                            angu = leerReal(sc, "ingrese el angulo", "Ha ingresado un caracter no valido");
                                            angulo = Math.toRadians(angu);
                                            a = new IGVecR3();
                                            a.setX(Math.cos(angulo));
                                            a.setY(Math.sin(angulo));
                                            a.setZ(0);
                                            b = new IGVecR3();
                                            b.setX(-(Math.sin(angulo)));
                                            b.setY(Math.cos(angulo));
                                            b.setZ(0);
                                            c = new IGVecR3();
                                            c.setX(0);
                                            c.setY(0);
                                            c.setZ(1);
                                            x1 = r.productoPunto(a);
                                            y1 = r.productoPunto(b);
                                            z1 = r.productoPunto(c);
                                            System.out.println("El resultado es: ("+x1+", "+y1+", "+z1+")\n");
                                            break;
                                    }
                                } while (y != 4);
                                break;
                            case 3:do {
                                System.out.println("ingrese la oprecion que desea realizar");
                                System.out.println("\n1. Rotacion en X\n2. Rotacion en Y\n3. Rotacion en Z\n4. Rotacion en W\n5. Regresar");
                                y = leerEntero(sc, "Ingrese una opcion", "Ha ingresado un caracter no valido");
                                switch (y){
                                    case 1:
                                        break;
                                    case 2:
                                        break;
                                    case 3:
                                        break;
                                    case 4:
                                        break;
                                }
                            }while (y!=5);
                                break;
                        }
                    }while (z!=4);
                    break;

            }

        }    while (x!=3);

    }
    public static double leerReal(Scanner sc,String mensaje, String mensajeError) {
        double retval = 0;
        System.out.println(mensaje);
        while (!sc.hasNextDouble()) {
            sc.nextLine();
            System.out.println(mensajeError);
        }
        retval = sc.nextDouble();
        sc.nextLine();
        return retval;
    }

    public static int leerEntero(Scanner sc,String mensaje, String mensajeError) {
        int retval = 0;
        System.out.println(mensaje);
        while (!sc.hasNextInt()) {
            sc.nextLine();
            System.out.println(mensajeError);
        }
        retval = sc.nextInt();
        sc.nextLine();
        return retval;
    }
}
