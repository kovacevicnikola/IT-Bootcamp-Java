package com.abc;
import java.util.*;
public class alkohol {

  public static void main(String[] args) {
  // ne radi mi kompajler na telefonu ponovo, pa ne mogu da proverim da li radi zadatak. ukoliko naidjete na greske, cenio bih svaki input
    Scanner sc = new Scanner(System.in);
    System.out.println("Unesite težinu");
    double tezina = sc.nextDouble();
    System.out.println("Unesite 1 za muski pol, 0 za zenski");
    int pol = sc.nextInt();
    double piceId=0, suma=0;
    while (piceId!=-1) {
      System.out.println("Unesite id pica");
      
      piceId= sc.nextInt();
      if (piceId==-1) break;
      System.out.println("Unesite kolicinu");
      suma+= procenat(piceId, sc.nextInt());
    }
    double formula = suma/(tezinaPol(pol, tezina));
    ispis(formula);
  }
  
  static double procenat(double id, double ml) {
    if (id==1) return ml*0.5;
    else if (id==2) return ml*0.4;
    else if (id==3) return ml*0.047;
    else if (id==4) return ml*0.11;
    else return 0;
    
  }
  
  static double tezinaPol(int pol, double tezina) {
    if (pol==1) return tezina*0.55;
    else if (pol==0) return tezina*0.68;
    else return 0;
  }
  
  static void ispis(double promil) {
    if (promil<0.2) {
      System.out.println("Bez kazne, dozvoljena alkoholisanost");
    }
    else if (promil<0.5) {
      System.out.println("10000, umerena alkoholisanost");
    } else if (promil<0.8) {
      System.out.println("10-20 000, srednja alkoholisanost ");
    } else if (promil<1.2) {
      System.out.println("20-40 000, visoka alkoholisanost");
    } else if (promil<1.6) {
      System.out.println("100-120 000, teska alkoholisanost");
    } else if (promil<2) {
      System.out.println("100-120 000, visoka alkoholisanost");
    } else {
      System.out.println("Potpuna alkoholisanosf, zatvorska kazna");
    }
  }
}
