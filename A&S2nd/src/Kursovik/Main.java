package Kursovik;

import java.io.FileWriter;
import java.util.*;

public class Main {

    public static int size;
    public static long beginTime;
    public static long endTime;
    public static ArrayList<ArrayList<Integer>> mas;

    public static void main(String[] args) throws Exception {
        generateRandomMas();
        vectorTest();
        arraylistTest();
        dequeTest();
        stackTest();
        queueTest();
        treemapTest();
        treesetTest();
        hashmapTest();
        hashsetTest();
    }

    //Vector
    public static void vectorTest() throws Exception {
        String fileName = "vectorTiming";
        FileWriter fos = new FileWriter(fileName);
        fos.write("10\n\n");
        for (int l = 0; l < 10; l++) {
            System.out.print("\nМощность множества: " + mas.get(l).size());
            //printMas(mas.get(l));
            Vector<Integer> vector = new Vector<>();
            beginTime = System.nanoTime();
            for (int i = 0; i < mas.get(l).size(); i++) {
                vector.add(mas.get(l).get(i));
            }
            endTime = System.nanoTime();
            fos.write(mas.get(l).size() + " - " + (endTime - beginTime) + "\n");
            System.out.println("\nVector time: " + (endTime - beginTime));
        }
        fos.close();
    }

    //ArrayList
    public static void arraylistTest() throws Exception {
        String fileName = "arraylistTiming";
        String fileNameExc = "arraylistTimingExc";
        FileWriter fos = new FileWriter(fileName);
        fos.write("10\n\n");
        for (int l = 0; l < 10; l++) {
            System.out.print("\nМощность множества: " + mas.get(l).size());
            ArrayList<Integer> list = new ArrayList<>();
            beginTime = System.nanoTime();
            for (int i = 0; i < mas.get(l).size(); i++) {
                list.add(mas.get(l).get(i));
            }
            endTime = System.nanoTime();
            fos.write(mas.get(l).size() + " - " + (endTime - beginTime) + "\n");
            //fosExc.write(mas.get(l).size() + " - " + (endTime - beginTime) + "\n");
            System.out.println("\nList time: " + (endTime - beginTime));
        }
        fos.close();
    }

    //Deque
    public static void dequeTest() throws Exception {
        String fileName = "dequeTiming";
        FileWriter fos = new FileWriter(fileName);
        fos.write("10\n\n");
        for (int l = 0; l < 10; l++) {
            System.out.print("\nМощность множества: " + mas.get(l).size());
            ArrayDeque<Integer> deque = new ArrayDeque<>();
            beginTime = System.nanoTime();
            for (int i = 0; i < mas.get(l).size(); i++) {
                deque.add(mas.get(l).get(i));
            }
            endTime = System.nanoTime();
            fos.write(mas.get(l).size() + " - " + (endTime - beginTime) + "\n");
            System.out.println("\nDeque time: " + (endTime - beginTime));
        }
        fos.close();
    }

    //Stack
    public static void stackTest() throws Exception {
        String fileName = "stackTiming";
        FileWriter fos = new FileWriter(fileName);
        fos.write("10\n\n");
        for (int l = 0; l < 10; l++) {
            System.out.print("\nМощность множества: " + mas.get(l).size());
            Stack<Integer> stack = new Stack<>();
            beginTime = System.nanoTime();
            for (int i = 0; i < mas.get(l).size(); i++) {
                stack.add(mas.get(l).get(i));
            }
            endTime = System.nanoTime();
            fos.write(mas.get(l).size() + " - " + (endTime - beginTime) + "\n");
            System.out.println("\nStack time: " + (endTime - beginTime));
        }
        fos.close();
    }

    //Queue
    public static void queueTest() throws Exception {
        String fileName = "queueTiming";
        FileWriter fos = new FileWriter(fileName);
        fos.write("10\n\n");
        for (int l = 0; l < 10; l++) {
            System.out.print("\nМощность множества: " + mas.get(l).size());
            Queue<Integer> queue = new PriorityQueue<>();
            beginTime = System.nanoTime();
            for (int i = 0; i < mas.get(l).size(); i++) {
                queue.add(mas.get(l).get(i));
            }
            endTime = System.nanoTime();
            fos.write(mas.get(l).size() + " - " + (endTime - beginTime) + "\n");
            System.out.println("\nQueue time: " + (endTime - beginTime));
        }
        fos.close();
    }

