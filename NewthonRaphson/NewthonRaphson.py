def Evaluar(f,x):
    fx = 0
    for i in range(len(f)):
        fx += f[i] * x**i
    return fx

def Derivar(f):
    D = []
    for i in range (1, len(f)):
        D.append(f[i]*i)
    return D


grado =  int(input("Digite grado: "))

F = []

for i in range (grado+1):
    coeficiente = float(input("Digite coeficiente #" + str(i) + ": "))
    F.append(coeficiente)

xo = float(input("Digite xo: "))
tol = float(input("Digite tolerancia: "))

D = Derivar(F)

i = 0 
sw = 0
x1 = 0
fxo = 0
fpxo = 0

NumMax = int(input("Digite número máximo de iteracciones: "))

while (sw==0 and i<=NumMax):
    fxo = Evaluar(F,xo)
    fpxo = Evaluar(D,xo)
    
    x1 = xo-(fxo/fpxo)
    
    e = abs(x1-xo)
    
    if e<=tol:
        sw = 1
    else:
        xo = x1
        i+=1

if sw==1:
    print("La raíz real: ", x1)
else:
    print("Not found")




