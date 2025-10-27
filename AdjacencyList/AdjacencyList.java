package adhacencylist;

import java.util.ArrayList;

/**
 *
 * @author Christian Abuda
 */
public class AdhacencyList {
    public static void main(String[] args) {
        Graph graph = new Graph(5);
        
        graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));
        graph.addNode(new Node('D'));
        graph.addNode(new Node('E'));
        
        graph.print();
    } 
}
class Graph{
    ArrayList<Node> nodes = new ArrayList<Node>();
    int sizes;
    
    Graph(int size){
        this.sizes = size;
    }
    public void addNode(Node letter){
        nodes.add(letter);
    }
    public void print(){
        for(int i = 0; i < sizes; i++){
            for(int j  = 1; j < sizes; j++){
                for(Node node : nodes){
                    System.out.print(node.data + " -> ");
                }
                if(i != 0){
                    nodes.remove(i);
                    sizes--;
                }
                System.out.println(" ");
            }
        }
    }
}
class Node{
    char data;
    
    Node(char data){
        this.data = data;
    }
}
