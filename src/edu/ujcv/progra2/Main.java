package edu.ujcv.progra2;

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
                                            break;
                                        case 2:
                                            break;
                                        case 3:
                                            break;
                                        case 4:
                                            break;
                                        case 5:
                                            break;
                                        case 6:
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
                                            break;
                                        case 2:
                                            break;
                                        case 3:
                                            break;
                                        case 4:
                                            break;
                                        case 5:
                                            break;
                                        case 6:
                                            break;
                                        case 7:
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
                                            break;
                                        case 2:
                                            break;
                                        case 3:
                                            break;
                                        case 4:
                                            break;
                                        case 5:
                                            break;
                                        case 6:
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
