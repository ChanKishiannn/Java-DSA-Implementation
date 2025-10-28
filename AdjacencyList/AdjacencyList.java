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
        
        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(0,3);
        graph.addEdge(0,4);
        
        graph.addEdge(1,2);
        graph.addEdge(1,3);
        graph.addEdge(1,4);
        
        graph.addEdge(2,3);
        graph.addEdge(2,4);
        
        graph.addEdge(3,4);
        
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
    public void addEdge(int scr, int dst){
        Node s = nodes.get(scr);
        Node d = nodes.get(dst);
        s.neighbors.add(d);
    }
    
    public void print() {
        for (Node node : nodes) {
            System.out.print(node.data + " -> ");
            for (Node neighbor : node.neighbors) {
                System.out.print(neighbor.data + " -> ");
            }
            System.out.println(" ");
        }
    }
}
class Node{
    char data;
    ArrayList<Node> neighbors;
    
    Node(char data){
        this.data = data;
        this.neighbors = new ArrayList<Node>(); 
    }
}
