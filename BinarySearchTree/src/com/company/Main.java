package com.company;

import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(10);
        tree.insert(50);
        tree.insert(100);
        tree.insert(79);
        tree.insert(45);
        tree.insert(55);
        tree.insert(95);
        //tree.postOrdr();
        //tree.search(300);
        tree.findMin();
//        tree.findMax();
//        tree.findHeight();

        //tree.printLevelOrder();

//        tree.delete(45);
        tree.inOrder();
        tree.getScuccesorResult(50);

        tree.isBST();
        tree.isBSTNew();
    }
}
