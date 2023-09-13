var grado = parseInt(prompt("Digite grado: "));

var F = [];

for (let i = 0; i <= grado; i++) {
    let coeficiente = parseFloat(prompt("Digie coeficiente #" + i + " "));
    F.push(coeficiente);
}

var xo = parseFloat(prompt("Digite xo"));
var tol = parseFloat(prompt("Digite tolerancia"));

var D = Derivar(F)

var i = 0, sw = 0, x1 = 0, fxo = 0, fpxo = 0;

var NumMax = parseInt(prompt("Digite número máximo de iteraciones"));

while (sw == 0 && i <= NumMax) {
    fxo = Evaluar(F, xo);
    fpxo = Evaluar(D, xo);

    x1 = xo - (fxo / fpxo);
    var e = Math.abs(x1 - xo);

    if (e <= tol) {
        sw = 1;
    } else {
        xo = x1;
        i++;
    }
}

if (sw == 1) {
    console.log("La raíz real es: " + x1);
} else {
    console.log("Not found");
}

function Evaluar(f, x) {
    let fx = 0;
    for (let i = 0; i < f.length; i++) {
        fx += f[i] * Math.pow(x, i);
    }
    return fx;
}

function Derivar(f) {
    let D = [];
    for (let i = 1; i < f.length; i++) {
        D.push(f[i] * i);
    }
    return D;
}
