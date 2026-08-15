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
        int posicion = 0;
        for (int i = 0; i < numeros.length; i++){
            if (numeros[i] == buscado){
                posicion = i;
            }
        }
        return posicion;
    }

    boolean tienePrimo(int[] numeros) {
        for (int i = 0; i < numeros.length; i++){
            if (esPrimo(numeros[i]) == true){
                return true;
            }
        }
        return false;
    }

    boolean todosPares(int[] numeros) {
        for (int i = 0; i < numeros.length; i++){
            if (esPar(numeros[i]) == false){
                return false;
            }
        }
        return true;
    }

    boolean esPrefijo(String s1, String s2) {
        if (s1.length() > s2.length()){
            return false;
        }
        for (int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i)){
                return false;
            }
        }
        return true;
    }

    boolean esSufijo(String s1, String s2) {
        if (s1.length() > s2.length()){
            return false;
        }
        String s1_reves = "";
        String s2_reves = "";
        for (int i = s1.length()-1; i > -1; i--){
            s1_reves += s1.charAt(i);
        }
        for (int i = s2.length()-1; i > -1; i--){
            s2_reves += s2.charAt(i);
        }
        if (esPrefijo(s1_reves, s2_reves)){
            return true;
        }
        return false;
    }

/***  Segunda parte: Debugging ***/

    boolean xor(boolean a, boolean b) {
        return (a || b) && !(a && b);
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