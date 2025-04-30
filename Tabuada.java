package aula11;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner ler = new Scanner(System.in);
int num, res;

System.out.println("Informe um número: ");
num= ler.nextInt();

for (int i = 1; i <= 10; i++) {
res = num*i;
System.out.println("Tabuada: " + res);
ler.close();
}
	}
}