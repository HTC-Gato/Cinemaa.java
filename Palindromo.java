import java.util.Scanner;

public class Palindromo {
    static public String removeEspaco(String s) {
        String semEspaco = s
                            .replace(" ", "")
                            .replace(";", "")
                            .replace(".", "")
                            .replace(":", "")
                            .replace("-", "")
        ;
        return semEspaco;
    }

    static public String inverte(String s){
        String invertida = "";
        for(int i=s.length()-1;i>=0;i-=1){
            invertida += s.charAt(i);
        }
        return invertida;
    }

    static public boolean ehPalindromo(String frase){
        String fraseLimpa = removeEspaco(frase);
        String fraseInvertida = inverte(fraseLimpa);
        return fraseLimpa.equalsIgnoreCase(fraseInvertida);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe a frase: ");
        String frase = input.nextLine();
        if(ehPalindromo(frase)){
            System.out.printf("A frase '%s' é palíndromo!", frase);
        }
        else{
            System.out.printf("A frase NÂO é palíndromo!");

        }
        input.close();
    }
}
