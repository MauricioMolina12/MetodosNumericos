/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SegundoCorte;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class EliminacionGauss {

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
                System.out.print("\n Digite número en la posicion[" + (i+1) + "," + (j+1) + "]:");
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
    }
}
