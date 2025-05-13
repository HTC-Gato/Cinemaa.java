import java.util.Scanner;

public class Programa01 {
    static public void main(String[] args){
        Scanner input = new Scanner(System.in);

        boolean[] fileiraA = {false, false, false, false, false, false, false, false, false, false};
        boolean[] fileiraB = {false, false, false, false, false, false, false, false, false, false};
        boolean[] fileiraC = {false, false, false, false, false, false, false, false, false, false};
        boolean[] fileiraD = {false, false, false, false, false, false, false, false, false, false};
        boolean[] fileiraE = {false, false, false, false, false, false, false, false, false, false};
        String fila = "";
        int cadeira;

        while (!fila.equals("Sair")){

            System.out.println("Mapa de Assentos");
            System.out.println("-----------+--1-2-3-4-5-6-7-8-9-10");
            System.out.println("-----------+-----------------------");
            for(int i=0;i<5;i++){
                if(i==0){
                    System.out.printf("A || f == 'A' ");
                    for(int j=0;j<10;j++){
                        if(fileiraA[j]){
                            System.out.printf("X");
                        }
                        else {
                            System.out.printf("O");
                        }
                        if (j==9){
                            System.out.printf("%n");
                        }
                        else{
                            System.out.printf("-");
                        }
                    }
                }
                else if(i==1){
                    System.out.printf("B || f == 'B' ");
                    for(int j=0;j<10;j++){
                        if(fileiraB[j]){
                            System.out.printf("X");
                        }
                        else {
                            System.out.printf("O");
                        }
                        if (j==9){
                            System.out.printf("%n");
                        }
                        else{
                            System.out.printf("-");
                        }
                    }                
                }
                else if(i==2){
                    System.out.printf("C || f == 'C' ");
                    for(int j=0;j<10;j++){
                        if(fileiraC[j]){
                            System.out.printf("X");
                        }
                        else {
                            System.out.printf("O");
                        }
                        if (j==9){
                            System.out.printf("%n");
                        }
                        else{
                            System.out.printf("-");
                        }
                    }
                }
                else if(i==3){
                    System.out.printf("D || f == 'D' ");
                    for(int j=0;j<10;j++){
                        if(fileiraD[j]){
                            System.out.printf("X");
                        }
                        else {
                            System.out.printf("O");
                        }
                        if (j==9){
                            System.out.printf("%n");
                        }
                        else{
                            System.out.printf("-");
                        }
                    }
                }
                else {
                    System.out.printf("E || f == 'E' ");
                    for(int j=0;j<10;j++){
                        if(fileiraE[j]){
                            System.out.printf("X");
                        }
                        else {
                            System.out.printf("O");
                        }
                        if (j==9){
                            System.out.printf("%n");
                        }
                        else{
                            System.out.printf("-");
                        }
                    }                
                }

            }

            System.out.printf("Qual a fila: ");
            fila = input.nextLine();
            System.out.printf("Qual a cadeira: ");
            cadeira = input.nextInt();input.nextLine();
            cadeira -= 1;
            if(fila.charAt(0)=='A'){
                if(fileiraA[cadeira]){
                    System.out.println("Assento não está disponível!");
                }
                else{
                    fileiraA[cadeira] = true;
                    System.out.printf("Assento %c%d reservado%n",fila.charAt(0),cadeira);
                }
            }
            else if(fila.charAt(0)=='B'){
                if(fileiraB[cadeira]){
                    System.out.println("Assento não está disponível!");
                }
                else{
                    fileiraB[cadeira] = true;
                    System.out.printf("Assento %c%d reservado%n",fila.charAt(0),cadeira);
                }
            }
            else if(fila.charAt(0)=='C'){
                if(fileiraC[cadeira]){
                    System.out.println("Assento não está disponível!");
                }
                else{
                    fileiraC[cadeira] = true;
                    System.out.printf("Assento %c%d reservado%n",fila.charAt(0),cadeira);
                }
            }
            else  if(fila.charAt(0)=='D'){
                if(fileiraD[cadeira]){
                    System.out.println("Assento não está disponível!");
                }
                else{
                    fileiraD[cadeira] = true;
                    System.out.printf("Assento %c%d reservado%n",fila.charAt(0),cadeira);
                }
            }
            else  if(fila.charAt(0)=='E'){
                if(fileiraE[cadeira]){
                    System.out.println("Assento não está disponível!");
                }
                else{
                    fileiraE[cadeira] = true;
                    System.out.printf("Assento %c%d reservado%n",fila.charAt(0),cadeira);
                }
            }
            else {
                System.out.println("Fila inválida!");
            }
        }

        input.close();
    }
}
