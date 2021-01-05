/**
 * A package view that contains View class which is responsible for printing the data, opening the file and handling the exceptions 
 */
package pl.poll.emiliagosiewska.view;

import java.util.*;
import java.io.*;
import java.util.Scanner;
import pl.poll.emiliagosiewska.model.Model;
import pl.poll.emiliagosiewska.model.Node;


/**
 * Class View that is responsible to communicate between user and the program and also for the printing the data
 * @author Emilia Gosiewska
 * @version 1.0
 */
public class View {

    public View()
    {
    }
    
    /**
     * A method that is responsible for parsing the file name and throwing the exception in case of not finding the argument 
     * @param args Provided arguments
     * @return returns the first position of the arguments
     * @throws FileNotFoundException an exception which is thrown whhen the argument isn't provided
     */
   
    public String parseFileName(String[] args) throws FileNotFoundException
    {
        if(args.length != 1)
            throw new FileNotFoundException("Argument not provided");
        return args[0];
    }
    
    /**
     * The method that is responsible for reading the file and creating the graph
     * @param file input file with data provided by the user
     * @return  returns the graph
     * @throws FileNotFoundException  An exception which is thrown when the file cannot be opened
     */
    public List<List<Node>> parseFileAsGraph(String file) throws FileNotFoundException {
       
        
        FileReader fil;
        
        try {
            fil = new FileReader(file);
            }
        catch(FileNotFoundException e) {
            throw new FileNotFoundException("Cannot open file");
        }
        Scanner scanner = new Scanner(fil);
        int size = 0;  //the size of the graph is the first value in the input file 
        if(scanner.hasNext())
        {
            size = scanner.nextInt();    
        }
        else 
        {
            throw new FileNotFoundException();
        }
        List<List<Node>> adjList = new ArrayList<>();
        for(int i =0; i < size ; i++)
        {
            adjList.add(new ArrayList<>());
        }
        
        int x = 0;
        int y = 0;
        int weight = 0;
        while(scanner.hasNext()){
            try {
                x = scanner.nextInt();
                y = scanner.nextInt();
                weight = scanner.nextInt();
            } catch (Exception e) {
                throw new FileNotFoundException();
            }
            Node node = new Node(y, weight);
            adjList.get(x).add(node);
          
        }
        return adjList;
    }
    
    /**
     * A method that is responsible for printing the distance between nodes for all two algorithms 
     * @param distance  is a variable that handles distances 
     */
    public void showDistance(int distance[]){
        for(int i=0; i<distance.length; i++)
        {
            if(distance[i] != Integer.MAX_VALUE)
                System.out.printf("%d: %d \n",i, distance[i]);
        }

    }
}
