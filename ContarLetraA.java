import java.util.Scanner;

public class ContarLetraA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Informe uma string para verificar a quantidade de letras 'a' (ou 'A'): ");
        String entrada = scanner.nextLine();
        
        
        int quantidade = contarLetraA(entrada);
        
        
        if (quantidade > 0) {
            System.out.println("A letra 'a' ou 'A' aparece " + quantidade + " vez(es) na string.");
        } else {
            System.out.println("A letra 'a' ou 'A' não aparece na string.");
        }
        
        scanner.close();
    }

    public static int contarLetraA(String str) {
        int contador = 0;
        
        
        String strMinuscula = str.toLowerCase();
        
        
        for (char c : strMinuscula.toCharArray()) {
            if (c == 'a') {
                contador++;
            }
        }
        
        return contador;
    }
}
