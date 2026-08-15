package aed;

class Funciones {

/***  Primera parte: Funciones en java ***/

    int cuadrado(int x) {
        return x * x;
    }

    double distancia(double x, double y) {
        return Math.sqrt((x*x + y*y));
    }

    boolean esPar(int n) {
        if (n%2==0){
            return true;
        }
        else{
            return false;
        }
    }

    boolean esBisiesto(int n) {
        if (n % 400 == 0){
            return true;
        }
        else if (n % 4 == 0 && n % 100 != 0){
            return true;
        }
        else{
            return false;
        }
    }

    int factorialIterativo(int n) {
        int i = 0;
        int tope = n;
        int res = 1;
        while (i <= tope){
            if (n == 0 || n == 1){
                res = res*1;
                i = tope + 1;
            }
            else{
                res = res*n;
                i++;
                n = n-1;
            }
        }
        return res;
    }

    int factorialRecursivo(int n) {
        if (n == 0){
            return 1;
        }
        else{
            return n * factorialIterativo(n-1);
        }
    }

    boolean esPrimo(int n) {
        boolean res = true;
        if (n == 0 || n == 1){
            return false;
        }
        for (int d = 2; d < n; d++){
            if (n % d == 0 && n > d){
                res = false;
            }
        }
        return res;
    }

    int sumatoria(int[] numeros) {
        int res = 0;
        for (int i = 0; i < numeros.length; i++){
            res += numeros[i];
        }
        return res;
    }

    int busqueda(int[] numeros, int buscado) {
        // COMPLETAR
        return 0;
    }

    boolean tienePrimo(int[] numeros) {
        // COMPLETAR
        return false;
    }

    boolean todosPares(int[] numeros) {
        // COMPLETAR
        return false;
    }

    boolean esPrefijo(String s1, String s2) {
        // COMPLETAR
        return false;
    }

    boolean esSufijo(String s1, String s2) {
        // COMPLETAR
        return false;
    }

/***  Segunda parte: Debugging ***/

    boolean xor(boolean a, boolean b) {
        return a || b && !(a && b);
    }

    boolean iguales(int[] xs, int[] ys) {
        boolean res = true;

        for (int i = 0; i < xs.length; i++) {
            if (xs[i] != ys[i]) {
                res = false;
            }
        }
        return res;
    }

    boolean ordenado(int[] xs) {
        boolean res = true;
        for (int i = 0; i < xs.length; i++) {
            if (xs[i] > xs [i+1]) {
                res = false;
            }
        }
        return res;
    }

    int maximo(int[] xs) {
        int res = 0;
        for (int i = 0; i <= xs.length; i++) {
            if (xs[i] > res) res = i;
        }
        return res;
    }

    boolean todosPositivos(int[] xs) {
        boolean res = false;
        for (int x : xs) {
            if (x > 0) {
                res = true;
            } else {
                res = false;
            }
        }
        return res;
    }

}