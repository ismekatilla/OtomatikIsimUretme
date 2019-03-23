package org.ismek.isimuret;

import java.util.Random;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		char[] harfDizisi = new char[26];
		
		byte index = 0;
		for (char i = 'A'; i <= 'Z'; i++) {
			harfDizisi[index] = i;
			index++;
		}
		
		// Dizi ekrana yazdırma
		for (int i = 0; i < harfDizisi.length; i++) {
			System.out.println(harfDizisi[i]);
		}

		Scanner scanner = new Scanner(System.in);

		System.out.print("Kaç kelime üretilmesini istersiniz = ");
		int kelimeSayisi = scanner.nextInt();
		
		System.out.print("Kaç harf üretilmesini istersiniz = ");
		int harfSayisi = scanner.nextInt();
		
		System.out.println(kelimeSayisi);
		System.out.println(harfSayisi);
		
		String[] uretilenKelimeler = new String[kelimeSayisi];
		
		for (int i = 0; i < kelimeSayisi; i++) {
			String kelime = "";
			for (int j = 0; j < harfSayisi; j++) {
				Random random = new Random();
				int harfDizisiIndexi = random.nextInt(26);
				char harf = harfDizisi[harfDizisiIndexi];
				kelime += harf;
			}
			uretilenKelimeler[i] = kelime;
		}
		
		for (int i = 0; i < uretilenKelimeler.length; i++) {
			System.out.println(uretilenKelimeler[i]);
		}
	}
}