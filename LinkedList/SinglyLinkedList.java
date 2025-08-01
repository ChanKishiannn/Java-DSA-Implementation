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
                + "[3] to display all the number in the list"
                + "[4] to add the number between the list"
                + "[5] to check if the list is empty"
                + "[6] to exit the program");
    }
    public static void main(String[] args) {
        //Importing the Java Scanner to ask users input and creating an object named SinglyLinkedList.
        Scanner input = new Scanner(System.in);
        SinglyLinkedList list = new SinglyLinkedList();
        
        //Asigning userChoose
        int userChoose;
        
        //Creating a do while loop to make the program runnning until the user press specific input to end the program.
        do{
            
            /*Accesing the menu() method to print the mene so that the user can
            choose what menu in the program they want to run. After that the program will catch
            the user input the userChoose to run the specific program*/
            
            
            menu();
            userChoose = input.nextInt();
            
            
            
            /*Checking if the user input is greater than 0 and less than 7. If it is true the program will continue to run
            If false the program will sent an error message.*/
            if(userChoose > 0 && userChoose < 7){
                switch(userChoose){
                    
                    
                    /*If the user input is 1 the computer will ask what number they want to add 
                    then the computer will catch the user input in the num*/
                    case 1:{
                        System.out.print("\nEnter the number you want to add on the list: ");
                        int num = input.nextInt();
                        
                        //The offer method was called to make the user  input num stored in the list object
                        list.offer(num);
                        break;
                    }
                    case 2:{
                        //The poll() medthod was called to delete the first num in the list.
                        list.poll();
                        break;
                    }
                    case 3:{
                        //The display method() was called to display call number inside the list
                        list.display();
                        break;
                    }
                    case 4:{
                        //If the user wants to add the number between the list the addNum() method will be used.
                        
                        
                        /*First the computer will ask where the new list will be place in the list.
                        then the computer will catch that input in the nodePosition.*/
                        System.out.print("\nEnter where to you want to place the number on the list: ");
                        int nodePosition = input.nextInt();
                        
                        /* The program will later on ask the user what num value they want to be stored in that new list.
                        then the computer will catch the user input num*/
                        System.out.print("\n Enter the number you want to add on the list: ");
                        int num = input.nextInt();
                        
                        
                        
                        /*Then the program will run the addNum() method then assign that list
                        where the user want it to be stored then assigned the value of that list
                        based on the user input num*/ 
                        list.addNum(nodePosition, num);
                        break;
                    }
                    case 5:{
                        //Running the isEmpty() method to check id the list is Empty
                        if(list.isEmpty() == true){
                            System.out.println("The list is empty!");
                        }else{
                            System.out.println("The list is not empty!");
                        }
                    }
                }
            
            //This is the error message if the user input different input in the menu
            }else{
                System.out.print("\nInvalid Input! Please try again: ");
            }
        
        //The while loop condition that loops the program until the user input 6 in the  program making it stop.
        }while(userChoose != 6);
        System.out.println("Exiting... Thank you!");
    }   
}

//Creating a class named Node to make the blueprint of the Node
class Node{
    
    //Make the attributes of the Node
    int num;
    Node next;
    
    //The program that makes the object Node
    public Node(int num){
        this.num = num;
        this.next = null;
    }
}

//Creating a SinglyLinkedList class to make the blueprint
class SinglyLinkedList{
    
    //Assigning the SinglyLinkedList Attributes
    Node head;
    Node tail;
    
    //Creating a nodeCount to count how many Node are in the list
    private int nodeCount = 0;
    
    
    //Creating an offer() method that will catch the user input when assign the value of it to the Node
    public void offer(int num){
        
        //The program that create the new node in the system then later on will be stored in the list
        Node newNode = new Node(num);
        
        
        /*Program will check if the list is Empty. If it is true it create the new node
        then that new node will be the head node (First Node in the list)
        also the tail node (Last Node in the list) will be assign also in the new Node.
        since it only have one node in the list*/
        if(isEmpty()){
            head = newNode;
            tail = newNode;
        }else{
        /*If the list is not Empty then the program create a new node then assign it to be the
        tail (Last node in the list)*/
            tail.next = newNode;
            tail = tail.next;
        }
        //Incrementing the nodeCount after adding the new node in the list
        nodeCount++;
    }
    
    //The poll() method will be the responsible of deleting the first value node in the list
    public void poll(){
        //Checking if the list is Empty. and if it is true it print the "The List is Empty!"
        if(isEmpty()){
            System.out.println("The List is Empty!");
        }else{
        /*If the program is not Empty the the head will be reassign to the next node
        (Making the first node deleted pernamently). Then the nodeCount will be
        Decremented after deleting the node in the list.
        */
            head = head.next;
            nodeCount--;
            
            //The program that check if the head is null and if it is true then it makes the tail also become null
            if(head == null){
                tail = null;
            }
        }
    }
    
    //The display method the display all the value inside the list
    public void display(){
        //Making a Node currentNode  and assign the value of it the same as the head node
        Node currentNode = head;
       
        
        //Check the list if it is Empty. If it is true it print "The List is Empty!"
        if(isEmpty()){
            System.out.println("The List is Empty!");
        }else{
       /*If the list is not Empty  then this program will be executed. 
       First it print the text "The number on the Node is:"*/
            System.out.print("\nThe number on the Node is: ");
            
            //Then the loop will be executed to check if the currentNode is not equal to null
            while(currentNode != null){
                /*if the currentNode is not equal to null then it print the currentNode value
                then after that currentNode will be reassigned as to the currentNode next*/
                System.out.print(currentNode.num + " ");
                currentNode = currentNode.next;
            }
            //Then the print statement to print a new line
            System.out.println();
        }
    }
    //The addNum method will add the new node between the list
    public void addNum(int newNodePosition, int num){
        
        
        /*The program will check if the newNodePosition is less than zero or newNodePosition is greater than nodeCount
        if it is true then it print "Invalid adding new number in the list!"*/
        
        if(newNodePosition < 0 || newNodePosition > nodeCount){
            System.out.println("Invalid adding new number in the list! ");
            return;
        }
        
        /*If it is false then it create a new node then assign the value num on the new node.*/
        Node newNode = new Node(num);
            
            /*This Program will check if the newNodePosition equals to zero 
            if it is true then the newNode.next have the value of the head
            then the head have  the value of the newNode*/
            if(newNodePosition == 0){
                newNode.next = head;
                head = newNode;
                
                /*The if statement to check if the tail is equals to null and if it is true
                and if the program above is not executed then the newNode will be place at the tail
                (Last node in the list)*/
                if(tail == null){
                   tail = newNode;
                }
            }else{
                //Create a Node current then assign the value of it as same as head
                Node current = head;  
                
                //for loop that check where the newNodepossiton will be place betweem the list
                for(int i = 0; i < newNodePosition -1; i++){
                    current = current.next;
                }
                newNode.next = current.next;
                current.next = newNode; 
            }
            if(newNode.next == null){
               tail = newNode;
            }
            nodeCount++;
    }
    public boolean isEmpty(){
        if(head == null){
            return true;
        }else{
            return false;
        }
    }
}
