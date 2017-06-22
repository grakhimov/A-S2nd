package Laba3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static Laba1.Main.getGeneratedArray;

public class Main {

    public static int c = 5;
    public static int[] masA;
    public static int[] masB;
    public static ArrayList<Integer> listA = new ArrayList<>();
    public static ArrayList<Integer> listB = new ArrayList<>();

    public static void main(String[] args) {
        setAB();
        merge(listA, listB);
        erase(listA, 30, 70);
        subst(listA, listB, 3);
    }

    public static void merge(ArrayList<Integer> listA, ArrayList<Integer> listB) {
        ArrayList<Integer> A = new ArrayList<>(listA);
        ArrayList<Integer> B = new ArrayList<>(listB);
        A.addAll(B);
        for (int i = 0; i < A.size(); i++) {
            for (int j = 1; j < A.size(); j++) {
                int temp;
                if (A.get(j) < A.get(j - 1)) {
                    temp = A.get(j);
                    A.set(j, A.get(j - 1));
                    A.set(j - 1, temp);
                }
            }
        }
        System.out.print("\n\nMerge(A, B) = ");
        for (int x : A) {
            System.out.print(x + " ");
        }
    }

    public static void erase(ArrayList<Integer> listT, int begin, int end) {
        ArrayList<Integer> list = new ArrayList<>(listT);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) <= begin || list.get(i) >= end) {
                list.remove(i);
                i--;
            }
        }
        System.out.print("\nErase(A, 30, 70) = ");
        for (int x : list) {
            System.out.print(x + " ");
        }
    }

    public static void subst(ArrayList<Integer> listA, ArrayList<Integer> listB, int p) {
        List<Integer> part0 = listA.subList(0, p-1);
        ArrayList<Integer> part1 = new ArrayList<>(listA.subList(p-1, listA.size()));
        part0.addAll(listB);
        for (int i = 0; i < part1.size(); i++) {
            part0.add(part1.get(i));
        }
        System.out.print("\nSubst(A, B, " + (p - 1) + ") = ");
        int k = 0;
        for (int x : part0) {
            k++;
            if (k == p || k == p + listB.size()) {
                System.out.print("| ");
            }
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void setAB() {
        System.out.print("Массив [А] = ");
        masA = getGeneratedArray();
        Tree tree = new Tree(masA);
        tree.width();
        listA = tree.list;

        System.out.print("\n\nМассив [B] = ");
        masB = getGeneratedArray();
        Tree tree2 = new Tree(masB);
        tree2.width();
        listB = tree2.list;
    }
}
