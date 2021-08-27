package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {

    Node root;

    static class Node{
        private int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
        }
    }


    private static Node insertRec(Node root, int data){
        if (root == null){
            root = new Node(data);
            return root;
        }
        else{
            if (data < root.data){
                root.left = insertRec(root.left, data);
            }
            else {
                root.right = insertRec(root.right, data);
            }
        }
        return root;
    }

    private Node searchRec(Node root, int data){
        if (root == null){
            System.out.println("Not found");
            return root;
        }
        else if (data == root.data){
            System.out.println("data found : " + data);
            return root;
        }
        else if (data < root.data){
            return searchRec(root.left, data);
        }
        return searchRec(root.right, data);
    }

    private static void preOrderRec(Node root){
        if (root != null){
            System.out.println(root.data + " ");
            preOrderRec(root.left);
            preOrderRec(root.right);
        }
    }

    private static void inOrderRec(Node root){
        if (root != null){
            inOrderRec(root.left);
            System.out.println(root.data + " ");
            inOrderRec(root.right);
        }
    }

    private static void postOrderRec(Node root){
        if (root != null){
            postOrderRec(root.left);
            postOrderRec(root.right);
            System.out.println(root.data + " ");
        }
    }

    //iterative method to find min in BST
    private static int findMinLoop(Node root){
        if (root == null){
            System.out.println("Tree id empty ");
            return -1;
        }
        while (root.left != null){
            root = root.left;
        }
        return root.data;
    }
    //iterative method to find max in BST
    private static int findMaxLoop(Node root){
        if (root == null){
            System.out.println("Tree is empty");
            return -1;
        }
        while (root.right != null){
            root = root.right;
        }
        return root.data;
    }

    //Recursive method to find minimum
    private static Node findMinRec(Node root){
        if (root == null){
            System.out.println("Tree is empty");
            return root;
        }
        else if (root.left == null){
            return root;
        }
        return findMinRec(root.left);
    }
    private static int findMaxRec(Node root){
        if (root == null){
            System.out.println("Tree is empty");
            return -1;
        }
        else if (root.right == null){
            return root.data;
        }
        return findMaxRec(root.right);
    }

    private static int findHeightRec(Node root){
        if (root == null){
            return -1;
        }
        return Math.max(findHeightRec(root.left),findHeightRec(root.right)) + 1;
    }

    private static void levelOrder(Node root){
        if (root == null){
            return;
        }
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while (!queue.isEmpty()){
            Node current = queue.peek();
            System.out.println(current.data + " ");
            if (current.left != null){
                queue.add(current.left);
            }
            if (current.right != null){
                queue.add(current.right);
            }
            queue.remove();
        }
    }

    public void printLevelOrder(){
        levelOrder(root);
    }

    public void findHeight(){
        System.out.println(findHeightRec(root));
    }

    public void findMin(){
        //iterarive call to findMinLoop
        //System.out.println(findMinLoop(root));
        //recursive call to findMin
        System.out.println(findMinRec(root).data);
    }

    public void findMax(){
        //iterative call to findMaxLoop
        //System.out.println(findMaxLoop(root));
        //recursive call to findMaxRec
        System.out.println(findMaxRec(root));
    }
    public void insert(int data){
        root = insertRec(root, data);
    }
    public void inOrder(){
        inOrderRec(root);
    }
    public void preOrder(){
        preOrderRec(root);
    }
    public void postOrdr(){
        postOrderRec(root);
    }
    public void search(int data){
        searchRec(root, data);
    }



    //Q1. to check if given binary tree is BSt or not:::
    //Approach 1: this is not an efficient solution as we'll have to traverse and compare
    // left and right subtree multiple times with the root node of that particular level

    // Time Complexity : O(n^2)


    private boolean isSubtreeLesser(Node root, int value){
        if (root == null){
            return true;
        }
        if (root.data <= value
                && isSubtreeLesser(root.left, value)
                && isSubtreeLesser(root.right, value)){
             return true;
        }
        return false;
    }
    private boolean isSubtreeGreater(Node root, int value){
        if (root == null){
            return true;
        }
        if (root.data >= value
                && isSubtreeGreater(root.left, value)
                && isSubtreeGreater(root.right, value)){
            return true;
        }
        return false;
    }

    private boolean isBinarysearchTree(Node root){
        if (root == null){
            return true;
        }
        if (isSubtreeLesser(root.left, root.data)
                && isSubtreeGreater(root.right, root.data)
                && isBinarysearchTree(root.left)
                && isBinarysearchTree(root.right)){
            return true;
        }
        return false;
    }
    public void isBST(){
        System.out.println(isBinarysearchTree(root));
    }

    //Approach 2: WE can define a permissible range for each node and data in that node must be in that range.
    //We can start node with the range -infinity to infinity, because for the root node there is no upper and lower
    //limit and now as we can set a range for other nodes. when we're going left we need to reset the upper bound so
    //that it must be between the -infinity to the range of the parent node. and so on

    // Time complexity in this approach : O(n)
    private boolean isBinarySearchTreeBest(Node root, int minValue, int maxValue){
        if (root == null){
            return true;
        }
        if (root.data > minValue
                && root.data < maxValue
                && isBinarySearchTreeBest(root.left, minValue, root.data)
                && isBinarySearchTreeBest(root.right, root.data, maxValue)){
            return true;
        }
        return false;
    }
    public void isBSTNew(){
        System.out.println(isBinarySearchTreeBest(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
    }



    //Q3. deleting a node from BST:
    private Node deleteNode(Node root, int data){
//        searchRec(root, data);
        if (root == null){
            return root;
        }
        else if (data < root.data){
            root.left = deleteNode(root.left, data);
        }
        else if (data > root.data){
            root.right = deleteNode(root.right, data);
        }
        else {
            //case 1: No child:
            if (root.left == null && root.right == null){
                root = null;
            }
            //case 2: One Child:
            else if (root.left == null){
                Node temp = root;
                root = root.right;
                temp = null;
            }
            else if (root.right == null){
                Node temp = root;
                root = root.left;
                temp = null;
            }
            //case 3: 2 children
            else {
                Node temp = findMinRec(root.right);
                root.data = temp.data;
                root.right = deleteNode(root.right, temp.data);
            }
        }
        return root;
    }
    public void delete(int data){
        deleteNode(root, data);
    }

    //function to find succcessor
    private Node getSuccessor(Node root, int data){
        Node current = searchRec(root, data);
        if (current == null){
            return null;
        }
        //case 1: Node has right subtree.............<we need to go to the left most node in the right subtree>...
        if (current.right != null) {
            return findMinRec(current.right);
        }

        //case 2: NO right subtree
        else{
            Node successor = null;
            Node ancestor = root;
            while (ancestor != current){
                if (current.data < ancestor.data){
                    successor = ancestor;
                    ancestor = ancestor.left;
                }
                else {
                    ancestor = ancestor.right;
                }
            }
            return successor;
        }
    }

    public void getScuccesorResult(int data){
        System.out.println(getSuccessor(root, data));
    }
}





