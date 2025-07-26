package reverselinkedlist;

import java.util.Scanner;

/**
 *
 * @author Christian M. Abuda
 */
public class ReverseLinkedList {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Creating an Object (I named it ReverseList) where the data will be store
        ReverseList list = new ReverseList();
        
        int choose;
        
        do{       
            //Asking the  user to input specific command to run the program
            System.out.println("Pleaseee Select input: "
                    + "\n [1] To Add"
                    + "\n [2] To Display"
                    + "\n [3] To Reverse The List"
                    + "\n [4] To Stop The Program");
            choose = input.nextInt();
            
            //The System will Check the user input to know what specific command the user want to run in the system
                if(choose > 0 && choose < 5 ){
                    switch(choose){
                    case 1: {
                        System.out.println("Please Enter a Number");
                        int number = input.nextInt();
                        list.addNumber(number);
                        break;
                    }
                    case 2:{
                        list.displayNumber();
                        break;
                    }
                    case 3: {
                        list.reverseList();
                        break;
                    }
                }
                }else{
                    //Error message to show the user that they input wrong command in the system
                    System.out.println("Invalid Number Pleaseee Choose 1 to 4 only!");
                }
            }
        //Program that enable the system to stop the program if the user want to stop it
        while(choose != 4);
        System.out.println("Thank Youu for Using Me! ");
    }
}
    //Creating a class Node where the number (or data) will be stored
    class Node{
        int number;
        Node next;
        Node prev;
        
        public Node(int number){
            this.number = number;
            this.next = null;
            this.prev = null;
        }
    }
    class ReverseList{
        Node head;
        Node tail;
        
        //Creating a addNumber() Method to add the number in the Node
        public void addNumber(int number){
            Node newNode = new Node(number);
                if(head == null){
                    head = newNode;
                    tail = newNode;
                }else{
                    tail.next = newNode;
                    newNode.prev = tail;
                    tail = tail.next;
                    }
                }
        
        //Creating a displayNumebr() Method to display the number that has been added in the Node
        public void displayNumber(){
            if(head == null){
                System.out.println("The List is Empty! Please Input some numbers....");
            }else{
                System.out.println("The List of Number is: ");
                Node temp = head;
                 while(temp != null){
                    System.out.print(temp.number + " ");
                    temp = temp.next;
                }
                 System.out.println("\n");
            }
        }
        //Creating a reverseList() Method to reverse the number on the list of the Node
        public void reverseList(){        
            if(head == null){
                System.out.println("The List is Empty! Please Input some numbers....");
            }else{
                Node current = head;
                Node temp = null;
                while(current != null){
                    temp = current.prev;
                    current.prev = current.next;
                    current.next = temp;

                    current = current.prev;

                    if(temp != null){
                        head = head.prev;
                    }
                }
            System.out.println("The List has been Reverse! ");
            }   
        }
    }
        
    
