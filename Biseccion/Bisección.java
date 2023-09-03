// import java.util.Scanner;

// public class Biseccion {

//     public static void main(String[] args) {
//         Scanner read = new Scanner(System.in);

//         System.out.println("Digite grado");
//         int grado = read.nextInt();

//         double F[] = new double[grado + 1];

//         System.out.println("Digite tolerancia");
//         double tolerancia = read.nextDouble();

//         for (int i = 0; i <= grado; i++) {
//             System.out.println("Digite coeficiente #" + i);
//             F[i] = read.nextDouble();
//         }

//         int sw = 0;
//         double fxi, fxd;

//         while (sw == 0) {
//             System.out.println("Digite limite inferior");
//             double xi = read.nextDouble();

//             System.out.println("Digite limite superior");
//             double xd = read.nextDouble();
//             System.out.println("");

//             fxi = Evaluar(F, xi);
//             fxd = Evaluar(F, xd);

//             double cer = fxi * fxd;

//             if (cer < 0) {
//                 boolean b = true;
//                 double xa = 0, fxm;
//                 int it = 1;
//                 while (b) {

//                     double xm = (xi + xd) / 2;
//                     double e = Math.abs(xm - xa);

//                     if (e <= tolerancia) {
//                         System.out.println("\nLa raíz real es = " + xm);
//                         b = false;
//                     } else {
//                         fxm = Evaluar(F, xm);

//                         if (fxm > 0) {
//                             xd = xm;
//                         } else {
//                             xi = xm;
//                         }
//                         System.out.println(xm);
//                     }
//                     it++;
//                     xa = xm;
//                 }
//                 sw = 1;
//             } else {
//                 System.out.println("No existe una raíz entre estos intervalos");
//                 System.out.println("fxi = " + fxi + "\nfxd = " + fxd);
//             }
//         }
//     }

//     public static double Evaluar(double f[], double x) {
//         double fx = 0;
//         for (int i = 0; i <= f.length; i++) {
//             fx += f[i] * Math.pow(x, i);
//         }
//         return fx;
//     }
// }
