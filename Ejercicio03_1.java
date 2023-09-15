public class Ejercicio03_1 {

    public static void main(String[] args) {

        int i = 0;
        int x;
        int y = 0;
        // Inicializamos y con 0 porque no se proporciona un valor

        do {
            x = 2 * i - 10;
            if (x < 0)
                x = (-1) * x;
            System.out.println(x + " " + y);
            i++;
        } while (i < 10);
        // El bucle "do-while" finaliza cuando "i" alcanza 10
    }
}
//El codigo proporcionado es un bucle 'for'
//Se inicializa una variable 'i' en 0 y este se ejecuta el bloque de codigo mientras 'i' sea menor que 10
//Siempre se calcula el valor de x como 2 veces el valor de i menos 10
//Luego se verifica si x es menor que 0
//si es asi, este se cambia a signo positivo, luego se imprime x junto a una variable

