import java.util.Scanner;

public class Programa01 {
    static public void main (String[] args) {
	Scanner input = new Scanner(System.in);

        float Nota1 ;
        float Nota2 ;
        float Nota3 ;
		float Nota4 ;
		float media ;
		 System.out.println("qual é o nome do aluno?");
		 String nome = input.nextLine();
		  System.out.println("qual é a primeira nota?");
		  Nota1 = input.nextFloat() ;
		  System.out.println("qual é a segunda nota?");
	      Nota2 = input.nextFloat() ;
          System.out.println("qual é a terceira nota?");
		  Nota3 = input.nextFloat() ;
		  System.out.println("qual é a quarta nota?");
		  Nota4 = input.nextFloat() ;

		  media = (Nota1 + Nota2 + Nota3 + Nota4 )/ 4;

		  if (media >= 6){
			System.out.printf("o aluno %s%n", nome);
			System.out.printf("foi aprovado com a média de %.2f%n", media);
		  }else {
			System.out.printf("o aluno %s%n", nome);
			System.out.printf("foi reprovado com a média de %.2f%n", media);
		  }
		  input.close();


		}
	
}
