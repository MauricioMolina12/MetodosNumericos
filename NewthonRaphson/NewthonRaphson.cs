using System;

class Program{

    static double Evaluar(double[]F, double x){
        double fx = 0;
        for(int i = o; i < f.length; i++){
            fx+=f[i]*Math.Pow(x,i);
        }
        return fx;
    }
     static double Derivar(double[]F){
        double[]D= new double [f.Length-1]
        for(int i = 1; i  < f.length; i++){
            D[i-1] = f[i]*i;
        }
        return D;
    }

    static void Main(){
        Console.Write("Digite grado: ");
        int grado = int.Parse(Console.ReadLine());

        double[] F = new double [grado+1];
        for(int i = 0; i  <=grado; i++){
            Console.Write("Digite coeficiente #" + i + "");
            double coeficiente = double.Parse(Console.ReadLine());
            F[i] = coeficiente;
        }

        Console.Write("Digite xo: ");
        double xo = double.Parse(Console.ReadLine());

        Console.Write("Digite tolerancia: ");
        double tol = double.Parse(Console.ReadLine());

        double[] D = Derivar(F);

        int i = 0;
        int sw = 0;
        int x1 = 0;
        int fxo = 0;
        int fpxo = 0;

        Console.Write("Digite número máximo de iteracciones: ");
        int NumMax = double.Parse(Console.ReadLine());

        while (sw == 0 && i <= NumMax){
            fxo = Evaluar(F, xo);
            fpxo = Evaluar(D, xo);

            x1 = xo - (fxo / fpxo);

            double e = Math.Abs(x1 - xo);

            if (e <= tol){
                sw = 1;
            }else{
                xo = x1;
                i++;
            }
        }

        if (sw == 1){
            Console.WriteLine("La raíz real es: " + x1);
        }else{
            Console.WriteLine("Not found");
        }
    }
        
}



