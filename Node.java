
/**
 * A package node that contains Node class which contains the nodes of the graph
 */
package pl.poll.emiliagosiewska.model;

import java.util.Comparator;

/**
 * Class to represent a node in the graph
 * @author Emilia Gosiewska
 * @version 1.0
 */

public class Node implements Comparator<Node> {
    private int node;
    private int cost;
    public Node()
    {
        
    }
/**
 *  A method that assigns the node and weight
 * @param node
 * @param cost 
 */
    public Node(int node, int cost)
    {
        this.node = node;
        this.cost = cost;
               
    }
    /**
     * Comparing two nodes
     * @param node1
     * @param node2
     * @return returns nothing, just an exit
     */
      @Override
    public int compare(Node node1, Node node2)
    {
        if(node1.cost < node2.cost)
            return -1;
        if(node1.cost > node2.cost)
            return 1;
        return 0;
    }
    /**
     * A method to get the value of the node
     * @return  returns the node
     */
    public int getNode()
    {
        return node;
    }
    /**
     * A method to get the weight of the node
     * @return returns the weight/cost
     */
       public int getCost()
    {
        return cost;
    }
       /**
        * A method that sets a node 
        * @param newNode  Is node variable 
        */
           public void setNode(int newNode)
    {
        node = newNode;
    }
           /**
            * A method that sets a weight
            * @param newCost Is weight variable 
            */
       public void setCost(int newCost)
    {
        cost =  newCost;
    }
}
