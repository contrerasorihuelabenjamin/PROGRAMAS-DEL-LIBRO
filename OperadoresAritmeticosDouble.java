// Programa 2.6b - Operadores aritméticos con decimales (double)
// Pág. 48 - Operaciones con valores de tipo double

class OperadoresAritmeticosDouble {
    public static void main(String[] args) {
        double numero1 = 7.0;
        double numero2 = 5.0;

        System.out.println("Operaciones con \"numero1\" y \"numero2:\"");
        System.out.println("Suma:              " + numero1 + " + " + numero2 + " = " + (numero1 + numero2));
        System.out.println("Resta:             " + numero1 + " - " + numero2 + " = " + (numero1 - numero2));
        System.out.println("Multiplicacion:    " + numero1 + " * " + numero2 + " = " + (numero1 * numero2));
        System.out.println("Division decimal:  " + numero1 + " / " + numero2 + " = " + (numero1 / numero2));
        System.out.println("Residuo (Modulo):  " + numero1 + " % " + numero2 + " = " + (numero1 % numero2));
    } // Fin del método main
} // Fin de la clase OperadoresAritmeticosDouble