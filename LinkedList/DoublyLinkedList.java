package linkedlist;

import java.util.Scanner;

/**
 *
 * @author Christian M. Abuda
 */
public class LinkedList {
    //Making an menu() method for easy access of the Menu code when needed.
    public static void menu(){
        System.out.println("Please choose the following menu: "
                + "[1] to add number in the list"
                + "[2] to delete the first number in the list"
                + "[3] to add  number between the list"
                + "[4] to delete  number between the list"
                + "[5] to check if the list is empty"
                + "[6] to exit the program");
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        
        DoublyLinkedList list = new DoublyLinkedList();
        
        int userInput;
        do{
            menu();
            userInput = scan.nextInt();
            
            if(userInput > 0 && userInput < 7){
                switch(userInput){
                    case 1: {
                        System.out.println("Please Enter you want to add in the list: ");
                        int num = scan.nextInt();
                        list.offer(num);

                        break;
                    }
                    case  2: {
                        list.pop();
                        break;
                    }
                    case 3: {
                        System.out.println("Please Enter where you want to the new number in the list: ");
                        int nodePosition = scan.nextInt();

                        System.out.println("Please Enter you want to add in the list: ");
                        int num = scan.nextInt();

                        list.addBetween(nodePosition, num);
                        break;
                    }
                    case 4: {
                        System.out.println("Please Enter where you want to delete number in the list: ");
                        int deletedPosition = scan.nextInt();

                        list.deleteBetween(deletedPosition);
                        break;
                    }
                    case 5: {
                        if(list.isEmpty()){
                            System.out.println("The list is Empty! ");
                        }else{
                            System.out.println("The list is NOT Empty! ");
                        }
                        break;
                    }
                }        
            }else{
                System.out.println("Invalid input Please Try Again! ");
            }
        }while(userInput != 6);
    }
}
class Node{
    int num;
    Node next;
    Node prev;
    
    public Node(int num){
        this.num = num;
        this.next = null;
        this.prev = null;
    }
}
class DoublyLinkedList{
    Node head;
    Node tail;
    
    private int nodeCount = 0;
    
    public void offer(int num){
        Node newNode = new Node(num);
        
        if(isEmpty()){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        nodeCount++;
    }
    public void pop(){
        if(isEmpty()){
            System.out.println("The list is Empty!");
        }else{
            if(head.next == null){
                head = null;
                tail = null;
            }else{
                head = head.next;
                head.prev = null;
            }
            
            if(head == null){
                tail = null;
            }
            nodeCount--;
        }
    }
    public void addBetween(int nodePosition, int num){
        if(head == null){
            System.out.println("The list is Empty");
            return;
        }else{
            if(nodePosition < 0 || nodePosition > nodeCount){
                System.out.println("Invalid adding the new number between the list!");
                return;
            }
            Node newNode = new Node(num);
            
            if(nodePosition == 0){
                newNode.next = head;
                head = newNode;
                head.prev = newNode;
                newNode.prev = null;
                
            }else if(nodePosition == nodeCount){
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
                newNode.next = null;
            }
            else{
                Node currentNode = head;
                
                for(int i = 0; i < nodePosition; i++){
                    currentNode = currentNode.next;
                }
                newNode.next = currentNode;
                newNode.prev = currentNode.prev;
                currentNode.prev.next = newNode;
                currentNode.prev = newNode;
                
            }
            nodeCount++;
        }  
    }
    public void deleteBetween(int nodePosition) {
    if (isEmpty()) {
        System.out.println("The list is Empty!");
        return;
    }
        if (nodePosition < 0 || nodePosition >= nodeCount) {
            System.out.println("Invalid position!");
            return;
        }

        if (nodePosition == 0) { // Delete head
            head = head.next;
        if (head != null) head.prev = null;
        
        
        else tail = null; // list became empty
        }
        
        else if (nodePosition == nodeCount - 1) { // Delete tail
            tail = tail.prev;
            
        if (tail != null)
            tail.next = null;
        else
            head = null; // list became empty
    }
    else { // Delete middle node
        Node currentNode = head;
        for (int i = 0; i < nodePosition; i++) {
            currentNode = currentNode.next;
        }
        currentNode.prev.next = currentNode.next;
        currentNode.next.prev = currentNode.prev;
    }
    nodeCount--;
    }
    public boolean isEmpty(){
        return nodeCount == 0;
    }
}
