/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.gauss;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class GAUSS {

    static int m, n;
    static double[][] M;

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Digite ecuaciones: ");
        n = read.nextInt();
        System.out.print("Digite incognitas: ");
        m = read.nextInt();

        M = new double[n][m + 1];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= m; j++) {
                System.out.print("\n Digite número en la posición[" + (i + 1) + "," + (j + 1) + "]:");
                M[i][j] = read.nextDouble();
            }
        }

        System.out.println("Matriz generada");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= m; j++) {
                System.out.print("\t" + M[i][j]);
            }
            System.out.println("\n");
        }

        for (int i = 0; i < n; i++) {
            double div = M[i][i];
            for (int j = 0; j <= m; j++) {
                M[i][j] /= div;
            }

            for (int k = i + 1; k < n; k++) {
                double pv = (-1) * M[k][i];
                for (int j = 0; j <= m; j++) {
                    M[k][j] = pv * M[i][j] + M[k][j];
                }
            }
        }

        System.out.println("Matriz resultante");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= m; j++) {
                System.out.print("\t" + M[i][j]);
            }
            System.out.println("\n");
        }

        // double x4 = M[n - 1][m];
        // double x3 = ConocerValor(2, x4);
        // double x2 = ConocerValor(1, x3);
        // double x1 = ConocerValor(0, x2);

        // System.out.println("x1 = " + x1 + "     x2 = " + x2 + "     x3 = " + x3 + "     x4 = " + x4);

        double [] V = new double [m];

        for (int v = m-1; v >= 0 ; v--) {
            if (v == m-1) {
                V[v]= M[n - 1][m];
                
            }
            else{
                V[v] = ConocerValor(v, V[v+1]);
            }            
        }

        for(int v = 0; v < V.length; v++){
            System.out.print("x"+(v+1)+" = "+ V[v] + "\t");
        }
        

    }

    static public double ConocerValor(int f, double valor_ant) {
        valor_ant *= M[f][f + 1];

        for (int c = 0; c < m; c++) {
            if (c != f && c!= f+1) {
                valor_ant += M[f][c];
            }
        }
        valor_ant = M[f][m] - valor_ant;
        return valor_ant;
    }
}
