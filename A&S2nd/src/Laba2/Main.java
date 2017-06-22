package Laba2;

import java.util.ArrayList;
import java.util.Random;

import static Laba1.Main.getGeneratedArray;

public class Main {

    public static int c = 26;
    public static int[] masA;
    public static int[] masB;
    public static int[] masC;
    public static int[] masD;
    public static ArrayList<Integer> listA = new ArrayList<>();
    public static ArrayList<Integer> listB = new ArrayList<>();
    public static ArrayList<Integer> listC = new ArrayList<>();
    public static ArrayList<Integer> listD = new ArrayList<>();

    public static void main(String[] args) {
        setABCD();
        findE();
    }

    public static void findE() {
        for (int i = 0; i < listB.size(); i++) {
            if (!listA.contains(listB.get(i))) {
                listB.remove(i);
                i--;
            }
        }
        System.out.print("\n A ∩ B  = ");
        for (int x : listB) {
            System.out.print(x + " ");
        }

        for (int i = 0; i < listB.size(); i++) {
            if (listC.contains(listB.get(i))) {
                listB.remove(i);
                i--;
            }
        }
        System.out.print("\n A ∩ B \\ C = ");
        for (int x : listB) {
            System.out.print(x + " ");
        }

        for (int i = 0; i < listB.size(); i++) {
            listD.add(listB.get(i));
        }
        System.out.print("\n(A ∩ B \\ C) ∪ D = ");
        for (int x : listD) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void setABCD() {
        System.out.print("Массив [А] = ");
        masA = getGeneratedArray();
        Tree tree = new Tree(masA);
        //tree.scrn();
        tree.width();
        listA = tree.list;

        System.out.print("\n\nМассив [B] = ");
        masB = getGeneratedArray();
        Tree tree2 = new Tree(masB);
        //tree2.scrn();
        tree2.width();
        listB = tree2.list;

        System.out.print("\n\nМассив [C] = ");
        masC = getGeneratedArray();
        Tree tree3 = new Tree(masC);
        //tree3.scrn();
        tree3.width();
        listC = tree3.list;

        System.out.print("\n\nМассив [D] = ");
        masD = getGeneratedArray();
        Tree tree4 = new Tree(masD);
        //tree4.scrn();
        tree4.width();
        listD = tree4.list;
        System.out.println();
    }
}