    //TreeMap
    public static void treemapTest() throws Exception {
        String fileName = "treemapTiming";
        FileWriter fos = new FileWriter(fileName);
        fos.write("10\n\n");
        for (int l = 0; l < 10; l++) {
            System.out.print("\nМощность множества: " + mas.get(l).size());
            TreeMap<Integer, Integer> treeMap = new TreeMap<>();
            beginTime = System.nanoTime();
            for (int i = 0; i < mas.get(l).size(); i++) {
                treeMap.put(mas.get(l).get(i), mas.get(l).get(i));
            }
            endTime = System.nanoTime();
            fos.write(mas.get(l).size() + " - " + (endTime - beginTime) + "\n");
            System.out.println("\nTreeMap time: " + (endTime - beginTime));
        }
        fos.close();
    }



    //TreeSet
    public static void treesetTest() throws Exception {
        String fileName = "treesetTiming";
        FileWriter fos = new FileWriter(fileName);
        fos.write("10\n\n");
        for (int l = 0; l < 10; l++) {
            System.out.print("\nМощность множества: " + mas.get(l).size());
            TreeSet<Integer> treeSet = new TreeSet<>();
            beginTime = System.nanoTime();
            for (int i = 0; i < mas.get(l).size(); i++) {
                treeSet.add(mas.get(l).get(i));
            }
            endTime = System.nanoTime();
            fos.write(mas.get(l).size() + " - " + (endTime - beginTime) + "\n");
            System.out.println("\nTreeSet time: " + (endTime - beginTime));
        }
        fos.close();
    }

    //HashMap
    public static void hashmapTest() throws Exception {
        String fileName = "hashmapTiming";
        FileWriter fos = new FileWriter(fileName);
        fos.write("10\n\n");
        for (int l = 0; l < 10; l++) {
            System.out.print("\nМощность множества: " + mas.get(l).size());
            HashMap<Integer, Integer> hashMap = new HashMap<>();
            beginTime = System.nanoTime();
            for (int i = 0; i < mas.get(l).size(); i++) {
                hashMap.put(mas.get(l).get(i), mas.get(l).get(i));
            }
            endTime = System.nanoTime();
            fos.write(mas.get(l).size() + " - " + (endTime - beginTime) + "\n");
            System.out.println("\nHashMap time: " + (endTime - beginTime));
        }
        fos.close();
    }

    //HashSet
    public static void hashsetTest() throws Exception {
        String fileName = "hashsetTiming";
        //String fileNameExc = "hashsetTimingExc";
        FileWriter fos = new FileWriter(fileName);
        fos.write("10\n\n");
        for (int l = 0; l < 10; l++) {
            System.out.print("\nМощность множества: " + mas.get(l).size());
            HashSet<Integer> hashSet = new HashSet<>();
            beginTime = System.nanoTime();
            for (int i = 0; i < mas.get(l).size(); i++) {
                hashSet.add(mas.get(l).get(i));
            }
            endTime = System.nanoTime();
            fos.write(mas.get(l).size() + " - " + (endTime - beginTime) + "\n");
            System.out.println("\nHashSet time: " + (endTime - beginTime));
        }
        fos.close();
    }

    public static void generateRandomMas() {
        Random rand = new Random();
        mas = new ArrayList<>();
        for (int l = 0; l < 10; l++) {
            size = 200 - rand.nextInt(190);
            ArrayList<Integer> tempList = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                int k = 1 + rand.nextInt(500);
                if (!tempList.contains(k)) {
                    tempList.add(k);
                } else {
                    i--;
                }
            }
            mas.add(tempList);
        }
    }


    public static void printMas(ArrayList<Integer> array) {
        for (int i = 0; i < array.size(); i++) {
            if (i % 20 == 0) {
                System.out.println();
            }
            System.out.print(array.get(i) + " ");
        }
    }
}
