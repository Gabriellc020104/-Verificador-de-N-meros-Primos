public class VerificadorPrimos {
    public static void main(String[] args) {
        int numero = 17;
        boolean ehPrimo = true;
        
        for (int i = 2; i <= numero / 2; i++) {
            if (numero % i == 0) {
                ehPrimo = false;
                break;
            }
        }
        
        if (ehPrimo) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }
    }
}
