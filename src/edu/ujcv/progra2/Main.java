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
            System.out.println("ingrese una opcion");
            System.out.println("1. vectores\n2. matrices\n3. salir");
            x = sc.nextInt();
            switch (x){
                case 1:
                    int z;
                    do {

                        System.out.println("Ingrese el tipo de vector");
                        System.out.println("1. Vector en R2\n2. Vector en R3\n3. Vector en R4\n4. Regresar");
                        z = sc.nextInt();
                        switch (z){
                            case 1:
                                int y;
                                do {
                                    System.out.println("ingrese la oprecion que desea realizar");
                                    System.out.println("1. Suma\n2. Resta\n3. Escalar * Vector\n4. Producto punto\n5. Angulo\n6. Magnitud\n7. Regresar");
                                    y = sc.nextInt();
                                    switch (y){
                                        case 1:
                                            IGVecR2 a = new IGVecR2();
                                            System.out.println("Ingrese X1 y Y1");
                                            a.setX(sc.nextDouble());
                                            a.setY(sc.nextDouble());
                                            IGVecR2 b = new IGVecR2();
                                            System.out.println("Ingrese X2 y Y2");
                                            b.setX(sc.nextDouble());
                                            b.setY(sc.nextDouble());
                                            IGVecR2 resul = a.suma(b);
                                            System.out.println("El resultado es: ("+resul.getX()+", "+resul.getY()+")\n");
                                            break;
                                        case 2:
                                            a = new IGVecR2();
                                            System.out.println("Ingrese X1 y Y1");
                                            a.setX(sc.nextDouble());
                                            a.setY(sc.nextDouble());
                                            b = new IGVecR2();
                                            System.out.println("Ingrese X2 y Y2");
                                            b.setX(sc.nextDouble());
                                            b.setY(sc.nextDouble());
                                            resul = a.resta(b);
                                            System.out.println("El resultado es: ("+resul.getX()+", "+resul.getY()+")\n");
                                            break;
                                        case 3:
                                            a = new IGVecR2();
                                            System.out.println("Ingrese X1 y Y1");
                                            a.setX(sc.nextDouble());
                                            a.setY(sc.nextDouble());
                                            System.out.println("ingrese Alpha");
                                            double alpha = sc.nextDouble();
                                            resul = a.escalarPorVector(alpha);
                                            System.out.println("El resultado es: ("+resul.getX()+", "+resul.getY()+")\n");
                                            break;
                                        case 4:
                                            a = new IGVecR2();
                                            System.out.println("Ingrese X1 y Y1");
                                            a.setX(sc.nextDouble());
                                            a.setY(sc.nextDouble());
                                            b = new IGVecR2();
                                            System.out.println("Ingrese X2 y Y2");
                                            b.setX(sc.nextDouble());
                                            b.setY(sc.nextDouble());
                                            double t = a.productoPunto(b);
                                            System.out.println("El resultado es: "+t);
                                            break;
                                        case 5:
                                            a = new IGVecR2();
                                            System.out.println("Ingrese X1 y Y1");
                                            a.setX(sc.nextDouble());
                                            a.setY(sc.nextDouble());
                                            b = new IGVecR2();
                                            System.out.println("Ingrese X2 y Y2");
                                            b.setX(sc.nextDouble());
                                            b.setY(sc.nextDouble());
                                            t = a.angulo(b);
                                            System.out.println("El resultado es: "+t+" grados");
                                            break;
                                        case 6:
                                            a = new IGVecR2();
                                            System.out.println("Ingrese X1 y Y1");
                                            a.setX(sc.nextDouble());
                                            a.setY(sc.nextDouble());
                                            b = new IGVecR2();
                                            System.out.println("Ingrese X2 y Y2");
                                            b.setX(sc.nextDouble());
                                            b.setY(sc.nextDouble());
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
                                    y = sc.nextInt();
                                    switch (y){
                                        case 1:
                                            IGVecR3 a = new IGVecR3();
                                            System.out.println("Ingrese X1, Y1 y Z1");
                                            a.setX(sc.nextDouble());
                                            a.setY(sc.nextDouble());
                                            a.setZ(sc.nextDouble());
                                            IGVecR3 b = new IGVecR3();
                                            System.out.println("Ingrese X2, Y2 y Z2");
                                            b.setX(sc.nextDouble());
                                            b.setY(sc.nextDouble());
                                            b.setZ(sc.nextDouble());
                                            IGVecR3 resul = a.suma(b);
                                            System.out.println("El resultado es: ("+resul.getX()+", "+resul.getY()+", "+resul.getZ()+")\n");
                                            break;
                                        case 2:
                                            a = new IGVecR3();
                                            System.out.println("Ingrese X1, Y1 y Z1");
                                            a.setX(sc.nextDouble());
                                            a.setY(sc.nextDouble());
                                            a.setZ(sc.nextDouble());
                                            b = new IGVecR3();
                                            System.out.println("Ingrese X2, Y2 y Z2");
                                            b.setX(sc.nextDouble());
                                            b.setY(sc.nextDouble());
                                            b.setZ(sc.nextDouble());
                                            resul = a.resta(b);
                                            System.out.println("El resultado es: ("+resul.getX()+", "+resul.getY()+", "+resul.getZ()+")\n");
                                            break;
                                        case 3:
                                            a = new IGVecR3();
                                            System.out.println("Ingrese X1, Y1 y Z1");
                                            a.setX(sc.nextDouble());
                                            a.setY(sc.nextDouble());
                                            a.setZ(sc.nextDouble());
                                            System.out.println("ingrese Alpha");
                                            double alpha = sc.nextDouble();
                                            resul = a.escalarPorVector(alpha);
                                            System.out.println("El resultado es: ("+resul.getX()+", "+resul.getY()+", "+resul.getZ()+")\n");
                                            break;
                                        case 4:
                                            a = new IGVecR3();
                                            System.out.println("Ingrese X1, Y1 y Z1");
                                            a.setX(sc.nextDouble());
                                            a.setY(sc.nextDouble());
                                            a.setZ(sc.nextDouble());
                                            b = new IGVecR3();
                                            System.out.println("Ingrese X2, Y2 y Z2");
                                            b.setX(sc.nextDouble());
                                            b.setY(sc.nextDouble());
                                            b.setZ(sc.nextDouble());
                                            double t = a.productoPunto(b);
                                            System.out.println("El resultado es: "+t);
                                            break;
                                        case 5:
                                            a = new IGVecR3();
                                            System.out.println("Ingrese X1, Y1 y Z1");
                                            a.setX(sc.nextDouble());
                                            a.setY(sc.nextDouble());
                                            a.setZ(sc.nextDouble());
                                            b = new IGVecR3();
                                            System.out.println("Ingrese X2, Y2 y Z2");
                                            b.setX(sc.nextDouble());
                                            b.setY(sc.nextDouble());
                                            b.setZ(sc.nextDouble());
                                            t = a.angulo(b);
                                            System.out.println("El resultado es: "+t+" grados");
                                            break;
                                        case 6:
                                            a = new IGVecR3();
                                            System.out.println("Ingrese X1, Y1 y Z1");
                                            a.setX(sc.nextDouble());
                                            a.setY(sc.nextDouble());
                                            a.setZ(sc.nextDouble());
                                            b = new IGVecR3();
                                            System.out.println("Ingrese X2, Y2 y Z2");
                                            b.setX(sc.nextDouble());
                                            b.setY(sc.nextDouble());
                                            b.setZ(sc.nextDouble());
                                            t = a.magnitud(b);
                                            System.out.println("El resultado es: "+t);
                                            break;
                                        case 7:
                                            a = new IGVecR3();
                                            System.out.println("Ingrese X1, Y1 y Z1");
                                            a.setX(sc.nextDouble());
                                            a.setY(sc.nextDouble());
                                            a.setZ(sc.nextDouble());
                                            b = new IGVecR3();
                                            System.out.println("Ingrese X2, Y2 y Z2");
                                            b.setX(sc.nextDouble());
                                            b.setY(sc.nextDouble());
                                            b.setZ(sc.nextDouble());
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
                                    y = sc.nextInt();
                                    switch (y){
                                        case 1:
                                            IGVecR4 a = new IGVecR4();
                                            System.out.println("Ingrese X1, Y1, Z1 y W1");
                                            a.setX(sc.nextDouble());
                                            a.setY(sc.nextDouble());
                                            a.setZ(sc.nextDouble());
                                            a.setW(sc.nextDouble());
                                            IGVecR4 b = new IGVecR4();
                                            System.out.println("Ingrese X2, Y2, Z2 y W2");
                                            b.setX(sc.nextDouble());
                                            b.setY(sc.nextDouble());
                                            b.setZ(sc.nextDouble());
                                            b.setW(sc.nextDouble());
                                            IGVecR4 resul = a.suma(b);
                                            System.out.println("El resultado es: ("+resul.getX()+", "+resul.getY()+", "+resul.getZ()+", "+resul.getW()+")");
                                            break;
                                        case 2:
                                            a = new IGVecR4();
                                            System.out.println("Ingrese X1, Y1, Z1 y W1");
                                            a.setX(sc.nextDouble());
                                            a.setY(sc.nextDouble());
                                            a.setZ(sc.nextDouble());
                                            a.setW(sc.nextDouble());
                                            b = new IGVecR4();
                                            System.out.println("Ingrese X2, Y2, Z2 y W2");
                                            b.setX(sc.nextDouble());
                                            b.setY(sc.nextDouble());
                                            b.setZ(sc.nextDouble());
                                            b.setW(sc.nextDouble());
                                            resul = a.resta(b);
                                            System.out.println("El resultado es: ("+resul.getX()+", "+resul.getY()+", "+resul.getZ()+", "+resul.getW()+")");
                                            break;
                                        case 3:
                                            a = new IGVecR4();
                                            System.out.println("Ingrese X1, Y1, Z1 y W1");
                                            a.setX(sc.nextDouble());
                                            a.setY(sc.nextDouble());
                                            a.setZ(sc.nextDouble());
                                            a.setW(sc.nextDouble());
                                            System.out.println("ingrese Alpha");
                                            double alpha = sc.nextDouble();
                                            resul = a.escalarPorVector(alpha);
                                            System.out.println("El resultado es: ("+resul.getX()+", "+resul.getY()+", "+resul.getZ()+", "+resul.getW()+")");
                                            break;
                                        case 4:
                                            a = new IGVecR4();
                                            System.out.println("Ingrese X1, Y1, Z1 y W1");
                                            a.setX(sc.nextDouble());
                                            a.setY(sc.nextDouble());
                                            a.setZ(sc.nextDouble());
                                            a.setW(sc.nextDouble());
                                            b = new IGVecR4();
                                            System.out.println("Ingrese X2, Y2, Z2 y W2");
                                            b.setX(sc.nextDouble());
                                            b.setY(sc.nextDouble());
                                            b.setZ(sc.nextDouble());
                                            b.setW(sc.nextDouble());
                                            double t = a.productoPunto(b);
                                            System.out.println("El resultado es: "+t);
                                            break;
                                        case 5:
                                            a = new IGVecR4();
                                            System.out.println("Ingrese X1, Y1, Z1 y W1");
                                            a.setX(sc.nextDouble());
                                            a.setY(sc.nextDouble());
                                            a.setZ(sc.nextDouble());
                                            a.setW(sc.nextDouble());
                                            b = new IGVecR4();
                                            System.out.println("Ingrese X2, Y2, Z2 y W2");
                                            b.setX(sc.nextDouble());
                                            b.setY(sc.nextDouble());
                                            b.setZ(sc.nextDouble());
                                            b.setW(sc.nextDouble());
                                            t = a.angulo(b);
                                            System.out.println("El resultado es: "+t+" grados");
                                            break;
                                        case 6:
                                            a = new IGVecR4();
                                            System.out.println("Ingrese X1, Y1, Z1 y W1");
                                            a.setX(sc.nextDouble());
                                            a.setY(sc.nextDouble());
                                            a.setZ(sc.nextDouble());
                                            a.setW(sc.nextDouble());
                                            b = new IGVecR4();
                                            System.out.println("Ingrese X2, Y2, Z2 y W2");
                                            b.setX(sc.nextDouble());
                                            b.setY(sc.nextDouble());
                                            b.setZ(sc.nextDouble());
                                            b.setW(sc.nextDouble());
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
                        z = sc.nextInt();
                        switch (z) {
                            case 1:
                                int y;
                                do {
                                    System.out.println("ingrese la oprecion que desea realizar");
                                    System.out.println("1. Multiplicacion\n2. Columna * Matriz\n3. Suma\n4. Escalar * Matriz\n5. Rotacion\n6. Regresar");
                                    y = sc.nextInt();
                                    switch (y){
                                        case 1:
                                            break;
                                        case 2:
                                            break;
                                        case 3:
                                            break;
                                        case 4:
                                            break;
                                        case 5:
                                            IGVecR2 a = new IGVecR2();
                                            IGVecR2 b = new IGVecR2();
                                            System.out.println("Ingrese el angulo");
                                            double angulo = sc.nextDouble();
                                            System.out.println("Ingrese el vector X y Y");
                                            a.setX(sc.nextDouble());
                                            a.setY(sc.nextDouble());
                                            IGMatR2 c = new IGMatR2();

                                            break;
                                    }
                                } while (y != 6);
                                break;
                            case 2:
                                do {
                                    System.out.println("ingrese la oprecion que desea realizar");
                                    System.out.println("\n1. Rotacion en X\n2. Rotacion en Y\n3. Rotacion en Z\n4. Regresar");
                                    y = sc.nextInt();
                                    switch (y){
                                        case 1:
                                            break;
                                        case 2:
                                            break;
                                        case 3:
                                            break;
                                    }
                                } while (y != 4);
                                break;
                            case 3:do {
                                System.out.println("ingrese la oprecion que desea realizar");
                                System.out.println("\n1. Rotacion en X\n2. Rotacion en Y\n3. Rotacion en Z\n4. Rotacion en W\n5. Regresar");
                                y = sc.nextInt();
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

}
