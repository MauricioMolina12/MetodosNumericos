/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.trapezoidalsimple;

/**
 *
 * @author salacomputocentro.ba
 */
import java.util.*;

public class TrapezoidalSimple {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        double H = 0, fb = 0, fa = 0, I = 0;
        
        System.out.println("Digite grado funcion");
        int n = read.nextInt();

        double F[] = new double[n + 1];

        for (int i = 0; i < F.length; i++) {
            System.out.println("Digite coeficiente # " + i);
            F[i] = read.nextDouble();
        }

        System.out.println("Digite limite inferior");
        int a = read.nextInt();

        System.out.println("Digite limite superior");
        int b = read.nextInt();

        H = b - a;

        for (int i = 0; i < F.length; i++) {
            fa = Evaluar(F, a);
            fb = Evaluar(F, b);
        }

        I = H * (fa + fb) / 2;

        System.out.println("La integral es: " + I);

    }

    public static double Evaluar(double f[], double x) {
        double fx = 0;
        for (int i = 0; i < f.length; i++) {
            fx += f[i] * Math.pow(x, i);
        }
        return fx;
    }
}
