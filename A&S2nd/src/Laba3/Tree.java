package Laba3;


import java.util.ArrayList;
import java.util.Stack;

public class Tree {
    private Node root;
    ArrayList<Integer> list = new ArrayList<>();

    public Tree(int[] mas) {
        for (int j : mas)
            this.insert(j, (char) j);
    }
    public void insert(int key, char data) {
        Node newNode = new Node();
        newNode.key = key;
        newNode.data = data;
        if (root == null)
            root = newNode;
        else {
            Node current = root;
            Node parent;
            while (true) {
                parent = current;
                if (key < current.key) {
                    current = current.leftChild;
                    if(current == null) {
                        parent.leftChild = newNode;
                        return;
                    }
                } else {
                    current = current.rightChild;
                    if(current == null) {
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }

    public void width() {
        System.out.print("Обход по ДДП: ");
        widthf(root);
    }

    private void widthf(Node node) {
        if (node != null) {
            widthf(node.leftChild);
            list.add(node.key);
            //System.out.print(node.key + "(" + node.data + ") ");
            System.out.print(node.key + " ");
            widthf(node.rightChild);
        }
    }

    public void scrn() {
        Stack<Node> mstack = new Stack<>();
        mstack.push(root);
        int n = 200;
        boolean row = false;
        for (int i = 0; i < 300; i++) {
            System.out.print('*');
        }
        System.out.println();
        while(!row) {
            Stack<Node> stack = new Stack<>();
            row = true;
            for (int j = 0; j < n; j++)
                System.out.print(' ');
            int k = 0;
            while(!mstack.isEmpty()) {
                Node temp = mstack.pop();
                if (temp != null) {
                    System.out.print(temp.key);
                    stack.push(temp.leftChild);
                    stack.push(temp.rightChild);
                    if (temp.leftChild != null || temp.rightChild != null)
                        row = false;
                }
                else {
                    System.out.print(".");
                    stack.push(null);
                    stack.push(null);
                }

                for(int j = 0; j < n; j++)
                    System.out.print(' ');
            }
            for(int j = 0; j < n; j++)
                System.out.print(' ');

            n /= 2;
            while(!stack.isEmpty())
                mstack.push(stack.pop());
            System.out.println();
        }
        for (int i = 0; i < 300; i++){
            System.out.print('*');
        }
    }
}