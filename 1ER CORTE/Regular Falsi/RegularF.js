var grado = parseInt(prompt("Digite grado: "));
var F = [];
var tol = parseFloat(prompt("Digite tolerancia: "));

for (let i = 0; i <= grado; i++) {
    var coeficiente = parseFloat(prompt("Digite coeficiente #" + i + ": "));
    F[i] = coeficiente;
}

var sw = 0, fxi = 0, fxd = 0;

while (sw == 0) {
    let xi = parseFloat(prompt("Digite limite inferior: "));
    let xd = parseFloat(prompt("Digite limite superior: "));

    fxi = Evaluar(F, xi);
    fxd = Evaluar(F, xd);

    let cer = fxi * fxd;

    if (cer < 0) {
        let b = true;
        let xa = 0, it = 0, fxv = 0;

        while (b) {
            var xv = xd - ((xd - xi) * fxd) / (fxd - fxi);
            var e = Math.abs(xv - xa);

            if (e <= tol) {
                console.log("La raíz real es: " + xv);
                b = false;
            } else {
                fxv = Evaluar(F, xv);

                if (fxv > 0) {
                    xd = xv;
                } else {
                    xi = xv;
                }
                console.log(xv);
            }
            it++;
            xa = xv;
        }
        sw = 1;
    } else {
        console.log("No existe una raíz entre estos intervalos");
        console.log("fxi = " + fxi + "\nfxd = " + fxd);
    }
}

function Evaluar(f, x) {
    let fx = 0;
    for (let i = 0; i < f.length; i++) {
        fx += f[i] * Math.pow(x, i);
    }
    return fx;
}

