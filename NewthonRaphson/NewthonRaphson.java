/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// package NewtonRaphson;

// /**
//  *
//  * @author ASUS
//  */
// import java.util.*;

// public class NewtonRaphson {

//     public static void main(String[] args) {
//         Scanner read = new Scanner(System.in);

//         System.out.println("Digite grado");
//         int grado = read.nextInt();

//         double F[] = new double[grado + 1];

//         for (int i = 0; i < F.length; i++) {
//             System.out.println("Digite coeficiente # " + i);
//             F[i] = read.nextDouble();
//         }

//         System.out.println("Digite xo");
//         double xo = read.nextInt();

//         System.out.println("Digite tolerancia");
//         double tol = read.nextDouble();

//         double D[] = new double[grado];
//         for (int i = 1; i < F.length; i++) {
//             D[i - 1] = F[i] * i;
//         }

//         int i = 0, sw = 0;
//         double x1 = 0;

//         System.out.println("Digite número máximo de iteracciones");
//         int maxit = read.nextInt();

//         double fxo = 0, fpxo = 0;

//         while (sw == 0 && i <= maxit) {
//             for (int j = 0; j < F.length; j++) {
//                 fxo = Evaluar(F, xo);
//             }
//             for (int j = 0; j < F.length - 1; j++) {
//                 fpxo = Evaluar(D, xo);
//             }
//             x1 = xo - (fxo / fpxo);
//             double e = 0;
//             e = Math.abs(x1 - xo);

//             if (e <= tol) {
//                 sw = 1;
//             } else {
//                 xo = x1;
//                 i++;
//             }
//         }

//         if (sw == 1) {
//             System.out.println("La raíz real es: " + x1);
//         } else {
//             System.out.println("Not found");
//         }
//     }

//     public static double Evaluar(double f[], double x) {
//         double fx = 0;
//         for (int i = 0; i < f.length; i++) {
//             fx += f[i] * Math.pow(x, i);
//         }
//         return fx;
//     }
// }
