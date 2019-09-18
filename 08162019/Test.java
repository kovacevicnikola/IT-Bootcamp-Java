package trougao;

import java.util.Random;

public class Test {

	public static void main(String[] args) {
		Random x = new Random();
		Tacka[] listaTacki = new Tacka[10];
		for (int i=0; i<listaTacki.length; i++) {
			listaTacki[i] = new Tacka(x.nextInt(50), x.nextInt(50));
		}
		Trougao trougao1 = new Trougao(listaTacki[0], 10, 10, 10);
		Trougao trougao2 = new Trougao(listaTacki[1], 21, 19, 30);
		Trougao trougao3 = new Trougao(listaTacki[2], 6, 4, 5);
		trougao1.getTrougao();
		System.out.println(trougao2.jednakokraki());
		Trougao trougao4 = new Trougao(listaTacki[0], 5, 5, 5);
		System.out.println(trougao1.proveraTacke(trougao4.getTacka()));

	}

}
