/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.poll.emiliagosiewska.test;
import pl.poll.emiliagosiewska.model.Model;
import pl.poll.emiliagosiewska.model.Node;
import org.junit.jupiter.api.*;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/**
 *
 * @author Emilia Gosiewska
 * version 1.0
 */
public class ModelTest {
    
    private Model model;
    
     @BeforeEach
    public void setUp() {
        ArrayList<Integer> source = new ArrayList<>();
        model = new Model(source);
    }
    
    @ParameterizedTest
    @ValueSource(ints = {-300, -929, 0})
     public void testAlgoDijkstra()
    {
      
    }
    
    /**
     * Test of the Dijkstra algorithm
     */
    @Test
    public void testAlgoDijkstra1()
    {
      
    }
    
    /**
     * Test of the Bellman Ford algorithm
     */
    @Test
    public void testBellmanFord() 
    { 
        
    }
    
}
