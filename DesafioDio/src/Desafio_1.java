/*
 
 QUESTAO
 FaCa um algoritmo para ler um numero indeterminado de dados, contendo cada 
 um, a idade de um individuo. O ultimo dado, que nao entrara nos calculos, 
 contem o valor de idade negativa. Calcular e imprimir a idade media deste 
 grupo de individuos.
 
 ENTRADA
 A entrada contem um numero indeterminado de inteiros. A entrada ser� encerrada 
 quando um valor negativo for lido.
 
 SA�DA
 A saida contem um valor correspondente a media de idade dos individuos.
 A media deve ser impressa com dois digitos apos o ponto decimal.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class  Desafio_1 {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int cont = 0;
        double soma = 0;
        double n = leitor.nextInt();
        
        while (n >= 1){
            if (n >= 0) {
                soma+=n;
                cont++;
            }
            n = leitor.nextInt();
        }
        double media = soma / cont;
        System.out.println(String.format("%.2f", media ));
    }
}