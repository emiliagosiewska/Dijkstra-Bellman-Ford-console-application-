
/**
 * A package model that contains class Model which implements the Dijkstra and Bellman Ford algorithms 
 */
package pl.poll.emiliagosiewska.model;

        
import java.util.*;


/**
 * The class that is responsible for the algorithms 
 * @author Emilia Gosiewska
 * @version 1.0
 */

public class Model {

   List<List<Node>> adjList; 

//    public Model(List<List<Node>> al) { 
//        adjList = al;   
        public Model(ArrayList<Integer> al) { 
         
    } 
    
    /**
     * This is a method which is responsible for performing Dijkstra algorithm
     * @param source is a source point where we start
     * @return returns the distance between nodes
     */
    public ArrayList<Integer> algoDijkstra(int source) 
    { 
        ArrayList<Integer> distance = new ArrayList<>();
        //for the purpose of the laboratory 2 I had to comment my previous implementation of the algorithms, which I will be correcting later to fullfil requirements
        
//        int verticesNumber = adjList.size(); 
//        int [] distance = new int[verticesNumber]; 
//        PriorityQueue<Node> pqueue = new PriorityQueue<>(verticesNumber, new Node()); 
//        
//   
//        for (int i = 0; i < verticesNumber; i++) 
//            distance[i] = Integer.MAX_VALUE; 
//        
//        pqueue.add(new Node(source,0));
//        while(!pqueue.isEmpty())
//        {
//            Node node = pqueue.remove();
//            if(node.getCost() >= distance[node.getNode()])
//                continue;
//            distance[node.getNode()] = node.getCost();
//            var edges = adjList.get(node.getNode());
//            for(int i=0; i<edges.size(); i++)
//            {
//                int dist = distance[node.getNode()] + edges.get(i).getCost();
//                if(dist<distance[edges.get(i).getNode()])
//                {
//                    Node candidate = new Node(edges.get(i).getNode(),dist);
//                    pqueue.add(candidate);
//                }
//            }
//        }
       return distance;
               
    } 



    

    
    /////Bellman-Ford algorithm
  
/**
 * This is a method which is responsible for performing Bellman Ford algorithm
 * @param src is a source point 
 * @return returns the distans between nodes
 */
   
    public ArrayList<Integer> bellmanFord(int src) 
    { 
        ArrayList<Integer> dis = new ArrayList<>();
        //for the purpose of the laboratory 2 I had to comment my previous implementation of the algorithms, which I will be correcting later to fullfil requirements
//        var V = adjList.size();
//        
//        int []dis = new int[V]; 
//        for (int i = 0; i < V; i++) 
//            dis[i] = Integer.MAX_VALUE; 
//  
//        // initialize distance of source as 0 
//        dis[src] = 0; 
//  
//
//    for (int i = 0; i < V - 1; i++)  
//    { 
//        if(adjList.get(i).isEmpty())
//            continue;
//        for (int j = 0; j < V; j++)  
//        { 
//            for(Node edge: adjList.get(j))
//            {
//                int sum = dis[j] + edge.getCost();
//                if (dis[j] != Integer.MAX_VALUE && sum < dis[edge.getNode()])
//                    dis[edge.getNode()] = sum; 
//                    
//            }
//        } 
//    } 
//  
//    // check for negative-weight cycles. 
//
//    for (int j = 0; j < V; j++)  
//    { 
//        for(Node edge : adjList.get(j))
//        {
//            if(dis[j]!= Integer.MAX_VALUE && dis[j] + edge.getCost() < dis[edge.getNode()])
//            {
//                System.out.println("The given graph contains negative cycle");
//                return dis;
//            }
//        }
//    } 
    return dis; 
}
}
        
  

