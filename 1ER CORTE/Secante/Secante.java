/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// package RegularFalsi;

// import static Biseccion.Biseccion.Evaluar;
// import java.util.Scanner;

// /**
//  *
//  * @author ASUS
//  */
// public class RegularFalsi {
    
//     public static void main(String[] args) {
        
//         Scanner read = new Scanner(System.in);

//         System.out.println("Digite grado");
//         int grado = read.nextInt();

//         double F[] = new double[grado + 1];

//         System.out.println("Digite tolerancia");
//         double tolerancia = read.nextDouble();

//         for (int i = 0; i < F.length; i++) {
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
            
//             fxi = Evaluar(F, xi);
//             fxd = Evaluar(F, xd);

//             double cer = fxi * fxd;
            
//             if (cer < 0) {
//                 boolean b = true;
//                 double xva = 0, xv,e,fxv;
//                 int it = 1;
//                 while (b) {
                    
//                     xv = xd-((xd-xi)*fxd)/(fxd-fxi);
                    
//                     e = Math.abs(xv-xva);
                  
//                     if (e <= tolerancia) {
//                         System.out.println("\nLa raix real es = " + xv);
//                         b = false;
//                     } else {
//                          fxv = Evaluar(F, xv);
                                                
//                         if (fxv < 0) {
//                             xi = xv;
//                         } else {
//                             xd = xv;
//                         }
//                         System.out.println(xv);
//                     }
//                     it++;
//                     xva = xv;
//                 }
//                 sw = 1;
//             }else{
//                 System.out.println("No existe una raix entre estos inventarios");
//                 System.out.println("fxi = " + fxi + "\nfxd = " + fxd);
//             }
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
