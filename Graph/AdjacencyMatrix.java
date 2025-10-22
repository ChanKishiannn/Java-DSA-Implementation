package adjacencymatrix2.pkg0;

import java.util.ArrayList;

/**
 *
 * @author Christian Abuda
 */
public class AdjacencyMatrix20 {
    public static void main(String[] args) {
        Graph graph = new Graph(5);
        
        graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));
        graph.addNode(new Node('D'));
        graph.addNode(new Node('E'));
        
        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(2,3);
        graph.addEdge(3,4);
        
        graph.print();
    } 
}
class Graph{
    int [][] matrix;
    ArrayList<Node> nodes = new ArrayList<>();
        
        
    Graph(int size){
        matrix = new int [size][size];    
    }
        public void addNode(Node node){
            nodes.add(node);
        }
        public void addEdge(int scr, int dst){
            matrix [scr][dst] = 1;
        }
        public boolean checkEdge(int scr, int dst){
            if(matrix[scr][dst] == 1){
                return true;
            }else{
                return false;
            }
        }
        public void print(){
            System.out.print(" ");
                for(Node node : nodes){
                    System.out.print(node.data + " ");
            }
            System.out.println(" ");
                for(int i = 0; i < matrix.length; i++){
                    System.out.print(nodes.get(i).data + " ");
                for(int j = 0; j < matrix[i].length; j++){
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println(" ");
            }
        }
}
    class Node{
        char data;
        
    Node(char data){
        this.data = data;
    }
}
