package Laba1;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static HashTable A;
    public static HashTable B;
    public static HashTable C;
    public static HashTable D;
    public static int c = 26;
    public static int[] masA;
    public static int[] masB;
    public static int[] masC;
    public static int[] masD;

    public static void main(String[] args) {

        A = new HashTable(c, 'A');
        B = new HashTable(c, 'B');
        C = new HashTable(c, 'C');
        D = new HashTable(c, 'D');
        setABCD();
        findE();
    }

    public static int[] getGeneratedArray() {
        Random rand = new Random();
        int[] generatedArray = new int[c];
        ArrayList<Integer> list = new ArrayList<>();
        int hash;
        for (int i = 0; i < c; i++) {
            hash = 122 - rand.nextInt(90);
            if (!list.contains(hash)) {
                list.add(hash);
                generatedArray[i] = hash;
                System.out.print(generatedArray[i] + " ");
            } else {
                i--;
            }

        }
        System.out.println();
        return generatedArray;
    }

    public static void findE() {
        ArrayList<Pair> listA = new ArrayList<>();
        ArrayList<Pair> listB = new ArrayList<>();
        ArrayList<Pair> listC0 = new ArrayList<>();
        ArrayList<Pair> listD = new ArrayList<>();
        ArrayList<Pair> listAB = new ArrayList<>();

        setList(listA, A);
        setList(listB, B);
        setList(listC0, C);
        setList(listD, D);

        //AND operation
        for (int i = 0; i < B.size * 2; i++) {
            for (int j = 0; j < B.size; j++) {
                if (A.contains(B.pairs[i][j])) {
                    listAB.add(B.pairs[i][j]);
                }
            }
        }
        System.out.print("\n A ∩ B  = ");
        for (Pair x : listAB) {
            System.out.print(x.key + " ");
        }

        //NOT operation
        for (int i = 0; i < listAB.size(); i++) {
            if (C.contains(listAB.get(i))) {
                listAB.remove(i);
                i--;
            }
        }
        System.out.print("\n A ∩ B \\ C = ");
        for (Pair x : listAB) {
            System.out.print(x.key + " ");
        }


        //OR operation
        for (int i = 0; i < listAB.size(); i++) {
            listD.add(listAB.get(i));
        }
        System.out.print("\n(A ∩ B \\ C) ∪ D = ");
        for (Pair x : listD) {
            System.out.print(x.key + " ");
        }
    }

    public static void setABCD() {
        System.out.println("Массив А: ");
        masA = getGeneratedArray();
        for (int m : masA) {
            A.add(m, (char) m);
        }
        System.out.println("Хеш-таблица по массиву А: ");
        A.print();

        System.out.println("\nМассив B: ");
        masB = getGeneratedArray();
        for (int m : masB) {
            B.add(m, (char) m);
        }
        System.out.println("Хеш-таблица по массиву B: ");
        B.print();

        System.out.println("\nМассив C: ");
        masC = getGeneratedArray();
        for (int m : masC) {
            C.add(m, (char) m);
        }
        System.out.println("Хеш-таблица по массиву C: ");
        C.print();

        System.out.println("\nМассив D: ");
        masD = getGeneratedArray();
        for (int m : masD) {
            D.add(m, (char) m);
        }
        System.out.println("Хеш-таблица по массиву D: ");
        D.print();
        System.out.println();
    }

    public static void setList(ArrayList<Pair> list, HashTable name) {
        for (int i = 0; i < c * 2; i++) {
            for (int j = 0; j < c; j++) {
                if (name.pairs[i][j].key != -1) {
                    list.add(name.pairs[i][j]);
                }
            }
        }
        System.out.print("[" + name.getName() + "] = ");
        for (Pair x : list) {
            System.out.print(x.key  + " ");
        }
        System.out.println();
    }
}
