package br.senac.rj.teste;

import java.util.Arrays;

public class TesteArray1 {

	public static void main(String[] args) {
		int[] meuArray1 = new int[4];
		meuArray1[0]=10;
		meuArray1[1]=20;
		meuArray1[2]=30;
		meuArray1[3]=40;
		System.out.println("Tamanho do array MeuArray1 = " + meuArray1.length);
		for (int i=0; i<meuArray1.length; i++) {
			System.out.println("meuArray["+i+"] = "+meuArray1[i]);
		}
		System.out.println("meuArray1 = " + Arrays.toString(meuArray1));
		int[] meuArray2 = {10, 20, 30, 40};
		System.out.println("Tamanho do array MeuArray2 = " + meuArray2.length);
		int i =0;
		for (int valor : meuArray2) {
			System.out.println("meuArray["+"] = " + valor);
			i++;
		}
		System.out.println("meuArray2= " + Arrays.toString(meuArray2));
	}
}
