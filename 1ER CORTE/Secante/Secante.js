var grado = parseInt(prompt("Digite grado: "))

var F = []

var tol = parseFloat(prompt("Digite tolerancia: "))

var xo = parseFloat(prompt("Digite xo: "))

var xi = parseFloat(prompt("Digite xi: "))

for(let i = 0; i  <= grado; i++){
    let coeficiente = parseFloat(prompt("Digite coeficiente #"+i+" :"))
    F[i] = coeficiente
}

var sw = 0, it = 0, fxi, fxd, x2 = 0, e

var maxit = parseInt(prompt("Digite número máximo de iteracciones"))
console.log("")
console.log("")
console.log("")

while(sw==0 && it <= maxit){
    fxi = Evaluar(F,xo)
    fxd = Evaluar(F,xi)

    x2 = xi - (((xi-xo)*fxd)/(fxd-fxi))
    e = Math.abs(x2-xi)
    
    console.log("")
    console.log("")
    console.log("Iteracción: " + it 
                +"\nXo     : " + xo
                +"\nXi     : " + xi
                +"\nF(xo)     : " + fxi
                +"\nF(xd)     : " + fxd
                +"\nX2     : " + x2
                +"\nError     : " + e)
    if(e<=tol){
        sw = 1
    }else{
        xo = xi
        xi = x2
        it++
    }
}

if(sw==1){
    console.log("La raíz real es: " + x2)
}else{
    console.log("Not found")
}


function Evaluar(f,x){
    let fx = 0
    for(let i = 0; i < f.length; i++){
        fx+=f[i]*Math.pow(x,i)
    }
    return fx
}

