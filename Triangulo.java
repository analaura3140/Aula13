package aula11;

import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		
Scanner ler = new Scanner(System.in);

int a, b, c;

System.out.println("Digite o valor de um lado do triângulo: ");
a = ler.nextInt();
System.out.println("Digite o valor de um lado do triângulo: ");
b = ler.nextInt();
System.out.println("Digite o valor de um lado do triângulo: ");
c = ler.nextInt();
ler.close();

if (a == b && b == c && c == a) {
	System.out.println("O triângulo é equilátero. ");
}	else if (a == b || b == c || a == c) {
	
	System.out.println("O triângulo é isósceles. ");
}
else {
	System.out.println("O triângulo é escaleno ");
}

	}

}
